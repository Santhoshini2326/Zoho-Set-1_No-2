import java.util.*;
public class joining {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the array1: ");
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array2: ");
        Integer arr1[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        list.addAll(Arrays.asList(arr1));
        Collections.sort(list);
        LinkedHashSet<Integer> finarr = new LinkedHashSet(list);
       /*  for(int i=0;i<list.size();i++){
            finarr.add(list.get(i));
        }
        System.out.println("the sorted Array is :");
        for(int sum : finarr){
            System.out.println(sum);
        }*/
        System.out.println(finarr);
    }
}
