import java.util.Scanner;

public class Quizz {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int[] answers={1,3};
        int[] guess=new int[answers.length];
        int score=0;
        System.out.println("=============");
        System.out.println("QUIZZ STARTED");
        System.out.println("=============");

        String[] Questions = {"What is you're Name ?","What is you're age ?"};
        String[][] Options = {{"1.Rakesh","2.Rasool","3.Sai","4.Kiran"},{"1.25","2.24","3.26","4.32"}};
           for(int i=0;i<Questions.length;i++) {
               System.out.println(Questions[i]);
               for (String options : Options[i]) {
                   System.out.println(options);
               }
               System.out.println();
           }
               System.out.println("====================");
               System.out.println("Provide the answers");
               System.out.println("=====================");
               for(int i=0;i<Questions.length;i++){
                   System.out.print("Answers for Question "+(i+1)+" :");
                   guess[i]=scanner.nextInt();
                   scanner.nextLine();
               }


               //scanner.nextLine();
            for(int i=0;i<Questions.length;i++) {
                if (guess[i] == answers[i]) {
                    System.out.println("You're correct ✅✅");
                    score++;
                } else {
                    System.out.println("Wrong guess(❌❌) right one is " + answers[i]);

                }
            }
        System.out.println("You're total score is : "+ score);
    }
}
