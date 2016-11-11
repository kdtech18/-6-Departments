/* Departments.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/8/2016
*/

import java.util.Scanner;

public class Departments
    {

    public static void main(String[] args)
        {
        Scanner scan = new Scanner(System.in);
        boolean isDepartment = false;
        String[][] departments = new String[][]{{"Athletic", "Academic", "Dean", "IT", "Arts"},
                                                {"Pat White", "John Morse", "Mike Nickelson and Carleton Galligan", "Greg Blondin", "Nathan Colby"}};
        
        System.out.print("Please enter a department: ");
        String input = scan.nextLine();
        for (int i = 0; i < departments[0].length; i++)
            {
                if (input.equalsIgnoreCase(departments[0][i])) {
                    System.out.println("This Department is run by: " + departments[1][i]);
                    isDepartment = true;
                    break;
                    }
                
            }
        if (!isDepartment)
            {
                System.out.println("This is not a department.");
            }
        
        }// end main method
    }
