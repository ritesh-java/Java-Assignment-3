package packageone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SectionWise{
 
	public static void main(String args[]) throws IOException{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students");		
		int num = s.nextInt();
		int[] id = new int[num];
		String[] name = new String[num];
		double[] tuition = new double[num];
		String[] section = new String[num];
		
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
			section[i] = s.next();
		}
		
		System.out.println("Enter the section to see it's result");
		String sec = s.next();
		int setflagno = 0;
		int setflagyes = 0;
		System.out.println("ID NAME FEES SECTION");
			for(int i =0;i<num;i++){
				sec = sec.toLowerCase();
				String temp = section[i].toLowerCase();
				if(temp.equals(sec)){
					System.out.println(id[i]+" "+name[i]+" "+tuition[i]+" "+section[i]);
					setflagyes=1;
				}
				else{
						setflagno = 1;				
				}
			}
			
			if(setflagno==1 && setflagyes==0){
				System.out.println("The entered section's result doesn't exist");
			}
		/*for(int x =0;x<num;x++){
			System.out.println(id[x]+" "+name[x]+" "+tuition[x]+" "+section[x]);
		}*/
		
		
	}
}