class Solution {
    public int getSecondLargest(int[] arr) {
      int n=arr.length;
    int largest=arr[0];
    int slargest=Integer.MIN_VALUE;;
    for(int i =1;i<n;i++){
        if(arr[i]>largest){
            slargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>slargest&&arr[i]!=largest){
            slargest=arr[i];
        }
    }
    if (slargest == Integer.MIN_VALUE) {
            return -1;
        }
        return slargest;
    
    }
}