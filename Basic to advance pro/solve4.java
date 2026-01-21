class solve4 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int words = s.split(" ").length;
            max = Math.max(max, words);
        }
        return max;
    }
}
