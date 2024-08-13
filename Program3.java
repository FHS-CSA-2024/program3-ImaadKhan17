//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:

public class Program3{
    public static void main(String[] args){
        int width;
        int length;
        int area;
        int perimeter;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter the length: ");
        length = myScanner.nextInt();
        System.out.print(" Enter the width: ");
        width = myScanner.nextInt();
        area = width * length;
        perimeter = width * 2 + length * 2;
        System.out.println("The Length is "+length);
        System.out.println("The width is " + width);
        System.out.println("The area is " + area);
        System.out.println("The perimter is " + perimeter);
    }
}


//Paste console output below:
/*
Enter the length: 142
Enter the width: 82
The Length is 142
The width is 82
The area is 11644
The perimter is 448

*/
