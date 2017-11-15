/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.pereira.gui;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.SECOND;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.List;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JFileChooser.DIRECTORIES_ONLY;
import static javax.swing.JFileChooser.FILES_ONLY;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); //centarando en pantalla
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jMenuItem2 = new javax.swing.JMenuItem();
        Administracion = new javax.swing.JMenu();
        AdminUsuarios = new javax.swing.JMenuItem();
        AdminTributos = new javax.swing.JMenuItem();
        Respaldos = new javax.swing.JMenuItem();
        Restauracion = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        comprasGlob = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setName(""); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1024, 789));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Software Libros de IVA");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoPCS.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Diseño y Codificación: Pereira Computer Services 2017");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localizanos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoGoogleMaps.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFB.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
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
        Clientes.setText("Contribuyentes");
        Clientes.setDelay(100);
        Clientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clientes.setPreferredSize(new java.awt.Dimension(100, 20));

        ClienteNuevo.setText("Clientes");
        ClienteNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClienteNuevo.setPreferredSize(new java.awt.Dimension(100, 25));
        ClienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteNuevoActionPerformed(evt);
            }
        });
        Clientes.add(ClienteNuevo);

        jMenuItem2.setText("jMenuItem2");
        Clientes.add(jMenuItem2);

        jMenuBar1.add(Clientes);

        Administracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Administracion.setText("Administracion");
        Administracion.setDelay(100);
        Administracion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Administracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administracion.setPreferredSize(new java.awt.Dimension(120, 20));

        AdminUsuarios.setText("Usuarios");
        AdminUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminUsuarios.setPreferredSize(new java.awt.Dimension(100, 25));
        AdminUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminUsuariosActionPerformed(evt);
            }
        });
        Administracion.add(AdminUsuarios);

        AdminTributos.setText("Tributos");
        AdminTributos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminTributos.setPreferredSize(new java.awt.Dimension(100, 25));
        AdminTributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminTributosActionPerformed(evt);
            }
        });
        Administracion.add(AdminTributos);

        Respaldos.setText("Respaldos");
        Respaldos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Respaldos.setPreferredSize(new java.awt.Dimension(100, 25));
        Respaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespaldosActionPerformed(evt);
            }
        });
        Administracion.add(Respaldos);

        Restauracion.setText("Restauracion");
        Restauracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Restauracion.setPreferredSize(new java.awt.Dimension(100, 25));
        Restauracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestauracionActionPerformed(evt);
            }
        });
        Administracion.add(Restauracion);

        jMenuItem3.setText("jMenuItem3");
        Administracion.add(jMenuItem3);

        jMenuBar1.add(Administracion);

        jMenu1.setText("Historicos");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(120, 20));

        jMenuItem5.setText("Mov Mensuales");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        comprasGlob.setText("Mov. Anuales");
        comprasGlob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasGlobActionPerformed(evt);
            }
        });
        jMenu1.add(comprasGlob);

        jMenuBar1.add(jMenu1);

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
        ventas.toFront();
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
        compras1.toFront();
    }//GEN-LAST:event_DatosComprasActionPerformed

    private void EmpresasNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresasNuevaActionPerformed
        // TODO add your handling code here:
         Empresas1 empresas = new Empresas1();
        jDesktopPane1.add(empresas);
        //jDesktopPane1.getDesktopManager().maximizeFrame(empresas);
        empresas.setVisible(true);
        empresas.setIconifiable(true);
        empresas.setMaximizable(true);
        empresas.setClosable(true);
        empresas.setResizable(true);
        empresas.toFront();
        
    }//GEN-LAST:event_EmpresasNuevaActionPerformed

    private void ClienteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteNuevoActionPerformed
        // TODO add your handling code here:
         Contribuyentes contribuyentes = new Contribuyentes();
        jDesktopPane1.add(contribuyentes);
       // jDesktopPane1.getDesktopManager().maximizeFrame(contribuyentes);
        contribuyentes.setVisible(true);
        contribuyentes.setIconifiable(true);
        contribuyentes.setMaximizable(true);
        contribuyentes.setClosable(true);
        contribuyentes.setResizable(true);
        contribuyentes.toFront();
    }//GEN-LAST:event_ClienteNuevoActionPerformed

    private void AdminUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUsuariosActionPerformed
        // TODO add your handling code here:
        UsuariosCrud usuariosCrud = new UsuariosCrud();
        jDesktopPane1.add(usuariosCrud);
       // jDesktopPane1.getDesktopManager().maximizeFrame(usuariosCrud);
        usuariosCrud.setVisible(true);
        usuariosCrud.setIconifiable(true);
        usuariosCrud.setMaximizable(true);
        usuariosCrud.setClosable(true);
        usuariosCrud.setResizable(true);
        usuariosCrud.toFront();
    }//GEN-LAST:event_AdminUsuariosActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        ReportesHist reportesHist = new ReportesHist();
        jDesktopPane1.add(reportesHist);
        //jDesktopPane1.getDesktopManager().maximizeFrame(reportesHist);
        reportesHist.setVisible(true);
        reportesHist.setIconifiable(true);
        reportesHist.setMaximizable(true);
        reportesHist.setClosable(true);
        reportesHist.setResizable(true);
        reportesHist.toFront();
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void AdminTributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminTributosActionPerformed
        // TODO add your handling code here:
        Tributos tributos = new Tributos();
        jDesktopPane1.add(tributos);
       // jDesktopPane1.getDesktopManager().maximizeFrame(tributos);
        tributos.setVisible(true);
        tributos.setIconifiable(true);
        tributos.setMaximizable(true);
        tributos.setClosable(true);
        tributos.toFront();
       // tributos.setResizable(true);
    }//GEN-LAST:event_AdminTributosActionPerformed

    private void RespaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespaldosActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory ( new java.io.File ( "." ) );
        chooser.setDialogTitle("Selección de dirección");
        chooser.setFileSelectionMode(DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == APPROVE_OPTION) {
            List<String> comandos = new ArrayList<>();
            Calendar cal = getInstance();
            String file = "backup" + cal.get(DAY_OF_MONTH) + cal.get(MONTH + 1) + cal.get(YEAR)
                    + cal.get(HOUR_OF_DAY) + cal.get(MINUTE) + cal.get(SECOND) + ".sql";
            comandos.add("C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_dump.exe");
            //comandos.add("-i");
            comandos.add("-h");
            comandos.add("192.168.1.10");
            //comandos.add("192.168.0.25");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");
            comandos.add("postgres");
            comandos.add("-F");
            comandos.add("c");
            comandos.add("-b");
            comandos.add("-v");
            comandos.add("-f");
            comandos.add(chooser.getSelectedFile().toString() + "\\" + file);
            comandos.add("contabledb");
            ProcessBuilder pb = new ProcessBuilder(comandos);
            pb.environment().put("PGPASSWORD", "root");
            try {
                final Process process = pb.start();
                try (BufferedReader r = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
                    String line = r.readLine();
                    while (line != null) {
                        line = r.readLine();
                    }
                }
                process.waitFor();
                process.destroy();
                showMessageDialog(null, "Respaldo exitoso!");
            } catch (IOException | InterruptedException e) {
            }
        }
    }//GEN-LAST:event_RespaldosActionPerformed

    private void RestauracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestauracionActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new javax.swing.JFileChooser();
        chooser.setFileSelectionMode(FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("SQL", "sql");
        chooser.setFileFilter(filtro);
        int res = chooser.showOpenDialog(this);
        if (res == APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            //aqui el restore:
            List<String> comandos = new ArrayList<>();
            comandos.add("C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_restore.exe");
            comandos.add("-h");
            comandos.add("192.168.1.10");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");
            comandos.add("postgres");
            comandos.add("-c");
            comandos.add("-d");
            comandos.add("freyadb");
            comandos.add("-v");
            comandos.add(file.getAbsolutePath());
            ProcessBuilder pb = new ProcessBuilder(comandos);
            pb.environment().put("PGPASSWORD", "root");
            try {
                final Process process = pb.start();
                try (BufferedReader r = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()))) {
                    String line = r.readLine();
                    while (line != null) {
                        line = r.readLine();
                    }
                }
                process.waitFor();
                process.destroy();
                showMessageDialog(null, "Restauración exitosa");
            } catch (IOException | InterruptedException e) {
                showMessageDialog(null, "No se pudo encontrar el archivo","Error", ERROR_MESSAGE);
     
            }
        }
    }//GEN-LAST:event_RestauracionActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
       try {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(new URI("https://www.facebook.com/pereiracomputerservices/"));
        }
        }
        } catch (IOException | URISyntaxException e) {
           showMessageDialog(null,"Error del Navegador");
        }
     
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        try {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(new URI("https://www.google.com.sv/maps/place/Pereira+Computer+Services/@13.8040259,-88.1568606,16z/data=!4m12!1m6!3m5!1s0x0:0xa01accddfc546cef!2sPereira+Computer+Services!8m2!3d13.802213!4d-88.152451!3m4!1s0x0:0xa01accddfc546cef!8m2!3d13.802213!4d-88.152451"));
        }
        }
        } catch (IOException | URISyntaxException e) {
           showMessageDialog(null,"Error del Navegador");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void comprasGlobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasGlobActionPerformed
        // TODO add your handling code here:
           HistoricoCompras historicoCompras = new HistoricoCompras();
        jDesktopPane1.add(historicoCompras);
        //jDesktopPane1.getDesktopManager().maximizeFrame(empresas);
        historicoCompras.setVisible(true);
        historicoCompras.setIconifiable(true);
        historicoCompras.setMaximizable(true);
        historicoCompras.setClosable(true);
        historicoCompras.setResizable(true);
        historicoCompras.toFront();
        
    }//GEN-LAST:event_comprasGlobActionPerformed

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
    private javax.swing.JMenuItem Respaldos;
    private javax.swing.JMenuItem Restauracion;
    private javax.swing.JMenu Sistema;
    private javax.swing.JMenuItem SistemaSalir;
    private javax.swing.JMenuItem comprasGlob;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
