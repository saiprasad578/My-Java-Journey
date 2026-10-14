class Exam result {

    private String studentName;
    private int javaMarks;
    private int dbmsMarks;
    private int osMarks;

    ExamResult(String studentName, int javaMarks, int dbmsMarks, int osMarks) {
        this.studentName = studentName;
        this.javaMarks = javaMarks;
        this.dbmsMarks = dbmsMarks;
        this.osMarks = osMarks;
    }

    void calculateResult() {
        int total = javaMarks + dbmsMarks + osMarks;
        double percentage = total / 3.0;

        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (javaMarks >= 35 && dbmsMarks >= 35 && osMarks >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class ExamResultDemo {

    public static void main(String[] args) {

        ExamResult student = new ExamResult("Sai", 85, 78, 90);

        student.calculateResult();
    }
}