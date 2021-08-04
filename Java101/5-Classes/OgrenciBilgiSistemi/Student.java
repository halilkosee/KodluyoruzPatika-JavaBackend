public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        // calcAvarage();
        this.isPass = false;
    }

    public void addBulkNote(int mat, int matOp, int fizik, int fizİkOp, int kimya, int kimyaOp) {

        if ((mat >= 0 && mat <= 100) && (matOp >= 0 && matOp <= 100)) {
            this.mat.note = mat;
            this.mat.opinion = matOp;
        }

        if ((fizik >= 0 && fizik <= 100) && (fizİkOp >= 0 && fizİkOp <= 100)) {
            this.fizik.note = fizik;
            this.fizik.opinion = fizİkOp;
        }

        if ((kimya >= 0 && kimya <= 100) && (kimyaOp >= 0 && kimyaOp <= 100)) {
            this.kimya.note = kimya;
            this.kimya.opinion = kimyaOp;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.opinion == 0
                || this.fizik.opinion == 0 || this.kimya.opinion == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * (1 - this.fizik.percentageOpinion))
                + (this.fizik.opinion * this.fizik.percentageOpinion))
                + ((this.kimya.note * (1 - this.kimya.percentageOpinion))
                        + (this.kimya.opinion * this.kimya.percentageOpinion))
                + ((this.mat.note * (1 - this.mat.percentageOpinion))
                        + (this.mat.opinion * this.mat.percentageOpinion)))
                / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik kanaat Notu : " + this.mat.opinion);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik kanaat Notu : " + this.fizik.opinion);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya kanaat Notu : " + this.kimya.opinion);
    }

}
