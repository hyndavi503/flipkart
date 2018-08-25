package demo;


public class Main {

	public static void main(String[] args) {
		
		FormFiller f=new FormFiller();
		FormDisplay f1=f.submitDisplay();
		f.fillForm();
		f1.display();
	}
}