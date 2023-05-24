public class Search {
    // LinearSearch method takes int[] arr and int target, runtime of O(n)
    public static Object LinearSearch(int[] arr, int target) {
        // for length of arr
        for (int i = 0; i < arr.length; i++) {
            // if index i in arr equals target
            if (arr[i] == target) {
                // return index
                return i;
            }
        }
        // if index not returned, elemenet not in arr
        return "Target not found";
    }

    // binarySearch method takes int[] arr and int target, runtime of O(log n)
    public static Object BinarySearch(int[] arr, int target) {
        // set int left index to 0
        int left = 0;
        // set int right index to last element in arr
        int right = arr.length - 1;

        // while left is less than or equal to right
        while (left <= right) {
            // set mid index
            int mid = left + (right - left) / 2;
            // if arr at mid imndex equals target
            if (arr[mid]  == target) {
                // return mid
                return mid;
            } 
            // else if arr at mid is less than right
            else if (arr[mid] < right) {
                // move left to next element after mid
                left = mid + 1;
            } 
            // else arr at mid index is greater than right
            else {
                // move right to element before mid
                right = mid - 1;
            }
        }
        // if target not found return so
        return "Target not found";
    }

    public static void main(String[] args) {
        // example arr
        int[] exArr= {1, 2, 3, 5, 7, 9, 10};

        // print out call to LinearSearch
        System.out.println(LinearSearch(exArr, 9));
        // print out call to BinarySearch
        System.out.println(BinarySearch(exArr, 9));
    }
    
}
