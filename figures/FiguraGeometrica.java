package figures;

import java.awt.*;

public abstract class FiguraGeometrica {
   protected int codi=0;
   protected String nom="";
   protected Color color=Color.white;

   public FiguraGeometrica (int ncodi, String nnom, Color ncolor) {
      if (ncodi>0){
         codi = ncodi;
         nom = nnom;
         color = ncolor;
      }

   }


   public void setCodi(int nouCodi)  {
      if (nouCodi>=0) codi = nouCodi;
   }

   public int getCodi () {
      return codi;
   }

   public void setNom (String nouNom)  {
      nom = nouNom;
   }

   public String getNom () {
      return nom;
   }

   public void setColor (Color nouColor) {
      color = nouColor;
   }

   public Color getColor () {
      return color;
   }


   public void visualitzar () {
      System.out.print(toString());
   }

   public abstract double area();

   public String toString() {
      String s = "Codi: "+codi+"\n"
              + "Nom: "+nom+"\n"
              + "Color: "+color+"\n";
      return s;
   }

   public boolean equals(FiguraGeometrica f) {
     if (this.codi == f.getCodi()) return true;
     else return false;
   }

}