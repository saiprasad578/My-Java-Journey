class Solution {
    public int countCollisions(String directions) {
        int collisions = 0;
        int state = 0;
        for (char c : directions.toCharArray()) {
            if (c == 'R') state++;
            else if (c == 'S') {
                collisions += state;
                state = 0;
            } else {
                if (state > 0) {
                    collisions += state + 1;
                    state = 0;
                }
            }
        }
        return collisions;
    }
}
