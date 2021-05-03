package odev;

public class StudentManager extends UserManager{

    public void joinCourse(User user) {
        System.out.println("Kursa Katıldı "+user.getFirstName());
    }

}
