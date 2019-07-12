package by.api.training;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.annotation.Generated;

@Getter
@Setter
@Accessors(fluent = true)
@Generated("com.robohorse.robopojogenerator")
public class VideoGame{

	@JsonProperty("id")
	private int id;

	@JsonProperty("reviewScore")
	private String reviewScore;

	@JsonProperty("releaseDate")
	private String releaseDate;

	@JsonProperty("name")
	private String name;

	@JsonProperty("rating")
	private String rating;

	@JsonProperty("category")
	private String category;

	@Override
 	public String toString(){
		return 
			"VideoGame{" + 
			"reviewScore = '" + reviewScore + '\'' + 
			",releaseDate = '" + releaseDate + '\'' + 
			",name = '" + name + '\'' + 
			",rating = '" + rating + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}