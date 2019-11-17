package day32.task;

public class Task7 {
        public static void main(String [] args ) {


             {
                String result = "";
                int legs = 4;
                if (legs == 0) {
                    result = "Not cute";
                } else if (legs == 2) {
                    result = "Some what cute";
                } else if (legs == 4) {
                    result = "Perfect";
                } else if (legs < 0) {
                    result = "OMG";
                } else if (legs > 4) {
                    result = "MUTANT";
                }


            }
        }}