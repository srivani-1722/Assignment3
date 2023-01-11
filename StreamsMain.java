import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsMain {
public static void main(String[] args) {
	
	List<Employee> empList =new LinkedList<Employee>();
	empList.add(new Employee(1,"emp1","developer",10000000));
	empList.add(new Employee(2,"emp2","tester",100000));
	empList.add(new Employee(3,"emp3","developer",1000));
	empList.add(new Employee(4,"emp4","developer",900000000));
	List<Department> deptList =new LinkedList<Department>();
	deptList.add(new Department(1,"Contract",4));
	deptList.add(new Department(2,"IT",1));
	deptList.add(new Department(3,"IT",3));
	deptList.add(new Department(4,"QA",2));

	System.out.println("Original List");
	System.out.println(empList);
	System.out.println("Ques1 filtered Developer with salary > 10000");
	List<Employee> ls
	= empList.stream()
		.filter(emp -> emp.getPosition().equals("developer") && emp.getSalary()>10000)
		.collect(Collectors.toList());
	for(Department dept : deptList) {
		for(Employee emp : ls) {
			if(emp.getId()==dept.getEmpId()) {
				System.out.println(dept.getName());
			}
		}
		
	}
	
	System.out.println("Ques2 filtered Developer with salary > 10000");

	Employee maxSalEmp = empList.stream().max(Comparator.comparing(emp -> emp.getSalary())).get();
	
	System.out.println(maxSalEmp);
	
	System.out.println("Ques3 filter 3 most highest paid employee");
	List<Employee> sortedList
	= empList.stream()
		.sorted(Comparator.comparingInt(emp -> emp.getSalary()))
		.collect(Collectors.toList());
	Collections.reverse(sortedList);
	System.out.println(sortedList);
	for(int i=0;i<3;i++) {
		System.out.println(sortedList.get(i));
	}
	
	System.out.println("Ques4 calculate lumpsum slary of developer");
	
	int total = empList.stream().filter(emp -> emp.getPosition().equals("developer")).collect(
			   Collectors.summingInt(emp -> emp.getSalary()));
			  System.out.println("Total Employees Salary with developer category : " + total);
	
			  
	System.out.println("Ques5 get the department which has more no of employees");

			
	List<String> deptNames = deptList.stream()
            .map(dept -> dept.getName())
            .collect(Collectors.toList());
	System.out.println(deptNames);
	
	Map<String, Integer> frequencyMap = new HashMap<>();
    for (String s: deptNames)
    {
        Integer count = frequencyMap.get(s);
        if (count == null) {
            count = 0;
        }

        frequencyMap.put(s, count + 1);
    }

    int highfrequent=frequencyMap.values().stream()
    .mapToInt(num -> Integer.parseInt(num+""))
    .max().getAsInt();
    
    List<String> depts=frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() == highfrequent)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

   System.out.println(depts);
}
}
