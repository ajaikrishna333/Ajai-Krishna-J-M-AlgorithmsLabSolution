public class Service {

    public int process(int[] a, int key) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            key = key - a[i];
            count++;
            if (key <= 0) {
                return count;
            }
        }
        if (key > 0) {
            count = -1;
        }
        return count;
    }

}
