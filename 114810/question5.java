import java.util.Scanner;
class Qfive {
    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any two numbers :");
        a = s.nextInt();
        b = s.nextInt();
        
		c = a + b;
        System.out.println("a + b = "+ c);
		
		c = a - b;
        System.out.println("a - b = "+ c);
		
		c = a * b;
        System.out.println("a * b = "+ c);
		
		c = a / b;
        System.out.println("a / b = "+ c);
		
		c = a % b;
        System.out.println("a * b = "+ c);
		
		c = (a + b) / 2;
        System.out.println("Average = "+ c);
		
		 if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}