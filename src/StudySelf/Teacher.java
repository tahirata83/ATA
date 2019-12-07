package StudySelf;

public class Teacher {
    String name;
    String surname;
    String branch;
    int hours;
    int salary;
    boolean hasMaster;

    public boolean isHasMaster() {
        return hasMaster;
    }

    public void setHasMaster(boolean hasMaster) {
        this.hasMaster = hasMaster;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
