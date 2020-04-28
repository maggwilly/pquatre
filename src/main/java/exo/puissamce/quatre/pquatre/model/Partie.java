package exo.puissamce.quatre.pquatre.model;

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
public Partie( Joueur[] joueur,Grille grille,int joueurCourant, boolean statut,int etat,Date dateDebut,Date dateFin,Joueur gagnant){
	
	this.joueur=joueur;
	this.grille=grille;
	this.joueurCourant=joueurCourant;
	this.statut=statut;
	this.etat=etat;
	this.dateDebut=dateDebut;
	this.dateFin=dateFin;
	this.gagnant=gagnant;
	
}
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
public void setJoueurCourant(int joueurCourant)  {
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
	
	/*methode permettant d'ajouter un jour*/
}
int nbreJoueur=0;
public void ajouterJoueur(Joueur j)
{ ++nbreJoueur;

if (nbreJoueur<=2){
	joueur[nbreJoueur -1]=j;	
}
else
{
	System.out.println( " pas plus de deux  joueur");
}
	
}
}
	


 


