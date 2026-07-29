class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            if (!res.containsKey(sortedWord)) {
                res.put(sortedWord, new ArrayList<>());
            }
            res.get(sortedWord).add(s);
        }
        return new ArrayList<>(res.values());
    }
}