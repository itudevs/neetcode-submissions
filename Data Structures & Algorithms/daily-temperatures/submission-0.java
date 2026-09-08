class Solution {
    public record Entry(
     Integer index,
     Integer temp
    ){};
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int[] result=new int[size];
        Stack<Entry> stack=new Stack<>();
        for(int i=0;i<size;i++){
         //push all values into stack 
          int temperature=temperatures[i];
          Entry entry=new Entry(i,temperature);
          while(!stack.isEmpty() && temperature >stack.peek().temp()){
            Entry pair=stack.pop();
            result[pair.index()]=i-pair.index();
          }
          stack.push(new Entry(i,temperature));
    
        }
        return result;
    }
}
