package disassemblerpkg;

public class toAssembly {

	private static String convertedCode = new String();
	
	/*
	 * Function:
	 * 	Converts input C code to assembly code
	 * Parameter:
	 * 	String originalCode - the C code to be converted
	 * Returns:
	 * 	none
	 * */
	toAssembly(String originalCode) {
		
		String convertedCode = new String();
		
		/* THE CONVERSION BEGINS */
		
		
		/* THE CONVERSION ENDS */
		
		toAssembly.convertedCode = convertedCode;
	}

	/*
	 * Function:
	 * 	Returns the converted assembly language
	 * Parameter:
	 * 	none
	 * Returns:
	 * 	String convertedCode - the converted assembly code
	 * */
	String getCode() {
		return toAssembly.convertedCode;
	}
}
