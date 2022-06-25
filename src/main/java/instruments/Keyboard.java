package instruments;

import instruments.enums.Colors;
import instruments.enums.KeyboardTypes;
import instruments.enums.Materials;
import instruments.enums.Types;

public class Keyboard extends Instrument{
    private KeyboardTypes keyboardType;
    public Keyboard(String instrumentName, Types type, Colors color, Materials material, KeyboardTypes keyboardType) {
        super(instrumentName, type, color, material);
        this.keyboardType = keyboardType;
    }

    public KeyboardTypes getKeyboardType() {
        return keyboardType;
    }
}
