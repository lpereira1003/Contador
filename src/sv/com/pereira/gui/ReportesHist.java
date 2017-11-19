package sv.com.pereira.gui;

import com.placeholder.PlaceHolder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import static javax.swing.RowFilter.orFilter;
import static javax.swing.RowFilter.regexFilter;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import static net.sf.jasperreports.engine.JasperFillManager.fillReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import static net.sf.jasperreports.engine.util.JRLoader.loadObjectFromFile;
import net.sf.jasperreports.view.JasperViewer;


public class ReportesHist extends javax.swing.JInternalFrame {

    public ReportesHist() {
        initComponents();
        PlaceHolder holder = new PlaceHolder(campoSeleccionEmpresa, "Ingrese Nombre de Empresa o NRC");
    }
    TableRowSorter trs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        freyadbPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ContadorPU").createEntityManager();
        ContadorPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ContadorPU").createEntityManager();
        empresasQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT e FROM Empresas e");
        empresasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : empresasQuery.getResultList();
        grupoLibros = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpresas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mesSeleccionado = new com.toedter.calendar.JMonthChooser();
        jLabel3 = new javax.swing.JLabel();
        annoSelect = new com.toedter.calendar.JYearChooser();
        btnVerReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        chkVtasConsuFinal = new javax.swing.JCheckBox();
        chkVtasContribuyente = new javax.swing.JCheckBox();
        chkCompras = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoSeleccionEmpresa = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Reportes Historicos");
        setToolTipText("");
        setNextFocusableComponent(btnVerReporte);
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte Histórico Mensual de transacciones");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablaEmpresas.setToolTipText("");
        tablaEmpresas.setName(""); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, empresasList, tablaEmpresas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idempresa}"));
        columnBinding.setColumnName("Idempresa");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ncr}"));
        columnBinding.setColumnName("Ncr");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${giro}"));
        columnBinding.setColumnName("Giro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gcontrib}"));
        columnBinding.setColumnName("Gcontrib");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tablaEmpresas);
        tablaEmpresas.getAccessibleContext().setAccessibleName("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuracion de Busqueda"));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Mes");

        mesSeleccionado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Año");

        btnVerReporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVerReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verOjo.png"))); // NOI18N
        btnVerReporte.setText("Reporte");
        btnVerReporte.setFocusable(false);
        btnVerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReporteActionPerformed(evt);
            }
        });
        btnVerReporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVerReporteKeyPressed(evt);
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

        grupoLibros.add(chkVtasConsuFinal);
        chkVtasConsuFinal.setSelected(true);
        chkVtasConsuFinal.setText("Libro Vtas. Consum. Final");

        grupoLibros.add(chkVtasContribuyente);
        chkVtasContribuyente.setText("Libro Vtas. Contribuyentes");
        chkVtasContribuyente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVtasContribuyenteActionPerformed(evt);
            }
        });

        grupoLibros.add(chkCompras);
        chkCompras.setText("Libro Compras");
        chkCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkComprasActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro_ventas_ccf.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro_ventas_tkt_fcf.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro_compras.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkCompras)
                                .addComponent(chkVtasConsuFinal)
                                .addComponent(annoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6))
                        .addComponent(mesSeleccionado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkVtasContribuyente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mesSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(annoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkVtasConsuFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkVtasContribuyente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(btnVerReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        campoSeleccionEmpresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoSeleccionEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionEmpresaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReporteActionPerformed
        // TODO add your handling code here:
        int filaSelecc = tablaEmpresas.getSelectedRow();
        if(filaSelecc==-1){
            showMessageDialog(this, "Seleccione Empresa");
            return;
        }
        int mes = mesSeleccionado.getMonth()+1;
        int anno = annoSelect.getYear();
        if(chkCompras.isSelected()){
            verCompras();
        }
        if(chkVtasConsuFinal.isSelected()){
            verConsumidorFinal();
        }
        if(chkVtasContribuyente.isSelected()){
            verContribuyentes();
        }
    }//GEN-LAST:event_btnVerReporteActionPerformed

    private void btnVerReporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVerReporteKeyPressed
        
    }//GEN-LAST:event_btnVerReporteKeyPressed
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void chkVtasContribuyenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVtasContribuyenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkVtasContribuyenteActionPerformed

    private void chkComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkComprasActionPerformed

    private void campoSeleccionEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeleccionEmpresaKeyTyped
        // TODO add your handling code here:
        campoSeleccionEmpresa.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoSeleccionEmpresa.getText());
                campoSeleccionEmpresa.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoSeleccionEmpresa.getText(), 1); // Busca nombre
                RowFilter filtro2 = regexFilter("(?i)"+campoSeleccionEmpresa.getText(), 2); // Busca NRC
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaEmpresas.getModel());
        tablaEmpresas.setRowSorter(trs);  
        tablaEmpresas/**/.selectAll();
    }//GEN-LAST:event_campoSeleccionEmpresaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ContadorPUEntityManager;
    private com.toedter.calendar.JYearChooser annoSelect;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerReporte;
    private javax.swing.JTextField campoSeleccionEmpresa;
    private javax.swing.JCheckBox chkCompras;
    private javax.swing.JCheckBox chkVtasConsuFinal;
    private javax.swing.JCheckBox chkVtasContribuyente;
    private java.util.List<pojos.Empresas> empresasList;
    private javax.persistence.Query empresasQuery;
    private javax.persistence.EntityManager freyadbPUEntityManager;
    private javax.swing.ButtonGroup grupoLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser mesSeleccionado;
    private javax.swing.JTable tablaEmpresas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = getLogger(ReportesHist.class.getName());

    private void verCompras() {
        int mes = mesSeleccionado.getMonth()+1;
        int anno = annoSelect.getYear();
        int filaEmpresa = tablaEmpresas.getSelectedRow();
        String idempresa = tablaEmpresas.getValueAt(filaEmpresa, 0).toString();
        int idEmpresa1 = parseInt(idempresa);
       Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/contabledb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\LibrodeCompras.jasper");
            Map valores = new HashMap();
            valores.put ( "MES" , mes);
            valores.put ( "ANNO" , anno );
            valores.put ( "IDEMPRESA" , idEmpresa1 );
            JasperPrint jasperPrint = fillReport(reporte, valores, conn);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.toFront();
            viewer.setTitle("Reporte Compras");
            viewer.setSize(1_100, 600);
            viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            //database.desconectar();
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }  
    }

    private void verConsumidorFinal() {
        int mes = mesSeleccionado.getMonth()+1;
        int anno = annoSelect.getYear();
        int filaEmpresa = tablaEmpresas.getSelectedRow();
        String idempresa = tablaEmpresas.getValueAt(filaEmpresa, 0).toString();
        int idEmpresa1 = parseInt(idempresa);
        Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/contabledb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\VentasConFinal.jasper");
            Map valores = new HashMap();
            valores.put ( "MES" , mes);
            valores.put ( "ANNO" , anno );
            valores.put ( "IDEMPRESA" , idEmpresa1 );
            JasperPrint jasperPrint = fillReport(reporte, valores, conn);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.toFront();
            viewer.setTitle("Reporte Consumidor Final");
            viewer.setSize(1_100, 600);
            viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            //database.desconectar();
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }   
    }

    private void verContribuyentes() {
        int mes = mesSeleccionado.getMonth()+1;
        int anno = annoSelect.getYear();
        int filaEmpresa = tablaEmpresas.getSelectedRow();
        String idempresa = tablaEmpresas.getValueAt(filaEmpresa, 0).toString();
        int idEmpresa1 = parseInt(idempresa);
        Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/contabledb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\LibroVentasAContribuyentes.jasper");
            Map valores = new HashMap();
            valores.put ( "MES" , mes);
            valores.put ( "ANNO" , anno );
            valores.put ( "IDEMPRESA" , idEmpresa1 );
            JasperPrint jasperPrint = fillReport(reporte, valores, conn);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.toFront();
            viewer.setTitle("Reporte Ventas a Contribuyentes");
            viewer.setSize(1_100, 600);
            viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            //database.desconectar();
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        } 
    }

}
