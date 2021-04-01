/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**
 *
 * @author michael
 */
public class Login 
{
  private String Lecture, Director,Student;
  private Double Amount;  

    

    public String getLecture() {
        return Lecture;
    }

    public void setLecture(String Lecture) {
        this.Lecture = Lecture;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String Student) {
        this.Student = Student;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }
    @Override
    public String toString() {
        return "Login{" + "Lecture=" + Lecture + ", Director=" + Director + ", Student=" + Student + ", Amount=" + Amount + '}';
    }
}
