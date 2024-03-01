class Solution {
    public int[] circularGameLosers(int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> toKeep = new ArrayList<>();
        toKeep.add(1);
        for (int i = 1; i <= n; i++) {
            ans.add(i);
        }
        int turn = 1;
        int address  = 0;
        while(true) {
            int index = ((address + (turn * k)) % n);
            if (!toKeep.contains(ans.get(index))){
                int adder = ans.get(index);
                toKeep.add(adder);
                address = ((address + (turn * k)) % n);
                turn++;
            }
            else {
                break;
            }

        }
        ans.removeAll(toKeep);
        int [] res = new int[ans.size()];
        for (int i = 0; i <ans.size() ; i++) {
            res[i] = ans.get(i);
        }
        return  res;
    }
}