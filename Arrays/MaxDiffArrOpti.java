class MaxDiffArrOpti{
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,44,5,99};
        int minEle = arr[0];
        int maxDiff = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            int diff = arr[i] - minEle;
            if(diff>maxDiff){
                maxDiff = diff;
            }
            if(arr[i]<minEle){
                minEle = arr[i];
            }
        }
        System.out.print(maxDiff);
    }
}