/*
 * This Java source file was ge nerated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        int[] arr = new int[]{8,4,23,42,16,15};
        mergeSort(arr);
        System.out.println(" ");
        System.out.print("Merge Sort: ");
        print(arr);
        System.out.println(" ");


    }


    public static int[] mergeSort(int[] arr) {

        int length = arr.length;
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];


            if (length > 1) {

            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }

            for (int i = mid; i < length; i++) {
                right[i - mid] = arr[i];
            }

                mergeSort(left);
                mergeSort(right);
                merge(left, right, arr);
            }

            return arr;
    }


    public static void merge(int[] left, int[] right,int[] arr) {

        int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length)
            {
                if (left[i] <= right[j])
                {
                    arr[k] = left[i];
                    i = i + 1;
                }

                else
                {
                    arr[k] = right[j];
                    j = j + 1;
                }

                k = k + 1;

            }
            while (i < left.length) {
                arr[k++] = left[i++];
            }

            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }

    public static int[] print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
