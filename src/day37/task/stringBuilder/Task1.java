package day37.task.stringBuilder;

import java.util.ArrayList;

// you have list of student names
// you need to return a string which is first letter of their names
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Ali");
        str.add("Veli");
        str.add("Samet");
        str.add("Murat");
        str.add("Serdar");
        str.add("Tahir");


        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.size();i++) {

            String s = str.get(i);
            sb.append(s.substring(0, 1));
        }
            System.out.println(sb);

        }
}