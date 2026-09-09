import java.util.*;

class RateLimiter {

    private final int maxRequests;
    private final long timeWindow;

    private final Map<String, Queue<Long>> userRequests =
            new HashMap<>();

    RateLimiter(int maxRequests, long timeWindow) {
        this.maxRequests = maxRequests;
        this.timeWindow = timeWindow;
    }

    synchronized boolean allowRequest(String user) {

        long currentTime = System.currentTimeMillis();

        Queue<Long> requests =
                userRequests.computeIfAbsent(
                        user,
                        k -> new LinkedList<>()
                );

        // Remove expired requests
        while (!requests.isEmpty()
                && currentTime - requests.peek() >= timeWindow) {

            requests.poll();
        }

        // Check request limit
        if (requests.size() >= maxRequests) {
            return false;
        }

        requests.add(currentTime);

        return true;
    }
}

public class RateLimiterDemo {

    public static void main(String[] args)
            throws InterruptedException {

        // Maximum 3 requests in 5 seconds
        RateLimiter limiter =
                new RateLimiter(3, 5000);

        String user = "User-101";

        for (int i = 1; i <= 5; i++) {

            if (limiter.allowRequest(user)) {
                System.out.println(
                        "Request " + i + ": Allowed"
                );
            } else {
                System.out.println(
                        "Request " + i + ": Blocked"
                );
            }

            Thread.sleep(500);
        }
    }
}