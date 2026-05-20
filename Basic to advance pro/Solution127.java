import java.util.*;

public class Solution127 {

    static class Query {
        String queryName;
        String result;
        int position;
        int rating;

        Query(String queryName, String result, int position, int rating) {
            this.queryName = queryName;
            this.result = result;
            this.position = position;
            this.rating = rating;
        }
    }

    public static void main(String[] args) {

        List<Query> queries = Arrays.asList(
                new Query("Dog", "Golden Retriever", 1, 5),
                new Query("Dog", "German Shepherd", 2, 5),
                new Query("Dog", "Mule", 200, 1),
                new Query("Cat", "Shirazi", 5, 2),
                new Query("Cat", "Siamese", 3, 3),
                new Query("Cat", "Sphynx", 7, 4)
        );

        Map<String, Double> qualitySum = new HashMap<>();
        Map<String, Integer> poorCount = new HashMap<>();
        Map<String, Integer> totalCount = new HashMap<>();

        for (Query q : queries) {

            qualitySum.put(
                    q.queryName,
                    qualitySum.getOrDefault(q.queryName, 0.0)
                            + ((double) q.rating / q.position)
            );

            if (q.rating < 3) {
                poorCount.put(
                        q.queryName,
                        poorCount.getOrDefault(q.queryName, 0) + 1
                );
            }

            totalCount.put(
                    q.queryName,
                    totalCount.getOrDefault(q.queryName, 0) + 1
            );
        }

        for (String name : totalCount.keySet()) {

            double quality =
                    qualitySum.get(name) / totalCount.get(name);

            double poorPercentage =
                    (poorCount.getOrDefault(name, 0) * 100.0)
                            / totalCount.get(name);

            System.out.printf(
                    "%s -> Quality: %.2f, Poor Query Percentage: %.2f%%\n",
                    name,
                    quality,
                    poorPercentage
            );
        }
    }
}