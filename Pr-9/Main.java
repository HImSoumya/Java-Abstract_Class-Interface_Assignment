// Design an abstract class `Doctor` with method `treatPatient()`. Implement subclasses `Surgeon` and `Dentist`.

abstract class Doctor {

    abstract void treatPatient();
}

class Surgeon extends Doctor {

    @Override
    void treatPatient() {
        System.out.println("Surgeon is performing surgery on the patient.");
    }
}

class Dentist extends Doctor {

    @Override
    void treatPatient() {
        System.out.println("Dentist is treating the patient's teeth.");
    }
}

public class Main {

    public static void main(String[] args) {

        Doctor d;

        d = new Surgeon();
        d.treatPatient();

        System.out.println();

        d = new Dentist();
        d.treatPatient();
    }
}