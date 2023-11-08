package arquivos;

import java.io.File;
public class Listing {
  
  public static void main(String[] args) {
    File dir = new File("suapasta");
    File[] arquivos = dir.listFiles();
    
    for (File arquivo : arquivos) {
      System.out.println(arquivo.getName());
      System.out.println(arquivo.isDirectory());
      System.out.println(arquivo.length());
      System.out.println(arquivo.lastModified());
      System.out.println(arquivo.isHidden());
      System.out.println(arquivo.isFile());

    }
    
    System.out.println("Hello world!");
  }
}