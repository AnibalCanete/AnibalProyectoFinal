
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.consultas.ConsultaContabilidad;
import sistemas.modelos.ModContabilidad;
import sistemas.vistas.frmContabilidad;
import sistemas.vistas.frmOpDiarias;


public class ctrlContabilidad implements ActionListener{
    private frmContabilidad frmconta;
    private ModContabilidad modconta;
    private ConsultaContabilidad consultaconta;
    
    public ctrlContabilidad(frmContabilidad frmconta, ModContabilidad modconta, ConsultaContabilidad consultaconta){
        this.frmconta = frmconta;
        this.modconta = modconta;
        this.consultaconta = consultaconta;
        this.frmconta.btnInsertar.addActionListener(this);
        this.frmconta.btnModificar.addActionListener(this);
        this.frmconta.btnEliminar.addActionListener(this);
        this.frmconta.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        frmconta.setTitle("Contabilidad");
        frmconta.setLocationRelativeTo(null);
        frmconta.txtInformes.setVisible(false);
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmOpDiarias.btnInsertar){
            modconta.setDescripcion(frmContabilidad.txtInformes.getText());
                        
            if(consultaconta.registrar(modconta))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmContabilidad.btnModificar) {
            //cont.setDescripcion(frm.txtDescripcion.getText());
                        
            if(consultaconta.modificar(modconta,frmContabilidad.txtInformes.getText()))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmContabilidad.btnEliminar) {
            modconta.setDescripcion(frmContabilidad.txtInformes.getText());
            
            if(consultaconta.eliminar(modconta))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmContabilidad.btnBuscar) {
            modconta.setDescripcion(frmContabilidad.txtInformes.getText());
            
            if(consultaconta.buscar(modconta))
            {
                this.modconta.setInformes(modconta.getInformes());
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
         frmContabilidad.txtInformes.setText(null);
     }
}
