class Solution {
    public int findSpecialInteger(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=nums.length/4,res=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>count)
            {
                res=entry.getKey();
                break;
            }
        }
        return res;
    }
}