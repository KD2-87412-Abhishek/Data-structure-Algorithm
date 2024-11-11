package Assingment02;

public class Emp {
	 private int salary;
	 private String name;
	 
	
	 public Emp(int salary, String name) {
		
		this.salary = salary;
		this.name = name;
	}

	public static void insertionSort( Emp[] emp, int N) {
			for(int i = 1 ; i < N ; i++) {
		
				int temp = emp[i].salary;
				int j;
				
				for(j = i - 1 ; j >= 0 &&emp[j].salary > temp ; j--) {
			
					emp[j+1].salary = emp[j].salary;
				}
				
				emp[j + 1].salary = temp;
			}
		}

	@Override
	public String toString() {
		return "Emp [salary=" + salary + ", name=" + name + "]";
	}

	public static void main(String[] args) {		
		
		
		Emp[] e = new Emp[]{
			    new Emp(40000, "ab"),
			    new Emp(25000, "mak"),
			    new Emp(30000, "adi")
			};
		for (Emp emp : e) {
		    System.out.println(emp);
		}

			
		
		insertionSort(e, 3);
		System.out.println("After sorting ");
		for (Emp emp : e) {
		    System.out.println(emp);
		}
		
	
		// TODO Auto-generated method stub
		

	}

}
