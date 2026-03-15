public class InsertionSortEjemplo {
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] nombres = {"Luis", "Ana", "Pedro", "María", "Juan", "Carlos"};
        System.out.println("Nombres originales:");
        for (String n : nombres) System.out.print(n + " ");

        insertionSort(nombres);

        System.out.println("\nNombres ordenados alfabéticamente:");
        for (String n : nombres) System.out.print(n + " ");
    }
}