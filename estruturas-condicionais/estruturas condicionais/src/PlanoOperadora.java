public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "Basic";

        switch (plano) {
            case "Turbo":
                System.out.println("5gb Youtube");

            case "Media":
                System.out.println("Whats + instagran Gratis");

            case "Basic":
                System.out.println("100 min em ligações");

            default:
                break;
        }
    }
}
