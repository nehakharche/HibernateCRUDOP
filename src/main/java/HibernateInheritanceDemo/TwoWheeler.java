package HibernateInheritanceDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table (name="TwoWheeler")
public class TwoWheeler extends Vehicle {
	@Column (name="V_COMP_NAME")
	String v_comp_name;
	@Column (name="COLOR")
	String color;
	@Column (name="V_PRICE")
	int v_price;
	
//	@Column (name="VEHICLE_NO")
//	int vehicleNo;
	
	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	}

	

	public TwoWheeler(int vehicleNo, String vehicleType, String v_comp_name,
		String color, int v_price) {
	super(vehicleNo, vehicleType);
	this.v_comp_name = v_comp_name;
	this.color = color;
	this.v_price = v_price;
	this.vehicleNo=vehicleNo;
	this.vehicleType=vehicleType;
}



	public String getV_comp_name() {
		return v_comp_name;
	}

	public void setV_comp_name(String v_comp_name) {
		this.v_comp_name = v_comp_name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getV_price() {
		return v_price;
	}

	public void setV_price(int v_price) {
		this.v_price = v_price;
	}

	

	@Override
	public String toString() {
		return "TwoWheeler [v_comp_name=" + v_comp_name + ", color=" + color
				+ ", v_price=" + v_price + "]";
	}
	

}
