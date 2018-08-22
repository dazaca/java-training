//: reusing/Chess.java
// Inheritance, constructors and arguments.
package reusing;

class Game {
  Game(int i) {
    System.out.println("Game constructor: " + i);
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    super(1);
    System.out.println("BoardGame constructor: "+ i);
  }
}	

public class Chess extends BoardGame {
  Chess() {
    super(11);
    System.out.println("Chess constructor");
  }
  public static void main(String[] args) {
    Chess x = new Chess();
  }
} /* Output:
Game constructor: 1
BoardGame constructor: 11
Chess constructor
*///:~
