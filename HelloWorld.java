import java.util.Scanner;
public class HelloWorld {
    public static void main(String[]args){
        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in);
    String name = s.nextLine();
System.out.println("Hello," + name + "!");}
}