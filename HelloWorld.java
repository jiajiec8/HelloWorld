import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class HelloWorld {
    public static void main(String[]args){
        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in);
    String name = s.nextLine();
System.out.println("Hello," + name + "!");
File f=new File("AP Computer Science A");
s.close();
s=new Scanner(f);
String course=s.nextLine();
System.out.println("Welcome to " + course + "!");
    }}