import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Standard {
    private List<Student> studentList;
    private int standard;

    public Standard setStudentsAndStandards(int standardName, int numberOfStudents, int numberOfSubjects) {
        Faker faker = new Faker();
        List<Student> studentListForStandard = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            List<Marks> marksList = new ArrayList<>();
            for (int j = 0; j < numberOfSubjects; j++) {
                Marks marks = new Marks.MarksBuilder().subjectName(faker.book().genre()).obtainedMarks(faker.number().numberBetween(1, 100)).maxMarks(100).build();
                marksList.add(marks);
            }
            Student stud = new Student.StudentBuilder().studentName(faker.name().firstName()).marks(marksList).build();
            studentListForStandard.add(stud);
        }

        Standard standard = new Standard(studentListForStandard,standardName);
        return standard;
    }

    public List<Standard> getAllStandards(Standard... s)
    {
        List<Standard> standards = new ArrayList<>();
        standards.addAll(List.of(s));
        return standards;
    }
}
