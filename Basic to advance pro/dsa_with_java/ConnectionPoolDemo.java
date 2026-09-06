import java.util.concurrent.*;

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

public class ConnectionPoolDemo {

    public static void main(String[] args) {

        ConnectionPool pool = new ConnectionPool(2);

        Runnable task = () -> {

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

        Thread user1 = new Thread(task, "User-1");
        Thread user2 = new Thread(task, "User-2");
        Thread user3 = new Thread(task, "User-3");

        user1.start();
        user2.start();
        user3.start();
    }
}