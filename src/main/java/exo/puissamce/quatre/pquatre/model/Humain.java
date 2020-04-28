package exo.puissamce.quatre.pquatre.model;

public class Humain extends Joueur {
private String nom;
private String prenom;
private String email;


public Humain() {
	super();
}


public Humain(String nom) {
	super();
	this.nom = nom;
}


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


}