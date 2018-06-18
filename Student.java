
public class Student {
	private String name;
	private int marks[];
	private double averageScore;
	
	public Student(String name, int marks[]) {
		this.name = name;
		this.marks = marks;
		int sum = 0;
		for(int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		averageScore = sum / marks.length;
	}
	
	
	public double getAverageScore() {
		return averageScore;
	}
	
	public boolean isBad() {
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] <= 2) {
				return true;
			}
		} return false;
	}
	
	public boolean isGood() {
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] <= 3) {
				return false;
			}
		} return true;
	}

}
