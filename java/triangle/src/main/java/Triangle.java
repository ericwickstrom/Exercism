
public class Triangle {
	// sides
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) throws TriangleException{
		// Triangle validation
		
		// sides should be 1 or greater.
		if(a <= 0 || b <= 0 || c <= 0){
			throw new TriangleException();
		}
		
		//triangle inequality rule
		if(!(a + b > c && a + c > b && b + c > a)){
			throw new TriangleException();
		}
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public TriangleKind getKind(){
		if(a == b && b == c){
			return TriangleKind.EQUILATERAL;
		} else if ((a == b && a != c) || (b == c && a != c) || (a == c && b != c)){
			return TriangleKind.ISOSCELES;
		} else {
			return TriangleKind.SCALENE;
		}
	}
	
	
	
}
