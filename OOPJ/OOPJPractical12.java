import java.util.*;

//* Creating Parent Class 
class Product{
	int Product_Id;
	String Product_Name;
	float Price;
}
//* Creating Parent Class

//* Creating Child Class with Inheritence of Parent Class
class productDetails extends Product{
	Scanner read = new Scanner(System.in);
	void Details(){
		System.out.println();
		System.out.print("Enter Product Id: ");
		Product_Id = read.nextInt();
		System.out.print("Enter Product Name: ");
		Product_Name = read.next();
		System.out.print("Enter Product Price: ");
		Price = read.nextFloat();
	}
}
//* Creating Child Class with Inheritence of Parent Class

//* Creating Child Class From Child Class inheriting Properties of Both 
class displayDetails extends productDetails{
	void Display(){
		System.out.println();
		System.out.println("Product Id: "+ Product_Id);
		System.out.println("Product Name: "+ Product_Name);
		System.out.println("Product Price: "+ Price);
	}
}
//* Creating Child Class From Child Class inheriting Properties of Both

class OOPJPractical12{
	public static void main(String [] args){
		Scanner read = new Scanner(System.in);
		int MAX, opt;
		System.out.print("Enter No. Of Products: ");
		MAX = read.nextInt();
		displayDetails List[] = new displayDetails[MAX];
		
		while(true){
			System.out.println();
			System.out.println("1 ==> Enter Details.");
			System.out.println("2 ==> Display Details.");
			System.out.println("3 ==> Exit Program.");
            System.out.println();
            System.out.print("Enter Option: ");
			opt = read.nextInt();
			
			switch(opt){
				case 1:
					for(int i = 0; i < MAX;i++){
						List[i] = new displayDetails();
						List[i].Details();
					}
					break;
				case 2:
					for(int i = 0; i < MAX;i++){
						List[i].Display();
					}
					break;
				case 3:
					System.out.println("Exiting Program...");
					break;
				default:
					System.out.println("Invalid Operation.");
					break;
			}
			
			if(opt == 3){
				break;
			}
		}
	}
}