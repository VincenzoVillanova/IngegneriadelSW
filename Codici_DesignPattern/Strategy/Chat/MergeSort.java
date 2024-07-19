// Concrete Strategy: Merge Sort
public class MergeSort implements Ordinamento {
    @Override
    public void ordina(int[] numeri) {
        mergeSort(numeri, 0, numeri.length - 1);
    }

    private void mergeSort(int[] numeri, int sinistra, int destra) {
        if (sinistra < destra) {
            int medio = (sinistra + destra) / 2;
            mergeSort(numeri, sinistra, medio);
            mergeSort(numeri, medio + 1, destra);
            unisci(numeri, sinistra, medio, destra);
        }
    }

    private void unisci(int[] numeri, int sinistra, int medio, int destra) {
        int n1 = medio - sinistra + 1;
        int n2 = destra - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(numeri, sinistra, L, 0, n1);
        System.arraycopy(numeri, medio + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = sinistra;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numeri[k] = L[i];
                i++;
            } else {
                numeri[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            numeri[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            numeri[k] = R[j];
            j++;
            k++;
        }
    }
}
