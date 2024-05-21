import java.util.*;
import java.io.*;

public class Sumofn {

    public static void main(String[] a) {

        int num = 100, s = 0;

        for(int i = 1; i <= num; ++i)
        {
           
            s += i;
        }

        System.out.println(s);
    }
}