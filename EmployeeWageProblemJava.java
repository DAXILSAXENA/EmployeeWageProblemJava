
public class EmpWageBuilderUC9 {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int wagePerHour;
	private final int workingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWageBuilderUC9(String company, int wagePerHour, int workingDays, int maxHoursPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	
	public void computeWage() {
		
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < workingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day# : " + totalWorkingDays + " Emp Hr : " + empHrs);
		}
		totalEmpWage = totalEmpHrs * wagePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for company " + company + " is " + totalEmpWage;
	}

	public static void main(String[] args) {

		EmpWageBuilderUC9 dMart = new EmpWageBuilderUC9("DMart", 20, 20, 100);
		EmpWageBuilderUC9 reliance = new EmpWageBuilderUC9("Reliance", 10, 20, 200);
		dMart.computeWage(); 
		System.out.println(dMart);
		reliance.computeWage(); 
		System.out.println(reliance);
	}
}
