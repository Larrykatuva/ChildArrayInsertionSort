
public class ChildInsertionSort {
	private Child[] children;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public ChildInsertionSort(int size) {
		this.children = new Child[size];
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting new child values into the children array
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void addChild(String firstName, String lastName, int age) {
		this.children[this.nItems] = new Child(firstName, lastName, age);
		this.nItems ++;
	}
	
	
	/**
	 * Displaying all the children in the children array.
	 */
	public void displayChildren() {
		for(Child child: this.children) {
			System.out.println("Fullname: "+child.getFullName()+" | Age: "+child.getAge());
		}
	}
	
	/**
	 * Sorting children by age using insertion sort algorithm.
	 */
	public void insertinSort() {
		int innerValue, outerValue;
		for(outerValue = 1; outerValue < this.nItems -1; outerValue ++) {
			Child temp = this.children[outerValue];
			innerValue = outerValue;
			while(innerValue > 0 && this.children[innerValue -1].getAge() >= temp.getAge()) {
				this.children[innerValue] = this.children[innerValue - 1];
				-- innerValue;
			}
			this.children[innerValue] = temp;
		}
	}
}
