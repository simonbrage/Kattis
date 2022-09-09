// From Kattis ITU 
// ------------------------------------------------------
// NOTE! This solution doesn't work in it's current state
// ------------------------------------------------------

import java.util.*;

class Student {
    String name;
    String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        ArrayList<Student> studentList = new ArrayList<Student>();
        for(int i = 0; i < n; i++) {
            String name = s.next();
            String grade = s.next();
            studentList.add(new Student(name, grade));
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                String gradeOne = s1.grade;
                String gradeTwo = s2.grade;
                String baseOne = Character.toString(gradeOne.charAt(0));
                String baseTwo = Character.toString(gradeTwo.charAt(0));

/*                 System.out.println("_________");
                System.out.println("STATUS: ");
                for (Student student : studentList) {
                    student.printName();
                }
                System.out.println(" ");
                System.out.println("Student 1: " + s1.getName() + " " + s1.getGrade());
                System.out.println("Student 2: " + s2.getName() + " " + s2.getGrade()); */

                if(gradeOne.equals(gradeTwo)) {
                    //System.out.println("GRADES 100% EQUAL between " + s1.getName() + " " + s2.getName());
                    return s1.getName().compareTo(s2.getName());
                }

                /* System.out.println("Grade were not equal, need more checks");
                System.out.println(""); */
                
                if(!gradeOne.contains("FX") && !gradeTwo.contains("FX")) {
                    if(baseOne.equals(baseTwo)) {
                        //System.out.println("BASE GRADE EQUAL between " + s1.getName() + " " + s2.getName());
                        if(gradeOne.contains("+") && (gradeTwo.contains("-") || gradeTwo.length() == 1)) {
                            //System.out.println("Student 1 is better:" + s1.getName() + " vs " + s2.getName());
                            return 1;
                        } else if((gradeOne.contains("-") || gradeOne.length() == 1) && gradeTwo.contains("+")) {
                            //System.out.println("Student 2 is better: " + s1.getName() + " vs " + s2.getName());
                            return -1;
                        } else {
                            if(gradeOne.contains("+") ||gradeTwo.contains("+")) {
                                //if(gradeOne.length() - gradeTwo.length() < 0) System.out.println("Student 2 is better"); else System.out.println("Student 1 is better");
                                return gradeOne.length() - gradeTwo.length();
                            } else {
                                //if((gradeOne.length() - gradeTwo.length())*-1 > 0) System.out.println("Student 1 is better"); else System.out.println("Student 2 is better");
                                return (gradeOne.length() - gradeTwo.length())*-1;
                            }      
                        }                  
                    } 
                    byte byteOne = (byte) gradeOne.charAt(0);
                    byte byteTwo = (byte) gradeTwo.charAt(0);
                    //System.out.println(byteOne);
                    //System.out.println(byteTwo);
                    //if(byteOne - byteTwo > 0) System.out.println("Student 2 is better by byte: " + byteTwo); else System.out.println("Student 1 is better by byte: " + byteOne);
    
                    return byteOne - byteTwo;
                } else {
                    if(gradeOne.matches("^[F][X]\\W*$") && gradeTwo.matches("^[F]\\W*$")) {
                        //System.out.println("Student 1 has " + gradeOne + " but Student 2 is worse with " + gradeTwo);
                        return 1;
                    } else if(gradeOne.matches("^^[F]\\W*$") && gradeTwo.matches("^[F][X]\\W*$")) {
                        //System.out.println("Student 2 has " + gradeTwo + " but Student 1 is worse with " + gradeOne);
                        return -1;
                    } else if(gradeOne.matches("^[F][X]\\W*$") && gradeTwo.matches("^[^F]{1}\\W*$")) {
                        //System.out.println("Student 1 has " + gradeOne + " but Student 2 is better with " + gradeTwo);
                        return -1;
                    } else if(gradeOne.matches("^[^F]{1}\\W*$") && gradeTwo.matches("^[F][X]\\W*$")) {
                        //System.out.println("Student 2 has " + gradeTwo + " but Student 1 is better with " + gradeOne);
                        return 1;
                    } if(gradeOne.matches("^[F][X]\\W*$") && gradeTwo.matches("^[F][X]\\W*$")) {
                        if(gradeOne.contains("+") && gradeTwo.contains("-")) {
                            //System.out.println("FX Student 1 is better:" + s1.getName() + " vs " + s2.getName());
                            return 1;
                        } else if(gradeOne.contains("-") && gradeTwo.contains("+")) {
                            //System.out.println("FX Student 2 is better: " + s1.getName() + " vs " + s2.getName());
                            return -1;
                        } else {
                            if(gradeOne.contains("+") || gradeTwo.contains("+")) {
                                //if(gradeOne.length() - gradeTwo.length() < 0) System.out.println("FX Student 2 is better"); else System.out.println("Student 1 is better");
                                return gradeOne.length() - gradeTwo.length();
                            } else {
                                //if((gradeOne.length() - gradeTwo.length())*-1 > 0) System.out.println("FX Student 1 is better"); else System.out.println("Student 2 is better");
                                return (gradeOne.length() - gradeTwo.length())*-1;
                            }
                        } 
                    }
                }
                return 0;
            }
            
        });

        //System.out.println("");
        //System.out.println("FINAL RESULT");
        for (Student student : studentList) {
            student.printName();
        }        
    }
}
