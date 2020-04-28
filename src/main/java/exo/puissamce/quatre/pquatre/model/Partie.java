package exo.puissamce.quatre.pquatre.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partie {
<<<<<<< HEAD
	private List<Joueur> joueurs=new ArrayList<Joueur>();
=======
	private List<Joueur> joueurs;
>>>>>>> 26bb81648469eac005cf409167118a06486fca72
	private Grille grille;
	private boolean terminee;
	private Date dateDebut;
	private Date dateFin;
	private Joueur gagnant;


	public Partie() {
		super();
<<<<<<< HEAD
=======
		this.joueurs=new ArrayList<Joueur>();
>>>>>>> 26bb81648469eac005cf409167118a06486fca72
	}

	public Grille getGrille() {
		return grille;
	}

	public void setGrille(Grille grille) {
		this.grille = grille;
	}


	public boolean isStatut() {
		return terminee;
	}

	public void setStatut(boolean statut) {
		this.terminee = statut;
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

	public boolean isTerminee() {
		return terminee;
	}

	public void setTerminee(boolean terminee) {
		this.terminee = terminee;
	}

	public List<Joueur> getJoueurs() {
		return joueurs;
	}

<<<<<<< HEAD
	public void ajouterJoueur(Joueur joueur) throws Exception{
		if(joueurs.size()<=2)
		  this.joueurs.add(joueur);
		else throw new Exception("Pas plus de deux joueurs pour une partie");
	}
=======
>>>>>>> 26bb81648469eac005cf409167118a06486fca72
}
