import java.util.Scanner;

public class FruitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Fruits;
        int size;
        System.out.print("How many fruits you need : ");
        size =scanner.nextInt();
        scanner.nextLine();
        Fruits = new String[size];
        for(int i=0;i<Fruits.length;i++){
            System.out.print("Enter the Fruit : " );
            Fruits[i]=scanner.nextLine();
        }
        System.out.println("Here are you're fruits :");
        for(String fruit : Fruits){
            System.out.println(fruit);
        }

    }
}
