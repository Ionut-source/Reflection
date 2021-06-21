package ro.ctrln.java.annotations;

public class ProgramingBittnetCourse implements  BittnetCourse{

    private int totalCourses;
    private int completCourses;
    private String name;

    public ProgramingBittnetCourse(String name, int totalCourses ) {
        this.name = name;
        this.totalCourses = totalCourses;
    }

    @Override
    public String getProgress() {
        return "Programing " + name + " progress: " + completCourses + "/" + totalCourses;
    }
}
