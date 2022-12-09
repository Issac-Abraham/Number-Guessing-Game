
import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you want to play a Guessing Game: ");
        String yesNo = input.nextLine();

        if(yesNo.equals("yes")){
            System.out.print("Enter first number: ");
            int minimum = input.nextInt();

            System.out.print("\nEnter Second number larger than the First Number: ");
            int maximum = input.nextInt();

         //   int range = maximum - minimum + 1;

            int randomNumber = (int) (Math.random() * (maximum-minimum + 1)) + minimum;

          //  System.out.println(randomNumber);

            System.out.print("\nGuess a number between " + minimum + " and " + maximum +": ");
            int guess = input.nextInt();
            int numTries = 0;


            // number of guesses

            while(guess != randomNumber){
                numTries++;
                if(guess >= minimum && guess <= maximum) {
                    numTries++;

                    if (guess < randomNumber) {
                        System.out.println("Number is bigger than " + guess);
                    } else {
                        System.out.println("Number is smaller than " + guess);

                    }
                    guess = input.nextInt();


                }
                else {
                    System.out.println("Not in the range.");
                    System.out.print("\nGuess a number between " + minimum + " and " + maximum +": ");
                    guess = input.nextInt();
                }




                }
            System.out.println("You got it!! it took you " + numTries + " Guesses");

            }



        else if (yesNo.equals("no")) {
            System.out.println("You suck anyway!!" +
                    "BYE");

        }
        else {
            System.out.println("INVALID INPUT");
        }


        }




    }

