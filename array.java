class array {
    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 30, 70};

        int target = 50;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}