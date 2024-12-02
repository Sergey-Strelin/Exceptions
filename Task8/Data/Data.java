// организуем ввод данных о человеке и их проверку
package Data;

import java.util.Scanner;

public class Data {
    
    public String getInfoAboutHuman() {
        
        boolean flag = true;
        String str = "";
        while (flag) {
            System.out.println("Введите данные человека разделяя группы данных пробелом");
            System.out.println("Формат ввода данных: \nФамилия Имя Отчество Дата_рожения Номер_телефона Пол");
            System.out.println("дата рождения - ДД.ММ.ГГГГ");
            System.out.println("номер телефона - 88888888888");
            System.out.println("пол - f-женский, m-мужской");
            System.out.print("> :");
            Scanner scaner = new Scanner(System.in,"UTF-8");
            str = scaner.nextLine();
            scaner.close();
            
            // проверяем количество групп данных
            try {
                isCorrectGroup(str);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }

            if (getGroupe(str) != 6) {
                flag = true;
            } else flag = false;
        }
        return str;
    }

    private int getGroupe(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }

    private void isCorrectGroup(String str) {
        if (getGroupe(str) != 6) throw new RuntimeException("Проверьте количество групп данных о человеке!.");

    }
}