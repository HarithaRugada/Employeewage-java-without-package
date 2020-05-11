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
			double workHours=Math.floor(Math.random()*10)%10;
			switch ((int) workHours)
			{
				case 9:
					System.out.println("Full time");
					break;
				default:
					System.out.println("Part time");
			}
			double dailyWage=wagePerHour*(workHours+1);
			System.out.println("Hours present is "+(workHours+1));
			System.out.println("The daily wage of employee is " +dailyWage);
		}

                else
                        System.out.println("Employee is Absent");

        }

}
