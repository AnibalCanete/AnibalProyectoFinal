
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.consultas.ConsultaGerencial;
import sistemas.modelos.ModGerencial;
import sistemas.vistas.frmGerencial;



public class ctrlGerencial implements ActionListener{
    private frmGerencial frmger;
    private ModGerencial modger;
    private ConsultaGerencial consultager;
    
    public ctrlGerencial(frmGerencial frmger, ModGerencial modger, ConsultaGerencial consultager){
        this.frmger = frmger;
        this.modger = modger;
        this.consultager = consultager;
        this.frmger.btnInsertar.addActionListener(this);
        this.frmger.btnModificar.addActionListener(this);
        this.frmger.btnEliminar.addActionListener(this);
        this.frmger.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        frmger.setTitle("Gerencial");
        frmger.setLocationRelativeTo(null);
        frmger.txtInformes.setVisible(false);
    }
    
    @Override
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmGerencial.btnInsertar){
            modger.setDescripcion(frmGerencial.txtInformes.getText());
                        
            if(consultager.registrar(modger))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmGerencial.btnModificar) {
            //cont.setDescripcion(frm.txtDescripcion.getText());
                        
            if(consultager.modificar(modger,frmGerencial.txtInformes.getText()))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmGerencial.btnEliminar) {
            modger.setDescripcion(frmGerencial.txtInformes.getText());
            
            if(consultager.eliminar(modger))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmGerencial.btnBuscar) {
            modger.setDescripcion(frmGerencial.txtInformes.getText());
            
            if(consultager.buscar(modger))
            {
                this.modger.setInformes(modger.getInformes());
                //frm.txtDescripcion.setText(cont.getDescripcion());
                JOptionPane.showMessageDialog(null, "Registro Encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }
    }
     public void limpiar()
     {
         frmGerencial.txtInformes.setText(null);
     }
}
