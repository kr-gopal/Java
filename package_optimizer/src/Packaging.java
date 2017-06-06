
import java.io.FileReader;
import java.io.BufferedReader;



public class Packaging {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception { 
		FileReader file = new FileReader("/home/marino/workspace/Package_optimizer/src/Input.txt");
		BufferedReader reader = new BufferedReader(file);
        String line;
        int i=0,j;
        int index_val = 0,cost = 0;
        float weight = 0;
        Item[] item_array = null;
        Big_pack pkg = new Big_pack();
        
        while((line=reader.readLine())!=null)
        {
        	String[] words = line.split("\\s+");
        	pkg.Weight=(Integer.parseInt(words[0])); 
        	j=2;
        	item_array=new Item[words.length-2];
        	
        	while(j<words.length)
        	{
        		String[] packet = words[j].split(",");
        		i=0;
        		
        		for(i=0;i<3;i++)
        		{
        			if(i==0)
            		{
            			index_val= Integer.valueOf(packet[0]);
            		}
            		else if(i==1)
            		{
            			weight=Float.valueOf(packet[1]);
            		}
            		else
            		{
            			cost= Integer.valueOf(packet[2]);
            		}
					item_array[j-2]=new Item(index_val,weight,cost);		
        		}
        		j=(j+1);
        	}
            Optimization opt=new Optimization();
           opt.optimize(pkg.Weight,item_array,item_array.length);
    	}
        	
        }
        
}