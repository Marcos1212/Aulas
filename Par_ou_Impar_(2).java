import javax.swing.JOptionPane;
public class ParoouImpar {
    public static void main(String[] args) {
        int n[] = new int[9];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (1 + i) + "º numero"));
        }
        for (int i = 1; i < n.length; i++) {
            boolean primo = true;
            for (int j = 2; j < n.length; j++) {
                if (n[i] % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo == true) {
                System.out.println(n[i]);
                System.out.println(i);
            }
        }
    }
}
