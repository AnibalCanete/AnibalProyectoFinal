
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.consultas.ConsultaOpAnuales;
import sistemas.modelos.ModOpAnuales;
import sistemas.vistas.frmOpAnuales;


public class ctrlOpAnuales implements ActionListener{
    private frmOpAnuales frmopanu;
    private ModOpAnuales modopanu;
    private ConsultaOpAnuales consultaopanu;
    
    public ctrlOpAnuales(frmOpAnuales frmopanu, ModOpAnuales modopanu, ConsultaOpAnuales consultaopanu){
        this.frmopanu = frmopanu;
        this.modopanu = modopanu;
        this.consultaopanu = consultaopanu;
        this.frmopanu.btnInsertar.addActionListener(this);
        this.frmopanu.btnModificar.addActionListener(this);
        this.frmopanu.btnEliminar.addActionListener(this);
        this.frmopanu.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        frmopanu.setTitle("Operaciones Anuales");
        frmopanu.setLocationRelativeTo(null);
        frmopanu.txtInformes.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmOpAnuales.btnInsertar){
            modopanu.setInformes(frmOpAnuales.txtInformes.getText());
                        
            if(consultaopanu.registrar(modopanu))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpAnuales.btnModificar) {
            //cont.setDescripcion(frm.txtDescripcion.getText());
                        
            if(consultaopanu.modificar(modopanu,frmOpAnuales.txtInformes.getText()))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpAnuales.btnEliminar) {
            modopanu.setInformes(frmOpAnuales.txtInformes.getText());
            
            if(consultaopanu.eliminar(modopanu))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpAnuales.btnBuscar) {
            modopanu.setInformes(frmOpAnuales.txtInformes.getText());
            
            if(consultaopanu.buscar(modopanu))
            {
                this.modopanu.setInformes(modopanu.getInformes());
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
         frmOpAnuales.txtInformes.setText(null);
     }
}
