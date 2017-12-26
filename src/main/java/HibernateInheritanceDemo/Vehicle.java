package HibernateInheritanceDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table (name="Parent")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int id;
	@Column (name="VEHICLE_NO")
	int vehicleNo;
	@Column (name="VEHICLE_NAME")
	String vehicleType;
	
	
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleType="
				+ vehicleType + "]";
	}


	public int getVehicleNo() {
		return vehicleNo;
	}


	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public Vehicle(int vehicleNo, String vehicleType) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
	}


	public Vehicle() {
		super();
	}
	
	

}
