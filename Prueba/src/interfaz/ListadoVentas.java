package interfaz;

import clases.Helper;

/**
 *
 * @author laura
 */
public class ListadoVentas extends javax.swing.JDialog {

    String ruta;

    public ListadoVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/ventas.txt";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmbListado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cmdListar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbListado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmbListado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanel2.add(cmbListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdListar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdListar.setText("Listar");
        cmdListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdListarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 100, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabla.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Fecha", "Nombre", "Direccion", "Ventas", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblTabla);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 350, 150));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 390, 200));
        jPanel4.getAccessibleContext().setAccessibleName("Ventas");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reportes.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -170, 420, 760));

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

        setSize(new java.awt.Dimension(436, 356));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdListarActionPerformed
        // TODO add your handling code here:
        String opcion = cmbListado.getSelectedItem().toString();
        Helper.ListadoClientesPorVentas(tblTabla, ruta, ruta, ruta);
    }//GEN-LAST:event_cmdListarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoVentas dialog = new ListadoVentas(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbListado;
    private javax.swing.JButton cmdListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables
}
