public class OddEven2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 7, 10};

        int n = arr.length;

        // Step 1: Separate odd to front, even to back
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[oddCount];
                arr[oddCount] = temp;
                oddCount++;
            }
        }

        // Step 2: Sort odd part in descending order
        for (int i = 0; i < oddCount - 1; i++) {
            for (int j = i + 1; j < oddCount; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Step 3: Sort even part in ascending order
        for (int i = oddCount; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Step 4: Rearranging in-place to alternate odd-even positions
        int oddIndex = 0;
        int evenIndex = oddCount;
        int i = 1;  // Start placing evens from index 1

        while (evenIndex < n && i < n) {
            // Shift all elements from 'i' to 'evenIndex - 1' right by one
            int evenValue = arr[evenIndex];
            for (int j = evenIndex; j > i; j--) {
                arr[j] = arr[j - 1];
            }
            arr[i] = evenValue;

            // Update indices
            evenIndex++;
            i += 2;
        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
