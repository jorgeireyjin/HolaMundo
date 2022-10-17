package is2.holamundo;

public class Main {

    private final String message = "*Hola Mundo Java*";

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(new Main().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}