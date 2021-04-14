public class SwitchStatements {
    public static void main(String[] args) {
        // Varianta cu if si else:
        String role = "admin";
        /*if(role == "admin")
            System.out.println("You're an admin.");
        else if (role == "moderator")
            System.out.println("You are a moderator.");
        else
            System.out.println("You are a guest.");*/


        // Varianta cu switch:
        switch (role) {
            case "admin":
                System.out.println("You're an admin.");
                break;
            case "moderator":
                System.out.println("You are a moderator.");
                break;
            default:
                System.out.println("You are a guest.");
        }
    }
}
