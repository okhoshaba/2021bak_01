import static javax.swing.JOptionPane.*;

class Hello {
  public static void main(String[] args) {
    showMessageDialog(null, "Hello, ...");
    System.out.println("Hello, Java!");
    showMessageDialog(null, "Hello, second...", 
        "Our Window", 
        WARNING_MESSAGE);
  }
}
