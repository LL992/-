package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsloe implements ExamConsole {
	
	private Exam exam;	
	
	public GridExamConsloe() { //기본생성자
		// TODO Auto-generated constructor stub
	}
		public GridExamConsloe(Exam exam) {
			this.exam = exam;
		}

	@Override
	public void print() {
		System.out.println("┌───────┬───────┐");
		System.out.println("│ total │  avg  │");
		System.out.println("├───────┼───────┤");
		System.out.printf("│ %3d   │ %3.2f  │\n", exam.total(), exam.avg());
		System.out.println("└───────────────┘");
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
