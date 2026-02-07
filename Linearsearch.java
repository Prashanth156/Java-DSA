class LinearSearch {

    static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) { // traverse
            if (arr[i] == key)
                return i;   // found
        }

        return -1; // not found
    } 

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int result = linearSearch(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
