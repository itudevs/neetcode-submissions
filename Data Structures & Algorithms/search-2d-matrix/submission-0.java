class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        TreeSet<Integer> bst=new TreeSet<>();
        bst.addAll(Arrays.stream(matrix).flatMapToInt(Arrays::stream).boxed().toList());
        if(bst.contains(target))
        return true;
        else
        return false;
    }
}
