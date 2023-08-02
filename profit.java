import java.util.*;
public class profit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxP=0;
        int buy=arr[0];
        for(int i=1;i<n;i++){
            if(buy>arr[i]){
                buy=arr[i];
            }
            else if(arr[i]-buy>maxP){
                maxP=arr[i]-buy;
            }
        }
        System.out.print("the max profit is :"+maxP);
        sc.close();
    }
}