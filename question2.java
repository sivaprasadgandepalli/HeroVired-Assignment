import java.util.*;
public class question2 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements in an array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=-1)
		{
			for(int j=i+1;j<n;j++)
            		{
               	 	if(arr[i]==arr[j])
                		{
                   	 		arr[j]=-1;
                		}
            		}
		}
        }
	for(int i=0;i<n;i++)
	{
		if(arr[i]!=-1)System.out.print(arr[i]+" ");
	}
        sc.close();
    }
}
