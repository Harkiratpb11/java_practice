import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        //int n=s.length();
        String h="";
        for(int i=n-1;i>=0;i--){
            h=h+s.charAt(i);
        }

        if(h.length()==0 || h==" "){
            System.out.println(h+" is palindrome");
        }
        else if(s.toLowerCase().equals(h.toLowerCase())){
            System.out.println(h+"is Palindrome");
        }
        else{
            System.out.println(h+"is not palindrome");
        }
        sc.close();
    }
}
