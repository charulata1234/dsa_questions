class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> pathsMap = new HashMap<>();
        
        for (List<String> path : paths) {
            pathsMap.put(path.get(0), path.get(1));
        }
        
        String destinationCity = paths.get(0).get(1);
        
        while (pathsMap.containsKey(destinationCity)) {
            destinationCity = pathsMap.get(destinationCity);
        }
        
        return destinationCity;
    }
}