class Solution {
    public int maxArea(int[] height) {
        
        int i = 0;
        int j = height.length-1;
        int arr = 0;
        while(i<j)
        {
            arr = Math.max(arr, (j-i)* Math.min(height[i], height[j]));
            if( height[i]< height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return arr;
    }
}
