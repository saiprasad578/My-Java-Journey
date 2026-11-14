class Course {

    private String studentName;
    private String courseName;
    private int totalLessons;
    private int completedLessons;

    Course(String studentName, String courseName, int totalLessons) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.totalLessons = totalLessons;
        this.completedLessons = 0;
    }

    void completeLesson() {
        if (completedLessons < totalLessons) {
            completedLessons++;
            System.out.println("Lesson completed successfully!");
        } else {
            System.out.println("All lessons are already completed.");
        }
    }

    void displayProgress() {
        double progress = (completedLessons * 100.0) / totalLessons;

        System.out.println("Student: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Completed Lessons: " + completedLessons
                + "/" + totalLessons);
        System.out.println("Progress: " + progress + "%");

        if (completedLessons == totalLessons) {
            System.out.println("Status: Course Completed");
        } else {
            System.out.println("Status: In Progress");
        }
    }
}

public class CourseProgressDemo {

    public static void main(String[] args) {

        Course course = new Course("Sai", "Java Programming", 5);

        course.completeLesson();
        course.completeLesson();

        System.out.println();

        course.displayProgress();

        System.out.println();

        course.completeLesson();
        course.completeLesson();
        course.completeLesson();

        System.out.println();

        course.displayProgress();
    }
}