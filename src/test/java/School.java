import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class School {
    private List<Standard> standards;
    private String schoolName;

    public String getNameOfTopper(int standard) {
        String studentName = "";
        for (Standard std : standards) {
            if(std.getStandard() == standard) {
                float highestPercentage = 0;
                for (Student student : std.getStudentList()) {
                    if (highestPercentage < student.getPercentage()) {
                        highestPercentage = student.getPercentage();
                        studentName = student.getStudentName() + "--" + Integer.toString(std.getStandard()) + "th standard";
                    }
                }
               break;
            }
        }
        return studentName;
    }
}
