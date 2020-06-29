public class Main
{
    static int numbs[];
    static int min;
    static int med;
    static int max;
    
	public static void main(String[] args) {
	
	    numbs = new int[10];
	
		arrayAddLoop:
		for(int i =0;i<numbs.length;i++){
		    //\u000dnumbs[i] = (int) (1 + Math.random() * 1000);
		}
		
		min = numbs[0];	max = numbs[0];
		int local = 0;
		
		arrayFinderLoop:
		for(int numb : numbs){
		    if(numb>max)
		        max = numb;
		        
	        if(numb<min)
		        min = numb;
		        
	        local += numb;
		    
		    System.out.println(""+numb);
		}
		
		local = local/10;
		int saved = max;
		int sector = 0;
		
		arrayMidleLoop:
		for(int i=0;i<numbs.length;i++){
		    
		    int localArray = (numbs[i]-local);
		    
		    if(localArray >0 && localArray<saved)
		        {
		            saved = localArray;
		            sector = i;
		        } 
		}
		
		System.out.println("minimum "+min+
		" maximum "+max+
		" midle " + numbs[sector]);
	}
}