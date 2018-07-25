import java.util.Scanner;

public class Personne2 {

	String nom;
	String prenom;
	String profession;
	String situationFamiliale;
	int age;
	String email;
	int tel;
	String adresse_localisation;
	String niveauDetudes;
	String situationPro;
	String domainePro;
	boolean permis;
	
//Methode à appeler dans le main
	
	/*String creerInfos() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez votre nom:");
		nom = scan.nextLine();
		System.out.println("Entrez votre prenom:");
		prenom = scan.nextLine();
		System.out.println("Entrez votre profession:");
		profession = scan.nextLine();
		System.out.println("Entrez votre situation familiale:");
		situationFamiliale = scan.nextLine();
		System.out.println("Entrez votre âge:");
		age = Integer.parseInt(scan.nextLine());
		System.out.println("Entrez votre email:");
		email = scan.nextLine();
		System.out.println("Entrez votre n° de télephone:");
		tel = Integer.parseInt(scan.nextLine());
		System.out.println("Entrez votre localisation/pays:");
		adresse_localisation = scan.nextLine();
		System.out.println("Entrez votre niveau d'etudes:");
		niveauDetudes = scan.nextLine();
		System.out.println("Entrez votre situation professionnelle:");
		situationPro = scan.nextLine();
		System.out.println("Entrez votre domaine professionnel:");
		domainePro = scan.nextLine();
		permis = Boolean.parseBoolean(scan.nextLine());
		
		return nom + prenom + profession + situationFamiliale + age + email + tel + adresse_localisation + niveauDetudes + situationPro + domainePro + permis;
	}*/


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public String getSituationFamiliale() {
		return situationFamiliale;
	}


	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public String getAdresse_localisation() {
		return adresse_localisation;
	}


	public void setAdresse_localisation(String adresse_localisation) {
		this.adresse_localisation = adresse_localisation;
	}


	public String getNiveauDetudes() {
		return niveauDetudes;
	}


	public void setNiveauDetudes(String niveauDetudes) {
		this.niveauDetudes = niveauDetudes;
	}


	public String getSituationPro() {
		return situationPro;
	}


	public void setSituationPro(String situationPro) {
		this.situationPro = situationPro;
	}


	public String getDomainePro() {
		return domainePro;
	}


	public void setDomainePro(String domainePro) {
		this.domainePro = domainePro;
	}


	public boolean isPermis() {
		return permis;
	}


	public void setPermis(boolean permis) {
		this.permis = permis;
	}
	

	
}
