/*
 * Если необходимо, исправьте данный код
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
 * 
 * Исходный код:
*try {
*   int d = 0;
*   double catchedRes1 = intArray[8] / d;
*   System.out.println("catchedRes1 = " + catchedRes1);
*} catch (ArithmeticException e) {
*   System.out.println("Catching exception: " + e);
*}
* Коментарий по выполнению кода. 
* Учитывая, что это "кусок" кода ни от чего - делаем ему "правильную" обёртку, чтобы он запустился,а так же всё остальное:
 * - создаём класс + метод main;
 * - создаём массив intArray и заполняем целыми числами, из которого будем брать значения;
 * - инициализацию переменной d вынес из блока try... catch ибо нечему в нём "ломаться"
 * - оставляем в блоке try строку с делением и выводом результата;
 * - блок catch не трогаем - вроде всё нормально (обрабатыаем ошибку "деление на 0");
 * - учитывая что d всегда равно 0 строка с выводом результата деления бессмысленная... однако учимся... пусть остаётся... 
 *      да и предупреждения не будет, что не используем переменную;
 * - не совсем понятен смысл определения переменной catchedRes1 как double, так как в java 
 *      при делении двух целых чисел так же получается целое число... хотя понятно - в int 0 это 0, а не точ что в double
*/

public class Task5 {
   public static void main(String[] args) {
      int[] intArray = {5,7,8,-3,9,5,4,-9,1,2};
      int d = 0;
      try {
         double catchedRes1 = intArray[8] / d;
         System.out.println("catchedRes1 = " + catchedRes1);
      } 
      catch (ArithmeticException e) {
         System.out.println("Catching exception: " + e);
      }
         
    }
}