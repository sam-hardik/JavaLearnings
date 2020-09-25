package learning;

class AssignmentFive {
	private int id,monthlyBasic;
	private String name;
	float pfRate;
	AssignmentFive(int id,int monthlyBasic,String name){
		this.id=id;
		this.monthlyBasic=monthlyBasic;
		this.name=name;
	}
	int getAnnualBasic() {
		return 12*this.monthlyBasic;
	}
	float getMonthlyGrossSalary() {
		return (float) (this.monthlyBasic+(0.5*this.monthlyBasic)+1250+800);
	}
	float getAnnualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
	}
	float getMonthlyDeductions() {
		if(((this.monthlyBasic*pfRate)/100)>6500) {
			return (6500+getEsic()+getProfTax());
		}
		else return (float) (0.1*this.monthlyBasic+getEsic()+getProfTax());
	}
	float getMonthlyTakeHome()
	{
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	}
	float getAnnualTakeHome() {
		return 12*getMonthlyTakeHome();
	}
	float getPfRate()
	{
		return pfRate;
	}
	void setPfRate(float pfRate) {
		this.pfRate=pfRate;
	}
	float getEsic() {
		if(this.monthlyBasic<=5000)
			return (float) (0.0475*this.monthlyBasic);
		else
			return 0;
	}
	int getProfTax() {
		if(getMonthlyGrossSalary()<=10000)
			return 50;
		else return 100;
	}
}


