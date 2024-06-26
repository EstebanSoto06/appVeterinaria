package interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import logica.GestorDatos;
import logica.HistorialClinico;
import logica.Mascota;


public class PaginaHistorial extends javax.swing.JPanel {
    private GestorDatos gestordatos;
    private List<Mascota> listaMascotas;
    private List<HistorialClinico> listaHistorialesClinicos;
    /**
     * Creates new form CRUD_Clientes
     */
    public PaginaHistorial(GestorDatos gestordatos) {
        initComponents();
        
        this.gestordatos = gestordatos;
        this.listaHistorialesClinicos = gestordatos.getListaHistorialesClinicos();
        this.listaMascotas = gestordatos.getListaMascotas();
        
        for (Mascota mascota : listaMascotas) {
            cbMascotas.addItem(mascota.getNombre());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSubtitulo = new javax.swing.JLabel();
        lbMotivo = new javax.swing.JLabel();
        txtMedicamentos = new javax.swing.JTextField();
        btnAnadir = new javax.swing.JButton();
        cbMascotas = new javax.swing.JComboBox<>();
        lbNombreMascota = new javax.swing.JLabel();
        cbMotivo = new javax.swing.JComboBox<>();
        lbMedicamentos = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 569));
        setMinimumSize(new java.awt.Dimension(1280, 569));
        setPreferredSize(new java.awt.Dimension(1280, 569));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtitulo.setText("Registra los datos de la consulta en el historial");
        add(lbSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        lbMotivo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbMotivo.setForeground(new java.awt.Color(0, 0, 0));
        lbMotivo.setText("Motivo");
        add(lbMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        txtMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
        txtMedicamentos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        add(txtMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 460, 30));

        btnAnadir.setBackground(new java.awt.Color(0, 102, 102));
        btnAnadir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnAnadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAnadir.setText("REGISTRAR CONSULTA");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        cbMascotas.setBackground(new java.awt.Color(255, 255, 255));
        cbMascotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMascotas.setForeground(new java.awt.Color(0, 0, 0));
        add(cbMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 260, 30));

        lbNombreMascota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbNombreMascota.setForeground(new java.awt.Color(0, 0, 0));
        lbNombreMascota.setText("Mascota");
        add(lbNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        cbMotivo.setBackground(new java.awt.Color(255, 255, 255));
        cbMotivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMotivo.setForeground(new java.awt.Color(0, 0, 0));
        cbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagnostico", "Tratamiento", "Estudio Clinico" }));
        add(cbMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 260, 30));

        lbMedicamentos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        lbMedicamentos.setText("Vacuna o medicamento administrado");
        add(lbMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        if (cbMotivo.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Seleccione un motivo", "Error", JOptionPane.ERROR_MESSAGE);  
        } else if (txtMedicamentos.getText().isEmpty() || txtMedicamentos == null){
            JOptionPane.showMessageDialog(this, "Si se le suministró algún medicamento indiquelo, sino coloque 'ninguno'", "Error", JOptionPane.ERROR_MESSAGE);  
        } else {
            boolean poseeHistorial = false;
            String nombreMascota = (String) cbMascotas.getSelectedItem();
            String analisis = (String) cbMotivo.getSelectedItem();
            String medicamento = txtMedicamentos.getText();
            for (HistorialClinico historial : listaHistorialesClinicos) {
                if (historial.getNombreMascota().equals(nombreMascota)) {
                    poseeHistorial = true;
                    historial.agregarMedicamento(medicamento);
                    historial.agregarAnalisisMedico(analisis);
                    
                    break;
                }
            }
            
            if (!poseeHistorial){
                List<String> analisisMedicos = new ArrayList<>();
                analisisMedicos.add(analisis);
                
                List<String> medicamentos = new ArrayList<>();
                medicamentos.add(medicamento);
                
                HistorialClinico nuevoHistorial = new HistorialClinico(nombreMascota, analisisMedicos, medicamentos);
                listaHistorialesClinicos.add(nuevoHistorial);
            }
            
            gestordatos.escribirHistorialesMedicos(listaHistorialesClinicos);
            gestordatos.setListaHistorialesClinicos(listaHistorialesClinicos);
            JOptionPane.showMessageDialog(this, "Historial actualizado", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(listaHistorialesClinicos);
        }         
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cbMascotas.removeAllItems();
        for (Mascota mascota : listaMascotas) {
            cbMascotas.addItem(mascota.getNombre());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JComboBox<String> cbMascotas;
    private javax.swing.JComboBox<String> cbMotivo;
    private javax.swing.JLabel lbMedicamentos;
    private javax.swing.JLabel lbMotivo;
    private javax.swing.JLabel lbNombreMascota;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JTextField txtMedicamentos;
    // End of variables declaration//GEN-END:variables
}
