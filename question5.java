import java.io.BufferedReader;
import java.io.FileReader;
class question5 {
    public static void main(String[] args) { 
        try {
            String line = "";  
            String splitBy = ","; 
            int TotalNumberOfBills=0;
            Double TotalBillAmount=0.00;
            Double MinBillAmount=99999.00;
            Double MaxBillAmount=0.00;
            BufferedReader br = new BufferedReader(new FileReader("transactionDetails.csv"));
            while ((line = br.readLine()) != null)
            {  
                String[] Tdata = line.split(splitBy);
                TotalNumberOfBills++;
                Double var=Double. parseDouble(Tdata[3]);
                TotalBillAmount+=var;
                if(var>MaxBillAmount)MaxBillAmount=var;
                if(var<MinBillAmount)MinBillAmount=var;

            }  
            System.out.println("Total number of Transactions (bills): "+TotalNumberOfBills); 
            System.out.println("Total Bill amount :"+TotalBillAmount); 
            System.out.println("Maximum Bill amount :"+MaxBillAmount); 
            System.out.println("Minimum Bill amount :"+MinBillAmount);  
        } catch (Exception e) {
            System.out.println("Run time error");
        }
    }
}
