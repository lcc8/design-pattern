package adapter.iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class IteratorEnumeration implements Enumeration {
    ArrayList<?> list;

    public IteratorEnumeration(ArrayList<?> list) {
        this.list = list;
    }

    @Override
    public boolean hasMoreElements() {
        return list.iterator().hasNext();
    }

    @Override
    public Object nextElement() {
        return list.iterator().next();
    }
}
