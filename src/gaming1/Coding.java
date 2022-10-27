package gaming1;

import javax.swing.JOptionPane;


public class Coding {
	private static final Object question1 = null;
	static int points = 0;
	

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to Shannell Quiz");
		JOptionPane.showConfirmDialog(null,"Are you ready to Start?",null, JOptionPane.YES_NO_OPTION);
		// call the quiz method
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		result();
	}
		
	    static void question1() {
		String answer = JOptionPane.showInputDialog(null,"Question 1 of 6:\n"+ "What are two NY Football Teams ?\n"
				 +"A)Giants/Jets\n(B)Bears/Cowboys\n(C)Eagles/Bills\n");
		 switch(answer) {
		 case "A","a" ->points++;}
		 
		 int confirmDialog = JOptionPane.showConfirmDialog(null, "You selected quit! \nAre you sure you want to quit?", "Selected Quit", JOptionPane.YES_NO_OPTION);

		 if(confirmDialog == JOptionPane.YES_OPTION) {               
		     System.exit(0); 
		 }
		 
		}

		static void question2() {
		String answer = JOptionPane.showInputDialog(null,"Question 2 of 6:\n"+ "What are their colors?\n"
				+ "(A)Purple/yellow\n(B)Blue/Green\n(C)(Black/White\n");
		switch(answer) {
		case "B", "b" -> points++;
		}
		
}
		static void question3() {
			String answer = JOptionPane.showInputDialog(null,"Question 3 of 6:\n"+ "How many points is a touchdown?\n"
					+ "(A)7\n(B)3\n(C)9\n");
			switch(answer) {
			case "A", "a" -> points++;}
			
			int confirmDialog = JOptionPane.showConfirmDialog(null, "You selected quit! \nAre you sure you want to quit?", "Selected Quit", JOptionPane.YES_NO_OPTION);

			 if(confirmDialog == JOptionPane.YES_OPTION) {               
			     System.exit(0);
			}
			
	}
 
		static void question4() {
			String answer = JOptionPane.showInputDialog(null,"Question 4 of 6:\n"+ " What is the correct spelling for this sport?\n"
					+ "(A)futbol\n(B)Football\n(C)futbul\n");
			switch(answer) {
			case "B", "b" -> points++;
			}
			
	}
		static void question5() {
			String answer = JOptionPane.showInputDialog(null,"Question 5 of 6:\n"+ " How many points is a Field Goal?\n"
					+ "(A)5\n(B)10\n(C)3\n");
			switch(answer) {
			case "C", "c" -> points++;}
			int confirmDialog = JOptionPane.showConfirmDialog(null, "You selected quit! \nAre you sure you want to quit?", "Selected Quit", JOptionPane.YES_NO_OPTION);

			 if(confirmDialog == JOptionPane.YES_OPTION) {               
			     System.exit(0);
			}
			
	}
		static void question6() {
			String answer = JOptionPane.showInputDialog(null,"Question 6 of 6:\n"+ " What league is American Football?\n"
					+ "(A)NBA\n(B)NFL\n(C)CFL\n");
			switch(answer) {
			case "B", "b" -> points++;
			}
		}
	
		public static void result() {
	 String name = JOptionPane.showInputDialog(null,"You finished the quiz.\nPlease enter your name?");
	 if(points == 20)
	 {
 		JOptionPane.showMessageDialog(null,"Name:" + name + "\nTotal Score:" + points + "\nGood job!");
	 }else if(points >=10) {
		 JOptionPane.showMessageDialog(null,"Name:" + name + "\nTotal Score:" + points + "\nYou Passed the quiz.");
 	}else {
 	JOptionPane.showMessageDialog(null,"Name:" + name + "\nTotal Score:" + points + "\nYou can now Exit! Thanks for Participating :)");
}
 }
}
	
	
	

