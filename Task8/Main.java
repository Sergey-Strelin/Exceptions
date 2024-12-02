import Data.*;
import Exception.*;


public class Main {
    public static void main(String[] args) {

        Data d1 = new Data();
        Human h = new Human();
        String[] info = null;
        VerifyInputData cd = new VerifyInputData();
        try {
            info = d1.getInfoAboutHuman().split(" ");
            cd.isCorrectDate(info);
            cd.isCorrectTel(info);
            cd.isCorrectSex(info);
            h = new Human(info[0], info[1], info[2], info[3], info[4], info[5]);
            WriterToFile writerToFile = new WriterToFile();
            writerToFile.writeToFile(h.toString(), "Files/"+info[0] + ".txt");
        } catch (ExceptionDate | ExceptionSex | ExceptionPhone e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.err.println("Ошибка записи в файл");
        }

    }

}