import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        int[] numeri = { 64, 34, 25, 12, 22, 11, 90 };

        // Ordinare con Bubble Sort
        context.setStrategia(new BubbleSort());
        context.eseguiStrategia(numeri);
        System.out.println("Bubble Sort: " + Arrays.toString(numeri));

        // Ordinare con Quick Sort
        int[] numeri2 = { 64, 34, 25, 12, 22, 11, 90 };
        context.setStrategia(new QuickSort());
        context.eseguiStrategia(numeri2);
        System.out.println("Quick Sort: " + Arrays.toString(numeri2));

        // Ordinare con Merge Sort
        int[] numeri3 = { 64, 34, 25, 12, 22, 11, 90 };
        context.setStrategia(new MergeSort());
        context.eseguiStrategia(numeri3);
        System.out.println("Merge Sort: " + Arrays.toString(numeri3));
    }
}