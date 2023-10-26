public class Student {
    private String name;
    private boolean isPresent;

    public Student(String name) {
        this.name = name;
        this.isPresent = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
