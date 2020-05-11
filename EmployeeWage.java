public class EmployeeWage
{

        public static void main(String[] args)
        {

                System.out.println("Welcome to Employee Wage Computation Program");
		double empCheck=Math.random();

                if (empCheck >0.5)
		{
                        System.out.println("Employee is Present");
			double workHours=Math.floor(Math.random()*10)%10;
			int wagePerHour=20;
			double dailyWage=wagePerHour*(workHours+1);
			System.out.println("Hours present is "+(workHours+1));
			System.out.println("The daily wage of employee is " +dailyWage);
		}

                else
                        System.out.println("Employee is Absent");

        }

}
