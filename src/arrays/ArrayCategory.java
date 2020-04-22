package arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import classmains.Category;

public class ArrayCategory {

	private ArrayList<Category> categoryList;

	public ArrayCategory() {
		categoryList = new ArrayList<Category>();
		cargar();
	}

	public Category getCategory(int index) {
		return categoryList.get(index);
	}

	public int lenghtList() {
		return categoryList.size();
	}

	public void addCategory(Category reg) {
		categoryList.add(reg);
	}

	public void deleteCategory(Category reg) {
		categoryList.remove(reg);
	}

	public Category searchCategory(int id_category) {
		for (Category list : categoryList) {
			if (list.getId_category() == id_category) {
				return list;
			}
		}
		return null;
	}

	public int generateIdCategory() {
		if (categoryList.size() == 0) {
			return 1;
		} else
			return categoryList.size() + 1;
	}

	public void cargar() {

		try {

			BufferedReader br;
			String linea;

//			Special Array for Reader
			String[] s;

			br = new BufferedReader(new FileReader("Category.txt"));

			while ((linea = br.readLine()) != null) {

//				Fields of class Category
				Category reg = new Category();

				s = linea.split(";");

				reg.setId_category(Integer.parseInt(s[0]));
				reg.setCat_description(s[1]);

				categoryList.add(reg);
			}

			br.close();

			System.out.println(categoryList);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void saveCategorys() {
		
		try {
			PrintWriter pw;	
			Category reg;
			String linea;
			
			pw = new PrintWriter(new FileWriter("Category.txt"));
			
			for (Category c : categoryList) {
				linea = c.getId_category() + ";" + 
						c.getCat_description();
				
				pw.println(linea);
			}
			
//			for (int i=0; i< categoryList.size(); i++) {
//				reg = categoryList.get(i); 
//				linea = reg.getId_category() + ";" + 
//						reg.getCat_description();
//				pw.println(linea);
//			}
			
			System.out.println(categoryList);
			
			pw.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}	

}
