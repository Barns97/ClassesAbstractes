package figures;

import java.awt.*;
import java.text.DecimalFormat;

public class Cercle extends FiguraGeometrica {
   private double radi=0;
   
   public Cercle (int ncodi, String nnom, Color ncolor, double nradi) {
      super (ncodi, nnom, ncolor);
      if (nradi>0) radi=nradi;
   }

   public void setRadi (double nouRadi) {
      if (nouRadi>=0) radi = nouRadi;
   }

   public double getRadi () {
      return radi;
   }

   public double area () {
      return Math.PI * (int) Math.pow(radi, 2);
   }
   
   public void visualitzar () {
     System.out.print(toString());
   }

   public String toString() {
       DecimalFormat df = new DecimalFormat("#.00");
     String s="Cercle\n"
             + super.toString()
             + "Radi: "+radi+"\n"
             + "Àrea: "+df.format(area())+"\n";
     return s;
   }


}