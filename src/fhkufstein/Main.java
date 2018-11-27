package fhkufstein;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

    String eingabe = JOptionPane.showInputDialog("gib etwas ein");

    switch (eingabe){
        case "20": JOptionPane.showMessageDialog(null, (Integer.parseInt(eingabe))*21);
        case "Peter Pan": JOptionPane.showMessageDialog(null, "Bangarang");
        default: System.err.println("blablabla");
    }

    }
}



