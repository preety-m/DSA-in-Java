public class binarySearch {

    public static int binSearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            } else if (num[mid] > key) {
                end = mid - 1;    
            } else {
                start = mid + 1;   
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = {2, 4, 7, 8, 9, 10, 12};
        int key = 10;

        int index = binSearch(num, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
