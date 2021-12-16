public class TestTelevisionShop {
	public static void main(String []args){
		Television tv1 = new Television("LG",55);
		Television tv2 = new Television("Samsung",48);
		Television tv3 = new Television("Sony",65);
		Television[] televisions = {tv1,tv2,tv3};
		TelevisionShop myTelevisionShop = new TelevisionShop(televisions);
		myTelevisionShop.displayTelevision(2);
		System.out.println("The number of televisions with brand Sony: "+myTelevisionShop.brandCount("Sony"));
		System.out.println("The brand and screen size of the televisions with the 2 smallest sizes:");
		Television[] small= myTelevisionShop.smallTelevisions();
		for (int i = 0; i < small.length; i++) {
			System.out.println("Brand: "+small[i].getBrand()+" Screen size: "+small[i].getScreensize());
		}
	}
}