package iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by len on 2017. 1. 16..
 */
public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector v = new Vector(Arrays.asList(args));
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
