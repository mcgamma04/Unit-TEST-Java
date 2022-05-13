import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KineticsTest {
    @Test
    public void twoMultlyFiveMustReturnTen(){
       var kent =  new Kinetics();
       assertEquals(10, kent.force(2,5));
    }
    @Test
    public void fiveMultlyFiveMustReturnTweltyfive(){
        var kent =  new Kinetics();
        assertEquals(25, kent.force(5,5));
    }
    @Test
    public void zeroMultlyTenMustReturnZero(){
        var kent =  new Kinetics();
        assertEquals(0, kent.force(0,5));
    }
}