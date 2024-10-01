import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int legalAge = 21;
        String trash = "";

        System.out.println("Enter your age: ");
        if(console.hasNextInt())

        {
            legalAge = console.nextInt();
            console.nextLine(); //Clear the buffer
            if (legalAge >= 21) }
            {
                System.out.println("You may get a paper wrist band!");
            }
            else
            {
                System.out.println("Woah! " + legalAge + " is not old enough to go in, go home!");
            }
        }
        else{
            trash = console.nextLine();
            System.out.println("You  " +trash);
            System.out.println("Run the program again!");
        }

    }
}

