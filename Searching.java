import java.util.*;
class Searching{

    static int LinearSearch(int[] arr,int target){
        int flag=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=i;
                break;
            }
        }
        return flag;
    }

    static int BinarySearch(int[] arr,int target){
        int flag=-1;
        int low=0,high=arr.length-1;
        
        while(low<=high){
            int mid= low+ (high - low) /2;
            if(arr[mid]==target){
                flag=mid;
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return flag;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of size");
        int n=in.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the Array Values: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element to search");
        int target=in.nextInt();

        Arrays.sort(arr);
        int flag=BinarySearch(arr, target);
        if(flag!= -1){
            System.out.println("Element "+target+" Found at position: "+(flag+1));
        }
        else{
            System.out.println(target+ " Not Found!");
        }

        /*int flag2=LinearSearch(arr, target);
        if(flag2!= -1){
            System.out.println("Element "+target+" Found at position: "+(flag2+1));
        }
        else{
            System.out.println(target+ " Not Found!");
        }
*/

    }
}