public class EmployeeWage
{

        public static void main(String[] args)
        {

                System.out.println("Welcome to Employee Wage Computation Program");
		double salary=0;
		for(int i=1;i<=20;i++)
		{

			double empCheck=Math.random();
	                if (empCheck >0.5)
			{
        	                System.out.println("Employee is Present on Day " +i);
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
				salary += dailyWage;
				System.out.println("Hours present on Day " +i+ " is " +(workHours+1));
				System.out.println("The daily wage of employee on Day " +i+ " is " +dailyWage);
				System.out.println("Salary till Day " +i+ " is " +salary);
			}

        	        else
                 	       System.out.println("Employee is Absent on Day " +i);

		}

	}

}
