package main.VW7.Kreaturen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    // TODO Make better tests when needed. For now just for execution.
    @Test
    public void TestCreature() {
        Creature john = new Creature("John", true, 100);
        Creature vanessa = new Creature("Vanessa", true, 100);
        System.out.println(john);
        System.out.println(vanessa);
        System.out.println(john.canJoin(vanessa));
        Creature baby = john.join(vanessa);
        baby.vitality = 100;
        baby.join(vanessa);

        System.out.println(john);
    }
}