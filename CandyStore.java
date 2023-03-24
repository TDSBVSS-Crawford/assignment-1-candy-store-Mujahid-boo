import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        // Main method. This method should contain most of your code.

        double total = 0; 

    int running = 1;



        while (running < 2){

            String a = "a";
            String b = "b";
            String c = "c";
            String d = "d";
            String e = "e";

            candyChoices();

            Scanner userchoice = new Scanner(System.in);
            String chosen = userchoice.nextLine();
        

            if (chosen.equals(a)){

                System.out.println("Enter the quantity you wish to purchase: ");
                int amount = userchoice.nextInt();
    
                calculateCost(a,amount);

            }

                
            }

        }


 //end main

    public static String candyChoices() {
        // this method should print out all the candy choices and prompt the user to make a choice

        System.out.println("Please choose from the following options, or type quit to exit:");
        System.out.println("a) Reese's Pieces: $2.50/0.5 kg");
        System.out.println("b) Skittles: $1.75/1 kg");
        System.out.println("c) Jubjubes: $0.50/1 kg");
        System.out.println("d) Lollipops: 1 for $0.50 or 5 for $2.00");
        System.out.println("e) Smarties: $1.50/1 kg");
        System.out.println("Select a candy to purchase: ");

        return ""; //change this return statement to return the user's choice
    }

    public static double calculateCost(String choice, double qty) {

        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";

        if (choice == a){

            double candyamount = 5;
            double beforeTax = (candyamount * qty);
            System.out.println(beforeTax);
            System.out.println(beforeTax*1.13); 

        }else if (choice == b){

            double candyamount = 1.75;
            double beforeTax = (candyamount * qty);
            System.out.println(beforeTax);
            System.out.println(beforeTax*1.13);

        }else if (choice == c){

            double candyamount = 0.5;
            double beforeTax = (candyamount * qty);
            System.out.println(beforeTax);
            System.out.println(beforeTax*1.13);
            
        }else if (choice == d){

            double candyamount = 0.5;
            double beforeTax = (candyamount * qty);
            System.out.println(beforeTax);
            System.out.println(beforeTax*1.13);

        }else if (choice == e){

            double candyamount = 1.5;
            double beforeTax = (candyamount * qty);
            System.out.println(beforeTax);
            System.out.println(beforeTax*1.13);

            doub

        }

        

        // this method should calculate the total cost of purchasing a type of candy
        return 0.0;
    }
} // end class
