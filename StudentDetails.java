package packageone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentDetails{
 
	public static void main(String args[]) throws IOException{
	  	 
	  Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students");		
		int num = s.nextInt();
		Student student = new Student(num);
		int[] id = new int[num];
		String[] name = new String[num];
		double[] tuition = new double[num];
		char[] section = new char[num];
		char charval;
		
		for(int i =0;i<num;i++){
			System.out.println("Enter the student "+(i+1)+" id:");
			try{
				id[i] = s.nextInt();	
			}
			catch(Exception e){
				System.out.println("Please enter numerical value");
				System.exit(0);
			}
			
			System.out.println("Enter the student "+(i+1)+" name");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			name[i] = br.readLine();
			System.out.println("Enter the student "+(i+1)+" fees");
			tuition[i] = s.nextDouble();
			System.out.println("Enter the student "+(i+1)+" section");
			charval = s.next().charAt(0);
			section[i] = Character.toUpperCase(charval);
		}
		
		Student st1 = new Student(id,name,tuition,section);
		
		st1.displayResults(num);
		
		

	}
}

class Student{
	private int[] id;
	private String[] name;
	private double[] tuition;
	private char[] section;
	
	Student(int num){
		id = new int[num];
		name = new String[num];
		 tuition = new double[num];
		 section = new char[num];	 
	}
	
	Student(int[] id, String[] name, double[] tuition, char[] section){
	  this.id = id;
	  this.name = name;
	  this.tuition = tuition;
	  this.section = section;
	}
	
	public void displayResults(int totalnum){
		System.out.println("ID NAME FEES SECTION");
		
		for(int i =0;i<totalnum;i++)
			System.out.println(id[i]+" "+name[i]+" "+tuition[i]+" "+section[i]);
	}
}