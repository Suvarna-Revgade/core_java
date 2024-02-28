package src.SingleDimensionalArray;

public class ArraysofObjects {

	public static void main(String[] args) {
	 Employee arr[]=new Employee[2];
	 arr[0]=new Employee(101,"Aniket",45000.8);
	 arr[1]=new Employee(102, "Aarti", 75000.9);
	 
	 	for(int i=0;i<arr.length;i++)
	 	{
	 		System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
	 	}
	 
	}

}
