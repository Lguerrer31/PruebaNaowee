package interfaz;

import clases.Helper;
import clases.Ventas;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author laura
 */
public class AgregarVentas extends javax.swing.JDialog {

    String ruta;
    ObjectOutputStream salida;
    ArrayList<Ventas> ventas;
    int aux = 0;

    public AgregarVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtRegistro.requestFocusInWindow();
        ruta = "src/datos/ventas.txt";
        ventas = Helper.TraerDatosI(ruta);
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            Helper.Volcado(salida, ventas);
            Helper.LimpiarTabla(tblTabla);
            Helper.LlenadoTablaI(tblTabla, ruta);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cmdCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Instrumento");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de las Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("No. Registro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtRegistro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroKeyTyped(evt);
            }
        });
        jPanel2.add(txtRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Estado");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Dirección");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 60, -1));

        txtDireccion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 80, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Fecha");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 40, -1));

        txtFecha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 80, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });
        jPanel2.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 460, 170));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        cmdEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        cmdCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 150, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 110, 200));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabla.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Fecha", "No. Registro", "Dirección", "Estado", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabla.setToolTipText("");
        tblTabla.getTableHeader().setReorderingAllowed(false);
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 740, 200));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 760, 230));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ventas.jpg"))); // NOI18N
        jLabel7.setDisabledIcon(null);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 503));

        setSize(new java.awt.Dimension(817, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        String registro, nombre, estado, fecha, direccion;
        ArrayList<Ventas> ventasActualizadas;

        try {
            if (!Helper.soloNumeros(txtRegistro.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtRegistro.requestFocusInWindow();
                txtRegistro.selectAll();
            } else if (!Helper.soloNumeros(txtFecha.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtFecha.requestFocusInWindow();
                txtFecha.selectAll();
            } else if (Helper.soloLetras(txtNombre.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar letras", "Error", 2);
                txtNombre.requestFocusInWindow();
                txtNombre.selectAll();
            } else {
                registro = txtRegistro.getText();
                nombre = txtNombre.getText();
                estado = cmbEstado.getSelectedItem().toString();
                fecha = txtFecha.getText();
                direccion = txtDireccion.getText();

                if (aux == 0) {

                    Ventas i = new Ventas(nombre, estado, direccion, fecha, registro);

                    try {
                        i.guardar(salida);
                        txtNombre.requestFocusInWindow();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    Helper.mensaje(this, "Datos guardados exitosamente", "Correcto!", 1);
                    Helper.LlenadoTablaI(tblTabla, ruta);
                    limpiar();

                } else {

                    ventasActualizadas = Helper.actualizarVentas(ruta, nombre, fecha, direccion, direccion, estado, fecha);
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                    Helper.Volcado(salida, ventasActualizadas);
                    Helper.LlenadoTablaI(tblTabla, ruta);
                    Helper.mensaje(this, "Datos actualizados exitosamente", "Correcto!", 1);

                    limpiar();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            Helper.mensaje(this, "Por favor digite datos correctos", "Error", 2);
        }

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        // TODO add your handling code here:
        int i, op;

        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {

            try {
                i = tblTabla.getSelectedRow();
                ventas.remove(i);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.VolcadoI(salida, ventas);
                Helper.LlenadoTablaI(tblTabla, ruta);
                limpiar();
                txtRegistro.requestFocusInWindow();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtRegistroKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped

    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        // TODO add your handling code here:
        Ventas p;
        int i;
        ventas = Helper.TraerDatosI(ruta);
        i = tblTabla.getSelectedRow();
        p = ventas.get(i);

        txtNombre.setText(p.getNombre());
        cmbEstado.setSelectedItem(p.getEstado());
        txtDireccion.setText(p.getDireccion());
        txtFecha.setText(p.getFecha());
        txtRegistro.setText(p.getIdentificacion());
        JButton botonesH[] = {cmdEliminar, cmdGuardar, cmdCancelar};
        JTextField cajaH[] = {txtRegistro, txtNombre, txtDireccion, txtFecha};
        Helper.habilitarBotones(botonesH);
        Helper.editarCajaDeTexto(cajaH);
        cmbEstado.setEnabled(true);
        aux = 1;
    }//GEN-LAST:event_tblTablaMouseClicked

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    public void limpiar() {
        txtNombre.setText("");
        cmbEstado.setSelectedItem(0);
        txtDireccion.setText("");
        txtFecha.setText("");
        txtRegistro.setText("");
        txtRegistro.requestFocusInWindow();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarVentas dialog = new AgregarVentas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRegistro;
    // End of variables declaration//GEN-END:variables
}
