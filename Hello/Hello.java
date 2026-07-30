 import java.util.Scanner;
 
 class Hello{
 
	public static void main(String[] args){
		String lastname = ""; 
		String firstname = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue dans mon programme java. ");
		System.out.println("Quel est votre nom? ");
		lastname = scan.next();
		System.out.println("Salut " + lastname);
		System.out.println("Quel est votre prénom? ");
		firstname = scan.next();
		System.out.println("Bienvenue " + lastname + " " + firstname);
		scan.close();
	}
 }