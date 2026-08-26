package quiz.quiz30;

public class SalaryMan {
	int salary = 1000000;
	SalaryMan(){}
	SalaryMan(int salary){
		this.salary=salary;
	}
	int getAnnualGross(){
		int salarySum = salary*12 + salary*5; 
		return salarySum;
	}
}
