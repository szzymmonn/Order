import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Zamowienie {


    private List<Pozycja> pozycje = new ArrayList<Pozycja>();

    public void dodajPozycje(Pozycja pozycja) {
        if (pozycje != null) {
            pozycje.add(pozycja);

        }
    }

    public double obliczWartosc() {
        double suma = 0;

        for (Pozycja pozycja : pozycje) {
            suma = suma + pozycja.obliczWartosc();
        }
        return suma;
    }

    public String toString() {
        String out = "Zamowienie:\n";
        for (Pozycja pozycja : pozycje) {
            out = out + pozycja.toString() + "\n";
        }
        out = out + "Razem: " + String.format("%.2f zł", obliczWartosc());


        return out;

    }


    public void usunPozycje(int index) {
        try {
            pozycje.remove(index);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nie ma pozycji o takim indexie");
        }

    }

    public void edytujPozycje(int index, String nazwaTowaru, int ileSztuk, double cena) {
        try {
            Pozycja edytowanaPozycja = pozycje.get(index);
            edytowanaPozycja.setNazwaTowaru(nazwaTowaru);
            edytowanaPozycja.setIleSztuk(ileSztuk);
            edytowanaPozycja.setCena(cena);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("nie ma pozycji");
        }

    }
}