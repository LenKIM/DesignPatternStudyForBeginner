package dinermerger;

import java.util.ArrayList;

/**
 * Created by len on 2017. 1. 18..
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int postion = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (postion >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = items.get(postion);
        postion = postion+1;
        return object;
    }
}
