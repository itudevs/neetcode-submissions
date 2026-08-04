
class Solution {

    public String encode(List<String> strs) {
        String output="";
          for(String string:strs){
           output+=string.length()+"#"+string;
          }
          return output;
    }

    public List<String> decode(String str) {
       List<String> output = new ArrayList<>();
// Match a number, followed by #, followed by anything
Pattern pattern = Pattern.compile("^(\\d+)#(.*)", Pattern.DOTALL); 

String currentStr = str;

while (currentStr.length() > 0) {
    Matcher matcher = pattern.matcher(currentStr);
    
    if (!matcher.find()) {
        // Break if the remaining string doesn't match the "Number#Text" format
        break; 
    }
    
    // 1. Extract the length safely
    int wordlength = Integer.parseInt(matcher.group(1)); 
    String remainingText = matcher.group(2);
    
    if (wordlength == 0) {
        output.add("");
        // Move past the "0#" (which is 2 characters)
        currentStr = remainingText; 
    } else {
        // 2. Extract the exact word based on the length
        String word = remainingText.substring(0, wordlength);
        System.out.println(word);
        output.add(word);
        
        // 3. Cut off the processed word for the next iteration
        currentStr = remainingText.substring(wordlength);
    }
  
}
         return output;
    }
}
