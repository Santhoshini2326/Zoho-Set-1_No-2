import java.util.*;
public class Gas_Station {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        int arr1[]= new int[n];
        int flag=0;
        System.out.println("Enter the first array:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Second array:");
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        for(int i=0,j=0;i<n && j<n;i++,j++){
            if(arr[i]>arr1[j]){
                flag=1;
                System.out.println("The index is: "+ i);
                break;
            }
        }
        if(flag==0){
            System.out.println("The index is: "+ -1);
        }
    }
}
