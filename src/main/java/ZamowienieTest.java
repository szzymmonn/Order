import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ZamowienieTest {

        @Test
        public void testKonstruktoraBezArgumentow(){
            //given
            Zamowienie zamowienie = new Zamowienie();
            //when
            List<Pozycja> listaPozycji = new ArrayList<Pozycja>();
            Pozycja pozycja = new Pozycja("Mleko", 12, 2.5);
            Pozycja pozycja2 = new Pozycja("Chleb", 2, 8.5);

            listaPozycji.add(pozycja);
            listaPozycji.add(pozycja2);
            zamowienie.setPozycje(listaPozycji);
            //then
            assertEquals(2, zamowienie.getPozycje().size());
        }

        @Test
        public void testKonstruktoraZArgumentami(){
            //given
            List<Pozycja> listaPozycji = new ArrayList<Pozycja>();
            Pozycja pozycja = new Pozycja("Mleko", 12, 2.5);
            Pozycja pozycja2 = new Pozycja("Chleb", 2, 8.5);

            listaPozycji.add(pozycja);
            listaPozycji.add(pozycja2);
            //when
            Zamowienie zamowienie2 = new Zamowienie(listaPozycji);
            //then
            assertEquals(2, zamowienie2.getPozycje().size());
        }

        @Test
        public void testDodawaniaJednejPozycji(){
            //given
            Zamowienie zamowienie3 = new Zamowienie();
            //when
            Pozycja pozycja3 = new Pozycja("Woda", 10, 1.40);
            zamowienie3.dodajPozycje(pozycja3);
            //then
            assertEquals(1,zamowienie3.getPozycje().size());
        }

        @Test
        public void testDodawaniaJednejPozycjiNullowej(){
            //given
            Zamowienie zamowienie4 = new Zamowienie();
            //when
            zamowienie4.dodajPozycje(null);
            //then
            assertEquals(1,zamowienie4.getPozycje().size());
        }
        @Test
        public void testSumyZamowienia2Pozycji(){
            //given
            Zamowienie zamowienie5 = new Zamowienie();
            Pozycja pozycja = new Pozycja("Mleko", 1, 2.5);
            Pozycja pozycja2 = new Pozycja("Chleb", 1, 8.5);
            zamowienie5.dodajPozycje(pozycja);
            zamowienie5.dodajPozycje(pozycja2);
            //when
            double suma = zamowienie5.obliczWartosc();
            //then
            assertEquals(Double.valueOf(pozycja.obliczWartosc() +pozycja2.obliczWartosc())
                    ,Double.valueOf(suma));
        }

        @Test
        public void testWyswietlZamowienie(){
            //given
            Zamowienie zamowienie5 = new Zamowienie();
            Pozycja pozycja = new Pozycja("Mleko", 12, 2.5);
            Pozycja pozycja2 = new Pozycja("Chleb", 2, 8.5);
            zamowienie5.dodajPozycje(pozycja);
            zamowienie5.dodajPozycje(pozycja2);
            //when

            //then
            //System.out.println(zamowienie5);

            assertTrue(zamowienie5.toString().contains("Razem: "));
            assertTrue(zamowienie5.toString().contains("Zamowienie:"));
            assertTrue(zamowienie5.toString().contains(
                    String.format("%.2f",zamowienie5.obliczWartosc())));
    }
    @Test
    public void testUsuwaniaPozycji() {
            //given
        Zamowienie zamowienie6 = new Zamowienie();
        Pozycja pozycja = new Pozycja("Chleb", 12, 2.5);
        Pozycja pozycja1 = new Pozycja("Mleko", 3, 8.5);

    }
    @Test
    public void testRabatPonizej5Sztuk() {
            Pozycja pozycja = new Pozycja("chleb", 4, 100);
            double wartoscZRabatem = pozycja.obliczWartoscZRabatem();
            assertEquals(Double.valueOf(400), Double.valueOf(wartoscZRabatem));
    }

}
