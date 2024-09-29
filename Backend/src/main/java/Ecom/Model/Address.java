package Ecom.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AddressID")
	private Integer addressID;

	@NotNull(message = "flatNo Name Mandatory")
	@NotBlank(message = "flatNo Name Mandatory")
	private String flatNo;

	@NotNull(message = "Street Name Mandatory")
	@NotBlank(message = "Street Name Mandatory")
	private String Street;

	@Size(max = 10)
	@NotNull(message = "City Name Mandatory")
	@NotBlank(message = "City Name Mandatory")
	private String city;

	@NotNull(message = "zipCode should not Blank")
	@NotBlank(message = "zipCode is Mandatory")
	private String ZipCode;

	@Size(max = 10)
	@NotNull(message = "State should not Blank")
	@NotBlank(message = "State Name Mandatory")
	private String state;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "userid")
	private User user;

	//Add new method
	public void setUser(User existingUser) {
		// TODO Auto-generated method stub
		
	}
	//Add new method

	public Object getFlatNo() {
		// TODO Auto-generated method stub
		return null;
	}

	//Add new method
	public Object getZipCode() {
		// TODO Auto-generated method stub
		return null;
	}

	//Add new method
	public Object getStreet() {
		// TODO Auto-generated method stub
		return null;
	}

	//Add new method
	public Object getState() {
		// TODO Auto-generated method stub
		return null;
	}
	//Add new method

	public Object getCity() {
		// TODO Auto-generated method stub
		return null;
	}
	//Add new method
	public void setFlatNo(Object flatNo2) {
		// TODO Auto-generated method stub
		
	}
	//Add new method
	public void setZipCode(Object zipCode2) {
		// TODO Auto-generated method stub
		
	}
	//Add new method
	public void setStreet(Object street2) {
		// TODO Auto-generated method stub
		
	}
	//Add new method
	public void setCity(Object city2) {
		// TODO Auto-generated method stub
		
	}
	//Add new method
	public void setState(Object state2) {
		// TODO Auto-generated method stub
		
	}

}
