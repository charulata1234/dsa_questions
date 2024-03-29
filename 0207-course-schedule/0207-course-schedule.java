class Solution {
    public boolean canFinish(int numCourses, int[][] matrix) {
                boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            al.add(new ArrayList<>());
        }
        for (int[] arr : matrix) {
            al.get(arr[1]).add(arr[0]);
        }
        System.out.println(al);
        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (dfs(al, vis, path, i)) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean dfs(List<List<Integer>> al, boolean[] vis, boolean[] path, int src) {
        vis[src] = true;
        path[src] = true;

        for (int ele: al.get(src)) {
            if (!vis[ele]) {
                if (dfs(al, vis, path, ele)) {
                    return true;
                }
            }
            else if (path[ele]) {
                return true;
            }
        }
        path[src] = false;
        return false;
    }   
}
