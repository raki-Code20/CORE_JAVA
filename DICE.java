import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();
        int rollTheDice ;
        int total=0;

        System.out.println("Please Roll the Dice :");
        rollTheDice = scanner.nextInt();
        if(rollTheDice>0){
            for(int i=0;i<rollTheDice;i++){
                int roll=random.nextInt(1,7);
                rolledDice(roll);
                int value = roll;
                System.out.println("The value for these Roll is : "+value);
                total +=value;


            }
            System.out.println("*************************************");

            System.out.println("The sum of you're Rolls are : "+total);
        }else{
            System.out.println("Invalid Roll");
        }

    }
    static  void   rolledDice(int roll){
        String dice1= """
              - - - - -- 
              |        |
              |   0    |
              |        |
              ----------
                """ ;
        String dice2="""
              - - - - -- 
              |        |
              |0      0|
              |        |
              ----------
                """ ;
        String dice3 = """
              - - - - -- 
              | 0      |
              |   0    |
              |      0 |
              ----------
                """ ;
        String dice4="""
              - - - - -- 
              | 0     0|
              |        |
              |0      0|
              ----------
                """ ;
String dice5="""
              - - - - -- 
              | 0    0 |
              |   0    |
              |0     0 |
              ----------
                """ ;
        String dice6="""
              - - - - -- 
              | 0    0 |
              | 0    0 |
              | 0    0 |
              ----------
                """ ;
        switch (roll){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default-> System.out.println("Not a valid");

        }

    }
}
