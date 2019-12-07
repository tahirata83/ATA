package StudySelf;

public class StudySelf {


    public static void main(String[] args) {
        Teacher tech1 = new Teacher();
        tech1.setName("Taber");
        tech1.setSurname("Aaren");
        tech1.setBranch("Math");
        tech1.setHours(21);
        tech1.setSalary(1100);
        tech1.setHasMaster(true);

        System.out.println(tech1.getName() + " " + tech1.getSurname()+" is a " + tech1.getBranch() + "  teacher " + " and he has "+ tech1.getHours() + " hours with salary " + tech1.getSalary() + " euro." );
    }
}
