import java.util.Scanner;

public class Binary_Calculator {

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        String binary1;
        String binary2;

        int number1;
        int number2;

        int number_addition;
        String binary_addition;

        int number_subtraction;
        String binary_subtraction;

        int number_multiply;
        String binary_multiply;

        int number_division;
        String binary_division;

        System.out.println("what is your first number in binary?");
        binary1 = userinput.nextLine();
        number1 = Integer.parseInt(binary1,2);

        System.out.println("What is your second number in binary");
        binary2 = userinput.nextLine();
        number2 = Integer.parseInt(binary2,2);

        number_addition = number1 + number2;
        binary_addition = Integer.toBinaryString(number_addition);

        number_subtraction = number1 - number2;
        binary_subtraction = Integer.toBinaryString(number_subtraction);

        number_multiply = number1*number2;
        binary_multiply = Integer.toBinaryString(number_multiply);

        number_division = number1/number2;
        binary_division = Integer.toBinaryString(number_division);

        System.out.println("Your binary numbers added =" +' '+ binary_addition
        +' '+ "the binary numbers subtracted =" +' '+ binary_subtraction +' '+
        "the binary numbers multiplied =" +' '+ binary_multiply +' '+ "the binary numbers divided ="
        +' '+ binary_division);
    }
}
