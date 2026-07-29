class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int[] output=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)->b.getValue().compareTo(a.getValue()));
        for(int i=0;i<nums.length;i++){
            
           if(!map.containsKey(nums[i])){
             count=1;
             map.put(nums[i],count);
           }else{
            count++;
            //assume by time reach this point its inside the array
            if(i==nums.length-1 || nums[i]!=nums[i+1]  ){
              map.put(nums[i],count);
              count=0;
            }
           }
        }
        pq.addAll(map.entrySet());
        for(int i=k;i>0;i--){
            output[i-1]=pq.poll().getKey();
        }
        return output;
    }
}
