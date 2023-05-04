import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Start


        int a = 5;
        int b = 2;
        double c = 3.0;
        System.out.println(5+a/b*c-1);

        System.out.println("Hi, I can help plan your next trip! Type y if you want to continue, or n to quit");
        String userChoice = input.nextLine();

        if(userChoice.toLowerCase().equals("y")){
            System.out.println("Awesome, let's get to work!");
            System.out.println("To figure out where you should go, I'm going to need some information: ");
            System.out.print("Where was your favorite vacation? Please enter a U.S. state: ");
            String trip = input.nextLine();
            System.out.print("Do you travel with family? ");
            String family = input.nextLine();
            System.out.print("What is your favorite thing to do? ");
            String hobby = input.nextLine();


        }
        else if(userChoice.toLowerCase().equals("n")){
            System.out.println("Okay, maybe next time");
        }
        else{
            System.out.println("I'm sorry, I don't understand you");
        }

    }
}