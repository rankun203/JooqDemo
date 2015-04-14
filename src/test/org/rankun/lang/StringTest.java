package org.rankun.lang;

import org.junit.Test;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
public class StringTest {

    @Test
    public void stringTest() {
        int i = 0;
        long prev_time = System.currentTimeMillis();
        long time;

        for (i = 0; i < 100000; i++) {
            String s = "Blah" + i + "Blah";
        }
        time = System.currentTimeMillis() - prev_time;

        System.out.println("Time after for loop " + time);

        prev_time = System.currentTimeMillis();
        for (i = 0; i < 100000; i++) {
            String s = String.format("Blah %d Blah", i);
        }
        time = System.currentTimeMillis() - prev_time;
        System.out.println("Time after for loop " + time);

    }

}

