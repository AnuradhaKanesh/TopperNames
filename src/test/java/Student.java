import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Student {
    private String studentName;
    private List<Marks> marks;

    public float getPercentage() {
        float totalObtainMarks = 0, totalMarks = 0;
        for (Marks score : marks) {
            totalObtainMarks += score.getObtainedMarks();
        }
        for (Marks score : marks) {
            totalMarks += score.getMaxMarks();
        }
        float percentage = (totalObtainMarks/totalMarks)*100;
        return percentage;
    }
}
