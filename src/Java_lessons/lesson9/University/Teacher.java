package Java_lessons.lesson9.University;

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{name='" + name + "'}";
    }
}
