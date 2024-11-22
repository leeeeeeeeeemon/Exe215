//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        try{
            int[] numbers = new int[3];
            //numbers[4] = 45;
            numbers[1] = Integer.parseInt("grgr");
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Ошибка преобразавания из строки в число");
        }

        try{
            int x = 1;
            if(x>=30){
                throw new Exception("Число x олжно быть меньше 30");
            }
        } catch (Exception ex){
            ex.printStackTrace();
            ex.getStackTrace();
            System.out.println(ex.getMessage());
        }

        try {
            int resilt = Factorial.getFact(-12);
            System.out.println(resilt);
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }







        System.out.println("End");
    }
}