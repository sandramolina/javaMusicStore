package instruments;

import instruments.enums.Colors;
import instruments.enums.GuitarTypes;
import instruments.enums.Materials;
import instruments.enums.Types;

public class Guitar extends Instrument{

    private GuitarTypes guitarType;

    public Guitar(String instrumentName, Types type, Colors color, Materials material, GuitarTypes guitarType) {
        super(instrumentName, type, color, material);
        this.guitarType = guitarType;
    }

    public GuitarTypes getGuitarType() {
        return guitarType;
    }
}
