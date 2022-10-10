package surcharge;

import java.util.Scanner;

public class Employes {
	
	public static Scanner scann;
	public static double Salaire;
	
	public  static void Mensuel() {
		
	int nombreHeur,tarif;
	//saisir le nombre heure de travail
	System.out.println(" Le nombre d’heure total ne doit pas dépasser 50 heures par semaine");
	do {
		System.out.print("donnez votre  nombre d'heur  de travail par chemain");
	
	nombreHeur=scann.nextInt();

	
	} while (nombreHeur> 50);
	
	//sais le tarif 
	System.out.println(" Le tarif par heure ne doit pas être inférieur à 25 DH par heur");
	
	do {
		System.out.print("donnez votre  tarif  par heure");
		tarif=scann.nextInt();
		
		
	} while (tarif< 25);
	//calcul le salaire
	if (nombreHeur> 40) Salaire=(40 * tarif) +((nombreHeur-40)*(tarif * 1.5));
	else Salaire=nombreHeur*tarif;
	
	
	
	}
	public static void hebdomadaire() {
		int nombreHeur,tarif;
		//saisir le nombre heure de travail
		System.out.println(" Le nombre d’heure total ne doit pas dépasser 200 heures par mois");
		
		do {
			System.out.println("Vous pouver saisir combient d’heure travaillée par mois : ");
			nombreHeur=scann.nextInt();
			
			
		} while (nombreHeur> 200);
		//sais le tarif 
		System.out.println(" Le tarif par heure ne doit pas être inférieur à 25 DH par heur");
		do {
			System.out.println("\t\tcombient est Le tarif par heure pour vous : ");
			tarif=scann.nextInt();
		} while (tarif< 20);
		//Le_calcule 
				if (nombreHeur > 180) Salaire = (180 * tarif) + ((nombreHeur - 180) * (tarif * 1.5));
				else Salaire = nombreHeur * tarif;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char Mod_Payment;
		String Nom;
		
		System.out.print("+++++++++++B O N J O U R++++++++++++++++");
		
		
		
		System.out.print("\t+++++++++++++++++++Entrez votre Nom+++++++++++++++++\n");
		
		
		scann=new Scanner(System.in);
		Nom=scann.next();
		
		System.out.print("\t++++++++Bienvenue"              +Nom+"++++++++");
		
		System.out.print("++++++Entrez votre mode de payement++++");
		System.out.println("\ttmensuel taper M \thebdomadaire taper H\"");
		do {
			
			Mod_Payment=Character.toUpperCase(scann.next().charAt(0));
			
		} while (Mod_Payment!= 'M' && Mod_Payment!= 'H');
		switch (Mod_Payment) {
		case 'M':
			Mensuel();
			break;
		case 'H':
			hebdomadaire();
			break;
		}
		System.out.println(" ________________________________________________");	
		System.out.println("│\tVotre valaire est " + String.format("%.2f", Salaire) + "│");	
		System.out.println("|________________________________________________|");
	}
		

	}
		
	


