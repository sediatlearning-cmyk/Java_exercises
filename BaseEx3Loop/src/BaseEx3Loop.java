import java.util.Scanner;
 
public class BaseEx3Loop{
	
	public static void numberAndParite(int number){
		if (number == 0){
			System.out.print("Nombre null");
		}
		else if(number > 0){
			System.out.print("Nombre positif");
		}
			else{
				System.out.print("Nombre négatif");
			}
		if ( number % 2 == 0){
			System.out.println(" et pair");
		}
		else {
			System.out.println(" et impair");
		}
	}
 
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
		}else{
			for(String element : args){
				try{
				int number = Integer.parseInt(element);
				numberAndParite(number);
				}catch(NumberFormatException e){
					System.out.println("Cette saisie " + element + " n'est pas un entier.");
				}
			}
		}
	}
}

