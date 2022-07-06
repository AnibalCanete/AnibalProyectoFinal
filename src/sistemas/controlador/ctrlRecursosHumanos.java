
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.consultas.ConsultaRecursosHumanos;
import sistemas.modelos.ModRecursosHumanos;
import sistemas.vistas.frmRecursosHumanos;


public class ctrlRecursosHumanos implements ActionListener{
    private frmRecursosHumanos frmrh;
    private ModRecursosHumanos modrh;
    private ConsultaRecursosHumanos consultarh;
    
    public ctrlRecursosHumanos(frmRecursosHumanos frmrh, ModRecursosHumanos modrh, ConsultaRecursosHumanos consultarh){
        this.frmrh = frmrh;
        this.modrh = modrh;
        this.consultarh = consultarh;
        this.frmrh.btnInsertar.addActionListener(this);
        this.frmrh.btnModificar.addActionListener(this);
        this.frmrh.btnEliminar.addActionListener(this);
        this.frmrh.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        frmrh.setTitle("Recursos Humanos");
        frmrh.setLocationRelativeTo(null);
        frmrh.txtProcedimientos.setVisible(false);
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmRecursosHumanos.btnInsertar){
            modrh.setDescripcion(frmRecursosHumanos.txtProcedimientos.getText());
                        
            if(consultarh.registrar(modrh))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmRecursosHumanos.btnModificar) {
            //cont.setDescripcion(frm.txtDescripcion.getText());
                        
            if(consultarh.modificar(modrh,frmRecursosHumanos.txtProcedimientos.getText()))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmRecursosHumanos.btnEliminar) {
            modrh.setDescripcion(frmRecursosHumanos.txtProcedimientos.getText());
            
            if(consultarh.eliminar(modrh))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmRecursosHumanos.btnBuscar) {
            modrh.setDescripcion(frmRecursosHumanos.txtProcedimientos.getText());
            
            if(consultarh.buscar(modrh))
            {
                this.modrh.setProcedimientos(modrh.getProcedimientos());
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
         frmRecursosHumanos.txtProcedimientos.setText(null);
     }
}
