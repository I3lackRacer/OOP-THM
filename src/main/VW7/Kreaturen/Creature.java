package main.VW7.Kreaturen;

import java.util.Random;

public class Creature {
    String name;
    int vitality;
    boolean lovely;
    Creature[] parentOf = new Creature[5];
    int counter = 0;

    static Random rand = new Random();

    Creature(String name) {
        this(name, rand.nextBoolean(), rand.nextInt(101));
    }

    Creature(String name, boolean lovely, int vitality) {
        assert vitality >= 0 && vitality <= 100 : "0 <= Vitalität <= 100";
        assert name != null && !name.isEmpty() : "Gib mir einen richtigen Namen";
        this.name = name;
        this.lovely = lovely;
        this.vitality = vitality;
    }

    void reduceVitality(int amount) {
        assert amount >= 0;
        vitality -= amount; // vitality = vitality - amount;
        if (vitality < 0) vitality = 0;
    }

    boolean canJoin(Creature other) {
        return this != other && this.vitality >= 50 && other.vitality >= 50 && counter < parentOf.length;
    }

    Creature join(Creature other) {
        assert canJoin(other) : "Unable to join " + other;
        boolean loveliness = this.lovely == other.lovely ? this.lovely : rand.nextBoolean();
        Creature child = new Creature(this.name + other.name, loveliness, (this.vitality + other.vitality) / 2);
        parentOf[counter++] = child;
        reduceVitality(33);
        return child;
    }

    public String toString() {
        String returnString = name + "(" + (lovely ? "lovely" : "unlovely") + ", " + vitality + ")";
        for (Creature c: parentOf) {
            if (c == null)
                continue;
            returnString += "\nparentof " + c;
        }
        return returnString;

    }
}