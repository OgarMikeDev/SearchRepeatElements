import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4};
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= 0; j--) {
                if (numbers[i] == numbers[j] && i != j) {
                    if (!listNumbers.contains(numbers[i])) {
                        System.out.println("Element repeat: " + numbers[i]);
                    }
                    listNumbers.add(numbers[i]);
                }
            }
        }
    }
}
