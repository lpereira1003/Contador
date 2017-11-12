/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.pereira.gui;

import static java.lang.System.exit;

public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); //centarando en pantalla
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Sistema = new javax.swing.JMenu();
        SistemaSalir = new javax.swing.JMenuItem();
        Datos = new javax.swing.JMenu();
        DatosVentas = new javax.swing.JMenuItem();
        DatosCompras = new javax.swing.JMenuItem();
        Empresas = new javax.swing.JMenu();
        EmpresasNueva = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        ClienteNuevo = new javax.swing.JMenuItem();
        Provedores = new javax.swing.JMenu();
        Proveedores = new javax.swing.JMenuItem();
        Administracion = new javax.swing.JMenu();
        AdminUsuarios = new javax.swing.JMenuItem();
        AdminTributos = new javax.swing.JMenuItem();
        Respaldos = new javax.swing.JMenuItem();
        Restauracion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setName(""); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1024, 789));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Contador 2017");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(666, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48))
        );

        Sistema.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sistema.setText("Sistema");
        Sistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sistema.setDelay(100);
        Sistema.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sistema.setPreferredSize(new java.awt.Dimension(100, 30));

        SistemaSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SistemaSalir.setText("Salir");
        SistemaSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SistemaSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SistemaSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        SistemaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemaSalirActionPerformed(evt);
            }
        });
        Sistema.add(SistemaSalir);

        jMenuBar1.add(Sistema);

        Datos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Datos.setText("Digitacion");
        Datos.setDelay(100);
        Datos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Datos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Datos.setPreferredSize(new java.awt.Dimension(100, 20));

        DatosVentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DatosVentas.setText("Ventas");
        DatosVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatosVentas.setBorderPainted(true);
        DatosVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatosVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DatosVentas.setPreferredSize(new java.awt.Dimension(100, 25));
        DatosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosVentasActionPerformed(evt);
            }
        });
        Datos.add(DatosVentas);

        DatosCompras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DatosCompras.setText("Compras");
        DatosCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DatosCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatosCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DatosCompras.setPreferredSize(new java.awt.Dimension(100, 25));
        DatosCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosComprasActionPerformed(evt);
            }
        });
        Datos.add(DatosCompras);

        jMenuBar1.add(Datos);

        Empresas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Empresas.setText("Empresas");
        Empresas.setDelay(100);
        Empresas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Empresas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Empresas.setPreferredSize(new java.awt.Dimension(100, 20));

        EmpresasNueva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EmpresasNueva.setText("Nueva");
        EmpresasNueva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EmpresasNueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmpresasNueva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmpresasNueva.setPreferredSize(new java.awt.Dimension(100, 25));
        EmpresasNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresasNuevaActionPerformed(evt);
            }
        });
        Empresas.add(EmpresasNueva);

        jMenuItem1.setText("jMenuItem1");
        Empresas.add(jMenuItem1);

        jMenuBar1.add(Empresas);

        Clientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Clientes.setText("Clientes");
        Clientes.setDelay(100);
        Clientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clientes.setPreferredSize(new java.awt.Dimension(100, 20));

        ClienteNuevo.setText("Clientes");
        ClienteNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClienteNuevo.setPreferredSize(new java.awt.Dimension(100, 25));
        Clientes.add(ClienteNuevo);

        jMenuBar1.add(Clientes);

        Provedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Provedores.setText("Proveedores");
        Provedores.setDelay(100);
        Provedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Provedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Provedores.setPreferredSize(new java.awt.Dimension(100, 20));

        Proveedores.setText("Proveedores");
        Proveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Proveedores.setPreferredSize(new java.awt.Dimension(100, 25));
        Provedores.add(Proveedores);

        jMenuBar1.add(Provedores);

        Administracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Administracion.setText("Administracion");
        Administracion.setDelay(100);
        Administracion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Administracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administracion.setPreferredSize(new java.awt.Dimension(120, 20));

        AdminUsuarios.setText("Usuarios");
        AdminUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminUsuarios.setPreferredSize(new java.awt.Dimension(100, 25));
        Administracion.add(AdminUsuarios);

        AdminTributos.setText("Tributos");
        AdminTributos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminTributos.setPreferredSize(new java.awt.Dimension(100, 25));
        Administracion.add(AdminTributos);

        Respaldos.setText("Respaldos");
        Respaldos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Respaldos.setPreferredSize(new java.awt.Dimension(100, 25));
        Administracion.add(Respaldos);

        Restauracion.setText("Restauracion");
        Restauracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Restauracion.setPreferredSize(new java.awt.Dimension(100, 25));
        Administracion.add(Restauracion);

        jMenuBar1.add(Administracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SistemaSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistemaSalirActionPerformed
        exit(0);
    }//GEN-LAST:event_SistemaSalirActionPerformed

    private void DatosVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosVentasActionPerformed
        Ventas1 ventas = new Ventas1();
        jDesktopPane1.add(ventas);
        jDesktopPane1.getDesktopManager().maximizeFrame(ventas);
        ventas.setVisible(true);
        ventas.setIconifiable(true);
        ventas.setMaximizable(true);
        ventas.setClosable(true);
        ventas.setResizable(true);
        
      


    }//GEN-LAST:event_DatosVentasActionPerformed

    private void DatosComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosComprasActionPerformed
        // TODO add your handling code here:
        Compras1 compras1 = new Compras1();
        jDesktopPane1.add(compras1);
        jDesktopPane1.getDesktopManager().maximizeFrame(compras1);
        compras1.setVisible(true);
        compras1.setIconifiable(true);
        compras1.setMaximizable(true);
        compras1.setClosable(true);
        compras1.setResizable(true);
        
         
    }//GEN-LAST:event_DatosComprasActionPerformed

    private void EmpresasNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresasNuevaActionPerformed
        // TODO add your handling code here:
         Empresas1 empresas = new Empresas1();
        jDesktopPane1.add(empresas);
        jDesktopPane1.getDesktopManager().maximizeFrame(empresas);
        empresas.setVisible(true);
        empresas.setIconifiable(true);
        empresas.setMaximizable(true);
        empresas.setClosable(true);
        empresas.setResizable(true);
        
    }//GEN-LAST:event_EmpresasNuevaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdminTributos;
    private javax.swing.JMenuItem AdminUsuarios;
    private javax.swing.JMenu Administracion;
    private javax.swing.JMenuItem ClienteNuevo;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenu Datos;
    private javax.swing.JMenuItem DatosCompras;
    private javax.swing.JMenuItem DatosVentas;
    private javax.swing.JMenu Empresas;
    private javax.swing.JMenuItem EmpresasNueva;
    private javax.swing.JMenu Provedores;
    private javax.swing.JMenuItem Proveedores;
    private javax.swing.JMenuItem Respaldos;
    private javax.swing.JMenuItem Restauracion;
    private javax.swing.JMenu Sistema;
    private javax.swing.JMenuItem SistemaSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
