package day22_Practice;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
    int [] num1= {3,49,12,6,21};
    String [] s1= {"I","am","learning","Java."};

  for(int i=num1.length-1;i>=0; i--) {
      Arrays.sort(num1);
        System.out.println(num1[i]);
    }
        for(int j=s1.length -1; j>=0;j--) {
        Arrays.sort(s1);
        System.out.println(s1[j]);
    }
}
    //part2, copy reverse ordered array to new array;

    //output should be [10, 5, 3, 1]

}
