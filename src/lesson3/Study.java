package lesson3;

class Study {
    private String course;

    // Setter for the course value.
    public void setCourse(String course) {
        this.course = course;
    }
    public void printCourse() {
        System.out.println(course);
    }
}

class JavaProgram {
    public static void main(String[] args) {

        Study study = new Study();  // New instance of Class Study.
        study.setCourse("Изучение Java - это просто!"); // Set value.
        study.printCourse(); // Output value.
    }
}


