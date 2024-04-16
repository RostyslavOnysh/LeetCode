package prepOCA;

public class Jogger {
  /*      prepOCA.Jogger jogger = new prepOCA.Runner();
        prepOCA.FitnessBuff runner = new prepOCA.Runner();
   //     jogger.move();                        // Line 07
    //    (prepOCA.FitnessBuff)jogger.move();           // Line 08
        ((prepOCA.FitnessBuff)jogger).move();         // Line 09
        runner.move();                        // Line 10
     //   (prepOCA.FitnessBuff)runner.move();           // Line 11
        ((prepOCA.FitnessBuff)runner).move();         // Line 12
    }

   */
        public static void main(String[] args) {
            String movie = "The";
            movie.concat(" ").concat("MATRIX".toLowerCase());
            System.out.print(movie.substring(5,6));  // occur error   out of bounds for length 3
        }
}
