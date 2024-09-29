package Ecom.Exception;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MyErrorClass {

	private String message;
	private LocalDateTime localDateTimes;
	private String desc;
	//Add new method
	public void setMessage(String defaultMessage) {
		// TODO Auto-generated method stub
		
	}
	//Add new method
	
	public void setLocalDateTimes(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	//Add new method
	public void setDesc(String description) {
		// TODO Auto-generated method stub
		
	}
}
