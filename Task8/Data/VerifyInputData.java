/*  проверка введённых данных о человеке
* Везде ниже:
*   @param str строка введенная пользователем
*   @return true - проверка прошла успешно
*   @return false - проверка провалилась
*/
package Data;
import  Exception.*;


public class VerifyInputData {
    public VerifyInputData() {
    }

    //  Проверяем правильность введённой даты рождения
    public boolean isCorrectDate(String[] str) {
        String[] arr = null;
        String date = str[3];

        if (date.contains(".")) {
            arr = date.split("\\.");
        } else throw new ExceptionDate("Ошибка в формате даты! Проверьте, что используется точка в качестве разделителя");

        if (arr.length != 3) {
            throw new ExceptionDate("Ошибка в формате даты! Правильный формат ДД.ММ.ГГГГ");
        }
        for (String el : arr) {
            if (!isDigit(el)) throw new ExceptionDate("Ошибка в формате даты! Необходимо использовать числа и точку");
        }
        return true;
    }

    // проверяем что введены только цифры
    private static boolean isDigit(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*
    * Проверка правильность введенного номера телефона
    * должны быть только цифры и длинна 11 цифр
    */
    public boolean isCorrectTel(String[] str) {
        String tel = str[4];
        if (tel.length() != 11 ) throw new ExceptionPhone("Не верная длинна телефона! Необходимо 11 цифр!");
        //if (!isDigit(tel)) throw new ExceptionPhone("В номере телефона должны быть только цифрs!");
        return true;
    }

    // private static boolean isLong(String str) {
    //     try {
    //         Long.parseLong(str);
    //         return true;
    //     } catch (NumberFormatException e) {
    //         return false;
    //     }
    // }

    // Проверка правильности введёного пола человека
    public boolean isCorrectSex(String[] str) {
        String sex = str[5];
        if (sex.length() != 1) throw new ExceptionSex("Пол человека должен быть из одной буквы m-мужской, f-женский)");
        if (sex.equals("f") | sex.equals("m")) return true;
        else throw new ExceptionSex("Пол человека введён не верно! Допускается m-мужской, f-женский)");
    }
}