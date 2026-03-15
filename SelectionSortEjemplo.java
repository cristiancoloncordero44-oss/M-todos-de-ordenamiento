public class SelectionSortEjemplo {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) { // Buscamos el máximo
                    maxIdx = j;
                }
            }
            // Intercambiar
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] puntuaciones = {67, 92, 45, 88, 73, 51, 99,67,80,24};
        System.out.println("Puntuaciones originales:");
        for (int p : puntuaciones) System.out.print(p + " ");

        selectionSort(puntuaciones);

        System.out.println("\nPuntuaciones ordenadas (mayor a menor):");
        for (int p : puntuaciones) System.out.print(p + " ");
    }
}