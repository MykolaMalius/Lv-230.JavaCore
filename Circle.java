import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheCircle {

	public static void main(String[] args) throws IOException {
		double pi = 3.14;
		double r = 0;
		double square;
		double lenght;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your radius to know the square of circle");
	r = Integer.parseInt(br.readLine());
	square = r * r * pi;
	System.out.println("Square of your circle is " + square);
	System.out.println("If you want to know the lenght of circle enter your radius");
	r = Integer.parseInt(br.readLine());
	lenght = 2 * pi * r;
	System.out.println("Lenght of your circle is " + lenght);

	}


}

