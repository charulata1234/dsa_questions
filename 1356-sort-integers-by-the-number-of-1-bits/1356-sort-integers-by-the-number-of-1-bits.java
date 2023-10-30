class Solution {
    public int[] sortByBits(int[] arr) {
          HashMap<Integer,ArrayList<Integer>> ans=new HashMap<>();
        for(int i:arr)
        {
            int n=Integer.bitCount(i);
            if(ans.containsKey(n))
            {
                ans.get(n).add(i);
            }
            else
            {
            ans.put(n,new ArrayList<>());
            ans.get(n).add(i);
            }
        }
       // System.out.print(ans); 
        int[] pans=new int[arr.length];
        int k=0;
        for(int i:ans.keySet())
        {
            ArrayList<Integer> an=ans.get(i);
            Collections.sort(an);
            for(int j:an)
            {
                pans[k]=j;
                k++;
            }
        }
        return pans;
    }
}