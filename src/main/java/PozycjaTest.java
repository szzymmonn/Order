import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PozycjaTest {
    @Test

    public void  testTworzeniaPozcyji(){
        //given
        Pozycja pozycja = new Pozycja();
        //when
        pozycja.setNazwaTowaru("chleb");
        pozycja.setIleSztuk(2);
        pozycja.setCena(5.20);
        //then
        assertEquals("chleb", pozycja.getNazwaTowaru());
        assertEquals(2, pozycja.getIleSztuk());
        assertEquals(Double.valueOf(5.20), Double.valueOf(pozycja.getCena()));
    }

    @Test
    public void testKonstruktoraZParametrami(){
        //given
        Pozycja pozycja1 = new Pozycja("chleb", 2, 5.20);
        //when
        //then
        assertEquals("chleb", pozycja1.getNazwaTowaru());
        assertEquals(2, pozycja1.getIleSztuk());
        assertEquals(Double.valueOf(5.20), Double.valueOf(pozycja1.getCena()));
    }
    @Test
    public void testObliczWartosc() {
        //given
        Pozycja pozycja2 = new Pozycja("kielbasa", 3, 5.00);
        //when
        double wartoscPozycji = pozycja2.obliczWartosc();
        //then
        assertEquals(Double.valueOf(15), Double.valueOf(wartoscPozycji));
    }
    @Test
    public void testToString() {
        //given
        Pozycja pozycja3 = new Pozycja("chleb", 2, 2.50);
        //when
        System.out.println(pozycja3);
    }
}
