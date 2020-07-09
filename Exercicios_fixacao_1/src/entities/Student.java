package entities;

public class Student {
	
	public double n1;
	public double n2;
	public double n3;
	public double nota;
	
	public double nota1() {
		if(n1 > 0 && n1 < 30){
		}else {
			System.out.println("Nota não aceita");
			System.exit(0);
		}
		return n1;
	}
	public double nota2() {
		if(n2 > 0 && n2 < 35){
		}else {
			System.out.println("Nota não aceita");
			System.exit(0);
		}
		return n2;
	}
	public double nota3() {
		if(n3 > 0 && n3 < 35){
		}else {
			System.out.println("Nota não aceita");
			System.exit(0);
		}
		return n3;
	}
	
	public double finalGrade() {
		 return  n1 + n2 + n3;
	}
	
	public double missingPoints() {
		if(finalGrade() < 60) {
			return 60.0 - finalGrade();
		}else {
			return 0.0;	
			
		}
	}
	

}
