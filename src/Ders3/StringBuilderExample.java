package Ders3;

public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder fullName = new StringBuilder();

    String name = "Alfa";
    String surname = "Betta";

    for (long i = 0; i < 1000000000; i++) {
      fullName.append(name);
      fullName.append(surname);
    }

    System.out.println(fullName);
  }
}
