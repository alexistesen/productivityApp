package classmains;

public class Category {

	private int id_category;
	private String cat_description;

	public Category() {
	}

	public Category(int id_category, String cat_description) {
		this.id_category = id_category;
		this.cat_description = cat_description;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getCat_description() {
		return cat_description;
	}

	public void setCat_description(String cat_description) {
		this.cat_description = cat_description;
	}

	@Override
	public String toString() {
		return "Category [id_category=" + id_category + ", cat_description=" + cat_description + "]";
	}

}
