//TODO 1: Create a class with name FullCourseMenu with below attributes (Test Commit)
//TODO Problem with toString() method on all extended classes!

public abstract class FullCourseMenu {
    private String courseType;

    public FullCourseMenu(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseType() {
        return courseType;
    }
}