package OOP;

class Account{
    public String name;
    protected String email;

    private String password;
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Account a = new Account();
        a.name = "Vijay malia";
        a.email = "gambler@gmail.com";
        
        a.setPassword("abcd");
        System.out.println(a.getPassword());
    }
}
