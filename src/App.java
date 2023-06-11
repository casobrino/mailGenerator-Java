import emailapp.Email;

public class App {
    public static void main(String[] args) throws Exception {
        Email e = new Email("Cesar", "Sobrino");
        e.changePasword("casopito");
        e.setMailboxCapacity(400);
        e.toString();
    }
}
