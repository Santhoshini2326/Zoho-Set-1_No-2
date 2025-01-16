There are some gas stations along a circular route. You are given two integer arrays gas[] denoted as the amount of gas present at each station and
cost[] denoted as the cost of travelling to the next station. You have a car with an unlimited gas tank. You begin the journey with an empty tank 
from one of the gas stations. Return the index of the starting gas station if it's possible to travel around the circuit without running out of 
gas at any station in a clockwise direction. If there is no such starting station exists, return -1.
Note: If a solution exists, it is guaranteed to be unique.
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
