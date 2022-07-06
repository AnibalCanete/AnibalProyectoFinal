
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.modelos.ModUsuario;
import sistemas.modelos.ModValidarSesion;
import sistemas.vistas.frmAcceso;
import sistemas.vistas.frmPrincipal;


public class ctrlSesion implements ActionListener{
    public ModValidarSesion validaSesion;
    public ModUsuario usuario;
    public frmAcceso acceso;
    public frmPrincipal principal;
    public ctrlSesion(ModValidarSesion validaSesion, ModUsuario usuario, frmAcceso acceso){
        this.validaSesion = validaSesion;
        this.usuario = usuario;
        this.acceso = acceso;
        this.acceso.btnAceptar.addActionListener(this);
        this.acceso.btnCancelar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == acceso.btnAceptar){
            usuario.setIdUsuario(acceso.txtUsuario.getText());
            if(validaSesion.buscar(usuario)){
                String psw = acceso.pswContrasenha.getText();
                if(psw.toString().equals(usuario.getContrasena().toString())){
                    acceso.dispose();
                    frmPrincipal pantPrincipal = new frmPrincipal();
                    CtrlMenuPrincipal menu = new CtrlMenuPrincipal(pantPrincipal);
                    pantPrincipal.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Contrasenha Incorrecta.");
                }
            }
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
