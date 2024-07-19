import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class provaStream {
    public static void main(String[] args) {
        provaStream prova = new provaStream();
        prova.MartelliamoStream();
    }

    public void MartelliamoStream() {
        /*
         * Dato un elenco di parole, crea un elenco di output che contenga
         * solo le parole di lunghezza dispari, convertite in maiuscolo.
         * List<String> input = new ArrayList<>(Arrays.asList(
         * "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));
         * 
         * List<String> result = input.stream()
         * .filter(x -> x.length() % 2 != 0)
         * .map(x -> x.toUpperCase())
         * .collect(Collectors.toList());
         * 
         * for (String string : result) {
         * System.out.println(string);
         * }
         */
        /*
         * Unisci le seconde lettere delle parole da 1 a 4 dell'elenco
         * (incluse, contando da zero), separate da virgole, in un'unica stringa.
         */
        /*
         * List<String> input = new ArrayList<>(Arrays.asList(
         * "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));
         * 
         * String result = input.stream().skip(1)
         * .limit(4)
         * .map(word -> word.substring(1, 2))
         * .collect(Collectors.joining(","));
         * 
         * System.out.println(result);
         * Risultato: r,h,e,c
         */

        /*
         * Selezionare dall'elenco di input l'insieme di parole la cui lunghezza è
         * maggiore di alla posizione della parola (a partire da zero) nell'elenco
         */
        /*
         * List<String> input = new ArrayList<>(Arrays.asList(
         * "alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel"));
         * 
         * List<String> result = IntStream.range(0, input.size())
         * .filter(pos -> input.get(pos).length() > pos)
         * .mapToObj(pos -> input.get(pos))
         * .collect(Collectors.toList());
         * 
         * for (String string : result) {
         * System.out.print(string + " ");
         * }
         * Risultato: alfa bravo charlie delta foxtrot
         */
        /*
         * Date due liste di numeri interi, calcola una terza lista dove ogni elemento è
         * il differenza tra gli elementi corrispondenti delle due liste di input (primo
         * meno secondo).
         */
        /*
         * List<Integer> one = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
         * List<Integer> two = Arrays.asList(2, 7, 1, 8, 2, 8, 1, 8, 2, 8);
         * 
         * List<Integer> result = IntStream.range(0, one.size())
         * .mapToObj(i -> one.get(i) - two.get(i))
         * .collect(Collectors.toList());
         * 
         * for (int string : result) {
         * System.out.print(string + " ");
         * }
         */

        /* Convertire una lista di stringhe in una lista di caratteri */
        /*
         * List<String> input = Arrays.asList("alfa", "bravo", "charlie");
         * 
         * List<Character> result = input.stream() ...;
         */

        /*
         * List<String> input = new ArrayList<>(Arrays.asList(
         * "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));
         * 
         * List<String> result = input.stream()
         * .filter(x -> x.length() % 2 == 1)
         * .map(x -> x.toUpperCase())
         * .collect(Collectors.toList());
         * 
         * for (String string : result) {
         * System.out.println(string);
         * }
         */

    }

}
