package otherProducts;

import behaviours.Sellable;

public class Accesory implements Sellable {
    private String name;

    public Accesory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
