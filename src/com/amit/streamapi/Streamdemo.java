package com.amit.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streamdemo {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		// 1. How many male and female employees are there in the organization ?
		/*
		 * Map<String, Long> collect = employeeList.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		 * 
		 * System.out.println(collect);
		 */

		// 2. Print the name of all departments in the organization ?

		// employeeList.stream().map(Employee::getDepartment).distinct().forEach(e->System.out.println(e));

		// 3. What is the average age of male and female employees ?

//		Map<String, Double> collect = employeeList.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
//
//		System.out.println(collect);

		// 4. Get the details of highest paid employee in the organization ?
		
		Optional<Employee> collect = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		System.out.println(collect.get());
		// 5. Get the names of all employees who have joined after 2015 ?

		// 6. Count the number of employees in each department ?

		// 7. What is the average salary of each department ?

		// 8. Get the details of youngest male employee in the Development department ?

		// 9. Who has the most working experience in the organization ?

		// 10. How many male and female employees are there in the Sales team ?

		// 11. What is the average salary of male and female employees ?

		// 12. List down the names of all employees in each department ?

		/*
		 * // 13. What is the average salary and total salary of the whole organization
		 * ?
		 * 
		 * Double collect =
		 * employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)
		 * ); System.out.println(collect);
		 * 
		 * double average =
		 * employeeList.stream().collect(Collectors.summarizingDouble(Employee::
		 * getSalary)).getAverage(); System.out.println(average);
		 * 
		 * double sum =
		 * employeeList.stream().collect(Collectors.summarizingDouble(Employee::
		 * getSalary)).getSum(); System.out.println(sum);
		 * 
		 * long count =
		 * employeeList.stream().collect(Collectors.summarizingDouble(Employee::
		 * getSalary)).getCount(); System.out.println(count);
		 * 
		 * double max =
		 * employeeList.stream().collect(Collectors.summarizingDouble(Employee::
		 * getSalary)).getMax(); System.out.println(max);
		 */

		// 14. Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years ?
		// 15. Who is the oldest employee in the organization?

		// 16. find second highest salary
	}

}

class Employee {
	int id;
	String name;
	int age;
	String gender;

	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}