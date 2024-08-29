/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author S563120
 */
public class Student {
    
    //Decalaring instance variables
    private int studentid ;
    private String studentname;
    private String major;
    private double gpa;
   
    
    //Implementing no-argument constructor for student class
    public Student (){
        studentid =0;
        studentname="unknow";
        major="unknow";
        gpa=0;
  
    }
    
    //Implementing parameterized constructor for student class
    public Student (int studentID, String studentName, String Major, double grade ){
        
        studentid = studentID;
        studentname= studentName;
        major= Major;
        gpa= grade;
       
    }
    
    //Creating get method for studentid variable
    public int getstudentid(){    
         return studentid;
    }
    
    //Creating set method for studentid variable
    public void setstudentid( int studentIDin){   
         studentid = studentIDin;
    
    }
    
    //Creating get method for studentname variable
     public String getstudentname(){
         return studentname;
    }
    
    //Creating set method for studentname variable
    public void setstudentname (String studentNamein){
         studentname = studentNamein;
    }
    
    //Creating get method for major variable
     public String getmajor(){
         return major;
    }
    
    //Creating set method for major variable
    public void setmajor(String Majorin){
         major = Majorin;
    }
    
    //Creating get method for gpa variable
     public double getgpa(){
         return gpa;
    }
    
    //Creating set method for gpa variable
    public void setmajor(double gradein){
         gpa = gradein;
    }
    
 
    //Implementing percenatage calculation method  to calculate the percenatge of a student
    public double calcPercentage(double gradein){
        
      return gradein/4*100 ;
    }   
}
