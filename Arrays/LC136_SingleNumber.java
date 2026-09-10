// 1 Method(BruteForce)-


class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int num:nums) {
            if(map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}


// 2 Method(HashMap)-



class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int ans = 0;
        int solu = 0;
        for(int i = 0;i < nums.length;i++) {
            count = 0;
            for(int j = 0;j < nums.length;j++) {
                if(nums[i] == nums[j]) {
                   count ++;
                }
            
            }
            if(count == 1) {
                return nums[i];
            }
    
        }
    return -1;
    }
}