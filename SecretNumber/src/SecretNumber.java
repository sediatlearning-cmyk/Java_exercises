import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		String response = "";
		int secretNumber = 0, proposedNumber = 0, count = 0;
		int numberProposedTable[] = new int[100];

		int min = 0 , max = 100;
		secretNumber =  min + (int)(Math.random() * ((max - min) + 1));
		do {
			System.out.println("Bienvenue dans notre jeu de nombre secret. Souhaitez vous jouer ?");
			answer = scan.next();
		} while(!answer.equalsIgnoreCase("non")&& !answer.equalsIgnoreCase("oui")&& !answer.equalsIgnoreCase("o") && !answer.equalsIgnoreCase("n"));
		do {
			if (answer.equalsIgnoreCase("oui")|| answer.equalsIgnoreCase("o")) {
				do {
					System.out.println("Faite un proposition : ");
					proposedNumber = scan.nextInt();
					count += 1;
					if (proposedNumber > secretNumber) {
						System.out.println("Votre nombre est trop grand.");
					}
					else if (proposedNumber < secretNumber){
						System.out.println("Votre nombre est trop petit.");
					}
					for(int i = 0 ; i < numberProposedTable.length; i++) {
						numberProposedTable[i] = proposedNumber;
					}
				} while(proposedNumber != secretNumber);
					
				System.out.println("Vous avez trouvé le nombre secret en " + count + " coups. Nombre secret : " + secretNumber);
			}
			else {
				System.out.println("Merci d'avoir joué à notre jeu du nombre secret");
			}
			do {
				System.out.println("Voulez vous rejouer ?");
				 response = scan.next();
			} while(!response.equalsIgnoreCase("non")&& !response.equalsIgnoreCase("oui")&& !response.equalsIgnoreCase("o") && !response.equalsIgnoreCase("n"));
			secretNumber =  min + (int)(Math.random() * ((max - min) + 1));
		} while (response.equalsIgnoreCase("oui")|| response.equalsIgnoreCase("o"));
		scan.close();
	}
}
