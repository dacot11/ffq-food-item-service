package edu.fiu.ffqr.models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="results")
public class Result {
	
	@Id
	private ObjectId id;

	@JsonProperty("questionnaireId")
	private String questionnaireId; 
	
	@JsonProperty("userId")
	private String userId;

	@JsonProperty("patientName")
	private String patientName;

	@JsonProperty("feedback")
	private String feedback;
	
	@JsonProperty("ageInMonths")
	private int ageInMonths;
	
	@JsonProperty("userChoices")
	ArrayList<FoodItemInput> userChoices;
	
	@JsonProperty("weeklyTotals")
	Map<String, Double> weeklyTotals = new HashMap<String, Double>();
	
	@JsonProperty("dailyAverages")
	Map<String, Double> dailyAverages = new HashMap<String, Double>();

	public Result(String questionnaireId, String userId, int ageInMonths, ArrayList<FoodItemInput> userChoices, 
					Map<String, Double> weeklyTotals, Map<String, Double> dailyAverages, String feedback){
		
		this.questionnaireId = questionnaireId;
		this.userId = userId;
		this.patientName = "pending";
		this.ageInMonths = ageInMonths;		
		this.userChoices = userChoices;
		this.weeklyTotals = weeklyTotals;
		this.dailyAverages = dailyAverages;
		this.feedback = feedback;
	}
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getQuestionnaireId() {
		return questionnaireId;
	}

	public void setQuestionnaireId(String questionnaireId) {
		this.questionnaireId = questionnaireId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}

	public ArrayList<FoodItemInput> getUserChoices() {
		return userChoices;
	}

	public void setUserChoices(ArrayList<FoodItemInput> userChoices) {
		this.userChoices = userChoices;
	}

	public Map<String, Double> getWeeklyTotals() {
		return weeklyTotals;
	}

	public void setWeeklyTotals(Map<String, Double> weeklyTotals) {
		this.weeklyTotals = weeklyTotals;
	}

	public Map<String, Double> getDailyAverages() {
		return dailyAverages;
	}

	public void setDailyAverages(Map<String, Double> dailyAverages) {
		this.dailyAverages = dailyAverages;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getFeedback() {
		return feedback;
	}
}
