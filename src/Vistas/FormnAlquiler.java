package Vistas;

import auto.Auto;
import auto.Alquiler;
import arregloauto.ArregloAuto;
import arregloauto.ArregloAlquiler;
import javax.swing.JOptionPane;
import auto.resultadoCreacion;

public class FormnAlquiler extends javax.swing.JFrame {

    private final ArregloAuto arregloAutos;
    private final ArregloAlquiler arregloAlquileres;
    private Auto autoEncontrado;

    public FormnAlquiler(ArregloAuto arregloAutos) {
        initComponents();
        this.arregloAutos = arregloAutos;
        this.arregloAlquileres = new ArregloAlquiler();
        this.autoEncontrado = null;
        this.setLocationRelativeTo(null);

        txtMarca.setEditable(false);
        txtModelo.setEditable(false);
        txtTipo.setEditable(false);
        txtTotal.setEditable(false);
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPlacaBuscar.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtTipo.setText("");
        txtKminicial.setText("");
        txtKmfinal.setText("");
        txtTotal.setText("");
        autoEncontrado = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtKmfinal = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPlacaBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtKminicial = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        lblTituloAlquiler = new javax.swing.JLabel();
        lblImagenRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Placa");

        btnBuscar.setText("Buscar auto");
        btnBuscar.setToolTipText("");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("TOTAL");

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo");

        jLabel6.setText("KM inicial");

        txtPlacaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaBuscarActionPerformed(evt);
            }
        });
        txtPlacaBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaBuscarKeyTyped(evt);
            }
        });

        jLabel7.setText("KM final");

        jLabel1.setText("Nombre");

        btnVolver.setText("Volver al registro");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTituloAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTituloAlquiler.setText("ALQUILA TU AUTO");

        lblImagenRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-de-verificacion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPlacaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addComponent(txtNombre)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(72, 72, 72)
                                            .addComponent(btnBuscar)))))
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addComponent(btnVolver))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKminicial, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txtTotal)
                                    .addComponent(txtKmfinal)
                                    .addComponent(lblImagenRegistro)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(btnCalcular))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblTituloAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTituloAlquiler)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlacaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(btnBuscar)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKminicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtKmfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblImagenRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnVolver)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String placa = txtPlacaBuscar.getText().trim();

        if (placa.isEmpty()) {
           
           JOptionPane.showMessageDialog(this,
                    "Ingrese una placa para buscar",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Auto auto = arregloAutos.buscar(placa);

        if (auto == null) {
            JOptionPane.showMessageDialog(this,
                    "No se encontró un auto con placa: " + placa,
                    "No encontrado",
                    JOptionPane.WARNING_MESSAGE);
            limpiarCampos();
            autoEncontrado = null;
        } else {

            txtMarca.setText(auto.getMarca());
            txtModelo.setText(auto.getModelo());
            txtTipo.setText(auto.getTipo());
            autoEncontrado = auto;

            JOptionPane.showMessageDialog(this,
                    """
                    \u2713 Auto encontrado
                    Marca: """ + auto.getMarca() + "\n"
                    + "Modelo: " + auto.getModelo() + "\n"
                    + "Tipo: " + auto.getTipo(),
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        if (autoEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Busque auto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = txtNombre.getText();
        String placa = autoEncontrado.getPlaca();
        String kmInicialStr = txtKminicial.getText();
        String kmFinalStr = txtKmfinal.getText();

        resultadoCreacion resultado = Alquiler.crearAlquilerValido(
                nombre, placa, autoEncontrado, kmInicialStr, kmFinalStr
        );

        if (resultado.isExito()) {
            Alquiler alquiler = resultado.getAlquiler();
            txtTotal.setText("S/. " + String.format("%.2f", alquiler.getCostoTotal()));
            arregloAlquileres.agregarAlquiler(alquiler);

            JOptionPane.showMessageDialog(this,
                    """
                    \u2713 Alquiler registrado exitosamente
                    Cliente: """ + nombre + "\n"
                    + "Placa: " + placa + "\n"
                    + "Costo: S/. " + String.format("%.2f", alquiler.getCostoTotal()),
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

            txtKminicial.setText("");
            txtKmfinal.setText("");
            txtTotal.setText("");
        } else {

            JOptionPane.showMessageDialog(this,
                    resultado.getMenError(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FormnAuto formAuto = new FormnAuto(arregloAutos);
        formAuto.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPlacaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaBuscarActionPerformed

    }//GEN-LAST:event_txtPlacaBuscarActionPerformed

    private void txtPlacaBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaBuscarKeyTyped
        if (txtPlacaBuscar.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPlacaBuscarKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArregloAuto arreglo = new ArregloAuto();
                new FormnAlquiler(arreglo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblImagenRegistro;
    private javax.swing.JLabel lblTituloAlquiler;
    private javax.swing.JTextField txtKmfinal;
    private javax.swing.JTextField txtKminicial;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlacaBuscar;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
