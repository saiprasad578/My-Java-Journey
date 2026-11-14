import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ConnectionPool {

    private final BlockingQueue<String> connections;

    ConnectionPool(int size) {
        connections = new ArrayBlockingQueue<>(size);

        for (int i = 1; i <= size; i++) {
            connections.add("Connection-" + i);
        }
    }

    String getConnection() throws InterruptedException {
        return connections.take();
    }

    void releaseConnection(String connection) throws InterruptedException {
        connections.put(connection);
    }
}

public class DatabaseConnectionPool {

    public static void main(String[] args) {

        ConnectionPool pool = new ConnectionPool(2);

        Runnable databaseTask = () -> {

            String connection = null;

            try {
                connection = pool.getConnection();

                System.out.println(
                    Thread.currentThread().getName()
                    + " acquired " + connection
                );

                // Simulate database operation
                Thread.sleep(2000);

                System.out.println(
                    Thread.currentThread().getName()
                    + " completed database operation"
                );

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();

            } finally {

                if (connection != null) {
                    try {
                        pool.releaseConnection(connection);

                        System.out.println(
                            Thread.currentThread().getName()
                            + " released " + connection
                        );

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        for (int i = 1; i <= 5; i++) {
            new Thread(databaseTask, "User-" + i).start();
        }
    }
}