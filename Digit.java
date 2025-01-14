import java.util.*;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count =0;
        StringBuilder sum = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))) {
               
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    sum.append(str.charAt(i));
                    i++; // Move to the next character
                }
                count = Integer.parseInt(sum.toString());
                for(int j=0 ;j<count;j++){
                    System.out.print(str.charAt(i-sum.length()-1));
                }
                sum.setLength(0);
            }
        }
    }    
}
