package fundamentals;

/**
 * Created By durgesh.soni on 17/04/20
 */

public class DeepCopyImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(
                "Durgesh,",
                32,
                new Course("Maths", "Physics"),
                new Id("9669568498", "1234")
        );

        Student s2 = (Student) s1.clone();
        System.out.println("Student 1 : " + s1);
        System.out.println("Student 2 : " + s2);

        s2.getCourse().setSub1("Biology");
        s2.getId().setMobile("8604425431");

        System.out.println("Student 1 : " + s1);
        System.out.println("Student 2 : " + s2);

    }
}
