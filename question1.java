import java.util.*;
public class question1 {
    public static boolean found(int arr[],int n )
    {
        for (int i : arr) {
            if(i==n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total number of elements in array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int mx=arr[n-1];
        for(int i=1;i<=mx;i++)
        {
            if(found(arr,i)==false)
            {
                System.out.print(i+" ");
            }
        }
    }
}
    
