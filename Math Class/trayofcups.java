
import java.util.*;
public class trayofcups
{
    int[] numbers = new int [5];
   // numbers [0] = 5;
    int[] num = {11, 9, 0, 7, 8};
    int nums[] = {2,3,4,5,6};
    int l = num.length;
    //num[7]; //arrayIndexOutOfBoundsException
   // for(int x: num){
    //    System.out.print(x + " ");
    //}
   public static void main(String[] args){
       
    }
    
    public static int lastIndexOf(int[] a, int i){
        int y = 0;
        int last = -1;
        for (int x: a){
            
         if(x == i) last = y;
         y++;
        }
        return last;
    }
    public static int range (int[] a){
        int min = a[0];
        int max = a[0];
        for ( int x:a){
            min = Math.min(min, x);
            max = Math.max(max, x);
    }
    return max - min;
}
public static int range2 (int[] a){
Arrays.sort(a);
return a[a.length] - a[0];
}
public static int countInRange(int[] a, int min, int max){
    int num = 0;
    if (max < min){
        int i = max;
        max = min;
        min = i;
    }
    for (int x:a){
        if(Math.max(min, x) == x && Math.min(max, x) == x){
            num++;
        }
    }
    return num;
}







public static int mode (int[] a){
int result = a[0];
int pre = a[0];
int diff = 0;
int cdiff = 0;
Arrays.sort(a);
for (int x:a){
    
    if(x == pre){
        cdiff++;
    }else{
        if(diff < cdiff){
            diff = cdiff;
            result = pre;
            cdiff = 0;
        }
    }
    pre = x;
}
return result;
}
public static double stdev(int[] a){
    double avg = avg(a);
    double sum = 0;
    
    for (int x:a){
    sum += (x-avg) * (x-avg);
    }
    return Math.sqrt(sum/(a.length - 1));
}

public static double avg(int[] a ){
    double sum = 0;
for(int x:a){
    sum += x;
}
return sum/a.length;
}


public static double median(int[] a){
    Arrays.sort(a);
    if (a.length % 2 == 0){
        int up = a[a.length/2];
        int down = a[(a.length/2)-1];
        return (up+down)/2.0;
    }
    else{
        return a[a.length/2];
    }

}

public static double percentEven(int[] a){
    int even = 0;
    for(int x:a){
        if (x%2 == 0){
            even++;
        }
    }
    return ((double)even/a.length) *100;
}

public static int priceIsRight(int[] a, int p){
    int correct = -1;
    for (int x:a){
        if(x <= p){
            correct = Math.max(correct, x);
}
}
return correct;

}
}





























