import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Expression (e.g: 12 + 13): ");
        String line = sc.nextLine();
        String [] enter = line.split("\\s+");
        int part1 = Integer.valueOf(enter[0]);
        int part2 = Integer.valueOf(enter[2]);
        if(enter[1].equals("+")){
            int add = part1 + part2;
            System.out.println("Answer: " + add);
        }
        else if(enter[1].equals("-")){
            int sub = part1 - part2;
            System.out.println("Answer: " + sub);
        }else if(enter[1].equals("/")){
            double divide = 0;
            try {
                divide = (double) part1 / part2;
            } catch (ArithmeticException e) {
                System.out.println(" Error: Zero can't be divided by any Number");
            }
            System.out.println("Answer: " + divide);
        }else if(enter[1].equals("*")){
            double product = part1 * part2;
            System.out.println("Answer: " + product);
        }



    }
}
