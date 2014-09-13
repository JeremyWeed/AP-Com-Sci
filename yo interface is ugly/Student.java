public class Student implements Comparable{
    private int gpa, height;
    private String studentName;
    
    public Student(int gpa, int height, String studentName){
        this.gpa = gpa;
        this.height = height;
        this.studentName = studentName;
    }
    
    public int compareTo(Object o){
        Student s = (Student) o;
        return gpa - s.getGpa();
    }
    
    public int getGpa(){
        return gpa;
    }
    
    public String getName(){
        return studentName;
    }
    
    public String toString(){
        return studentName;
    }
}