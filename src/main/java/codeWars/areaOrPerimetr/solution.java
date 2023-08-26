package codeWars.areaOrPerimetr;

public class solution {
    public static int areaOrPerimeter (int l, int w) {
      if (l != w) {
          return 2*(l + w);
      }
      else {
          return l * w;
      }
    }
}

/*

 */
