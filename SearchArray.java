import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Fruits = {"Apple","Mango","Banana","Orange","Grapes"};
        String fruit ;
        boolean isFound = false;///Here it states i havent found the fruit 👎👎👎👎👎👎.
        System.out.print("Enter the Fruit : ");
        fruit = scanner.nextLine();
        for(int i=0;i<Fruits.length;i++) {
            if (Fruits[i].equalsIgnoreCase(fruit)) {
                isFound=true;///Here it is found 👍👍👍👍👍👍
                System.out.println("Match Found Successfully ! 😁😁😁😁");
                break;
            }
        }
        if(!isFound){ /// if block executes only when it is true , here it states that !isFound = true 👌👌👌👌👌
            System.out.println("Match not found ! 🥺🥺🥺🥺");

        }
    }
}
