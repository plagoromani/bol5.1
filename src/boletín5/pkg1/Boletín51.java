
package boletín5.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Boletín51 {

    
    public static void main(String[] args) {
        
        Coche obx=new Coche();
        JOptionPane.showMessageDialog(null,"velocidade inicial"+obx.getVelocidade()+"km/h");
        String respuesta1 = JOptionPane.showInputDialog("acelerar");
        obx.acelerar(Integer.parseInt(respuesta1));
        JOptionPane.showMessageDialog(null,"velocidade actual"+obx.getVelocidade() + "km/h");
        String respuesta2 = JOptionPane.showInputDialog("frenar");
        obx.frenar(Integer.parseInt(respuesta2));
        JOptionPane.showMessageDialog(null, "velocidade actual"+obx.getVelocidade() + "km/h");
        
        
        
    }
    
}
