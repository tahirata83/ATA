package StudySelf;

public class MyClass {
    public static void main(String[] args) {
        Cube cube1 = new Cube();
        System.out.println(cube1.getCubeVolume());


        Triangle triangle1 = new Triangle();


        System.out.println(triangle1.getPerimeterTriangle());
        System.out.println(triangle1.getAreaTriangle());
        System.out.println("====================================================");
        Triangle triangle2 = new Triangle(6, 8, 9, 10);
        System.out.println(triangle2.getAreaTriangle());
        System.out.println(triangle2.getPerimeterTriangle());
        System.out.println("====================================================");

    }}
