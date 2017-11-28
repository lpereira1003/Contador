package sv.com.pereira.gui;

import com.placeholder.PlaceHolder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.beans.Beans.isDesignTime;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static java.util.Collections.emptyList;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import static javax.swing.RowFilter.orFilter;
import static javax.swing.RowFilter.regexFilter;
import javax.swing.table.TableRowSorter;
import static org.apache.commons.codec.digest.DigestUtils.md5Hex;
import static org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE;
import static org.jdesktop.beansbinding.ELProperty.create;
import static org.jdesktop.swingbinding.SwingBindings.createJTableBinding;
import pojos.Usuarios;

public class UsuariosCrud extends javax.swing.JInternalFrame {

    public UsuariosCrud() {
        initComponents();
        PlaceHolder holder = new PlaceHolder(CampoNombreEmpleado, "Nombre de Usuario");
        PlaceHolder holder1 = new PlaceHolder(CampoUser, "Usuario Asignado");
        tablaEmpleados.setAutoCreateRowSorter(true);//permite ordenar la tabla x cuaquier columna
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        GrupoBotones = new javax.swing.ButtonGroup();
        ContadorPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ContadorPU").createEntityManager();
        usuariosQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT u FROM Usuarios u");
        usuariosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usuariosQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CampoUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoNombreEmpleado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        RadioButtonAgregar = new javax.swing.JRadioButton();
        RadioButtonModificar = new javax.swing.JRadioButton();
        RadioButtonEliminar = new javax.swing.JRadioButton();
        btnProcesar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoPass1 = new javax.swing.JPasswordField();
        campoPass2 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        campoUsuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");
        setToolTipText("");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Acceso Usuarios");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        CampoUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUserActionPerformed(evt);
            }
        });
        CampoUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoUserKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Usuario");

        CampoNombreEmpleado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoNombreEmpleadoKeyPressed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 102), null, null));

        GrupoBotones.add(RadioButtonAgregar);
        RadioButtonAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioButtonAgregar.setSelected(true);
        RadioButtonAgregar.setText("Agregar");
        RadioButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonAgregarActionPerformed(evt);
            }
        });

        GrupoBotones.add(RadioButtonModificar);
        RadioButtonModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioButtonModificar.setText("Modificar");

        GrupoBotones.add(RadioButtonEliminar);
        RadioButtonEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioButtonEliminar.setText("Eliminar");

        btnProcesar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnProcesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnProcesar.setText("Guardar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioButtonEliminar)
                    .addComponent(RadioButtonModificar)
                    .addComponent(RadioButtonAgregar))
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcesar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonAgregar)
                .addGap(30, 30, 30)
                .addComponent(RadioButtonModificar)
                .addGap(30, 30, 30)
                .addComponent(RadioButtonEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSalir)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Reingrese Contraseña");

        campoPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPass1KeyPressed(evt);
            }
        });

        campoPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPass2KeyPressed(evt);
            }
        });

        tablaEmpleados.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usuariosList, tablaEmpleados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idusuario}"));
        columnBinding.setColumnName("Idusuario");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);
        if (tablaEmpleados.getColumnModel().getColumnCount() > 0) {
            tablaEmpleados.getColumnModel().getColumn(0).setMinWidth(40);
            tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaEmpleados.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        campoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoUsuarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CampoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CampoNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoPass1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(campoPass2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(CampoNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
    // INICIA RUTINA FILTRADO DE DATA
    TableRowSorter trs1 ;
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        if(RadioButtonEliminar.isSelected()){
           int fila = tablaEmpleados.getSelectedRow();
            String idEmpleado = tablaEmpleados.getValueAt(fila, 0).toString();
            int idEmpleadoInt = parseInt(idEmpleado);
//           Usuarios usuario = em.find(Usuarios.class,idEmpleadoInt);
           EntityTransaction tx = em.getTransaction();
            tx.begin();
            try {
               Usuarios usuario = em.find(Usuarios.class, idEmpleadoInt);
               em.remove(usuario);
               tx.commit();
            } catch (Exception e){
                showMessageDialog(this, "Error de Conexion");
               tx.rollback();
               return;
            } 
           limpiarCampos();
        } 
        if(RadioButtonAgregar.isSelected()){
            if(CampoUser.getText().length()==0) {
            showMessageDialog(this,"Nombre NO puede ser Vacio");
            CampoUser.requestFocus();
            return;
            }
            else{
                if(CampoNombreEmpleado.getText().length()==0)
                {
                    showMessageDialog(this, "Seleccione Empleado de la tabla");
                    CampoUser.requestFocus();
                    return;   
                }          
                if(campoPass1.getText().length()==0||campoPass2.getText().length()==0)
                {
                    showMessageDialog(this, "No Moleste please\n NO acepto Contraseñas en Blanco");
                    campoPass1.requestFocus();
                    return;
                }         
                if(campoPass1.getText().equals(campoPass2.getText())){
                }else
                {
                    showMessageDialog(this, "Las Contraseñas NO coinciden\n Intente Nuevmente");
                    campoPass1.setText("");
                    campoPass2.setText("");
                    campoPass1.requestFocus();
                    return; 
                }
                Usuarios usuario = new Usuarios();
                String usuarioEncrip=CampoUser.getText(); 
                String usuarioEncriptado=md5Hex(usuarioEncrip); 
                String paswordEncrip=campoPass1.getText(); 
                String passwordEncriptado=md5Hex(paswordEncrip);
                usuario.setNombre(CampoNombreEmpleado.getText());
                usuario.setPassw(passwordEncriptado);
                usuario.setUsuario(usuarioEncriptado);
                //preparando enlace
                em.persist(usuario);
                try {
                    // escribiendo on DB
                    em.getTransaction().begin();
                    em.persist(usuario);
                    em.getTransaction().commit();
                }
                catch (Exception e) {
                }finally {
                // actualizarTabla();
                    em.close();
                }
                    showMessageDialog(this, "El Usuario se guardó correctamente");
                 limpiarCampos();
                 actualizarTabla();
                }
        }// fin de Agregar
        if(RadioButtonModificar.isSelected())
            {//*** modificando usuarios
            if(CampoUser.getText().length()==0) 
                {
                     showMessageDialog(this,"Nombre NO puede ser Vacio");
                     CampoUser.requestFocus();
                     return;
                }
             if(campoPass1.getText().length()==0||campoPass2.getText().length()==0)
             {
                 showMessageDialog(this, "No Moleste please\n NO acepto Contraseñas en Blanco");
                 campoPass1.requestFocus();
                 return;
             }         
             if(campoPass1.getText().equals(campoPass2.getText())){
             }else
                {
                    showMessageDialog(this, "Las Contraseñas NO coinciden\n Intente Nuevamente");
                    campoPass1.setText("");
                    campoPass2.setText("");
                    campoPass1.requestFocus();
                    return; 
                } 
             int fila = tablaEmpleados.getSelectedRow();
             String idEmpleado1 = tablaEmpleados.getValueAt(fila, 0).toString();
             int idEmpleadoInt = parseInt(idEmpleado1);
             Integer iduserfindInt = null;
             Usuarios usuario = em.find(Usuarios.class,idEmpleadoInt);
             usuario.setNombre(CampoNombreEmpleado.getText());
             String usuarioEncrip=CampoUser.getText(); 
             String usuarioEncriptado=md5Hex(usuarioEncrip); 
             String paswordEncrip=campoPass1.getText(); 
             String passwordEncriptado=md5Hex(paswordEncrip);
             usuario.setNombre(CampoNombreEmpleado.getText());
             usuario.setPassw(passwordEncriptado);
             usuario.setUsuario(usuarioEncriptado);
             EntityTransaction tx = em.getTransaction();
             tx.begin();
             try {
                em.persist(usuario);
                tx.commit();
             } catch (Exception e) {
                tx.rollback();
             }
             showMessageDialog(this, "Guardado correctamente");
             limpiarCampos();
            actualizarTabla();
        }//fin de Modificar
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void CampoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUserActionPerformed

    private void tablaEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMousePressed

    }//GEN-LAST:event_tablaEmpleadosMousePressed
TableRowSorter trs;
    private void campoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuarioKeyTyped
        // TODO add your handling code here:
         campoUsuario.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoUsuario.getText());
                campoUsuario.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoUsuario.getText(), 1); // Busca nombre
                //RowFilter filtro2 = regexFilter("(?i)"+campoUsuario.getText(), 2); // Busca NRC
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
               // filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaEmpleados.getModel());
        tablaEmpleados.setRowSorter(trs);  
        tablaEmpleados/**/.selectAll();
    }//GEN-LAST:event_campoUsuarioKeyTyped

    private void RadioButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonAgregarActionPerformed

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        int fila = tablaEmpleados.getSelectedRow();
        String id = tablaEmpleados.getValueAt(fila, 0).toString();
        int id1 = parseInt(id);
        Usuarios usuario = em.find(Usuarios.class,id1);
        CampoNombreEmpleado.setText(usuario.getNombre());
    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void CampoNombreEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNombreEmpleadoKeyPressed
         if(evt.getKeyCode()==VK_ENTER) {
            CampoUser.requestFocus();
        }  
    }//GEN-LAST:event_CampoNombreEmpleadoKeyPressed

    private void CampoUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoUserKeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            campoPass1.requestFocus();
        } 
    }//GEN-LAST:event_CampoUserKeyPressed

    private void campoPass1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPass1KeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            campoPass2.requestFocus();
        }
    }//GEN-LAST:event_campoPass1KeyPressed

    private void campoPass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPass2KeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            btnProcesar.requestFocus();
        }
    }//GEN-LAST:event_campoPass2KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoNombreEmpleado;
    private javax.swing.JTextField CampoUser;
    private javax.persistence.EntityManager ContadorPUEntityManager;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JRadioButton RadioButtonAgregar;
    private javax.swing.JRadioButton RadioButtonEliminar;
    private javax.swing.JRadioButton RadioButtonModificar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField campoPass1;
    private javax.swing.JPasswordField campoPass2;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleados;
    private java.util.List<pojos.Usuarios> usuariosList;
    private javax.persistence.Query usuariosQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
    //campoBuscarCliente.setText("");
    CampoNombreEmpleado.setText("");
    CampoUser.setText("");
    campoPass1.setText("");
    campoPass2.setText("");
    }
    private static final Logger LOG = getLogger(UsuariosCrud.class.getName());

    private void actualizarTabla() {
         bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
        ContadorPUEntityManager = isDesignTime() ? null : createEntityManagerFactory("ContadorPU").createEntityManager();
        usuariosQuery = isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT u FROM Usuarios u");
        usuariosList = isDesignTime() ? emptyList() : usuariosQuery.getResultList();
        tablaEmpleados = new javax.swing.JTable();
        campoUsuario = new javax.swing.JTextField();
        tablaEmpleados.getTableHeader().setReorderingAllowed(false);
        org.jdesktop.swingbinding.JTableBinding jTableBinding = createJTableBinding(READ_WRITE, usuariosList, tablaEmpleados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(create("${idusuario}"));
        columnBinding.setColumnName("Idusuario");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);
        if (tablaEmpleados.getColumnModel().getColumnCount() > 0) {
            tablaEmpleados.getColumnModel().getColumn(0).setMinWidth(40);
            tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaEmpleados.getColumnModel().getColumn(0).setMaxWidth(40);
        }
        bindingGroup.bind();
      
    }
}
