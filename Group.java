
public class Group {
	private String groupName;
	private Student studentsList[];
	private int qBad; // количество двоечников
	private int qGood; // количество отличников
	private double groupAvScore; // средний балл группы
	private int

	// конструктор
	public Group(String groupName) {
		this.groupName = groupName;
	}

	// геттер двоечников
	public int getQBad(Student studentsList[]) {
		qBad = 0;
		for (int i = 0; i < studentsList.length; i++) {
			if (studentsList[i].isBad()) {
				qBad++;
			}
		}
		return qBad;
	}

	// геттер отличников
	public int getQGood(Student studentsList[]) {
		qGood = 0;
		for (int i = 0; i < studentsList.length; i++) {
			if (studentsList[i].isGood()) {
				qGood++;
			}
		}
		return qGood;
	}

	//геттер среднего балла группы
	public double getGroupAvScore(Student studentsList[]) {
		double sum = 0;
		for(int i = 0; i < studentsList.length; i++) {
			sum += studentsList[i].getAverageScore();
		}
		groupAvScore = sum / studentsList.length;
		return groupAvScore;
	}
}
