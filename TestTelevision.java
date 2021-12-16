class Television {
	private String brand;
	private int screenSize;
	public Television (String abrand, int ascreenSize){
		brand=abrand;
		screenSize=ascreenSize;
	}
	public void setBrand(String abrand){
		brand=abrand;}
	public String getBrand(){
		return brand;}
	public void setScreensize(int ascreenSize){
		screenSize=ascreenSize;}
	public int getScreensize(){
		return screenSize;}
}
        
public class TestTelevision{
	public static void main(String []args){
		Television aTelevision = new Television("LG",55);
		System.out.print("A Television object has been created: brand is "+aTelevision.getBrand()+",screen size is "+aTelevision.getScreensize());
	}
}
class TelevisionShop {
    private Television[] televisions;
		public TelevisionShop(Television[] televisions) {
		this.televisions = televisions;
    }
	public void settelevisions(Television[] televisions){
		this.televisions=televisions;}
	public Television[] gettelevisions(){
		return televisions;}
	public void displayTelevision(int index){
		System.out.println("Television with index "+index);
		System.out.println("Brand :"+televisions[index].getBrand());
		System.out.println("Screen size :"+televisions[index].getScreensize());
	}
	public int brandCount(String aBrand){
		int count=0;
		for (int i=0; i < televisions.length; i++)// Sir can you show me how to use enhanced for loop for this case?
			if (televisions[i].getBrand().equals(aBrand))
				{count++;}
		return count;
	}
	public Television[] smallTelevisions() {
		Television[] televisionstemp = televisions.clone();
		Television[] small = new Television[2];
		for (int i = 0; i < televisionstemp.length; i++) {
			for (int j = i+1; j < televisionstemp.length; j++) {
				if(televisions[i].getScreensize() > televisions[j].getScreensize()) {
					Television temp = televisionstemp[i];    
					televisionstemp[i] = televisionstemp[j];    
					televisionstemp[j] = temp;    
					small[0]=televisionstemp[0];
					small[1]=televisionstemp[1];
				}
			}
		}
		return small;
	}
}

