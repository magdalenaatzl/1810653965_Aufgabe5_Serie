package fhkufstein;

public class KlasseEins {
    public static void main(String[] args) {

       for (int i=1; i<4; i+=2)
       //Schleife wird 2x aufgerufen, da sich die i jedes Mal um 2 erhöht.
       {
           printName();

       }
       int i = 0;
       while (i<5){
       printName();
       printAge(21+i);
       i++;
       }

    }

    public static void printName()
    {
        System.out.println("Magdalena");
    }
    public static int printAge(int age)
    {
        System.out.println("Alter: "+age);
        return age;
    }
}
