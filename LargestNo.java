

class LargestNo{
    public static void main(String[] args) {
        QuickSort qs=new QuickSort();
        int[] arr={50,31,20,30,40,90,15,35};

        qs.quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int n=5,max=0;
        int length=arr.length-1;
        for(int i=0;i<n;i++){
             max=arr[length];
            length--;
        }
        System.out.println(n+" th Largest element "+ max);
        
    }
}