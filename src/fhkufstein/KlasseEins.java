package fhkufstein;

public class KlasseEins {
    public static void main(String[] args) {

       for (int i=1; i<4; i+=2)
       //Schleife wird 2x aufgerufen, da sich die i jedes Mal um 2 erhöht.
       {
           printName();

       }

    }

    public static void printName()
    {
        System.out.println("Magdalena");
    }
}
