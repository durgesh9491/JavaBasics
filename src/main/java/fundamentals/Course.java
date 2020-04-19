package fundamentals;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created By durgesh.soni on 17/04/20
 */

@Data
@AllArgsConstructor
class Course implements Cloneable {
    String sub1;
    String sub2;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
