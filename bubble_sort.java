//Que_39 , Bubble sort
class bubble_sort {
    public static void print(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 8, 7, 2 };

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        print(arr);
    }
}