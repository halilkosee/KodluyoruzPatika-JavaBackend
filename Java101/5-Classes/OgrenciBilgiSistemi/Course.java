public class Course {
    String name;
    String courseCode;
    String prefix;
    int note;
    int opinion;
    double percentageOpinion;
    Teacher teacher;

    Course(String name, String courseCode, String prefix, double percentageOpinion) {
        this.name = name;
        this.courseCode = courseCode;
        this.prefix = prefix;
        this.note = 0;
        this.opinion = 0;
        this.percentageOpinion = percentageOpinion;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("İşlem Başarılı");
        } else {
            System.out.println(teacher.name + " bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " akedemisyeni :" + teacher.name);
        } else {
            System.out.println("Akademisyen atanmamaıştır.");
        }
    }
}
