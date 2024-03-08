////import java.io.BufferedReader;
////import java.io.File;
//import java.io.File;
////import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectStreamException;
//import java.io.PrintWriter;
import java.io.*;

public class Meal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String mealName; //name of meal
	String mealID; //Meal components or meal description
	
	File test = new File("src/MealPlanFile.txt");
	FileWriter write;// = new FileWriter(test);
	PrintWriter printWriter;// = new PrintWriter(write);
	
	//specific components for the meal
	String protein = null;
	String grains = null;
	String fruits = null;
	String vegetables = null;
	String fats = null;
	String dairy = null;
//	int mealFlag = 0; //1 - breakfast, 2 - snack, 3- lunch, 4- dinner
	
	Meal(String mealID, String mealName, String protein,String grains,String fruits,String vegetables,String fats,String dairy){
//		this.mealFlag = mealFlag;
		this.mealName = mealName;
		this.mealID = mealID;
		this.protein = protein;
		this.grains = grains;
		this.fruits = fruits;
		this.vegetables = vegetables;
		this.fats = fats;
		this.dairy = dairy;
		
//		try {
//			writeToFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void writeToFile() throws IOException{
		write = new FileWriter(test, true);
		printWriter = new PrintWriter(write);
		
		printWriter.print(stringAll());
		printWriter.print("\n");
		printWriter.close();
		
	}

	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
//	public String getMealDes() {
//		return mealDes;
//	}
//	public void setMealDes(String mealDes) {
//		this.mealDes = mealDes;
//	}
	public String getProtein() {
		return protein;
	}
	public void setProtein(String protein) {
		this.protein = protein;
	}
	public String getGrains() {
		return grains;
	}
	public void setGrains(String grains) {
		this.grains = grains;
	}
	public String getFruits() {
		return fruits;
	}
	public void setFruits(String fruits) {
		this.fruits = fruits;
	}
	public String getVegetables() {
		return vegetables;
	}
	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}
	public String getFats() {
		return fats;
	}
	public void setFats(String fats) {
		this.fats = fats;
	}
	public String getDairy() {
		return dairy;
	}
	public void setDairy(String dairy) {
		this.dairy = dairy;
	}
	public String stringAll() {
		String info = mealID + ": " + mealName + "\n" + "\tProtein:" + protein+ " , Grains:" + grains + " , Fruits: " + fruits +", Veggies: " + vegetables + ", Fats: " + fats +", Dairy: " + dairy;
		return info;
	}
	public String toString() {
		return mealName;
	}
}
