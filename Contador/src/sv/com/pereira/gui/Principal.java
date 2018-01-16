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
        Administracion = new javax.swing.JMenu();
        AdminUsuarios = new javax.swing.JMenuItem();
        AdminTributos = new javax.swing.JMenuItem();
        Datos = new javax.swing.JMenu();
        DatosVentas = new javax.swing.JMenuItem();
        DatosCompras = new javax.swing.JMenuItem();
        Empresas = new javax.swing.JMenu();
        EmpresasNueva = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        ClienteNuevo = new javax.swing.JMenuItem();
        Provedores = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Contador 2017");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(699, Short.MAX_VALUE))
        );

        Sistema.setText("sistema");

        SistemaSalir.setText("Salir");
        SistemaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemaSalirActionPerformed(evt);
            }
        });
        Sistema.add(SistemaSalir);

        jMenuBar1.add(Sistema);

        Administracion.setText("Administracion");

        AdminUsuarios.setText("Usuarios");
        Administracion.add(AdminUsuarios);

        AdminTributos.setText("Tributos");
        Administracion.add(AdminTributos);

        jMenuBar1.add(Administracion);

        Datos.setText("Datos");

        DatosVentas.setText("Ventas");
        DatosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosVentasActionPerformed(evt);
            }
        });
        Datos.add(DatosVentas);

        DatosCompras.setText("Compras");
        Datos.add(DatosCompras);

        jMenuBar1.add(Datos);

        Empresas.setText("empresas");

        EmpresasNueva.setText("Nueva");
        Empresas.add(EmpresasNueva);

        jMenuBar1.add(Empresas);

        Clientes.setText("clientes");

        ClienteNuevo.setText("Clientes");
        Clientes.add(ClienteNuevo);

        jMenuBar1.add(Clientes);

        Provedores.setText("proveedores");
        jMenuBar1.add(Provedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
    private javax.swing.JMenu Sistema;
    private javax.swing.JMenuItem SistemaSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
