import java.util.Arrays;

public class Task3_1 {
    public static void main(String[] args) {
        /*
        *   Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        *   и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих
        *   массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
        *   пользователя.
        *
        *   Для проверки работы уалите одно значение в любом массиве        
        */

        int[] arrayNumber1 = {14, 8, 655};
        int[] arrayNumber2 = {4, 78, 983};
        int[] arrRes = arrayDiff(arrayNumber1,arrayNumber2);
        if (arrRes.length != 0) System.out.println(Arrays.toString(arrRes));
    }

        public static int[] arrayDiff( int[] array1, int[] array2) {
        
            if (array1.length != array2.length) {
                int[] result = {};
                System.out.println("Внимание! Массивы разной длинны!") ;
                return result;
            } else {
                int[] result = new int[array1.length];
                for (int i = 0; i < result.length; i++) {
                    result[i] = array1[i] - array2[i];
                }
                return result;
            }
            
        }



    

}
