public class StCreator {
    private static boolean a = true;

    public static Persona getPersona() {
        if (a) {
            return new Uomo("Ciao");
        } else {
            return new Donna("Ciao");
        }
    }

    public static void setA(boolean newValue) {
        a = newValue;
    }

    public static boolean getA() {
        return a;
    }

}