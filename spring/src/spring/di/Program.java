package spring.di;



import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam(); //Exam객체와 Console객체와의 결합관계
		Exam exam = new NewlecExam(10,10,10,10);
		//ExamConsole console = new InineExamConsole(exam); // DI방식 Inine는 출력방법
		ExamConsole console = new GridExamConsloe(); // Grids는 출력방법
		
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console"); //형식변환으로 가져오는방법((ExamConsole))
		//ExamConsole console = context.getBean(ExamConsole.class); // ExamConsole에 맞는 클래쓰를 찾아달라는 방법
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<> ();
		//exams.add(new NewlecExam(1,1,1,1));
		
		
		
		//for(Exam e : exams)
		//	System.out.println(e);
		
	}

}
