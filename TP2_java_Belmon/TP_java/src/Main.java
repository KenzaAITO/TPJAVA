//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import TP2.exercice1.CarteAJouer;

public class Main {
    public static void main(String[] args) {

        CarteAJouer carte1 = new CarteAJouer("SPADE", "AS");

        CarteAJouer carte2 = new CarteAJouer("HEART", "QUEEN");

        System.out.print("Carte 1 : " + carte1 + "\n" + "Carte 2 : " + carte2);


    }
}