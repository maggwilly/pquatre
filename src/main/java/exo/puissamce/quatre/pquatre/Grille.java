package exo.puissamce.quatre.pquatre;

import javax.swing.event.EventListenerList;

public class Grille {
private Pion[][] cases ={{},{}};

private  EventListenerList listerner;
/*definition des methodes*/

public Pion getPionAt(int ligne,int colonne)
{
	
	return cases[20][20];
}
public void setPionAt(int ligne,int colonne)
{
	
}
public void vider()
{
	
}
public boolean isColonnePlaine(int colonne)/*cette methode permet de controler si une colone est plaine ou non*/
{
	return true;
}
public  int getDeterminePositionLibre(int colonne)/*cette methode permet de determiner la dernire position libre*/
{
	return colonne;
	}
public boolean isGrillePlaine()/*permet de savoir si la grille est vide ou plaine,ce qui permet de savoir si la partie est terminee*/
{
	return true;}
public void addPionListener(PionListener listener)
{
	
}
public void removePionListener(PionListener listener)
{
	
}
public void firePionListener(int colonne,int ligne,Pion pion){
	
}
}
