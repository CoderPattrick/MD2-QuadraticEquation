import java.util.Scanner;

public class Main {
    public static QuadraticEquation listInput;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean choice = true;
        while (choice){
            System.out.println("Enter a");
            double a = input.nextDouble();
            System.out.println("Enter b");
            double b = input.nextDouble();
            System.out.println("Enter c");
            double c = input.nextDouble();
            listInput = new QuadraticEquation(a,b,c);
            double delta = listInput.getDiscriminant();
            String text = "";
            if(delta<0){
                text="The equation has no roots";
                System.out.println(text);
            }
            else if(delta==0){
                double root = listInput.getRoot1();
                text="The equation has one root: ";
                System.out.println(text+root);
            }
            else {
                double root1 = listInput.getRoot1();
                double root2 = listInput.getRoot2();
                text="The equation has two roots: ";
                System.out.println(text);
                System.out.println("Root1: "+root1);
                System.out.println("Root2: "+root2);
            }
            System.out.println("Enter 0 to exit,any number not 0 to continue");
            int tempChoice = input.nextInt();
            if(tempChoice==0){
                choice=false;
            }
        }
    }
}
