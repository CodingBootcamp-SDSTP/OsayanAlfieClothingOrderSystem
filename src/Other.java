import java.math.BigDecimal;

public class Other extends Clothes
{
	final int ID;
	private String size;
	private String gender;
	private String productname;

	public Other(int id, String pn, String t, String c, BigDecimal p, int q, String s, String g) {
		ID = id;
		setProductName(pn);
		setType(t);
		setColor(c);
		setPrice(p);
		setQuantity(q);
		size = s;
		gender = g;
	}

	public String getSize() {
		return(size);
	}

	public String getGender() {
		return(gender);
	}

	public String getProductName() {
		return(productname);
	}
}
