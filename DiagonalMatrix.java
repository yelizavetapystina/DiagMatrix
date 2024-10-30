//Yelizaveta Pystina
//CS1B: Midterm 2
//June 2, 2024

//Question 1: 
import java.util.Scanner;
public class DiagonalMatrix {
	
	static void printDiagonal(int matrix[][], int n){
		System.out.println("\nThe diagonal of the inputted matrix is : ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.println(matrix[i][j]+ " ");
				}
			}
		}
	
	}

	public static void main(String args[]){
		int row, column;

		Scanner input = new Scanner(System.in);
//inputs number of rows and number of columns values
		while(true){
			System.out.println("Please enter the number of rows:  ");
			row = input.nextInt();
	
			System.out.println("\n");
			
			System.out.println("Please enter the number of columns: ");
			column = input.nextInt();
			
		
			
			if(row == column){
				if (row >= 3 || column >= 3) //both the number of rows and columns must be at least 3
					break;
				else 						// if the value of the columns and/or the value of the rows is less than 3
					System.out.println("We are looking for a matrix with at least 3 rows and columns. Please try again. \n");

			
			}
			else							//if the number of rows does not equal the number of columns
				System.out.println("We are looking for a square matrix, meaning equal number of columns and rows. Try again. \n");
		}
		int Matrix[][] = new int[row][column];
		System.out.println("\n");
		System.out.println("Please enter the elements of the matrix: \n"); 	//user input matrix (minimum 9 elements)
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print("[" + i + "]" + "[" + j +  "]:");
				Matrix[i][j] = input.nextInt();
			}
		}
	printDiagonal(Matrix, row); //calling the printDiagonal function
	}
}

/*
Question 2.

Describe  what is meant by type "int" versus type "Integer" in Java ? Try to use an example to describe your answer.(4 points)

An int is a primitive type that represents a value that is a whole number.
An Integer is a class, in it it has various Integer objects.

In Java, every primitive type (int, boolean, float, char, etc) has a corresponding "wrapper" class (Integer, Boolean, Float, Character, etc, respectively)
This system of wrapper classes are done in order to use primitive data types as objects, which is helpful in case we want to modify the arguments passed as a method.

An example of this being done in practice would be

//primitive data type method
	int n = 3;
	System.out.println(n);
	//will output '3'
	  
//wrapper class method 
	Integer myInt = 3;
	System.out.println(myInt);
	//will output '3'
	}


*/



