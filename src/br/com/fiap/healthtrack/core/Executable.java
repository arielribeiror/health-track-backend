package br.com.fiap.healthtrack.core;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 * 
 * @author Grupo 23
 * @version 1.0
 */
public class Executable {
	
	/**
	 * Activities instances
	 */
	static ActivityType activityType = new ActivityType("1", "Academia");
//	static Activity activity = new Activity("1", activityType.getType(), 450, Date.now(), "Treino pela manhã");
	
	/**
	 * Foods instances
	 */
	static FoodType foodType = new FoodType("1", "Almoço");
//	static Food food = new Food("1", foodType.getType(), 750, LocalDateTime.now(), "Pratada de pedreiro");
	
	/**
	 * Weight instance
	 */
//	static Weight weight = new Weight("1", 62.5, LocalDateTime.now());
	
	/**
	 * BloodPressure instance
	 */
//	static BloodPressure bloodPressure = new BloodPressure("1", 10, 7, LocalDateTime.now()); 

	/**
	 * main method
	 * @param args default param
	 */
	public static void main(String[] args) {
		
		/**
		 * Activities methods call
		 */
		activityType.getType();
//		activity.addActivity();
//		activity.getActivityById("1");
//		activity.getActivitiesByType("Academia");
//		activity.editActivity("1", "Natação", 350, LocalDateTime.now(), "Nado vespertino");
		
		/**
		 * Foods methods call
		 */
		foodType.getType();
//		food.addFood();
//		food.getFoodById("1");
//		food.getFoodsByType("Almoço");
//		food.editFood("1", "Jantar", 450, LocalDateTime.now(), "Tapioca com ovos mexidos");
		
		/**
		 * Weight methods call
		 */
//		weight.addWeight();
//		weight.getWeightById("1");
//		weight.editWeight("1", 65.0);
		
		/**
		 * BloodPressure methods call
		 */
//		bloodPressure.addBloodPressure();
//		bloodPressure.getBloodPressureById("1");
//		bloodPressure.editBloodPressure("1", 10, 6);
	}

}
