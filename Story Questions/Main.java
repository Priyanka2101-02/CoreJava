/*
 * class definitions:
 class Student:
 data members:
 String name
 int score
 Student(String name, int score): constructor with public visibility
 class Classroom:
 method definition:
 registerStudent(Student student):
 return : String
 visibility: public
 studentCard(String card):
 return : String
 visibility : public 

class Student
- define data members according to the above specifications
class Classroom
- define data members according to the above specifications
-Implement the below methods for this class:
-String registerStudent(Student student):
• Write a code to validate the names and marks of the students according to the below
specifications.
• The name must be in uppercase, if not return "Block letters needed".
• If the score is not between 0 to 100 then return "Invalid score".
• If the above conditions are satisfied then return "Registered".
-String studentCard(String card):
• The given string contains only numbers(no alphabets and special symbols allowed).
• If it has any other character return "Invalid card" else return "Valid card".

input:
Student s1=new Student("A",6);
Classroom cm=new Classroom();
cm.registerStudent(s1);

output:
Registered
 */











class Student {
    // Data members
    String name;
    int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Classroom {
    // Method to register a student
    public String registerStudent(Student student) {
       
        if (!isUpperCase(student.name)) {
            return "Block letters needed";
        }

        
        if (student.score < 0 || student.score > 100) {
            return "Invalid score";
        }

        return "Registered";
    }

   
    public String studentCard(String card) {
        // Check if the card contains only numbers
        if (!card.matches("[0-9]+")) {
            return "Invalid card";
        }

        return "Valid card";
    }

    
    private boolean isUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("A", 6);
        Classroom cm = new Classroom();
        String result = cm.registerStudent(s1);
        System.out.println(result); // Output: Registered
    }
}
