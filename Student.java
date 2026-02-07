
class StudentRecordSystem {

    static Student[] students = new Student[5];
    static int count = 0;

    // ADD STUDENT
    static void addStudent(int id, String name, int marks) {
        students[count++] = new Student(id, name, marks);
    }

    // DISPLAY STUDENTS
    static void displayStudents() {
        System.out.println("\nID   Name   Marks");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].id + "   " +
                               students[i].name + "   " +
                               students[i].marks);
        }
    }

    // LINEAR SEARCH BY ID
    static void searchById(int key) {
        for (int i = 0; i < count; i++) {
            if (students[i].id == key) {
                System.out.println("Student Found: " +
                        students[i].name + ", Marks: " + students[i].marks);
                return;
            }
        }
        System.out.println("Student not found");
    }

    // BUBBLE SORT BY MARKS
    static void sortByMarks() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].marks > students[j + 1].marks) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Students sorted by marks");
    }

    public static void main(String[] args) {

        // ADD SAMPLE DATA
        addStudent(101, "Arun", 78);
        addStudent(102, "Bala", 85);
        addStudent(103, "Chitra", 67);
        addStudent(104, "Divya", 92);
        addStudent(105, "Eshan", 74);

        displayStudents();

        System.out.println("\nSearching student with ID 103:");
        searchById(103);

        sortByMarks();
        displayStudents();
    }
}

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

