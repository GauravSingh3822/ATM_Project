import java.util.*;
class ATM{
    float Balance=5000;
    int PIN=7846;

    public void checkpin(){
        System.out.print("Enter you Pin :");
         Scanner sc=new Scanner(System.in);
         int enteredpin=sc.nextInt();
         if(enteredpin==PIN){
             menu();
         } else {
             System.out.println("Oops Enter Invalid Pin");
             menu();
         }

    }
    public void menu(){
        System.out.println("Please Enter your Choice");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num==1){
            ChekBalance();
        }else if(num==2){
            Withdraw();
        }
        else if(num==3){
            DepositMoney();
        }
        else if(num==4){
            return;
        }else{
            System.out.println("Please Enter a Valid Number");
        }
    }


 public void ChekBalance(){
     System.out.println("Balance:"+Balance);
     menu();// again show menu
 }
 public void Withdraw(){
     System.out.println("Enter Amount to Withdraw :");
     Scanner sc=new Scanner(System.in);
     float amount= sc.nextFloat();
     if(amount>Balance){
         System.out.println("Insufficient Balance");
     } else{
         Balance=Balance-amount;
         System.out.println("Money Withdraw Successful");
         menu();
     }

 }
 public void DepositMoney(){
     System.out.println("Enter the Amount");
     Scanner sc=new Scanner(System.in);
     float amount =sc.nextFloat();
     Balance=Balance+amount;
     System.out.println("Money Deposited Successfully");
     menu();
 }

 }


public class AtmProject {
    public static void main(String[] args) {
        // Object Creation
        ATM obj=new ATM();
                obj.checkpin();

    }
}
