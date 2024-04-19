package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList<String>();
        collection.add("foo");
        collection.add("bar");
        collection.add("baz");
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase() + "");
        }

    }
}
