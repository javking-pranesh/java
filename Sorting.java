import java.util.*;
class Sorting{

    static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1 -i;j++){
                if(arr[j]> arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
                
            }
            if(i!= minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
            
        }
        return arr;
    }

    static int[] insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]> arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
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
        

        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();

        System.out.println("Sorting Using Bubble Sort");
        arr1=bubbleSort(arr1);
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("Sorting Using Selection Sort");
        arr2=selectionSort(arr2);
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        System.out.println("Sorting Using Insertion Sort");
        arr3=insertionSort(arr3);
        for(int i=0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}