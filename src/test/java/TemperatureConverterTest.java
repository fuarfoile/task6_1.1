import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    TemperatureConverter testobj;
    double delta = 0.01;

    @Before
    public void initialize() {
        testobj= new TemperatureConverter();
    }
    @Test
    public void testConvertFtoC(){
        assertEquals(13, testobj.convertFtoC(55.4), delta);
    }
    @Test
    public void testConvertCtoF(){
        assertEquals(107.6, testobj.convertCtoF(42), delta);
    }
    @Test
    public void testConvertCtoK(){
        assertEquals(315.15, testobj.convertCtoK(42), delta);
    }
    @Test
    public void testConvertKtoC(){
        assertEquals(-268.95, testobj.convertKtoC(4.2), delta);
    }
    @Test
    public void testConvertFtoK(){
        assertEquals(42.04, testobj.convertFtoK(-384), delta);
    }
    @Test
    public void testconvertKtoF(){
        assertEquals(-328.27, testobj.convertKtoF(73), delta);
    }
}
