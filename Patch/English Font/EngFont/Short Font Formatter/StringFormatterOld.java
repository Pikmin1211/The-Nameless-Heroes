import java.util.*;
import java.io.*;
import java.sql.*;

public class StringFormatterOld{

// Constructor
public StringFormatterOld(){}

public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException
{
	Scanner sc = new Scanner(System.in);
	while(true){
		System.out.println("Welcome to thing! Read from [F]ile, or e[X]it?\nF/X");
		String answer = sc.nextLine();
		if(answer.equals("X") || answer.equals("x")){
			System.out.println("Later nerd");
			System.exit(0);
		}
		else if(answer.equals("F") || answer.equals("f")){
			System.out.println("Please enter filename.");
			String filename = sc.nextLine();
			StringFormatterOld pointlessobject = new StringFormatterOld();
			try{
				File file = new File(filename);
				Scanner sc2 = new Scanner(file);
				pointlessobject.FormatFile(sc2,pointlessobject);
			}
			catch (FileNotFoundException e){
				System.out.println("File not found! Please try again.");
			}
		}
		else{
			System.out.println("You absolute buffoon");
		}
	}
}

public void FormatFile(Scanner input, StringFormatterOld obj) throws UnsupportedEncodingException, FileNotFoundException{
	PrintWriter writer = new PrintWriter("formatted.txt", "UTF-8");
	while (input.hasNextLine()){
		String next = input.nextLine();
		String formatted = obj.ReplaceCharacters(next);
		writer.println(formatted);
	}

	writer.close();
}

public String ReplaceCharacters(String input){
	input = input.replaceAll("a","[_a]");
	input = input.replaceAll("b","[_b]");
	input = input.replaceAll("c","[_c]");
	input = input.replaceAll("d","[_d]");
	input = input.replaceAll("e","[_e]");
	input = input.replaceAll("f","[_f]");
	input = input.replaceAll("g","[_g]");
	input = input.replaceAll("h","[_h]");
	input = input.replaceAll("i","[_i]");
	input = input.replaceAll("j","[_j]");
	input = input.replaceAll("k","[_k]");
	input = input.replaceAll("l","[_l]");
	input = input.replaceAll("m","[_m]");
	input = input.replaceAll("n","[_n]");
	input = input.replaceAll("o","[_o]");
	input = input.replaceAll("p","[_p]");
	input = input.replaceAll("q","[_q]");
	input = input.replaceAll("r","[_r]");
	input = input.replaceAll("s","[_s]");
	input = input.replaceAll("t","[_t]");
	input = input.replaceAll("u","[_u]");
	input = input.replaceAll("v","[_v]");
	input = input.replaceAll("w","[_w]");
	input = input.replaceAll("x","[_x]");
	input = input.replaceAll("y","[_y]");
	input = input.replaceAll("z","[_z]");
	input = input.replaceAll("A","[_A]");
	input = input.replaceAll("B","[_B]");
	input = input.replaceAll("C","[_C]");
	input = input.replaceAll("D","[_D]");
	input = input.replaceAll("E","[_E]");
	input = input.replaceAll("F","[_F]");
	input = input.replaceAll("G","[_G]");
	input = input.replaceAll("H","[_H]");
	input = input.replaceAll("I","[_I]");
	input = input.replaceAll("J","[_J]");
	input = input.replaceAll("K","[_K]");
	input = input.replaceAll("L","[_L]");
	input = input.replaceAll("M","[_M]");
	input = input.replaceAll("N","[_N]");
	input = input.replaceAll("O","[_O]");
	input = input.replaceAll("P","[_P]");
	input = input.replaceAll("Q","[_Q]");
	input = input.replaceAll("R","[_R]");
	input = input.replaceAll("S","[_S]");
	input = input.replaceAll("T","[_T]");
	input = input.replaceAll("U","[_U]");
	input = input.replaceAll("V","[_V]");
	input = input.replaceAll("W","[_W]");
	input = input.replaceAll("X","[_X]");
	input = input.replaceAll("Y","[_Y]");
	input = input.replaceAll("Z","[_Z]");

	return input;
}

}