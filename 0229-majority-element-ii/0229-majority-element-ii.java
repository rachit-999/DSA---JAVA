class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num) + 1);
            }
            else {
                map.put(num,1);
            }
        }

        for(int num : map.keySet()) {
            if(map.get(num) > nums.length / 3) {
                ans.add(num);
            }
        }
        return ans;
    }
        
    
}