class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;   // optimization flag

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap, array is already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Before sorting:");
        for (int x : arr)
            System.out.print(x + " ");

        bubbleSort(arr);

        System.out.println("\nAfter sorting:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
