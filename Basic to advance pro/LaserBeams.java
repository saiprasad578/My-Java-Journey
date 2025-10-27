class LaserBeams {
    public int countBeams(String[] bank) {
        int last = 0, beams = 0;
        for (String s : bank) {
            int current = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '1') current++;
            }
            if (current > 0) {
                beams += last * current;
                last = current;
            }
        }
        return beams;
    }
}
