package interfaz;

import clases.Cliente;
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
public class AgregarCliente extends javax.swing.JDialog {

    String rutaA, rutaI;
    ObjectOutputStream salida;
    ArrayList<Cliente> cliente;
    int aux = 0;

    public AgregarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rutaA = "src/datos/clientes.txt";
        rutaI = "src/datos/ventas.txt";

        cliente = Helper.TraerDatos(rutaA);

        try {
            salida = new ObjectOutputStream(new FileOutputStream(rutaA));
            Helper.Volcado(salida, cliente);
            Helper.LimpiarTabla(tblTabla);
            Helper.LlenadoTabla(tblTabla, rutaA);
            JButton botonesH[] = {cmdCancelar, cmdGuardar, cmdEliminar};
            JTextField cajaH[] = {txtIdentificacion, txtNombre, txtPrimerApellido, txtSegundoApellido, txtDireccion, txtEmail, txtEdad, txtTel};
            Helper.habilitarBotones(botonesH);
            Helper.editarCajaDeTexto(cajaH);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        txtSegundoApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        cmbVentas = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cmdCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tel");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel2.setText("Identificación");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setText("Primer Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setText("Segundo Apellido");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setText("Ventas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel7.setText("Edad");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel8.setText("Email");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel9.setText("Dirección");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel10.setText("Sexo");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        jPanel2.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 70, 30));

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 70, 30));

        txtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerApellidoActionPerformed(evt);
            }
        });
        txtPrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, 30));

        txtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoApellidoActionPerformed(evt);
            }
        });
        txtSegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 70, 30));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 30));

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 70, 30));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 70, 30));

        cmbSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Indefinido" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 120, -1));

        cmbVentas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmbVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cmbVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVentasActionPerformed(evt);
            }
        });
        jPanel2.add(cmbVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 560, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        cmdEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        cmdCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 150, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 110, 200));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabla.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Identificacion", "Nombre", "Primer Apellido", "Segundo Apellido", "Dirección", "Edad", "Email", "Tel", "Sexo", "Ventas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 960, 200));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 980, 230));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cliente.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void txtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoApellidoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cmbVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVentasActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        try {
            String identificacion, nombre, primer_apellido, segundo_apellido, edad, direccion, sexo, registro, auxVentas, tel, email;
            ArrayList<Cliente> clienteActualizado;

            if (txtIdentificacion.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPrimerApellido.getText().isEmpty() || txtSegundoApellido.getText().isEmpty()) {
                Helper.mensaje(this, "No puede dejar campos vacios", "Error", 2);
                txtNombre.requestFocusInWindow();
            } else if (!Helper.soloNumeros(txtEdad.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtEdad.requestFocusInWindow();
                txtEdad.selectAll();
            } else if (!Helper.soloNumeros(txtIdentificacion.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtIdentificacion.requestFocusInWindow();
                txtIdentificacion.selectAll();
            } else if (!Helper.soloNumeros(txtTel.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtTel.requestFocusInWindow();
                txtTel.selectAll();
            } else if (Helper.soloLetras(txtNombre.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar letras", "Error", 2);
                txtNombre.requestFocusInWindow();
                txtNombre.selectAll();
            } else if (Helper.soloLetras(txtPrimerApellido.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar letras", "Error", 2);
                txtPrimerApellido.requestFocusInWindow();
                txtPrimerApellido.selectAll();
            } else if (Helper.soloLetras(txtSegundoApellido.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar letras", "Error", 2);
                txtSegundoApellido.requestFocusInWindow();
                txtSegundoApellido.selectAll();
            } else {

                int indice;

                Ventas ventas;
                auxVentas = cmbVentas.getSelectedItem().toString();
                identificacion = txtIdentificacion.getText();
                nombre = txtNombre.getText();
                primer_apellido = txtPrimerApellido.getText();
                segundo_apellido = txtSegundoApellido.getText();
                direccion = txtDireccion.getText();
                edad = txtEdad.getText();
                email = txtEmail.getText();
                tel = txtTel.getText();
                sexo = cmbSexo.getSelectedItem().toString();
                indice = auxVentas.indexOf("-") - -1;
                registro = auxVentas.substring(0, indice);
                ventas = Helper.traerVentas(registro, rutaI);

                if (aux == 0) {

                    Cliente a = new Cliente(identificacion, nombre, primer_apellido, segundo_apellido, edad, email, sexo, tel, auxVentas, ventas);

                    a.guardar(salida);
                    txtNombre.requestFocusInWindow();
                    Helper.mensaje(this, "Datos guardados exitosamente", "Correcto!", 1);
                    Helper.LlenadoTabla(tblTabla, rutaA);
                    cmbVentas.setSelectedItem(0);
                    cmbSexo.setSelectedItem(0);
                    limpiar();

                } else {
                    clienteActualizado = Helper.actualizarCliente(rutaA, identificacion, nombre, primer_apellido, segundo_apellido, edad, ventas, tel, email, ventas, sexo);
                    salida = new ObjectOutputStream(new FileOutputStream(rutaA));
                    Helper.Volcado(salida, clienteActualizado);
                    Helper.LlenadoTabla(tblTabla, rutaA);
                    Helper.mensaje(this, "Datos actualizados exitosamente", "Correcto!", 1);
                    cmbSexo.setSelectedItem(0);
                    cmbVentas.setSelectedItem(0);
                    limpiar();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException | NumberFormatException e) {
            Helper.mensaje(this, "Por favor digite datos correctos", "Error", 2);
        }

        cmbVentas.setSelectedItem(0);
        cmbSexo.setSelectedItem(0);
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;

        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {

            try {
                i = tblTabla.getSelectedRow();
                cliente.remove(i);
                salida = new ObjectOutputStream(new FileOutputStream(rutaA));
                Helper.Volcado(salida, cliente);
                Helper.LlenadoTabla(tblTabla, rutaA);
                limpiar();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        limpiar();
        JButton botonesH[] = {cmdCancelar};
        JButton botonesD[] = {cmdEliminar, cmdGuardar};
        JTextField cajaD[] = {txtNombre, txtPrimerApellido, txtSegundoApellido, txtDireccion};
        JTextField cajaH[] = {txtIdentificacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        Helper.editarCajaDeTexto(cajaH);
        Helper.noEditarCajaTexto(cajaD);
        cmbVentas.setEnabled(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        // TODO add your handling code here:
        Cliente p;
        int i;
        cliente = Helper.TraerDatos(rutaA);
        i = tblTabla.getSelectedRow();
        p = cliente.get(i);
        cmbVentas.setSelectedItem(p.getVentas());
        txtNombre.setText(p.getNombre());
        txtIdentificacion.setText(p.getIdentificacion());
        txtDireccion.setText(p.getEdad());
        txtPrimerApellido.setText(p.getPrimer_apellido());
        txtSegundoApellido.setText(p.getSegundo_apellido());
        JButton botonesH[] = {cmdEliminar, cmdGuardar, cmdCancelar};
        JTextField cajaH[] = {txtIdentificacion, txtNombre, txtPrimerApellido, txtSegundoApellido, txtDireccion};
        Helper.habilitarBotones(botonesH);
        Helper.editarCajaDeTexto(cajaH);
        cmbVentas.setEnabled(true);
        aux = 1;
    }//GEN-LAST:event_tblTablaMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerApellidoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtPrimerApellidoKeyTyped

    private void txtSegundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoApellidoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtSegundoApellidoKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    public void limpiar() {
        txtIdentificacion.setText("");
        txtDireccion.setText("");
        txtNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtEmail.setText("");
        txtTel.setText("");
        txtEdad.setText("");
        txtIdentificacion.requestFocusInWindow();
        cmbVentas.setSelectedItem(0);
        cmbSexo.setSelectedItem(0);
        aux = 0;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarCliente dialog = new AgregarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbVentas;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
