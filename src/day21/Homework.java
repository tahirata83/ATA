package day21;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
public class Homework {


    static class WordCount {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input the string :");
            String str = in.nextLine();
            System.out.println("number of words in the string:" + wordcount(str));
        }

        public static int wordcount(@NotNull String sentence) {
            int count = 0;
            char ch[] = new char[sentence.length()];
            for (int i = 0; i < sentence.length(); i++) {

                Character letterChar = sentence.charAt(i);

                ch[i] = sentence.charAt(i);

                if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                    count++;
            }
            return count;
        }
    }}
    //The quick brown fox jumps over the lazy dog