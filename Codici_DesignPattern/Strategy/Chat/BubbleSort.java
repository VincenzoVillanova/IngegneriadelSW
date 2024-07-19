public class BubbleSort implements Ordinamento {
    @Override
    public void ordina(int[] numeri) {
        int n = numeri.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeri[j] > numeri[j + 1]) {
                    // Scambia numeri[j] e numeri[j+1]
                    int temp = numeri[j];
                    numeri[j] = numeri[j + 1];
                    numeri[j + 1] = temp;
                }
            }
        }
    }
}