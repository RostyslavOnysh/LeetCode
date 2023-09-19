package modArrayList;

import java.util.ArrayList;

public class ModArrayListImpl<D> extends ArrayList<D> {
    public D getUsingMod(int index) {
        int validIndex = Math.abs(index % this.size());
        return this.get(validIndex);
    }
}
