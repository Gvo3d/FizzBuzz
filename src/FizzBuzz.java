public class FizzBuzz {
    private StringBuilder result = new StringBuilder(8);
    private int startValue;
    private int finishValue;

    public FizzBuzz(int startValue, int finishValue) {
        this.startValue = startValue;
        this.finishValue = finishValue;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(1, 100);
        fizzBuzz.calculate();
    }

    private void calculate(){
        for (int i=startValue; i<=finishValue; i++){
            toString(i);
        }
    }

    private void toString(int i){
        if (i % 3 == 0) {
            result.append("Fizz");
        }
        if (i % 5 == 0) {
            result.append("Buzz");
        }
        if (result.length()==0){
            System.out.println(i);
        } else {
            System.out.println(result);
            result.delete(0, result.length());
        }
    }
}
