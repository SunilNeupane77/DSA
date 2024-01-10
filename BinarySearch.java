import java.util.Scanner;


public class BinarySearch {
        public static Integer binarySearch(int arr[],int key){
        int lo=0,mid,hi=arr.length-1;
        while (lo<=hi) {
            mid=(lo+hi)/2;
            if(key<arr[mid]){
                hi=mid+1;
            }
            else if (arr[mid]<key) {
                lo=mid-1;
            }
            else{
                return mid;
            }
            
        }
        return null;
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int arr[]={12,13,18,22,48,68};
     System.out.println("Enter Search Key");
     int key=sc.nextInt();
     Integer found= binarySearch(arr, key);
     if(found==null){
        System.out.println("Element not found");
     }
     else{
        System.out.println("Element Found..");
     }
}
}
