package reusing;

class ChessWithoutDefCtor extends BoardGame {
	  ChessWithoutDefCtor () {
	    System.out.println("ChessWithoutDefCtor constructor");
	    super(11);
	  }
	}

	public class _7_Reusing_E06_ChessWithoutDefCtor {
	  public static void main(String args[]) {
	    new ChessWithoutDefCtor();
	  }
	}
