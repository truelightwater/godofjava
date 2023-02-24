package godofjavabook1.example.lambda;

public class SampleLambda {
    private void calculateClassic() {

        Calculate calculateAdd = new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
    }

    private void calculateLambda() {
        Calculate calculateAdd = (a, b) -> a+b;
        System.out.println(calculateAdd.operation(1,2));
    }

    private void calculateSubtractLambda() {
        Calculate calculateSub = (a, b) -> a-b;
        System.out.println(calculateSub.operation(4,1));
    }

    public static void main(String[] args) {
        SampleLambda sampleLambda = new SampleLambda();
        sampleLambda.calculateLambda();
        sampleLambda.calculateSubtractLambda();
    }
}
