package triangle;

/*
 * 1:equilateral 2:scalene 3:isosceles 0:not exist
 */
public class Triangle {
	
	public int getTriangleShape(int a, int b, int c) {
		if ((a+b)<=c || (a+c)<=b || (b+c)<=a) {
			return 0;
		} else {
			if (a == b && a == c) {
				return 1;
			} else if (a != b && a != c && b != c) {
				return 3;
			} else {
				return 2;
			}
		}
	}
}
