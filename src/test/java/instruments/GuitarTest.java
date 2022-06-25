package instruments;

import instruments.enums.Colors;
import instruments.enums.GuitarTypes;
import instruments.enums.Materials;
import instruments.enums.Types;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;
    @Before
    public void before() {
        guitar = new Guitar("Acoustic Guitar", Types.STRING, Colors.MAROON, Materials.WOOD, GuitarTypes.ACOUSTIC);
    }

    @Test
    public void getInstrumentName() {
        assertEquals("Acoustic Guitar", guitar.getName());
    }

    @Test
    public void getType() {
        assertEquals( Types.STRING, guitar.getType());
    }

    @Test
    public void getColor() { assertEquals(Colors.MAROON, guitar.getColor());
    }

    @Test
    public void getMaterial() { assertEquals(Materials.WOOD, guitar.getMaterial());
    }

    @Test
    public void play() { assertEquals("The Acoustic Guitar is playing and it's saying I will make you a rock star", guitar.play());
    }

    @Test
    public void getGuitarType() {
        assertEquals(GuitarTypes.ACOUSTIC, guitar.getGuitarType());
    }
}