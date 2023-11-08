package arquivos;

import java.io.File;

public class Listing {

  public static void main(String[] args) {
    File dir = new File("suapasta");
    for (File file : dir.listFiles()) {
      System.out.println(file.getName());
      System.out.println(file.isDirectory());
      System.out.println(file.length());
    }
  }
}