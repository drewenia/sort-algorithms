package selectionSort;

import java.util.Arrays;
import java.util.Random;

public class ExampleOne {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println(Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        var length = numbers.length;

        /* ilk for loop'u array'i dolasirken sondan bir onceki eleman da durmali*/
        for (int i = 0; i < length - 1; i++) {
            /* for loop'u icerisine girildiginde arrayde ki ilk eleman min olarak kabul ediliyor
            * inner for loop'u icerisinde bir sonra ki elemana gecilerek eger bir sonraki eleman
            * min olarak kabul ettigimiz outer loop'da ki eleman'dan ufak ise yeni min o olarak kabul ediliyor
            * */
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }

            /* swap methodu en dusuk numara bulundugunda index i ile birlikte numarayi en basa koymamizi saglayacak */
            swap(numbers,i,indexOfMin);
        }
    }
    private static void swap(int[] numbers, int i, int indexOfMin){
        int temp = numbers[i]; // array'de ki ilk rakam buraya gelir
        numbers[i] = numbers[indexOfMin]; // numbers'in 0. indexi en ufak numaraya set edildi
        numbers[indexOfMin] = temp; // indexOfMin'in gösterdiği hücre ile sıfırıncı indexde ki rakam swap edildi
    }
}
