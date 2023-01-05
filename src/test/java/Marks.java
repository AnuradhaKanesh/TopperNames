import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Marks {
    private String subjectName;
    private int maxMarks;
    private int obtainedMarks;
}
