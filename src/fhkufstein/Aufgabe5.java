package fhkufstein;

public class Aufgabe5 {
    public static void main(String[] args) {
        System.out.println(add(5,10));
        System.out.println(add (5.0, 10.0));

    }

    public static int add(int a, int b)
    {
     return a+b;
    }
    public static double add(double a, double b)
    {
        return a+b;
    }
}
