import java.util.List;

public class TestToppers {
    public static void main(String[] args) {


        Standard standard1 = new Standard().setStudentsAndStandards(1, 10, 5);
        Standard standard2 = new Standard().setStudentsAndStandards(2, 10, 5);
        Standard standard3 = new Standard().setStudentsAndStandards(3, 10, 5);
        Standard standard4 = new Standard().setStudentsAndStandards(4, 10, 5);
        Standard standard5 = new Standard().setStudentsAndStandards(5, 10, 5);

        List<Standard> standardsList = new Standard().getAllStandards(standard1, standard2, standard3, standard4, standard5);

        School school = new School.SchoolBuilder().schoolName("St.Marys").standards(standardsList).build();

        System.out.println(school.getNameOfTopper(4)+ " Topper");

    }
}
