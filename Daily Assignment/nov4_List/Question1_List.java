package nov4_List;
import java.util.*;

class Product{
	int productId;
	String productName;
	double price;
	int quantity;
	
	Product(int productId,String productName,double price,int quantity){
		this.productId=productId;
		this.productName =productName;
		this.price=price;
		this.quantity= quantity;
	}

	public static Product get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
public class Question1_List {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Product>list = new ArrayList<Product>();
		Product p1 = new Product(101,"Laptop",55000,5);
		Product p2 = new Product(102,"Mouse",800,10);
		Product p3 = new Product(103,"Keyboard",1500,0);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		// displaying all products
		for (Product p : list) 
		{
			System.out.println(p.productId +" " +p.productName +" "+p.price+" "+p.quantity);
		}
		
		//Product quantity less than 5
		for (Product p : list) 
		{
			if(p.quantity <5) 
			{
				System.out.println("\nProducts list less than quantity 5 :"+p.productId +" " +p.productName +" "+p.price+" "+p.quantity);	
			}
		}
		
		//Most Expensive
		Product expensive = list.get(0);
        for(Product p : list)
        {
            if(p.price > expensive.price)
            {
                expensive = p;
            }
		}
		System.out.println("\nMost Expensive product is :" + expensive.productId +" " +expensive.productName +" "+expensive.price+" "+expensive.quantity);
		
		//Total
		double totalValue = 0;
        for(Product p : list)
        {
            totalValue = totalValue + (p.price * p.quantity);
        }
        System.out.println("\nTotal Inventory Value: " + totalValue);
        
        
        //Mouse - price update
        for(Product p : list)
        {
            if(p.productName.equals("Mouse"))
            {
                p.price = 1000;
                System.out.println("\n"+p.productId +" " +p.productName +" "+p.price+" "+p.quantity);
            }
        }
        System.out.println("Mouse price updated successfully.");
        
        
        //remove product 
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).quantity == 0)
            {
                list.remove(i);
                i--;
            }
        }
        
        //final products
        System.out.println("\nFinal Product List:");
        for(Product p : list)
        {
        	System.out.println(p.productId +" " +p.productName +" "+p.price+" "+p.quantity);
        }
        
	}	

}
