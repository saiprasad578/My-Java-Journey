class Solution {
    public int countCollisions(String directions) {
        int collisions = 0;
        int movingRight = 0;
        
        for (char c : directions.toCharArray()) {
            if (c == 'R') {
                movingRight++;
            } else if (c == 'S') {
                collisions += movingRight;
                movingRight = 0;
            } else {
                if (movingRight > 0) {
                    collisions += movingRight + 1;
                    movingRight = 0;
                } 
            }
        }
        return collisions;
    }
}
