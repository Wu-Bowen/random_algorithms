class Solution {
    public HashSet<String> dict;
    public boolean wordBreak(String s, List<String> wordDict) {
        dict = new HashSet<>(wordDict);
        return helperWordBreak(s, 0);
    }
    
    public boolean helperWordBreak(String s, int start) {
        if(start == s.length()){
            return true;
        }
        for(int i = start; i < s.length(); i++) {
            if(dict.contains(s.substring(start, i + 1)) && helperWordBreak(s, i+1)){
                return true;
            }
        }
        return false;
    }
}