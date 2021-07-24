class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> res = new ArrayList<>(); 
        for(int[] interval : intervals) {
            int intervalStart = interval[0];
            int intervalEnd = interval[1];
            if(intervalEnd < start) {
                res.add(interval);
            } else if(intervalStart > end) {
                res.add(new int[]{start, end});
                start = intervalStart;
                end = intervalEnd;
            } else {
                start = Math.min(start, intervalStart);
                end = Math.max(end, intervalEnd);
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][2]);
    }
}