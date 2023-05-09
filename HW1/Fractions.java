package CTDL.HW1;


public class Fractions {
    private int numerator;
    private int denominator;
    public Fractions (int numerator, int denominator) {
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int getNumrator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int GCD(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator; 
        } else {
            return GCD(denominator, numerator%denominator);
        }
    }
    public void printFraction() {
        int GCD;
        if (this.getDenominator() == 0) {
            System.out.println("ERROR");
        } else if (this.getNumrator() == 0) {
            if (this.getDenominator() < 0) {
                this.setNumerator(-1 * this.getDenominator());
                System.out.println("fraction: -0 "  + " / " + this.getDenominator());
            } else {
                System.out.println("fraction: " + this.getNumrator() + " / " + this.getDenominator());
            }
        } else if ( this.getNumrator() < 0 && this.getDenominator() < 0 ) {
            this.setNumerator(Math.abs(this.getNumrator()));
            this.setDenominator(Math.abs(this.getDenominator()));
            GCD = GCD(this.getNumrator(), this.getDenominator());
            this.setNumerator(this.getNumrator() / GCD);
            this.setDenominator(this.getDenominator() / GCD);
            System.out.println("fraction: " + this.getNumrator() + " / " + this.getDenominator());
        } else if (this.getNumrator() > 0 && this.getDenominator() < 0) {
            this.setDenominator(Math.abs(this.getDenominator()));
            GCD = GCD(this.getNumrator(), this.getDenominator());
            this.setNumerator( - 1 *this.getNumrator() / GCD);
            this.setDenominator(this.getDenominator() / GCD);
            System.out.println("fraction: " + this.getNumrator() + " / " + this.getDenominator());
        } else if (this.getNumrator() < 0 && this.getDenominator() > 0) {
            this.setNumerator(Math.abs(this.getNumrator()));
            GCD = GCD(this.getNumrator(), this.getDenominator());
            this.setNumerator(-1 * this.getNumrator() / GCD);
            this.setDenominator(this.getDenominator() / GCD);
            System.out.println("fraction: " + this.getNumrator() + " / " + this.getDenominator());
        } else {
            GCD = GCD(this.getNumrator(), this.getDenominator());
            this.setNumerator(this.getNumrator() / GCD);
            this.setDenominator(this.getDenominator() / GCD);
            System.out.println("fraction: " + this.getNumrator() + " / " + this.getDenominator());
        }
    }
    public void addFractions(Fractions other ){
        int numerator = this.getNumrator()*other.getDenominator() + other.getNumrator()*this.getDenominator();
        int denominator = this.getDenominator()*other.getDenominator();
        Fractions fraction = new Fractions(numerator, denominator);
        fraction.printFraction();  
    }
    public void subtractFractions(Fractions other ){
        int numerator = this.getNumrator()*other.getDenominator() - other.getNumrator()*this.getDenominator();
        int denominator = this.getDenominator()*other.getDenominator();
        Fractions fraction = new Fractions(numerator, denominator);
        fraction.printFraction(); 
    }
    public void multiplyFractions(Fractions other) {
        int numerator = this.getNumrator()*other.getNumrator();
        int denominator = this.getDenominator()*other.getDenominator();
        Fractions fraction = new Fractions(numerator, denominator);
        fraction.printFraction();  
    }
    public void divideFractions(Fractions other) {
        int numerator = this.getNumrator()*other.getDenominator();
        int denominator = this.getDenominator()*other.getNumrator();
        Fractions fraction = new Fractions(numerator, denominator);
        fraction.printFraction();  
    }
}
