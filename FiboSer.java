package selenium;

public class FiboSer extends AddTwoNum {

	public static void main(String[] args) {

		int a=0,b=1,c=0,i;
		
		
		for(i=2;i<100;i++){
			c=a+b;
			AddTwoNum kk = new AddTwoNum();
			
if (c>100){
	break; 
}
System.out.println(c);

			a=b;
			b=c;
			
			AddTwoNum ll = new AddTwoNum(a);
			
			

		}
		
		FiboSer kk = new FiboSer();
		kk.add(5, 6);

		
	}
	
	public void m1(){
		
	}
	
	}


