package ticket24;

public class NumberFactory {
    public static RationalNumber createNumber(NumberType type, double real, double imaginary) {
        switch (type) {
            case RATIONAL:
                return new RationalNumber(real);
            case COMPLEX:
                return new ComplexNumber(real, imaginary);
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
