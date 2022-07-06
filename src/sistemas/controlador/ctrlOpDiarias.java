
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.consultas.ConsultaOpDiarias;
import sistemas.modelos.ModOpDiarias;
import sistemas.vistas.frmOpDiarias;

public class ctrlOpDiarias implements ActionListener{
    private frmOpDiarias frmopdia;
    private ModOpDiarias modopdia;
    private ConsultaOpDiarias consultaopdia;
    
    public ctrlOpDiarias(frmOpDiarias frmopdia, ModOpDiarias modopdia, ConsultaOpDiarias consultaopdia){
        this.frmopdia = frmopdia;
        this.modopdia = modopdia;
        this.consultaopdia = consultaopdia;
        this.frmopdia.btnInsertar.addActionListener(this);
        this.frmopdia.btnModificar.addActionListener(this);
        this.frmopdia.btnEliminar.addActionListener(this);
        this.frmopdia.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        frmopdia.setTitle("Operaciones Diarias");
        frmopdia.setLocationRelativeTo(null);
        frmopdia.txtRevisiones.setVisible(false);
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmOpDiarias.btnInsertar){
            modopdia.setDescripcion(frmOpDiarias.txtRevisiones.getText());
                        
            if(consultaopdia.registrar(modopdia))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpDiarias.btnModificar) {
            //cont.setDescripcion(frm.txtDescripcion.getText());
                        
            if(consultaopdia.modificar(modopdia,frmOpDiarias.txtRevisiones.getText()))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpDiarias.btnEliminar) {
            modopdia.setDescripcion(frmOpDiarias.txtRevisiones.getText());
            
            if(consultaopdia.eliminar(modopdia))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpDiarias.btnBuscar) {
            modopdia.setDescripcion(frmOpDiarias.txtRevisiones.getText());
            
            if(consultaopdia.buscar(modopdia))
            {
                this.modopdia.setRevisiones(modopdia.getRevisiones());
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
         frmOpDiarias.txtRevisiones.setText(null);
     }
}
