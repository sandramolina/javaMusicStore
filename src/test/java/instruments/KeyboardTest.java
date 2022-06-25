package instruments;

import instruments.enums.Colors;
import instruments.enums.KeyboardTypes;
import instruments.enums.Materials;
import instruments.enums.Types;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    Keyboard keyboard;
    @Before
    public void before() {
        keyboard = new Keyboard("Piano", Types.KEYBOARD, Colors.COLORFUL, Materials.PLASTIC, KeyboardTypes.PIANO);
    }

    @Test
    public void getInstrumentName() { assertEquals("Piano", keyboard.getName());
    }

    @Test
    public void getType() { assertEquals(Types.KEYBOARD, keyboard.getType());
    }

    @Test
    public void getColor() { assertEquals(Colors.COLORFUL, keyboard.getColor());
    }

    @Test
    public void getMaterial() { assertEquals(Materials.PLASTIC, keyboard.getMaterial());
    }

    @Test
    public void play() { assertEquals("The Piano is playing and it's saying I am awesome and everyone wants to know how to play me", keyboard.play());
    }

    @Test
    public void getKeyboardType() { assertEquals(KeyboardTypes.PIANO, keyboard.getKeyboardType());
    }
}