public class CommonElements1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        System.out.println("Common elements:");
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
