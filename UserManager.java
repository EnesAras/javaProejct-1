package odev;

public class UserManager {
    public void login (User user) {
        System.out.println("Giri� ��lemi Yap�ld� "+user.getFirstName());
    }

    public void logout (User user) {
        System.out.println("��k�� ��lemi Yap�ld� "+user.getFirstName());
    }
}
