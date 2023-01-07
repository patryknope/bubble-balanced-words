import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BubbleSort {

    public static List<Comparable> sort(List<Comparable> input) {

        if (input == null) {
            throw new RuntimeException("Input is null");
        }

        List<Comparable> list = new ArrayList<>(input);
        list.removeIf(Objects::isNull);

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(list.get(j), list.get(j + 1)) > 0) {
                    swap(list, j);
                }
            }
        }

        return list;
    }

    private static void swap(List<Comparable> input, int j) {
        Comparable temp = input.get(j);
        input.set(j, input.get(j + 1));
        input.set(j + 1, temp);
    }

    private static int compare(Object a, Object b) {

        if (a instanceof Double && b instanceof Double) {
            return Double.compare((Double) a, (Double) b);
        }
        else if (a instanceof Integer && b instanceof Integer) {
            return Integer.compare((Integer) a, (Integer) b);
        }
        else {
            double d = Double.parseDouble(String.valueOf(a));
            double e = Double.parseDouble(String.valueOf(b));
            return Double.compare(d, e);
        }
    }
}


