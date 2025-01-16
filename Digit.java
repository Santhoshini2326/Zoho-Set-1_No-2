Given a string s, Your task is to complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.
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
