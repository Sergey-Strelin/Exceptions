/*
 *  Разработайте программу, которая выбросит Exception, когда пользователь вводит
 *  пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        try {
            String str = in.nextLine();
            if (str == "") throw new RuntimeException("Пустую строку вводить нельзя!");
            else System.out.println("Вы ввели: " + str) ;
        }
        finally {
            in.close();
        }
    }    
}

