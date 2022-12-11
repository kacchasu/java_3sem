package homework_29;

public class IllegalTableNumber extends Exception{
    private String address;
    public IllegalTableNumber(String add) {
        super("Illegal table number");
        address = add;
    }

    public String getMessage() {
        return super.getMessage() + ": " + address;
    }
}
