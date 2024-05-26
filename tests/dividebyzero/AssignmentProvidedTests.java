import org.checkerframework.checker.dividebyzero.qual.*;

// A simple test case for your divide-by-zero checker.
// The file contains "// ::" comments to indicate expected
// errors and warnings.
//
// Passing this test does not guarantee a perfect grade on this assignment,
// but it is an important start. You should always write your own test cases,
// in addition to using those provided to you.
class AssignmentProvidedTests {

  public static void f() {
    int one = 1;
    int zero = 0;
    // :: error: divide.by.zero
    int x = one / zero;
    int y = zero / one;
    // :: error: divide.by.zero
    int z = x / y;
    String s = "hello";
  }

  public static void g(int y) {
    if (y == 0) {
      // :: error: divide.by.zero
      int x = 1 / y;
    } else {
      int x = 1 / y;
    }

    if (y != 0) {
      int x = 1 / y;
    } else {
      // :: error: divide.by.zero
      int x = 1 / y;
    }

    if (!(y == 0)) {
      int x = 1 / y;
    } else {
      // :: error: divide.by.zero
      int x = 1 / y;
    }

    if (!(y != 0)) {
      // :: error: divide.by.zero
      int x = 1 / y;
    } else {
      int x = 1 / y;
    }

    if (y < 0) {
      int x = 1 / y;
    }

    if (y <= 0) {
      // :: error: divide.by.zero
      int x = 1 / y;
    }

    if (y > 0) {
      int x = 1 / y;
    }

    if (y >= 0) {
      // :: error: divide.by.zero
      int x = 1 / y;
    }
  }

  public static void h() {
    int zero_the_hard_way = 0 + 0 - 0 * 0;
    // :: error: divide.by.zero
    int x = 1 / zero_the_hard_way;

    int one_the_hard_way = 0 * 1 + 1;
    int y = 1 / one_the_hard_way;

    int zero_the_hard_way_again = 0 * (1 + 1);
    // :: error: divide.by.zero
    int z = 1 / zero_the_hard_way_again;
  }

  public static void l() {
    // :: error: divide.by.zero
    int a = 1 / (1 - 1);
    int y = 1;
    // :: error: divide.by.zero
    int x = 1 / (y - y);
    int z = y - y;
    // :: error: divide.by.zero
    int k = 1 / z;
  }

  public static void m() {
    int v = -1 % 2;
    int w = 1 % -5;

    // :: error: divide.by.zero
    int x = 1 % 0;
    // :: error: divide.by.zero
    int y = 0 % 0;

    int z = 0 % 5;
  }

  public static void a(int y) {
    if (y > -5) {
      // :: error: divide.by.zero
      int x = 1 / y;
    }

    if (y >= (5 * 0)) {
      // :: error: divide.by.zero
      int x = 5 / y;
    }
  }

  public static void c(int y) {
    if (y != -1) {
      // :: error: divide.by.zero
      int x = 1 / y;
    } else {
      int x = 1 / y;
    }
  }

  public static void b(int y) {
    int x = 5;
    x = x - 6;

    // Actually know it's non zero
    // :: error: divide.by.zero
    y = 1 / x;
  }

  public static void d(int y) {
    int x = 6 - 5; // top
    if (y == x) {
      // :: error: divide.by.zero
      int z = x / y; 
    }

    int l = 6 - 5; // top
    int z = 1;

    if (z == l) {
      // Think it should give this error based on
      // the refinement, but doensn't 

      // // :: error: divide.by.zero
      int r = l / z; 
    }
  }

  public static void e(int x, int y) {
    if (y != 0) {
      System.out.println(x / y);
    } else {
      // :: error: divide.by.zero
      System.out.println(x / y);
    }

    // :: error: divide.by.zero
    System.out.println(x / y);
    // :: error: divide.by.zero
    System.out.println(y / x);
  }

  public static void g() {
    int x = 1 + 0;
    int y = 1 / x;
  }
}
