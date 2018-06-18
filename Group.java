
public class Group {
	private String groupName;
	private Student studentsList[];
	private int qBad; // ���������� ����������
	private int qGood; // ���������� ����������
	private double groupAvScore; // ������� ���� ������
	private int

	// �����������
	public Group(String groupName) {
		this.groupName = groupName;
	}

	// ������ ����������
	public int getQBad(Student studentsList[]) {
		qBad = 0;
		for (int i = 0; i < studentsList.length; i++) {
			if (studentsList[i].isBad()) {
				qBad++;
			}
		}
		return qBad;
	}

	// ������ ����������
	public int getQGood(Student studentsList[]) {
		qGood = 0;
		for (int i = 0; i < studentsList.length; i++) {
			if (studentsList[i].isGood()) {
				qGood++;
			}
		}
		return qGood;
	}

	//������ �������� ����� ������
	public double getGroupAvScore(Student studentsList[]) {
		double sum = 0;
		for(int i = 0; i < studentsList.length; i++) {
			sum += studentsList[i].getAverageScore();
		}
		groupAvScore = sum / studentsList.length;
		return groupAvScore;
	}
}
