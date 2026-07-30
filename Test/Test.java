import java.util.Scanner;
 
public class Test{
	/*
	 * Number and Parite method to define if number is positive, negative, even or odd
	 * @param : number 
	 * */
	public static void numberAndParite(int number){
		if (number == 0){
			System.out.println("Nombre null");
		}
		else if(number > 0){
			System.out.println("Nombre positif");
		}
			else{
				System.out.println("Nombre négatif");
			}
		if ( number % 2 == 0){
			System.out.println("Nombre pair");
		}
		else {
			System.out.println("Nombre impair");
		}
	}
    /* main method */
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		if (args.length == 0){
			System.out.println("Saisissez un entier :");
			
			while(!scan.hasNextInt()){
				System.out.println("Saisissez un entier :");
				scan.next();
			}
			int number = scan.nextInt();
			numberAndParite(number);
			scan.close();
		}else if(args.length == 1){
			try{
			int number = Integer.parseInt(args[0]);
			numberAndParite(number);
			}catch(NumberFormatException e){
				System.out.println("Cette saisie " + args[0] + " n'est pas un entier.");
			}
		}
	}
}

