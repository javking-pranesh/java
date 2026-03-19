import java.util.*;
class QuickSort{

    static int partition(int[] arr,int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int low, int high){

        if(low<high){
            int pivot= partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of size");
        int n=in.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the Array Values: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Array Before Sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length-1);    

        System.out.println("Array after sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}