package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] number;

    public static int binary(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
// бинарный поиск и insertion Sort коды скопировал с урока .... немного прочитал о них доп.инфы
// и по совету сделал из интренета отдельными методами
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        number = new int[15];         // если честно на мой взгляд тут уместнее использовать сканер и при кол-ве данных
        Random random = new Random(); // в массиве и не ограничиваться 15

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(1, 101);
        }// сделал так намерено когда запуститте , поймете для чего ., понимаю что так не красиво и делать не надо!
        System.out.println("\"Oh, great Overlord... *quivering* This array is a complete mess!" +
                " *trembling* Shall I set it ablaze :                                    " + Arrays.toString(number));

        insertionSort(number);
        System.out.println("Oh, great Overlord... *nervous smile*" +
                " I have tidied up this array for you. *proudly* " +
                "The humble goblin has put everything in order! :    " + Arrays.toString(number));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oh, great Overlord, if it pleases you... *quivering* " +
                "Might you please enter a number? *trembling* The humble goblin awaits your command...");
        int target = scanner.nextInt();

        int result = binary(number, target);
        if (result == -1) {
           System.out.println("Oh, great Overlord... *nervous gulp* " +
                    "I... I must report that no number hath been found in our humble quest. *trembling* " +
                    "The lowly goblin fears your wrath but must speak the truth... *shivering*");
        } else {
            System.out.println("Yes!Yes! Oh great Overlord! *wheeze*" +
                    " A number hath been uncovered in the depths of our quest!" +
                    " *pant* The great goblin hath fulfilled thy command! *gasp* it is :  " + result +
                    "   box.My MMMMaaAaaster!" + "\n With Love your little goblin Java.");
        }


    }
}





