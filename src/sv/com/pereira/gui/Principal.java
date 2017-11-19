/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.pereira.gui;

import static com.jtattoo.plaf.texture.TextureLookAndFeel.setTheme;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JFileChooser.DIRECTORIES_ONLY;
import static javax.swing.JFileChooser.FILES_ONLY;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import static net.sf.jasperreports.engine.util.JRLoader.loadObjectFromFile;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoUsuarioActivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Sistema = new javax.swing.JMenu();
        SistemaSalir = new javax.swing.JMenuItem();
        Datos = new javax.swing.JMenu();
        DatosVentas = new javax.swing.JMenuItem();
        DatosCompras = new javax.swing.JMenuItem();
        Empresas = new javax.swing.JMenu();
        EmpresasNueva = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        ClienteNuevo = new javax.swing.JMenuItem();
        Administracion = new javax.swing.JMenu();
        AdminUsuarios = new javax.swing.JMenuItem();
        AdminTributos = new javax.swing.JMenuItem();
        Respaldos = new javax.swing.JMenuItem();
        Restauracion = new javax.swing.JMenuItem();
        Historicos = new javax.swing.JMenu();
        MovMensuales = new javax.swing.JMenuItem();
        MovAnuales = new javax.swing.JMenuItem();
        Skin = new javax.swing.JMenu();
        skin1 = new javax.swing.JMenuItem();
        skin2 = new javax.swing.JMenuItem();
        skin3 = new javax.swing.JMenuItem();
        skin4 = new javax.swing.JMenuItem();
        skin5 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        video = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setName(""); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1050, 800));
        jDesktopPane1.setRequestFocusEnabled(false);

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
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFB.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        campoUsuarioActivo.setEditable(false);
        campoUsuarioActivo.setBackground(new java.awt.Color(102, 255, 102));
        campoUsuarioActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoUsuarioActivo.setForeground(new java.awt.Color(0, 0, 255));
        campoUsuarioActivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoUsuarioActivo.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Con la Asesoría Contable de: Leticia Urquilla");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoUsuarioActivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(campoUsuarioActivo)
                                .addGap(231, 231, 231))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jMenuBar1.add(Empresas);

        Clientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Clientes.setText("Contribuyentes");
        Clientes.setDelay(100);
        Clientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clientes.setPreferredSize(new java.awt.Dimension(100, 20));

        ClienteNuevo.setText("Nuevo");
        ClienteNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClienteNuevo.setPreferredSize(new java.awt.Dimension(100, 25));
        ClienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteNuevoActionPerformed(evt);
            }
        });
        Clientes.add(ClienteNuevo);

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

        jMenuBar1.add(Administracion);

        Historicos.setText("Historicos");
        Historicos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Historicos.setPreferredSize(new java.awt.Dimension(120, 20));

        MovMensuales.setText("Mov Mensuales");
        MovMensuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovMensualesActionPerformed(evt);
            }
        });
        Historicos.add(MovMensuales);

        MovAnuales.setText("Mov. Anuales");
        MovAnuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovAnualesActionPerformed(evt);
            }
        });
        Historicos.add(MovAnuales);

        jMenuBar1.add(Historicos);

        Skin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Skin.setMnemonic('k');
        Skin.setText("Skin");
        Skin.setDelay(100);
        Skin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Skin.setMaximumSize(new java.awt.Dimension(100, 32767));
        Skin.setPreferredSize(new java.awt.Dimension(50, 42));

        skin1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin1.setText("Skin1");
        skin1.setPreferredSize(new java.awt.Dimension(215, 42));
        skin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin1ActionPerformed(evt);
            }
        });
        Skin.add(skin1);

        skin2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin2.setText("Skin2");
        skin2.setPreferredSize(new java.awt.Dimension(215, 42));
        skin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin2ActionPerformed(evt);
            }
        });
        Skin.add(skin2);

        skin3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin3.setText("Skin3");
        skin3.setPreferredSize(new java.awt.Dimension(215, 42));
        skin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin3ActionPerformed(evt);
            }
        });
        Skin.add(skin3);

        skin4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin4.setText("Skin4");
        skin4.setPreferredSize(new java.awt.Dimension(215, 42));
        skin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin4ActionPerformed(evt);
            }
        });
        Skin.add(skin4);

        skin5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin5.setText("Skin5");
        skin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin5ActionPerformed(evt);
            }
        });
        Skin.add(skin5);

        jMenuBar1.add(Skin);

        Ayuda.setText("jMenu1");

        video.setText("Video");
        video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoActionPerformed(evt);
            }
        });
        Ayuda.add(video);

        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane1.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 1098, 730);
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

    private void MovMensualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovMensualesActionPerformed
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
        
    }//GEN-LAST:event_MovMensualesActionPerformed

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

    private void MovAnualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovAnualesActionPerformed
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
        
    }//GEN-LAST:event_MovAnualesActionPerformed

    private void skin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin1ActionPerformed
//        try {
//            // TODO add your handling code here:
//            skin1();
//        } catch (IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
//        }
    }//GEN-LAST:event_skin1ActionPerformed

    private void skin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin2ActionPerformed
        try {
            // TODO add your handling code here:
            skin2();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin2ActionPerformed

    private void skin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin3ActionPerformed
        try {
            // TODO add your handling code here:
            skin3();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin3ActionPerformed

    private void skin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin4ActionPerformed
        try {
            skin4();
            // TODO add your handling code here:
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin4ActionPerformed

    private void skin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin5ActionPerformed
        try {
            // TODO add your handling code here:
            skin5();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin5ActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        int HAND_CURSOR1 = Cursor.HAND_CURSOR;
        
    }//GEN-LAST:event_jLabel5MouseEntered

    private void videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoActionPerformed
        // TODO add your handling code here:
//        URI url =URI.create("\\Reportes\\pvsys20.mp4");
            Runtime obj = Runtime.getRuntime(); 
 
        try {
            // obj.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe");
            //loadObjectFromFile("Reportes\\ComprasGlobales.jasper");
//                String ruta = "Reportes\\pvsys20.mp4";
        Process name = obj.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe C:\\Users\\Master-Pc\\Documents\\NetBeansProjects\\Contador\\Reportes\\pvsys20.mp4");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }//GEN-LAST:event_videoActionPerformed

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
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem ClienteNuevo;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenu Datos;
    private javax.swing.JMenuItem DatosCompras;
    private javax.swing.JMenuItem DatosVentas;
    private javax.swing.JMenu Empresas;
    private javax.swing.JMenuItem EmpresasNueva;
    private javax.swing.JMenu Historicos;
    private javax.swing.JMenuItem MovAnuales;
    private javax.swing.JMenuItem MovMensuales;
    private javax.swing.JMenuItem Respaldos;
    private javax.swing.JMenuItem Restauracion;
    private javax.swing.JMenu Sistema;
    private javax.swing.JMenuItem SistemaSalir;
    public javax.swing.JMenu Skin;
    public static javax.swing.JTextField campoUsuarioActivo;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem skin1;
    private javax.swing.JMenuItem skin2;
    private javax.swing.JMenuItem skin3;
    private javax.swing.JMenuItem skin4;
    private javax.swing.JMenuItem skin5;
    private javax.swing.JMenuItem video;
    // End of variables declaration//GEN-END:variables

       private void skin2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // code look&feel
        setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        setTheme("", "PCS", "PCS");
    }

    private void skin3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        //code look&feel
        setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
          setTheme("", "PCS", "PCS");
         }

    private void skin4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        //code look&feel
        setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
         setTheme("", "PCS", "PCS");
 }

    private void skin5() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            setTheme("", "PCS", "PCS");
  }
}
