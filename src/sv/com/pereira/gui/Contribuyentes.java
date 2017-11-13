package sv.com.pereira.gui;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import static javax.swing.RowFilter.orFilter;
import static javax.swing.RowFilter.regexFilter;
import javax.swing.table.TableRowSorter;
import pojos.Clientes;

public class Contribuyentes extends javax.swing.JInternalFrame {
    public Contribuyentes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ContadorPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ContadorPU").createEntityManager();
        grupoTipoVtas = new javax.swing.ButtonGroup();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContribuyentes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        campoSeleccionEmpresa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PanelIngresaData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoGiro = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoNIT = new javax.swing.JTextField();
        campoNCR = new javax.swing.JTextField();
        chkGContrib = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        rbNueva = new javax.swing.JRadioButton();
        rbModificar = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("** Contribuyentes**");
        setToolTipText("");
        setAutoscrolls(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
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
        jLabel1.setText("Contribuyentes");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 51), null));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablaContribuyentes.setAutoCreateRowSorter(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientesList, tablaContribuyentes);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idclien}"));
        columnBinding.setColumnName("Idclien");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${giro}"));
        columnBinding.setColumnName("Giro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nrc}"));
        columnBinding.setColumnName("Nrc");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nit}"));
        columnBinding.setColumnName("Nit");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gcontrib}"));
        columnBinding.setColumnName("Gcontrib");
        columnBinding.setColumnClass(Boolean.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablaContribuyentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContribuyentesMouseClicked(evt);
            }
        });
        tablaContribuyentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaContribuyentesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaContribuyentes);
        if (tablaContribuyentes.getColumnModel().getColumnCount() > 0) {
            tablaContribuyentes.getColumnModel().getColumn(0).setMinWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(3).setMinWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(3).setPreferredWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(3).setMaxWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(5).setMinWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(5).setPreferredWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        jLabel2.setBackground(new java.awt.Color(0, 255, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contribuyentes");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoSeleccionEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionEmpresaKeyTyped(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        PanelIngresaData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("NRC");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("NIT");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Giro");

        campoGiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoGiroKeyPressed(evt);
            }
        });

        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNombreKeyPressed(evt);
            }
        });

        campoNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNITKeyPressed(evt);
            }
        });

        chkGContrib.setText("Gran Contribuyente?");

        javax.swing.GroupLayout PanelIngresaDataLayout = new javax.swing.GroupLayout(PanelIngresaData);
        PanelIngresaData.setLayout(PanelIngresaDataLayout);
        PanelIngresaDataLayout.setHorizontalGroup(
            PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresaDataLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkGContrib)
                    .addComponent(campoNCR, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(campoNIT)
                    .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(campoGiro))
                .addGap(10, 10, 10))
        );
        PanelIngresaDataLayout.setVerticalGroup(
            PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresaDataLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoGiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelIngresaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoNCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(chkGContrib)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 12))); // NOI18N

        grupoTipoVtas.add(rbNueva);
        rbNueva.setText("Nuevo");
        rbNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNuevaActionPerformed(evt);
            }
        });

        grupoTipoVtas.add(rbModificar);
        rbModificar.setText("Modificar");
        rbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbModificarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNueva)
                    .addComponent(rbModificar))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbNueva)
                .addGap(20, 20, 20)
                .addComponent(rbModificar)
                .addGap(20, 20, 20)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelIngresaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PanelIngresaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Ventas");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnVerCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCotizacionActionPerformed
    

    }//GEN-LAST:event_btnVerCotizacionActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnVerCotizacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVerCotizacionKeyPressed

    }//GEN-LAST:event_btnVerCotizacionKeyPressed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formInternalFrameClosed

    private void campoSeleccionEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeleccionEmpresaKeyTyped
        // TODO add your handling code here:
        campoSeleccionEmpresa.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoSeleccionEmpresa.getText());
                campoSeleccionEmpresa.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoSeleccionEmpresa.getText(), 1); // Busca nombre
                RowFilter filtro2 = regexFilter("(?i)"+campoSeleccionEmpresa.getText(), 3); // Busca NRC
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaContribuyentes.getModel());
        tablaContribuyentes.setRowSorter(trs);  
        tablaContribuyentes/**/.selectAll();
    }//GEN-LAST:event_campoSeleccionEmpresaKeyTyped

    private void tablaContribuyentesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaContribuyentesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaContribuyentesKeyPressed

    private void tablaContribuyentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContribuyentesMouseClicked
        int filaEmpresas = tablaContribuyentes.getSelectedRow();
        campoNombre.setText(tablaContribuyentes.getValueAt(filaEmpresas, 1).toString());
        campoGiro.setText(tablaContribuyentes.getValueAt(filaEmpresas, 2).toString());
        campoNCR.setText(tablaContribuyentes.getValueAt(filaEmpresas, 3).toString());
        campoNIT.setText(tablaContribuyentes.getValueAt(filaEmpresas, 4).toString());
        String estadoContr = tablaContribuyentes.getValueAt(filaEmpresas, 5).toString();
        if(estadoContr.equals("true")){
           chkGContrib.setSelected(true); 
        }
        else {
            chkGContrib.setSelected(false);
        }
    }//GEN-LAST:event_tablaContribuyentesMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void campoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            campoGiro.requestFocus();
        }
    }//GEN-LAST:event_campoNombreKeyPressed

    private void campoGiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoGiroKeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            campoNIT.requestFocus();
        }
    }//GEN-LAST:event_campoGiroKeyPressed

    private void campoNITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNITKeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            campoNCR.requestFocus();
        }
    }//GEN-LAST:event_campoNITKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        if(campoNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nombre Empresa NO puede ser vacio");
            campoNombre.requestFocus();
            return;
        }
        if(campoGiro.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Giro NO puede ser vacio");
            campoGiro.requestFocus();
            return;
        }
        if(campoNIT.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "NIT NO puede ser vacio");
            campoNIT.requestFocus();
            return;
        }
        if(campoNCR.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "NCR  NO puede ser vacio");
            campoNCR.requestFocus();
            return;
        }
        if(rbNueva.isSelected()){
            Clientes cliente = new Clientes();
            cliente.setNombre(campoNombre.getText());
            cliente.setGiro(campoGiro.getText());
            cliente.setNit(campoNIT.getText());
            cliente.setNrc(campoNCR.getText());
            cliente.setGcontrib(chkGContrib.isSelected());
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            try {
             em.persist(cliente);
             tx.commit();
            } catch (Exception e) {
              e.printStackTrace();
             tx.rollback();
            }
            limpiarCampos();
        }
        if(rbModificar.isSelected()){
            int filaEmpresas = tablaContribuyentes.getSelectedRow();
            String idEmpresa = tablaContribuyentes.getValueAt(filaEmpresas, 0).toString();
            int idEmpresa1 = Integer.parseInt(idEmpresa);
            EntityTransaction tx = em.getTransaction();
            Clientes cliente = em.find(Clientes.class, idEmpresa1);
            cliente.setNombre(campoNombre.getText());
            cliente.setGiro(campoGiro.getText());
            cliente.setNit(campoNIT.getText());
            cliente.setNrc(campoNCR.getText());
            cliente.setGcontrib(chkGContrib.isSelected());
            tx.begin();
            try {
               em.persist(cliente);
               tx.commit();
            } catch (Exception e) {
               e.printStackTrace();
               tx.rollback();
            }
            limpiarCampos();
        }
        em.close();
        actualizarTablaEmpresas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rbNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNuevaActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_rbNuevaActionPerformed

    private void rbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbModificarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_rbModificarActionPerformed

    TableRowSorter trs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ContadorPUEntityManager;
    private javax.swing.JPanel PanelIngresaData;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JTextField campoGiro;
    private javax.swing.JTextField campoNCR;
    private javax.swing.JTextField campoNIT;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoSeleccionEmpresa;
    private javax.swing.JCheckBox chkGContrib;
    private java.util.List<pojos.Clientes> clientesList;
    private javax.persistence.Query clientesQuery;
    private javax.swing.ButtonGroup grupoTipoVtas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbModificar;
    private javax.swing.JRadioButton rbNueva;
    private javax.swing.JTable tablaContribuyentes;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void actualizarTablaEmpresas() {
       bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ContadorPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ContadorPU").createEntityManager();
        grupoTipoVtas = new javax.swing.ButtonGroup();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
       
        tablaContribuyentes = new javax.swing.JTable();

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientesList, tablaContribuyentes);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idclien}"));
        columnBinding.setColumnName("Idclien");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${giro}"));
        columnBinding.setColumnName("Giro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nrc}"));
        columnBinding.setColumnName("Nrc");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nit}"));
        columnBinding.setColumnName("Nit");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gcontrib}"));
        columnBinding.setColumnName("Gcontrib");
        columnBinding.setColumnClass(Boolean.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablaContribuyentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContribuyentesMouseClicked(evt);
            }
        });
        tablaContribuyentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaContribuyentesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaContribuyentes);
        if (tablaContribuyentes.getColumnModel().getColumnCount() > 0) {
            tablaContribuyentes.getColumnModel().getColumn(0).setMinWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(3).setMinWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(3).setPreferredWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(3).setMaxWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(5).setMinWidth(75);
            tablaContribuyentes.getColumnModel().getColumn(5).setPreferredWidth(50);
            tablaContribuyentes.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        
        
    }

    private void limpiarCampos() {
       campoGiro.setText("");
       campoNCR.setText("");
       campoNIT.setText("");
       campoNombre.setText("");
       chkGContrib.setSelected(false);
    }

}

  
    
