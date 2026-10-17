public class duplicate {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 3, 3, 4, 4};

        for (int i = 0; i < array.length; i++) {
            boolean isDublicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                System.out.println(array[i]);
            }
        }
    }
}

