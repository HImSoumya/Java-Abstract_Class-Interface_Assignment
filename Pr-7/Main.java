// Design an abstract class `Character` with methods `attack()` and `defend()`. Implement subclasses `Warrior`, `Mage`, and `Archer`.

abstract class Character {

    abstract void attack();

    abstract void defend();
}

class Warrior extends Character {

    @Override
    void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    @Override
    void defend() {
        System.out.println("Warrior blocks attack using shield!");
    }
}

class Mage extends Character {

    @Override
    void attack() {
        System.out.println("Mage attacks using fire magic!");
    }

    @Override
    void defend() {
        System.out.println("Mage creates a magical barrier!");
    }
}

class Archer extends Character {

    @Override
    void attack() {
        System.out.println("Archer attacks using arrows!");
    }

    @Override
    void defend() {
        System.out.println("Archer dodges the attack quickly!");
    }
}

public class Main {

    public static void main(String[] args) {

        Character c;

        c = new Warrior();
        c.attack();
        c.defend();

        System.out.println();

        c = new Mage();
        c.attack();
        c.defend();

        System.out.println();

        c = new Archer();
        c.attack();
        c.defend();
    }
}