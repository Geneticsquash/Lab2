//TODO 1: Create a class with name FullCourseMenu with below attributes (Test Commit)
public class FullCourseMenu {
    private String courseType;

    public FullCourseMenu(String courseName) {
        this.courseType = courseName;
    }

    @Override
    public String toString() {
        return courseType;
    }
}
