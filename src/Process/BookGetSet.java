package Process;

public class BookGetSet {

	private String name;
	private String code;
	private String price;
	private String author;
	private String isAvailable;
	
	
	public BookGetSet(String name, String code, String price, String author, String isAvailable) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getisAvailable() {
		return isAvailable;
	}
	public void setAvailable(String isAvailable) {
		
		this.isAvailable = isAvailable;
	}
	public String toString(){
		return name +" , "+ code +" , "+ price +" , "+ author +" , "+ isAvailable;
	}
}

	
	
	

