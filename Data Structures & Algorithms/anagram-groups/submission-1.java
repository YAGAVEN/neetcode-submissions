class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            String result = toString(s);
            if(map.containsKey(result)){
                map.get(result).add(s);
            }else{
                map.put(result, new ArrayList<>(List.of(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
    public String toString(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return Arrays.toString(c);
    }
}

