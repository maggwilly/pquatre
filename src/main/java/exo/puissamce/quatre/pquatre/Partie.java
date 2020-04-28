package exo.puissamce.quatre.pquatre;

import java.sql.Date;

public class Partie {
	
private Joueur[] joueur ={};
private Grille grille;
private int joueurCourant;
private boolean statut;
private int etat;
private Date dateDebut;
private Date dateFin;
private Joueur gagnant;

public Joueur[] getJoueur() {
	return joueur;
}
public void setJoueur(Joueur[] joueur) {
	this.joueur = joueur;
}
public Grille getGrille() {
	return grille;
}
public void setGrille(Grille grille) {
	this.grille = grille;
}
public int getJoueurCourant() {
	return joueurCourant;
}
public void setJoueurCourant(int joueurCourant) {
	this.joueurCourant = joueurCourant;
}
public boolean isStatut() {
	return statut;
}
public void setStatut(boolean statut) {
	this.statut = statut;
}
public int getEtat() {
	return etat;
}
public void setEtat(int etat) {
	this.etat = etat;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
public Joueur getGagnant() {
	return gagnant;
}
public void setGagnant(Joueur gagnant) {
	this.gagnant = gagnant;
}




 
}

