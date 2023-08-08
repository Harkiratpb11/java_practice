import java.util.*;
public class MR {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int key=0;
    int[] A=new int[n];
    for(int i=0;i<n;i++){
        A[i]=sc.nextInt();
    }
    Arrays.sort(A);
    
    for(int i=1;i<n;i++){
        

        int a=A[i], b=A[i-1];
        if(a==b){
            key=A[i];
        }
    }
    System.out.println("the repeating number is:"+ key);
    sc.close();
   }
}
