public class selectionsortAlgorithm {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            //swap
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
    }
    
}
