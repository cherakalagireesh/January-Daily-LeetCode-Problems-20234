class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int length = arr.length;
        int i = 0;

        while (i < length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == length - 1) {
            return false;
        }

        while (i < length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == length - 1;
    }
}