package Nov16;

public class Book {
	private int isdn;
	private String bname;
	private float cost;
	public int getIsdn() {
		return isdn;
	}
	public void setIsdn(int isdn) {
		if(isdn<100 || isdn>10000 )
			throw new IllegalArgumentException("isdn not in range 100-10000");
		else
		this.isdn = isdn;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
  /*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + isdn;
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		boolean status=false;
		if(obj instanceof Book){
			Book b=(Book)obj;
			if((isdn==b.isdn)&&(bname.equals(b.bname))&&(cost==b.cost))
				return true;
		}
		return status;
	}
}