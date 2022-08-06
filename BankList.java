import java.util.Scanner;

class BankList{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int opt, amount, find;
        System.out.print("Enter No of Account in the List: ");
        amount = read.nextInt();
        System.out.println();
        Bank List[] = new Bank[amount];

        do{
            System.out.println("(1) ==> To Create Accounts.");
            System.out.println("(2) ==> To check Balance of Accounts.");
            System.out.println("(3) ==> To Search in Accounts.");
            System.out.println("(4) or (0) ==> To Exit.");
            System.out.println();

            System.out.print("Enter Any One Option: ");
            opt = read.nextInt();
            System.out.println();

            if(opt==1){
                for(int i = 0;i<amount;i++){
                    for(int j = 0;j<1;j++){
                        List[i] = new Bank();
                    }
                    for(int k = 0;k<1;k++){
                        List[i].getDetails(i);
                    }
                    System.out.println();
                }
            }
            // System.out.print(amount);
            if(opt==2){
                do{
                    System.out.print("Enter Number form the List: ");
                    find = read.nextInt();
                    List[find-1].displayBalance();
                    System.out.println();
                }
                while(find<=amount && find>=0);
            }

            if(opt==3){
                System.out.print("Enter Bank Account Number you Want to Find: ");
                float Acc_No = read.nextFloat();
                for(int i = 0;i<amount;i++){
                    if(List[i].Acc_No[i]==Acc_No){
                        System.out.println();
                        List[i].searchAccounct(i);
                        break;
                    } 
                    if(List[i].Acc_No[i]!=Acc_No){
                        System.out.println("Account Does not Exsist!!");
                        break;
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
        while(opt >= 1 && opt <= 3);
    }
}