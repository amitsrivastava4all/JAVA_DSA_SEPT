public class BinarySearch {
    public static void main(String[] args) {
        // BS - Sorted Array
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int low = 0;
        int high = arr.length-1;
        int search = 2220;
        while(low<=high){
            int mid = (low + high)/2;
            if(search == arr[mid]){
                System.out.println("Element Found...");
                return;
            }
            if(search<arr[mid]){
                high = mid-1;
            }
            else if (search>arr[mid]){
                low = mid + 1;

            }
        }
        System.out.println("Element Not Found..");
    }
}
