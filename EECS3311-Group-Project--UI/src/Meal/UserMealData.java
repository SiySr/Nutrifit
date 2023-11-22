package Meal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Profile.DatabaseManagerProfile;


public class UserMealData {
	
	private Date date;
	private String mealType;
	private List<String> ingredientsList = new ArrayList<String>();
	private List<Float> quantityList= new ArrayList<Float>();
	
	
	private DatabaseManagerMeal database = null;
	
	private void database() {
		this.database = new DatabaseManagerMeal();
	}
	
	public void create() {
		if(database == null)	
			database();
		database.create(this);
	}
	public ArrayList<String> getFoods() {
		if(database == null)	
			database();
		return database.fetchNames();
	}
	
	
	public Date getDate() {
		return this.date;
	}
	public void setDate(String date) {
		try {
			this.date = new SimpleDateFormat("yyyy/MM/dd").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	public String getMealType() {
		return this.mealType;
	}
    public void addToIngredientsList(String ingredient) {
    	ingredientsList.add(ingredient);
    }
    public List<String> getIngredientsList(){
    	return this.ingredientsList;
    }
    public void addToQuantityList(String quantity) {
    	quantityList.add(Float.valueOf(quantity));
    	System.out.println(quantityList.toString());
    }
    public List<Float> getQuantityList(){
    	return this.quantityList;
    }
}