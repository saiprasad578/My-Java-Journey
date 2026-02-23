class count7 {
    public int countCollisions(String directions) {
        int n = directions.length();
        int left = 0, right = n - 1;
        
        // skip leading L
        while (left < n && directions.charAt(left) == 'L') {
            left++;
        }
        
        // skip trailing R
        while (right >= 0 && directions.charAt(right) == 'R') {
            right--;
        }
        
        int collisions = 0;
        
        for (int i = left; i <= right; i++) {
            char c = directions.charAt(i);
            if (c != 'S') {
                collisions++;
            }
        }
        
        return collisions;
    }
}