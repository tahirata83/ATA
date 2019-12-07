package StudySelf;

public class Triangle {
    int side1;
    int side2;
    int side3;
    int heigth1;

    public int getPerimeterTriangle(){
        return (side1+side2+side3);
    }

    public int getAreaTriangle(){
        return (side1*heigth1/2);
    }

    Triangle(){
         side1=3;
         side2=4;
         side3=5;
         heigth1=6;
    }

    Triangle(int a,int b,int c,int d){
        side1=a;
        side2=b;
        side3=c;
        heigth1=d;
    }
}
