class MicroBlog {
    public String truncate(String input) {
        int[] codePoints = input.codePoints().toArray();
        int limit = Math.min(codePoints.length, 5);
        return new String(codePoints, 0, limit);
    }
}
