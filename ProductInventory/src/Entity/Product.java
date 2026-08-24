package Entity;

public class Product {
	private int proId;
	private String proName;
	private String category;
	private float price;
	private int stcokCount;
	public Product(int proId, String proName, String category, float price, int stcokCount) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.category = category;
		this.price = price;
		this.stcokCount = stcokCount;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStcokCount() {
		return stcokCount;
	}
	public void setStcokCount(int stcokCount) {
		this.stcokCount = stcokCount;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", category=" + category + ", price=" + price
				+ ", stcokCount=" + stcokCount + "]";
	}
	
	
}
