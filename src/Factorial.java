public class Factorial {
    public static int getFact(int num) throws FactorialException {
        int result=1;
        if(num<1) throw  new FactorialException("Число меньше 1", num);

        for(int i=1;i<=num;i++){
            result*=i;
        }
        return result;
    }
}
