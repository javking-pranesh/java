import java.util.*;
class MergeSort{
    static void mergeSort(int[] arr, int l,int r){
        if(l<r){
            int mid=l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
        
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1= mid - l + 1;
        int n2 = r-mid;
        int[] lArr=new int[n1];
        int[] rArr=new int[n2];

        for(int x=0;x<n1;x++){
            lArr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++){
            rArr[x]=arr[mid+1 +x];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(lArr[i]<= rArr[j]){
                arr[k]=lArr[i];
                i++;
            }
            else{
                arr[k]=rArr[j];
                j++;
            }
            k++;

        }
        while(i<n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rArr[j];
            j++;
            k++;
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

        mergeSort(arr, 0, arr.length-1);        

        System.out.println("Array after sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}