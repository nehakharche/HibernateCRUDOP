package HibernateInheritanceDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="FourWheeler")
public class FourWheeler extends Vehicle {
	
	
	@Column (name="V_COMP_NAME")
	String v_comp_name;
	@Column (name="V_PRICE")
	int v_price;
	@Column (name="MODEL_NO")
	String modelNo;
	public FourWheeler() {
		super();
	}
	
	
	public FourWheeler(int vehicleNo, String vehicleType, String v_comp_name,
			int v_price, String modelNo) {
		super(vehicleNo, vehicleType);
		this.v_comp_name = v_comp_name;
		this.v_price = v_price;
		this.modelNo = modelNo;
		this.vehicleNo=vehicleNo;
		this.vehicleType=vehicleType;
	}


	public String getV_comp_name() {
		return v_comp_name;
	}
	public void setV_comp_name(String v_comp_name) {
		this.v_comp_name = v_comp_name;
	}
	public int getV_price() {
		return v_price;
	}
	public void setV_price(int v_price) {
		this.v_price = v_price;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	@Override
	public String toString() {
		return "FourWheeler [v_comp_name="
				+ v_comp_name + ", v_price=" + v_price + ", modelNo=" + modelNo
				+ "]";
	}

	
	
}
