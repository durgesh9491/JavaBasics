package fundamentals;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created By durgesh.soni on 17/04/20
 */

@Data
@AllArgsConstructor
class Student implements Cloneable {
    String name;
    int rollNo;
    Course course;
    Id id;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.course = (Course) course.clone();
        return s;
    }
}
