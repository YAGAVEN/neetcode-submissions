class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String result = Arrays.toString(c);
            if(map.containsKey(result)){
                map.get(result).add(s);
            }else{
                map.put(result, new ArrayList<>(List.of(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
