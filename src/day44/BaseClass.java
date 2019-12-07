package day44;


class TestAbstractConcept {
    public static void main(String[] args) {
       Derived d1 = new Derived();
        d1.study();

    }
}

public abstract class BaseClass {
    public abstract void study();
}

class Derived extends BaseClass {
    @Override
    public void study() {
        System.out.println("Studing Derived");
    }




}

