package day32.task;

public class Task8 {
    public int x;
    public int y;

    public int getPerimeter(int x, int y) {
        int perimeter = x+y+x+y;
        return perimeter;
    }

    public int getArea(int x, int y) {
        int area = x * y;
        return area;
    }

    public static void main(String[] args) {
        Task8 r = new Task8();
        System.out.println(r.getPerimeter(4,5));
        System.out.println(r.getArea(4,5));
    }
}