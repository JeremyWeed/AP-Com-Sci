public class Calendar implements Comparable<Calendar>{
    private int year;
    private int month;
    private int day;
    public Calendar(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String toString(){
        return ((month < 10) ? "0" + month : month) + "/" + ((day < 10) ? "0" + day : day) + "/" + year;
    }
    
    public int compareTo(Calendar c){
        if (c.getYear() > getYear())return 1;
        else if (c.getYear() < getYear()) return -1;
        else if (c.getMonth() > getMonth()) return 1;
        else if (c.getMonth() < getMonth()) return -1;
        else if (c.getDay() > getDay()) return 1;
        else if (c.getDay() < getDay()) return -1;
        else return 0;
    }
}