public class Cal2DArray {
    //🧨🧨🧨🧨🧨 A 2Dimensional Array is an Array where each element is an Array.

    public static void main(String[] args) {
        char[][] numberPad1={{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};
        for(char[] numberPad2 : numberPad1){
            for(char numberPad : numberPad2 ){
                System.out.print(numberPad+" ");
            }
            System.out.println(" ");
        }

    }
}


OUTPUT :
========
1 2 3  
4 5 6  
7 8 9  
* 0 #  

Process finished with exit code 0
