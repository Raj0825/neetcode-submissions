class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> result = new HashMap<>();

        for(int i = 0 ; i<strs.length; i++){
            String s = strs[i];

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sort = new String(charArray);

            result.putIfAbsent(sort , new ArrayList<>());
            result.get(sort).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
