package odev;

public class UserManager {
    public void login (User user) {
        System.out.println("Giriþ Ýþlemi Yapýldý "+user.getFirstName());
    }

    public void logout (User user) {
        System.out.println("Çýkýþ Ýþlemi Yapýldý "+user.getFirstName());
    }
}
