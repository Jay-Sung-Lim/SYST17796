/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemos23tuepm;

public class studentList {
    public static void main(String[] args) {
        Student s1 = new Student("s1", "Jaesung");
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = new Student("s2", "Nayoung");
        studentList[1] = new Student("s3", "Minsu");
        
        for(int i =0; i<studentList.length; i++) {
            System.out.println(studentList[i].getStudentName());
        }
    }
}
