public class oopsSorter123 {
    public static void doIt(int[] sOrry) {
        for (int i = 0; i < sOrry.length - 1; i++) {
            for (int j = 0; j < sOrry.length - i - 1; j++) { // Fix: sOrry.length - i - 1
                if (sOrry[j + 1] < sOrry[j]) {
                    int tmp = sOrry[j];
                    sOrry[j] = sOrry[j + 1];
                    sOrry[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted? Maybe.");
        for (int i = 0; i < sOrry.length; i++) { // Fix: i < sOrry.length
            System.out.print(sOrry[i] + " ");
        }
        System.out.println();
    }
}
