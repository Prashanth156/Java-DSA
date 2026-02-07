class QuickSort {

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);   // left part
            quickSort(arr, p + 1, high);  // right part
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];   // choose last element as pivot
        int i = low - 1;         // boundary for smaller elements

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;   // pivot position
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        quickSort(arr, 0, arr.length - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
