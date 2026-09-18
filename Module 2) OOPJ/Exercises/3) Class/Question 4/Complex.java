public class Complex {
	
	int real;
	int imaginary;
	
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
		
	public Complex sum(Complex c) {
		
		int newReal = this.real + c.real;
		int newImaginary = this.imaginary + c.imaginary;
		
		return new Complex(newReal, newImaginary);
		
	}
	
	public Complex difference(Complex c) {
		
		int newReal = this.real - c.real;
		int newImaginary = this.imaginary - c.imaginary;
		
		return new Complex(newReal, newImaginary);
	}
	
	public Complex product(Complex c) {
		
		int newReal = (this.real * c.real) - (this.imaginary * c.imaginary);
		int newImaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		
		return new Complex(newReal, newImaginary);
		
		
	}

		

	public static void main(String[] args) {
		
		System.out.print("Enter real part of first complex number: ");
		int real1 = consoleinput.getint();
		
		System.out.print("Enter imaginary part of first complex number: ");
		int imaginary1 = consoleinput.getint();
		
		System.out.print("Enter real part of second complex number: ");
		int real2 = consoleinput.getint();
		
		System.out.print("Enter imaginary part of second complex number: ");
		int imaginary2 = consoleinput.getint();
		
		Complex c1 = new Complex(real1, imaginary1);
		Complex c2 = new Complex(real2, imaginary2);
		
		Complex sum = c1.sum(c2);
	    Complex difference = c1.difference(c2);
	    Complex product = c1.product(c2);

	    System.out.println("Sum = " + sum.real + " + " + sum.imaginary + "i");
	    System.out.println("Difference = " + difference.real + " + " + difference.imaginary + "i");
	    System.out.println("Product = " + product.real + " + " + product.imaginary + "i");
	}

}
