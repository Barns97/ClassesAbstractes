package proves;

import java.awt.Color;
import figures.*;
import java.util.Scanner;

public class ProvaFigures {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int menu = 0;
    boolean error = false, sortir = false;

    Cercle c = new Cercle (1, "Cercle1", Color.blue, 23.87);
    Rectangle r = new Rectangle (2, "Rectangle1", Color.white, 8,2);
    Triangle t = new Triangle (3, "Triangle1", Color.black, 7,3);

    do{

      try{
        error=true;
        System.out.println("\n\n--------------------MENÚ-------------------------");
        System.out.println("1-Cercle");
        System.out.println("2-Rectangle");
        System.out.println("3-Triangle");
        System.out.println("0-Sortir");
        menu = sc.nextInt();

        switch (menu) {
          case 1:
            System.out.println("");
            c.visualitzar();
            break;
          case 2:
            System.out.println("");
            r.visualitzar();
            break;
          case 3:
            System.out.println("");
            t.visualitzar();
            break;
          case 0:
            sortir = true;
            break;
        }
      }catch (NullPointerException e){
        System.out.println("\nEntri una opció valida.\n");
        error= true;
      }


    }while (!sortir || !error);
  }
}
