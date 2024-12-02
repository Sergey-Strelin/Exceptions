public class Task2 {
    public static void main(String[] args) {
        /*
         * Посмотрите на код ниже, и подумайте сколько разных типов исключений вы тут сможете получить?
         * по возможности исправьте код
         * 
         * 
         *  private static int sum2d (String[][]arr){
             
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {               // массив двумерный, значение j может быть либо 0, либо 1, при задании j=2,3,4 получим исключение ArrayIndexOutOfBoundsException (выход за пределы индекса)
                    int val = Integer.parseInt(arr[i][j]);  //могут попасться элементы у которых значение null, а также состоящие не не только из цифр
                                                            // и преобразовать в число не получится - NumberFormatException
                    sum += val;
                }
            }
            return sum;
        */


        String[][] arrString = {{"34","44"},{"3f3","67"},{null,"22"}};
        System.out.println(sum2d(arrString));
        
    }

        // переписал прооцедуру
        private static int sum2d (String[][]arr){
            String regex = "[0-9]+";
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 2; j++) {               
                    if (arr[i][j] != null && arr[i][j].matches(regex)) sum += Integer.parseInt(arr[i][j]);  
                }
            }
            return sum;
        }
    
}
