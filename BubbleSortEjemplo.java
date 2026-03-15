public class BubbleSortEjemplo {
    // Algoritmo de burbuja
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] precios = {450, 120, 780, 340, 230, 560, 98, 102, 37,84};
        System.out.println("Precios originales:");
        for (int p : precios) System.out.print(p + " ");

        bubbleSort(precios);

        System.out.println("\nPrecios ordenados (menor a mayor):");
        for (int p : precios) System.out.print(p + " ");
    }
}