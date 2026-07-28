
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sSorted=s.toCharArray();
        char[] tSorted=t.toCharArray();
        Arrays.sort(sSorted);
        Arrays.sort(tSorted);
        boolean isAnagram=false;
        //if its anagram assume same length of characters 
        if(sSorted.length!=tSorted.length) //if n ot same lenth not anagram
        return false;
        int n=tSorted.length;
        for(int i=0;i<n;i++){
            if(sSorted[i]==tSorted[i])
           isAnagram=true;
            else
            return false;
        }
        return isAnagram;
    }
}
