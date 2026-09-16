class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        ans.add(intervals[0]);
        for(int i = 1;i < intervals.length;i++) {
            int[] current = intervals[i];
            int[] previous = ans.get(ans.size() - 1);
            if(current[0] <= previous[1]) {
                previous[1] = Math.max(current[1],previous[1]);
            }
            else {
                ans.add(current);
            }
        }
        return ans.toArray(new int[ans.size()][]);
        
    }
}