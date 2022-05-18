import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacorialTest {
    Facorial fact = new Facorial();
    @Test
    public  void twoFactMusbeTwo(){

        assertEquals(2,fact.fact(2));
    }
    @Test
    public void fiveFactoMustRetur120(){
        assertEquals(120,fact.fact(5));
    }
    @Test
    public void zeroFactMustBeZero(){
        assertEquals(0,fact.fact(0));
    }

}