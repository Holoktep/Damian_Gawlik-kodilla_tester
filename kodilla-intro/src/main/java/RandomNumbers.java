import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        int sum = 0;
        int count = 0;

        while (sum < 5000) {
            int randomNumber = random.nextInt(31);
            randomNumbers.add(randomNumber);
            sum += randomNumber;
            count++;
        }

        System.out.println("Suma osiągnęła 5000 lub więcej.");
        System.out.println("Liczba losowań: " + count);
        System.out.println("Ostateczna suma: " + sum);
        System.out.println("Największa wylosowana liczba: " + getMaxValue(randomNumbers));
        System.out.println("Najmniejsza wylosowana liczba: " + getMinValue(randomNumbers));
    }

    public static int getMaxValue(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int getMinValue(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}