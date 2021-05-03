package odev;

public class Main {

    public static void main(String[] args) {

        Student user1 = new Student();
        user1.setId(1);
        user1.setFirstName("Enes Furkan");
        user1.setLastName("Aras");
        user1.setStudentNumber(12);

        Instructor user2 = new Instructor();
        user2.setId(1993);
        user2.setFirstName("Engin");
        user2.setLastName("Demiroğ");
        user2.setInstructorNumber(45544554);

        UserManager userManager = new UserManager();
        userManager.login(user2);
        userManager.logout(user2);


        StudentManager studentManager = new StudentManager();
        studentManager.joinCourse(user1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse();
        instructorManager.deleteCourse();



    }

}