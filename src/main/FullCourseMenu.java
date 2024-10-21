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
