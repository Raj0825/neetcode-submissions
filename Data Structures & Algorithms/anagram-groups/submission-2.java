class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i++){
            String s = strs[i];

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            map.putIfAbsent(sorted , new ArrayList<>());
            map.get(sorted).add(s);
        } 
        return new ArrayList<>(map.values());
    }
}
