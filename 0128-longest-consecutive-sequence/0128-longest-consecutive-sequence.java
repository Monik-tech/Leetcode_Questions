class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }

        Set<Integer>numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int maxStreak = 0;
        for(int num : numSet){
            if(!numSet.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;

                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        return maxStreak;
    }
}

 