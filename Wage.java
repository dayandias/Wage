import java.util.Scanner;

public class Wage{

	static void printMenu(){
		
		System.out.println("Please select an option from the following menu:");
		System.out.println("*******************************************************");
		System.out.println("\t\t\tMenu\t\t");
		System.out.println("*******************************************************");	
		System.out.println("1)      Calculate earnings at $10.00/hr");
		System.out.println("2)      Calculate earnings at $.10 doubled each hour");
    		System.out.println("3)      Exit");
		System.out.println("*******************************************************");
		
	}
	
	//to get the input of number of hours
	static int totalHours(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many hours? ");
		int inputHours;
		inputHours = scan.nextInt();
		return inputHours;
	}

	//to calculate the total wage if user opts option1
	static int calc1(int hours){ 
		int totalEarnings;
		totalEarnings = hours*10;

		return totalEarnings;
	}

	//to calculate the total wage if user opts option2
	static double calc2(int hours){ 
		double totalEarnings = 0;
		double sum = 0;
		double rate = 0.10;
		double roundOff;

		for(int i = 1; i <= hours; i++){
			totalEarnings = rate*1;
			rate = rate*2;
			sum = sum + totalEarnings;
			
		}
		roundOff = Math.round(sum*100.00)/100.00;
		return roundOff;
	}

public static void main(String[] args){  

		printMenu(); //users Method printMenu to print the options for an user input
		
		//Getting the option input from the user
		Scanner scan = new Scanner(System.in); 
		int inputOpt;
 		inputOpt = scan.nextInt();
		System.out.println(inputOpt);
		
		int hours;
		double wage;
		while(inputOpt != 3){

			if (inputOpt == 1){
								
				hours = totalHours();
				System.out.println(hours);

				wage = calc1(hours);
				System.out.println("You will earn $"+ wage);
				
				System.out.println("\n");
				printMenu();
				inputOpt = scan.nextInt();
				System.out.println(inputOpt);
		
			}
		
			else if(inputOpt == 2){
				hours = totalHours();
				System.out.println(hours);

				wage = calc2(hours);
				System.out.println("You will earn $"+ wage);
				
				System.out.println("\n");
				printMenu();
				inputOpt = scan.nextInt();
				System.out.println(inputOpt);

			}
			
			else{
				System.out.println("Input option error. Please input 1,2 or 3");			
								
				inputOpt = scan.nextInt();
						
			}
						
		}	
		
	}
}