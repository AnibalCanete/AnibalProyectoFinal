
package sistemas.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistemas.consultas.ConsultaInventario;
import sistemas.modelos.ModInventario;
import sistemas.vistas.frmInventario;


public class ctrlInventario implements ActionListener{
    private frmInventario frmInventario;
    private ModInventario modInventario;
    private ConsultaInventario consultaInventario;
    
    public ctrlInventario(frmInventario frmInventario, ModInventario modInventario, ConsultaInventario consultaInventario){
        this.frmInventario = frmInventario;
        this.modInventario = modInventario;
        this.consultaInventario = consultaInventario;
        this.frmInventario.btnInsertar.addActionListener(this);
        this.frmInventario.btnModificar.addActionListener(this);
        this.frmInventario.btnEliminar.addActionListener(this);
        this.frmInventario.btnBuscar.addActionListener(this);
    }
    
    public void iniciar(){
        frmInventario.setTitle("Inventario");
        frmInventario.setLocationRelativeTo(null);
        frmInventario.txtProveedor.setVisible(false);
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmInventario.btnInsertar){
            modInventario.setDescripcion(frmInventario.txtProveedor.getText());
                        
            if(consultaInventario.registrar(modInventario))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmInventario.btnModificar) {
            //cont.setDescripcion(frm.txtDescripcion.getText());
                        
            if(consultaInventario.modificar(modInventario,frmInventario.txtProveedor.getText()))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmInventario.btnEliminar) {
            modInventario.setDescripcion(frmInventario.txtProveedor.getText());
            
            if(consultaInventario.eliminar(modInventario))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmInventario.btnBuscar) {
            modInventario.setDescripcion(frmInventario.txtProveedor.getText());
            
            if(consultaInventario.buscar(modInventario))
            {
                this.modInventario.setProveedor(modInventario.getProveedor());
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
         frmInventario.txtProveedor.setText(null);
     }
}
