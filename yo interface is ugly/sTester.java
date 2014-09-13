public class sTester{
    static Student[] sa = {new Student(99, 2, "sam"), new Student(98, 3,"teddy"), new Student(64, 3, "diego")};
    
    public static void main(String args[]){
        System.out.println(isHigher(sa[0],sa[1]));
        System.out.println(isHigher(sa[1],sa[2]));
        System.out.println(isHigher(sa[0],sa[2]));
    }
    
    static String isHigher(Student one, Student two){
        if(one.compareTo(two) > 0){
            return one.getName();
        }else if (two.compareTo(one) > 0){
            return two.getName();
        }else return "nope";
    }
    
    static Student findMax(Student std[]){
        Student s = std[0];
        for(Student x:sa){
            s = (x.compareTo(s)>0) ? x:s;
        }
        return s;
    }
}