package day17;

public class HomeworkStock {

    public static void main(String[] args) {

        int [] items= { 7,1,5,3,6,4};
        int profit=0;


        for (int i=0; i<items.length-1;i++) {
            if(items[i+1]>items[i]) {



                profit+=(items[i+1]-items[i]);
            }
        }
        System.out.println(profit);
    }}