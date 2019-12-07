package day37.task.stringBuilder;

import org.junit.Assert;
import org.junit.Test;

public class Task3 {

    //Using StringBuffer create English alphabet
    //Hint1: you can use ASCII table
    //Hint2: loop(from 'A' to 'Z')
    // return "ABC........XYZ" all 26 letters
    public String getAlphabet() {
        StringBuffer sb = new StringBuffer();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            sb.append(letter);
        }
        return sb.toString();
    }

    //Using StringBuffer get only vowels from alphabet

    @Test
    public void test() {
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = getAlphabet();

        Assert.assertEquals(expected, actual);
    }

}
