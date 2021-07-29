static int findRepeating(int arr[], int n) {
    int missingElement = 0;
    for (int i = 0; i < n; i++){
        int element = arr[Math.abs(arr[i])];
        if(element < 0) {
            missingElement = arr[i];
            break;
        }
    arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
    }
return Math.abs(missingElement);
}