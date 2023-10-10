class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> n = new ArrayList<Integer>();
      HashMap<Integer,Integer> m= new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
       if(!m.containsKey(nums[i])){
             m.put(nums[i],0);
       }
            else{
             m.put(nums[i],m.get(nums[i]+1));
             }
        }
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(i+1)){
                n.add(i+1);
}
 }
        return n;
    }
}