package exo.puissamce.quatre.pquatre;

public class Humain extends Joueur {
private String nom;
private String prenom;
	/*definition des  accesseurs et des mutateurs*/

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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String email;
	public Humain () {
		
	}
	public void joue(){
		System.out.println("je suis un humain");
	}
}
