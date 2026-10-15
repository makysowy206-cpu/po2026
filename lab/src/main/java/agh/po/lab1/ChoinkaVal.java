package agh.po.lab1;

public class ChoinkaVal{
	public static void main(String[] args) {
	
	if (args.length == 0) {
		System.out.println("zly argument");
		return;
		}

		int Val = Integer.parseInt(args[0]);
		
		for(int i = 1; i <= Val; i++) {
			for(int j = 1; i >= j; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}