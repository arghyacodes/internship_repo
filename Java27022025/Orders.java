import java.util.Scanner;
class Order {
	private
		int id;
		String name;
		int price;
		int qty;
	
		public
			void setId(int id)
			{
				this.id = id;
			}
			void setName(String name)
			{
				this.name = name;
			}
			void setPrice(int price)
			{
				this.price = price;
			}
			int getPrice()
			{
				return price;
			}
			int getId()
			{
				return id;
			}
			void setQty(int qty) {
				this.qty = qty;
			}
			int getQty()
			{
				return qty;
			}
			String getName()
			{
				return name;
			}
}

public class Orders{
	public static void main(String[] args) {
		Order obj = new Order();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = sc.nextInt();
		obj.setId(id);
		
		System.out.println("enter name");
		String name = sc.next();
		obj.setName(name);
		
		System.out.println("enter price");
		int price = sc.nextInt();
		obj.setPrice(price);
		
		System.out.println("enter quantity");
		int qty = sc.nextInt();
		obj.setQty(qty);
		
		System.out.println("Order Summary :\nOrder Id : "+obj.getId()+"\nName : "+obj.getName()+"\nPrice : "+obj.getPrice()+"\nOrder Quantity : "+obj.getQty()+"\n Total : "+(obj.getPrice()*obj.getQty()));
	}
}