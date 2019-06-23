package jp.ivs.Model;

public class Category {
	protected int id;
    protected String name;
    
	public Category() {
	}
    
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
