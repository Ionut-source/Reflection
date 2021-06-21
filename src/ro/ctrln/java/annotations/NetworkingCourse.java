package ro.ctrln.java.annotations;

public class NetworkingCourse implements  BittnetCourse{

    private int totalCourses;
    private int completCourses;
    private String name;

    public NetworkingCourse(String name, int totalCourses) {
        this.name = name;
        this.totalCourses = totalCourses;

    }

    @Override
    public String getProgress() {
        return "Networking " + name + " progress: " + completCourses + "/" + totalCourses;
    }
}
