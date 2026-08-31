package tcs_coding;

import java.util.*;

class Student {
    private int id;
    private String name;
    private int totmarksobt;

    // Constructor
    public Student(int id, String name, int totmarksobt) {
        this.id = id;
        this.name = name;
        this.totmarksobt = totmarksobt;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotmarksobt() {
        return totmarksobt;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotmarksobt(int totmarksobt) {
        this.totmarksobt = totmarksobt;
    }
}

class Solution1 {
    // Method to find student with highest total marks
    public static String findStudentWithhighestTotal(Student[] students) {
        int maxMarks = -1;
        String studentName = "";
        for (Student student : students) {
            if (student.getTotmarksobt() > maxMarks) {
                maxMarks = student.getTotmarksobt();
                studentName = student.getName();
            }
        }
        return studentName.toUpperCase();
    }

    // Method to search students by percentage
    public static List<Integer> searchStudentsBypercentage(Student[] students) {
        List<Integer> result = new ArrayList<>();
        for (Student student : students) {
            double percentage = (student.getTotmarksobt() / 400.0) * 100;
            if (percentage >= 70) {
                result.add(student.getId());
            }
        }
        Collections.sort(result);
        return result.isEmpty() ? null : result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of students
        int n = sc.nextInt();
        Student[] students = new Student[n];

        // Read student details
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();  // Consume newline
            String name = sc.nextLine();
            int totmarksobt = sc.nextInt();
            students[i] = new Student(id, name, totmarksobt);
        }

        // Call findStudentWithhighestTotal
        String studentWithHighestTotal = findStudentWithhighestTotal(students);
        System.out.println(studentWithHighestTotal);

        // Call searchStudentsBypercentage
        List<Integer> studentsByPercentage = searchStudentsBypercentage(students);
        if (studentsByPercentage != null) {
            for (int id : studentsByPercentage) {
                System.out.println(id);
            }
        } else {
            System.out.println("No Student found with mentioned attribute.");
        }

        sc.close();
    }
}

