import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Triang> triangList = new ArrayList<>();

        // Aggiungi 5 elementi alla lista
        triangList.add(new Triang(5, 4, 5, 90, 60, 30));
        triangList.add(new Triang(5, 12, 5, 90, 53, 37));
        triangList.add(new Triang(6, 8, 10, 90, 45, 45));
        triangList.add(new Triang(7, 24, 25, 90, 75, 15));
        triangList.add(new Triang(9, 12, 15, 90, 63, 27));

        List<Integer> triangList2 = getBaseIso(triangList);
        /*
         * for (Integer triang : triangList2) {
         * System.out.println(triang);
         * }
         */
        List<Persona> listaesotica = new ArrayList<>();
        listaesotica.add(new Persona("Mario", "Italia", 30));
        listaesotica.add(new Persona("Luigi", "Italia", 25));
        listaesotica.add(new Persona("Peach", "Regno dei Funghi", 24));
        listaesotica.add(new Persona("Toad", "Regno dei Funghi", 22));
        listaesotica.add(new Persona("Bowser", "Regno dei Koopa", 35));

        List<Persona> pers = getPminmax(10, 16, listaesotica);
        for (Persona persona : pers) {
            System.out.println(persona);
        }

        List<Auto> autoList = List.of(
                new Auto("SUV", "Rosso", 20000, "Modello A"),
                new Auto("Sedan", "Blu", 15000, "Modello B"),
                new Auto("Hatchback", "Verde", 12000, "Modello C"));

        System.out.println(getAuto(autoList));
        System.out.println(getCostoAuto(autoList));
        System.out.println(getMinCosto(autoList));
        System.out.println(ordinaLista(autoList));
        /*
         * System.out.println("Somma eta persone: " + getSumEta(listaesotica));
         * 
         * Map<String, String> nomeNazMap = getNomeNaz(listaesotica);
         * System.out.println(nomeNazMap);
         * /*
         * List<Integer> triangList3 = getlatomax(triangList);
         * for (Integer triang : triangList3) {
         * System.out.println(triang);
         * }
         */
        /*
         * List<Integer> triangList4 = getSommaPer(triangList);
         * for (Integer triang : triangList4) {
         * System.out.println(triang);
         * }
         */

    }

    // Ritornare i triangoli isosceli
    public static List<Triang> getTriangoliso(List<Triang> t1) {
        return t1.stream()
                .filter(x -> (x.lato1() == x.lato2()) || (x.lato2() == x.lato3()) || (x.lato3() == x.lato1()))
                .toList();
    }

    // torna la base dei triangoli
    public static List<Integer> getBaseIso(List<Triang> t1) {
        return t1.stream()
                .filter(x -> (x.lato1() == x.lato2()) || (x.lato2() == x.lato3()) || (x.lato3() == x.lato1()))
                .map(triang -> triang.lato1() == triang.lato2() ? triang.lato3()
                        : triang.lato2() == triang.lato3() ? triang.lato1() : triang.lato2()) // Trova il lato diverso
                .collect(Collectors.toList()); // Colleziona le basi in una lista
    }

    // metodo che restituisce la lista dei lati maggiori delle istanze di t1
    public static List<Integer> getlatomax(List<Triang> t1) {
        return t1.stream()
                .map(triang -> Math.max(triang.lato1(), Math.max(triang.lato2(), triang.lato3()))) // Trova il lato
                                                                                                   // maggiore
                .collect(Collectors.toList());
    }

    // metodo che trova la somma dei perimetri delle istanze di t1
    public static List<Integer> getSommaPer(List<Triang> t1) {
        return t1.stream()
                .map(x -> x.lato1() + x.lato2() + x.lato3())
                .collect(Collectors.toList());
    }

    /*
     * Usando la programmazione funzionale in Java, data una lista 'gente' di
     * istanze di Persona (codice sotto), implementare una classe con:
     * (a) un metodo che prende in ingresso due parametri int min e max, e trova e
     * restituisce la lista di istanze di Persona costituita da elementi di gente
     * che hanno età compresa fra min e max.
     * (b) un metodo che calcola la somma delle età degli elementi di gente e
     * restituisce il valore della somma.
     * (c) un metodo che restituisce una mappa contenente coppie (nome persona,
     * nazione).
     * (d) un metodo che restituisce una lista di String contenente le nazioni,
     * senza ripetizioni, presenti inizialmente nella lista gente.
     * 
     * public record Persona (String nome, String nazione, int eta) {
     * }
     */

    record Persona(String nome, String nazione, int eta) {
    }

    public static List<Persona> getPminmax(int min, int max, List<Persona> lista) {
        return lista.stream()
                .filter(x -> (x.eta() > min) && (x.eta() < max))
                .toList();
    }

    public static int getSumEta(List<Persona> lista) {
        return lista.stream()
                .map(x -> x.eta())
                .reduce(0, (accum, x) -> x + accum);
    }

    public static Map<String, String> getNomeNaz(List<Persona> lista) {
        return lista.stream()
                .collect(Collectors.toMap(Persona::nome, Persona::nazione));
    }

    /*
     * Usando la programmazione funzionale di Java, data una lista al di istanze di
     * Auto, implementare una classe con:
     * (a) Un metodo che per incrementa il costo di ciascuna istanza del 5% e
     * restituisce una lista con le istanze aventi il prezzo modificato,
     * (b) un metodo che restituisce la somma del costo delle istanze di Auto
     * presenti nella lista al,
     * (c) un metodo che trova il valore minore del costo delle istanze di Auto
     * nella lista al e lo restituisce,
     * (d) un metodo che ordina per costo le istanze di al.
     * 
     * public record Auto(String categoria, String colore, int costo, String
     * modello) {
     * }
     */

    public record Auto(
            String categoria, String colore,
            int costo, String modello) {
    }

    public static List<Auto> getAuto(List<Auto> auto) {
        return auto.stream().map(x -> new Auto(
                x.categoria(),
                x.colore(),
                (int) (x.costo() * 1.05),
                x.modello()))
                .collect(Collectors.toList());
    }

    public static int getCostoAuto(List<Auto> ls) {
        return ls.stream()
                .map(x -> x.costo())
                .reduce(0, (x, y) -> x + y);
    }

    public static int getMinCosto(List<Auto> ls) {
        return ls.stream()
                .mapToInt(Auto::costo)
                .min()
                .orElse(0);
    }

    public static List<Auto> ordinaLista(List<Auto> ls) {
        return ls.stream()
                .sorted(Comparator.comparing(x -> x.costo()))
                .toList();
    }
}
