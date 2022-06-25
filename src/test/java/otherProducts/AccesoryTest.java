package otherProducts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccesoryTest {
    Accesory accesory;
    @Before
    public void before() { accesory = new Accesory("Drum Sticks");
    }

    @Test
    public void getAccesoryName() { assertEquals("Drum Sticks", accesory.getName());
    }
}