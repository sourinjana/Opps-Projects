import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

         System.out.println("Enter Your car details");

         while (true) {
            System.out.println("Select Below Opion---> ");
            System.out.println("Type Your Car : ");
            System.out.println("1.Hatchback");
            System.out.println("2.Sedan");
            System.out.println("3.Suv");
            System.out.println("4.Exit--->");

            int num=scan.nextInt();
            if(num==1){
                Hatchback hatchback=new Hatchback();
                hatchback.generateTheBill();
            }else if(num==2){
                  Sedan sedan=new Sedan();
                      sedan.generateTheBill();
            }else if(num==3){
                 Suv suv=new Suv();
                    suv.generateTheBill();
            }else if(num==4){
                  break;
            }else{
                System.out.println("Pleace select option correctly----");
            }
            
         }
    
    }
}