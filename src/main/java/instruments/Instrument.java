package instruments;

import behaviours.IPlay;
import behaviours.Sellable;
import instruments.enums.Colors;
import instruments.enums.Materials;
import instruments.enums.Types;

public abstract class Instrument implements IPlay, Sellable {
    private String name;
    private Types type;
    private Colors color;
    private Materials material;

    public Instrument(String instrumentName, Types type, Colors color, Materials material) {
        this.name = instrumentName;
        this.type = type;
        this.color = color;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    public Colors getColor() {
        return color;
    }

    public Materials getMaterial() {
        return material;
    }

    public String play(){
        return String.format("The %s is playing and it's saying %s", getName(), type.getSound());
    }
}
