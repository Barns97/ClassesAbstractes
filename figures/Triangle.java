package figures;

import java.awt.*;
import java.text.DecimalFormat;

public class Triangle extends FiguraGeometrica {
   private double base=0, altura=0;
   
   public Triangle (int ncodi, String nnom, Color ncolor, double nbase, double naltura) {
      super (ncodi, nnom, ncolor);
      if (nbase>0) base=nbase;
      if (naltura>0) altura=naltura;
   }


   public void setBase (double novaBase) {
      if (novaBase>=0) base = novaBase;
   }

   public double getBase() {
      return base;
   }

   public void setAltura (float novaAltura) {
      if (novaAltura>=0) altura = novaAltura;
   }

   public double getAltura() {
      return altura;
   }

   
   public double area () {
      return base*altura/2;
   }

   public void visualitzar () {
     System.out.print(toString());
   }

   public String toString() {
     DecimalFormat df = new DecimalFormat("#.00");
     String s = "Triangle\n"
             + super.toString()
             + "Base: "+df.format(base)+"\n"
             + "Altura: "+df.format(altura)+"\n"
             + "Àrea: "+df.format(area())+"\n";
     return s;

   }

}