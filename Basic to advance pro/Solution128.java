import java.util.*;
import java.util.stream.Collectors;

class Solution128 {

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

        Map<String, List<Query>> grouped =
                queries.stream()
                        .collect(Collectors.groupingBy(q -> q.queryName));

        for (String name : grouped.keySet()) {

            List<Query> list = grouped.get(name);

            double quality = list.stream()
                    .mapToDouble(q -> (double) q.rating / q.position)
                    .average()
                    .orElse(0);

            double poorPercentage = list.stream()
                    .filter(q -> q.rating < 3)
                    .count() * 100.0 / list.size();

            System.out.printf(
                    "%s -> Quality: %.2f, Poor Query Percentage: %.2f%%\n",
                    name,
                    quality,
                    poorPercentage
            );
        }
    }
}