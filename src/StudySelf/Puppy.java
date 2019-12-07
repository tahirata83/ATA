package StudySelf;


public class Puppy {
    int pupyAge;

    public int getPupyAge() {
        return pupyAge;
    }

    public void setPupyAge(int pupyAge) {
        this.pupyAge = pupyAge;
    }

    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name );
    }


    public static void main(String []args) {
        // Following statement would create an object myPuppy

        Puppy myPuppy = new Puppy("Puppy");
    }
}