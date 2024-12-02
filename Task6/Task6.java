/*
 * Дан следующий код, исправьте его там, где требуется
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit

*public static void main(String[] args) throws Exception {
*   try {
*       int a = 90;
*       int b = 3;
*       System.out.println(a / b);
*       printSum(23, 234);
*       int[] abc = { 1, 2 };
*       abc[3] = 9;
*   } catch (Throwable ex) {
*       System.out.println("Что-то пошло не так...");
*   } catch (NullPointerException ex) {
*       System.out.println("Указатель не может указывать на null!");
*   } catch (IndexOutOfBoundsException ex) {
*       System.out.println("Массив выходит за пределы своего размера!");
*   }
*}
*public static void printSum(Integer a, Integer b) throws FileNotFoundException {
*   System.out.println(a + b);
*}
* Коментарий по выполнению кода. 
* - не понимаю зачем включать в try всё подряд, что точно не "сломается", если уж значения заданы - они заданы... вынес
* - удалил лишние блоки catch - исключение NullPointerException у нас не возможно, так как все значения жёстко заданы условием, 
*      а "catch (Throwable ex)" использовать бессмыслено, так как перехватывает вообще всё что может и в данном случае избыточно - 
*      у нас по условию всего одно действие которое заканчивается ошибкой - выход за пределы массива...
* - переписал сообщение об ошибке как мне понятно... (массив не может выходить за пределы своего размера, за то можно обратиться к несуществующему элементу массива)
* - в определении метода printSum удалил указание "throws FileNotFoundException" по условиию все значения жёстко заданны и
*      ни каких ошибок быть не может... вот если бьы это был ввод с клавиатуры и он не проверялся... но проще там проверку сделать, что ввели...

* 
* Размышление по результату 2 и 3 задания - задания оставили непонятное ощущение... вроде задание, а начинаешь думать - бредятина какая-то...
* Предлагаю при подготовке задания (для исправления ошибок) не использовать константы, а сделать 
* ввод всех значений с клавиатуры... сразу станет интереснее - и на ноль можно поделить и всякую ерунду ввести... 
* сейчас даже не знаю что делать...
*/


public class Task3 {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        try {
            abc[3] = 9;
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Попытка доступа к не существующему элементу массива (за его пределами)!");
        }
    }

    public static void printSum(Integer a, Integer b) {    
        System.out.println(a + b);
    }
}