import java.util.Scanner;

public class exercises {

    public static Scanner sc= new Scanner(System.in);

    public static void ex2() {
        String name = sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    public static void ex3() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a + b = " + (a + b)); 
    }

    public static void ex4() {
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area = " + (a * b));
    }

    public static void ex5() {
        char c = sc.nextLine().charAt(0);
        System.out.println((char)(c + 1));
    }

    public static void ex6() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((boolean)(a > b));
    }

    public static void odd_even_check() {
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println(a + " is an even number");
        }
        else{
            System.out.println(a + " is an odd number");
        }
    }

    public static void positive_negative_check() {
        int a = sc.nextInt();
        if (a > 0){
            System.out.println(a + " is an positive number");
        }
        else if (a < 0){
            System.out.println(a + " is an negative number");
        }
        else{
            System.out.println(a + " is equal to 0");
        }
    }

    public static void same_name_check(){
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)){
            System.out.println("two people have the same name");
        }
        else{
            System.out.println("two people don't have the same name");
        }
    }
    public static void main(String[] args) {
        
        same_name_check();
        
    }
}