package ticket24;

public class ComplexNumber extends RationalNumber {
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        super(real);
        this.imaginary = imaginary;
    }

    public double getModulus() {
        return Math.sqrt(super.getModulus() * super.getModulus() + imaginary * imaginary);
    }
}
