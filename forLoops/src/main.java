
public class main {
	public static void main(String args[]){
		main main = new main();
		main.f();
	}
	
	
	
	
	
	
	
	public void f(){
		for(int i = 0; i < 3 ; i ++){
			for (int e = 0; e< 5 - i; e++){
			s("\\");
			
			}
			s(i + 1 + "" );
			for (int e = 0; e< 5 - i; e++){
			s("/");
			}
	
			s("/n");
			
		}
	}
	
	public void s(String s){
	System.out.print(s);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void l1(){
		for(int i = 0; i < 4; i++){
			for(int e = 0; e<5; e++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void l2(){
		for (int i = 0; i <6; i++){
			for (int e = 0; e < i; e++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void l3(){
		for (int i = 1; i < 8; i++){
			for (int e = 1; e < i + 1; e++){
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public void l4(){
		for(int i = 0; i < 4; i++){
			for(int e = 0; e <10; e++){
				for (int a = 0; a < 3; a++){
					System.out.print(e);
				}
			}
			System.out.println("");
		}
	}
	public void l5(){
		for(int i = 0; i < 3; i++){
			for (int e = 0; e < 6; e++){
				System.out.print("\\");
			}
			for (int e = 0; e < 6; e++){
				System.out.print("/");
			}
			System.out.println("");
		}
	}
	public void l6(){
		int lnum = 1;
		for (int i = 0; i < 5; i++){
			for (int e = 0; e < (11-lnum)/ 2; e++ ){
				System.out.print("-");
			}
			for (int a = 0; a < lnum; a++){
				System.out.print(lnum);
			}
			for (int e = 0; e < (11-lnum)/ 2; e++ ){
				System.out.print("-");
			}
			lnum += 2;
			System.out.println("");
		}
		
	}
	public void pgram(){      
		System.out.println("A");
		for (int i = 2; i < 21; i +=2){
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("B");
		for(int i = 24; i > 3; i-= 4){
			System.out.print(i + "   ");
		}
		System.out.println("");
		System.out.println("C");
		int g = 0;
		for(int i = 1; i <= 100; i++){
			g += i;
		}
		System.out.println(g);	
		System.out.println("D");
		int f = 0;
		for(int i = 1; i <= 1004; i++){
			f += i;
		}
		System.out.println(f/1004.0);
		System.out.println("E");
		for (int i = 0; i <5; i++){
			System.out.print((int)(Math.random() * 100) + 1 + " ");
		}
		System.out.println("");
		System.out.println("F");
		for (int i = 0; i <9; i++){
			System.out.print((int)(Math.random() * 20) + 4 + ",");
		}System.out.println((int)(Math.random() * 20) + 4);
		System.out.println("G");
		int max = -50;
		for (int i = 0; i< 20; i++){
			int r = (int)((Math.random()*100) - 50);
			max = Math.max(max, r);
			System.out.print(r + " ");
		}
		System.out.println("");
		System.out.println(max);
		System.out.println("H");
		for (int i = 1; i <= 20; i++){
			System.out.print  ((int)Math.pow(i, 2) + " ");
		}
	}
}
