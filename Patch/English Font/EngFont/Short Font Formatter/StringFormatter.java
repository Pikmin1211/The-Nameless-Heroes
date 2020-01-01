import java.util.*;
import java.io.*;
import java.sql.*;

public class StringFormatter{

// Constructor
public StringFormatter(){}

public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException
{
	Scanner sc = new Scanner(System.in);
			String filename = "input.txt";
			StringFormatter pointlessobject = new StringFormatter();
			try{
				File file = new File(filename);
				Scanner sc2 = new Scanner(file);
				pointlessobject.FormatFile(sc2,pointlessobject);
				System.exit(0);
			}
			catch (FileNotFoundException e){
				System.out.println("File not found! Please try again.");
				System.exit(0);
			}	
}

public void FormatFile(Scanner input, StringFormatter obj) throws UnsupportedEncodingException, FileNotFoundException{
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