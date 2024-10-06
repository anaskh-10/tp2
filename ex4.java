package Td;

import Td.ex3.Livres;

public class ex4 {
	static class Livres {
		private String titre,auteur;
		private float nbPages ;
		private double prix;
		private boolean fixPrix;
		public void livre(String autuer,String titre) {
			this.auteur=autuer;
			this.setTitre(titre);
		}
		public String getAuteur() {
			return auteur;
		}
		public void setNbPages(int nb) {
			nbPages=nb;
		}
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public float getNbPages() {
			return nbPages;
		}
		public void setNbPages(float nbPages) {
			if(nbPages>20) {
				this.nbPages = nbPages;
			}else {
				System.out.println("le nombre indique est faible");
			}

		}
		public double getPrix() {
			return prix;
		}
		public void setAuteur(String auteur) {
			this.auteur=auteur;
		}
		public String toString() {
			return "Livre " + titre +" , "+auteur+", contenant "+nbPages+" , "+prix;   
		}
		public void decrire() {
			System.out.println(this.toString());
		}
		public Livres() {
			this.titre=" ";
			this.auteur=" ";
			this.nbPages=0;
			this.prix=0;
			this.fixPrix=false;
		}
		public Livres(String titre,int nbPages) {
			this.titre=titre;
			this.auteur=" ";
			this.nbPages=nbPages;
			this.prix=0;
			this.fixPrix=false;
		}
		public Livres(String titre,String auteur,int nbPages,double prix) {
			this.titre=titre;
			this.auteur=auteur;
			this.nbPages=nbPages;
			this.prix=prix;
			this.fixPrix=true;
		}
		public boolean testPrix() {
			return fixPrix;
		}
		public void setPrix(double prix) {
			if(!fixPrix) {
				this.prix=prix;
				fixPrix=true;
			}else
				System.out.println("le prix est deja fixe ");
		}
		public static void main(String[] args) {
			Livres[] tab= new Livres[3];
			tab[0] = new Livres("L'alchimiste", "Coelho", 225,15.2);
			tab[1] = new Livres("La Tunisie",508);
			tab[2]= new Livres ("Harry Potter ","Jk Rowling ",0,17.2);
			System.out.println("voici les livres \n");
			for(Livres livre :tab ) {
				livre.decrire();
			}
			tab[1].setAuteur("Paulo Coelho");
			tab[2].setNbPages(461);
			tab[1].setPrix(14.01);
			
			tab[0].setPrix(14);
			System.out.println("les livres apres la modification \n");
			for(Livres livre :tab ) {
				livre.decrire();
			}
			
		}
	}

}
