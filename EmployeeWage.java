public class EmployeeWage
{

        public static void main(String[] args)
        {

                System.out.println("Welcome to Employee Wage Computation Program");
		double salary=0;
		int day=1;
		int totalWorkhours=0;
		while( totalWorkhours < 100 && day<20 )
		{

			double empCheck=Math.random();
	                if (empCheck >0.5)
			{
        	                System.out.println("Employee is Present on Day " +day);
				int wagePerHour=20;
				double workHours=Math.floor(Math.random()*10)%10;
				if((totalWorkhours+workHours) <100)
				{
					day+=1;
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
					totalWorkhours += workHours;
					System.out.println("Hours present on Day " +day+ " is " +(workHours+1));
					System.out.println("The daily wage of employee on Day " +day+ " is " +dailyWage);
					System.out.println("Salary till Day " +day+ " is " +salary);
					System.out.println("Total Work Hours till Day " +day+ " is " +totalWorkhours);
				}
			}

        	        else
                 	       System.out.println("Employee is Absent on Day " +day);

		}

	}

}
