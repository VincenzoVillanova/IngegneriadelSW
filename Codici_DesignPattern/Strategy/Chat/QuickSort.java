// Concrete Strategy: Quick Sort
public class QuickSort implements Ordinamento {
    @Override
    public void ordina(int[] numeri) {
        quickSort(numeri, 0, numeri.length - 1);
    }

    private void quickSort(int[] numeri, int inizio, int fine) {
        if (inizio < fine) {
            int pi = partizione(numeri, inizio, fine);
            quickSort(numeri, inizio, pi - 1);
            quickSort(numeri, pi + 1, fine);
        }
    }

    private int partizione(int[] numeri, int inizio, int fine) {
        int pivot = numeri[fine];
        int i = (inizio - 1);
        for (int j = inizio; j < fine; j++) {
            if (numeri[j] < pivot) {
                i++;
                int temp = numeri[i];
                numeri[i] = numeri[j];
                numeri[j] = temp;
            }
        }
        int temp = numeri[i + 1];
        numeri[i + 1] = numeri[fine];
        numeri[fine] = temp;
        return i + 1;
    }
}
