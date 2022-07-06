
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.consultas.ConsultaOpMensuales;
import sistemas.modelos.ModOpMensuales;
import sistemas.vistas.frmOpMensuales;



public class ctrlOpMensuales implements ActionListener{
    private frmOpMensuales frmopmen;
    private ModOpMensuales modopmen;
    private ConsultaOpMensuales consultaopmen;
    
    
    public ctrlOpMensuales(frmOpMensuales frmopmen, ModOpMensuales modopmen, ConsultaOpMensuales consultaopmen){
        this.frmopmen = frmopmen;
        this.modopmen = modopmen;
        this.consultaopmen = consultaopmen;
        this.frmopmen.btnInsertar.addActionListener(this);
        this.frmopmen.btnModificar.addActionListener(this);
        this.frmopmen.btnEliminar.addActionListener(this);
        this.frmopmen.btnBuscar.addActionListener(this);
        }
    
        public void iniciar(){
            frmopmen.setTitle("Operaciones Mensuales");
            frmopmen.setLocationRelativeTo(null);
            frmopmen.txtAnalisis.setVisible(false);
        }
        
    @Override
        public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmOpMensuales.btnInsertar){
            modopmen.setAnalisis(frmOpMensuales.txtAnalisis.getText());
                        
            if(consultaopmen.registrar(modopmen))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpMensuales.btnModificar) {
            //cont.setDescripcion(frm.txtDescripcion.getText());
                        
            if(consultaopmen.modificar(modopmen,frmOpMensuales.txtAnalisis.getText()))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpMensuales.btnEliminar) {
            modopmen.setAnalisis(frmOpMensuales.txtAnalisis.getText());
            
            if(consultaopmen.eliminar(modopmen))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmOpMensuales.btnBuscar) {
            modopmen.setAnalisis(frmOpMensuales.txtAnalisis.getText());
            
            if(consultaopmen.buscar(modopmen))
            {
                this.modopmen.setAnalisis(modopmen.getAnalisis());
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
         frmOpMensuales.txtAnalisis.setText(null);
     }
    }


