package me.adamcraftmaster;

import me.adamcraftmaster.projs.*;
import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println("Hello, please choose one of the following projects to run: ");
        System.out.println("1. Hello World");
        System.out.println("2. Letter Value Sum");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Running: Hello World");
                HelloWorld.main();
                break;
            case 2:
                System.out.println("Running: Letter Value Sum");
                LetterValueSum.main();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
