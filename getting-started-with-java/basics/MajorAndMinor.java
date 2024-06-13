import java.util.Arrays;

public class MajorAndMinor {
    public static void main(String[] args) {
        int[] numbers = {
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber() };

        int major = numbers[0];
        int minor = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > major) {
                major = numbers[i];
            }

            if (numbers[i] < minor) {
                minor = numbers[i];
            }
        }

        System.out.println("The array is:" + Arrays.toString(numbers) + "\nMajor: " + major + "\nMinor: " + minor);
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
