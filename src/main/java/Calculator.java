public class Calculator{
    ICalculator iCalculator;

    public Calculator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public int mult(int a, int b){
        //if verify is on
        return iCalculator.add(a,b) * 2;

        // return (a+b)*2;
    }
}
