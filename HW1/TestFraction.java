package CTDL.HW1;

public class TestFraction {
    public static void main(String[] args) {
        Fractions fraction1 = new Fractions(2,3 );
        Fractions fraction2 = new Fractions(4, 5);
        fraction1.printFraction();
        fraction2.printFraction();
        fraction1.addFractions(fraction2);
        fraction1.subtractFractions(fraction2);;
        fraction1.multiplyFractions(fraction2);
        fraction1.divideFractions(fraction2);
    }
}
