package homes.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Home {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int price;
	private int bedrooms;
	private boolean finishedBasement;
	private String garageType;
	@Autowired
	private Address address;

	public Home() {
		super();
	}

	public Home(int price, int bedrooms, boolean finishedBasement) {
		super();
		this.price = price;
		this.bedrooms = bedrooms;
		this.finishedBasement = finishedBasement;
	}

	public Home( int price, int bedrooms, boolean finishedBasement, String garageType) {
		super();
		this.price = price;
		this.bedrooms = bedrooms;
		this.finishedBasement = finishedBasement;
		this.garageType = garageType;
	}
	public Home(long id, int price, int bedrooms, boolean finishedBasement, String garageType) {
		super();
		this.id = id;
		this.price = price;
		this.bedrooms = bedrooms;
		this.finishedBasement = finishedBasement;
		this.garageType = garageType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public boolean isFinishedBasement() {
		return finishedBasement;
	}

	public void setFinishedBasement(boolean finishedBasement) {
		this.finishedBasement = finishedBasement;
	}

	public String getGarageType() {
		return garageType;
	}

	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Home [id=" + id + ", price=" + price + ", bedrooms=" + bedrooms + ", finishedBasement="
				+ finishedBasement + ", garageType=" + garageType + ", address=" + address + "]";
	}

}
