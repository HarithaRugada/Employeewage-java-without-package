public class EmployeeWage
{

        public static void main(String[] args)
        {

                System.out.println("Welcome to Employee Wage Computation Program");
		double empCheck=Math.random();

                if (empCheck >0.5)
		{
                        System.out.println("Employee is Present");
			int wagePerHour=20;
			int fullDayHour=8;
			int dailyWage=wagePerHour*fullDayHour;
			System.out.println("The daily wage of employee is " +dailyWage);
		}

                else
                        System.out.println("Employee is Absent");

        }

}
