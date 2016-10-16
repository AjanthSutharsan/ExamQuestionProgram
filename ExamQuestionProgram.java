
import java.util.Scanner;
public class ExamQuestionProgram
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your guess for the six letter word.");
            String Guess = input.nextLine();
            String Answer = "RANDOM";
            String GuessU = Guess.toUpperCase();
        
        

        do {
          
            for(int i=0;i<6;i++) {
                if((GuessU.charAt(i))==(Answer.charAt(i))) {
                    System.out.print(GuessU.charAt(i));
                } 
                else {
                    System.out.print('?');
                }

            } 
            System.out.println();
            System.out.println("Please try again.");
            String Guess1 = input.nextLine();
            String Guess1U = Guess1.toUpperCase();
            GuessU = Guess1U;

        } 
        while(!GuessU.equals(Answer));
        

    }
}
