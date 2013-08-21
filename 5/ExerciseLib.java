// shows that compiling does not catch an infinite loop. You can still create those.
class ExerciseLib {
  public static void main(String[] args) {
    int x = 1;
    while ( x < 10 ) {
      if ( x > 3 ) {
        System.out.println("big x");
      }
    }
  }
}
