import java.util.*;
public class question3 {
    static Scanner sc=new Scanner(System.in);
    static String []productList={"Laptop","Mobiles","Keyboards","Speaker","Chargers","Air Coolers","Digital Watches"};
    static int [] productCount={20,30,24,46,15,42,50};
    static int []productCost={50000,15000,1500,1800,780,18000,4000};
    static String [][] specification={
        {"intel i3 processor","256GB SSD","14inches"},
        {"4gb ram","64gb rom","android12 version"},
        {"backlight keyBoard","white color","dell"},
        {"bluetooth connected","15mm drivers","8hours playtime"},
        {"33watts vooc","150grams","65watts"},
        {"110 capacity","power saving","fast cooling"},
        {"1.5inches display","100 sport modes","wifi calling"}};
        static void menuDisplay()
        {
            System.out.println("\n1.Product List View list of all Products"+"\n2.Product count View number of quantities available for a specific Product"+
            "\n3.View Product details Product Specification, Cost and count available"+
            "\n4.Edit Product  Update Product Details"+"\n5.Update Inventory Add/Delete Product Quantities");
            System.out.println("Choose your option:");
            int n=sc.nextInt();
            select(n);
        }
        static void select(int n)
        {
            if(n==1)
            {
                System.out.println("list of all Products");
                int l=productList.length;
                for (int i=0;i<l;i++) {
                    System.out.println((i+1)+"."+productList[i]);
                }
            }
            else if(n==2)
            {
                System.out.println("number of quantities available for a specific Product");
                int l=productCount.length;
                for (int i=0;i<l;i++) {
                    System.out.println((i+1)+"."+productList[i]+"-"+productCount[i]);
                }
            }
            else if(n==3)
            {
                System.out.println("Enter id of specific product in range(1-7):");
                int ch=sc.nextInt();
                System.out.print("Specifications:"+" ");
                System.out.println(Arrays.toString(specification[ch-1]));
                System.out.println("stock availability: "+productCount[ch-1]);
                System.out.println("product cost: "+productCost[ch-1]);
                
            }
            else if(n==4)
            {
                System.out.println("To Edit/Update enter product id in range(1-7):");
                int ch=sc.nextInt();
                System.out.println("old details:");
                System.out.println("product Name:"+productList[ch-1]);
                System.out.println("Product cost:"+productCost[ch-1]);
                System.out.println("product specifications:"+ (Arrays.toString(specification[ch-1])));
                System.out.println("Enter new Details:");
                System.out.println("enter new name:");
                sc.nextLine();
                String name=sc.nextLine();
                System.out.println("Enter three specifications one after another:");
                String specification1=sc.nextLine();
                String specification2=sc.nextLine();
                String specification3=sc.nextLine();
                System.out.println("Enter cost:");
                int cp=sc.nextInt();
                productList[ch-1]=name;
                productCost[ch-1]=cp;
                specification[ch-1][0]=specification1;
                specification[ch-1][1]=specification2;
                specification[ch-1][2]=specification3;
                System.out.println("updated successfully!");
            }
            else if(n==5)
            {
                System.out.println("1.Add product quantity\n2.Delete Product quantity");
                System.out.println("select options to continue:");
                int opt=sc.nextInt();
                System.out.println("Enter id of product to update its quantites:");
                int ch=sc.nextInt();
                System.out.println("Amount you wanted to add/Delete");
                int amount=sc.nextInt();
                if(opt==1)
                {
                    productCount[ch-1]+=amount;
                    System.out.println("Updated successfully!");
                    System.out.println(productCount[ch-1]);
                }
                else{
                    productCount[ch-1]-=amount;
                    System.out.println("Updated successfully!");
                    System.out.println(productCount[ch-1]);
                }
            }
            System.out.println("Press 'Y' to continue");
            char ch1=sc.next().charAt(0);
            if(ch1=='y')
            {
                menuDisplay();
            }
        }
    public static void main(String[] args) {
       menuDisplay();
    }
}
