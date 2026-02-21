class VehicleRental{
	private String customerName;
	private String vehicleType;
	private String rentalDate;
	private String returnDate;
	private double rentalCost;
	void setValues(String cn,String vt,String rentalDate,String returnDate){
		customerName=cn;
		vehicleType=vt;
		this.rentalDate=rentalDate;
		this.returnDate=returnDate;
		}
	void setRentalCost(double rC){
		if(rC<0){
			System.out.println("error");
			return ;
		}
		rentalCost=rC;
	}
	String getCn(){
		return customerName;
	}
	String getVt(){
		return vehicleType;
	}
	String getRenDa(){
		return rentalDate;
	}
	String getRetDa(){
		return returnDate;
	}
	double getRenco(){
		return rentalCost;
	}
	void displayRentalinfo(){
		System.out.println("Customer name:"+" "+customerName);
		System.out.println("Vehicle  type:"+" "+vehicleType);
		System.out.println("Rental   Date:"+" "+rentalDate);
		System.out.println("Return   date:"+" "+returnDate);
		if(rentalCost<0){
			System.out.println("Rental   Cost: ERROR");
		}else{
			System.out.println("Rental   Cost:"+" "+rentalCost);
		}
		System.out.println();
	}
}
class VehicleRentalTest{
	public static void main(String...args){
		VehicleRental v1 = new VehicleRental();
		VehicleRental v2 = new VehicleRental();
		VehicleRental v3 = new VehicleRental();
		v1.setValues("Krishna","Car","Feb 7","Feb 15");
		v2.setValues("Lalith","Bike","Jan 12","Jan 13");
		v3.setValues("V","Aeroplane","Sep 11","Sep 11");
		v1.setRentalCost(2500.0);
		v2.setRentalCost(-1);
		v3.setRentalCost(1069.0);
		v1.displayRentalinfo();
		v2.displayRentalinfo();
		v3.displayRentalinfo();
	}
}
