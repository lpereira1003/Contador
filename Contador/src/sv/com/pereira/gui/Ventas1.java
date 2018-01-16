package sv.com.pereira.gui;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.lang.Double.parseDouble;
import static java.lang.String.format;
import java.math.BigDecimal;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import static java.time.Instant.now;
import static java.time.LocalTime.now;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import static javax.swing.RowFilter.orFilter;
import static javax.swing.RowFilter.regexFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import static net.sf.jasperreports.engine.JasperFillManager.fillReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import static net.sf.jasperreports.engine.util.JRLoader.loadObjectFromFile;
import net.sf.jasperreports.view.JasperViewer;
import pojos.Clientes;
import pojos.Empresas;
import pojos.Impuestos;
import pojos.Ventas;

public class Ventas1 extends javax.swing.JInternalFrame {
    public Ventas1() {
        initComponents();
        grupoTipoVtas.add(chkCCF);
        grupoTipoVtas.add(chkFCF);
        grupoTipoVtas.add(chkTKT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ContadorPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ContadorPU").createEntityManager();
        empresasQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT e FROM Empresas e");
        empresasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : empresasQuery.getResultList();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
        grupoTipoVtas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpresas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatosIngresados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoTotalIva = new javax.swing.JTextField();
        campoTotalGravado = new javax.swing.JTextField();
        campoTotalPercepcion = new javax.swing.JTextField();
        campoTotalTotales = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoBuscoTransaccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblGravado_total = new javax.swing.JLabel();
        lbl_iva = new javax.swing.JLabel();
        lblPercepcion = new javax.swing.JLabel();
        campoGravado = new javax.swing.JTextField();
        campoDocVta = new javax.swing.JTextField();
        CampoIva = new javax.swing.JTextField();
        campoTotalVta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoPercepcion = new javax.swing.JTextField();
        btnGuardarCompra = new javax.swing.JButton();
        panelconfigProceso = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        chkTKT = new javax.swing.JCheckBox();
        chkFCF = new javax.swing.JCheckBox();
        chkCCF = new javax.swing.JCheckBox();
        calendario = new com.toedter.calendar.JCalendar();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        campoSeleccionEmpresa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        campoSeleccionCliente = new javax.swing.JTextField();
        btnEliminarTransacc = new javax.swing.JToggleButton();
        btnConsuFinal = new javax.swing.JToggleButton();
        btnCreditoFiscal = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("** Ingresando Ventas **");
        setToolTipText("");
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
        jLabel1.setText("Ingresando Ventas");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 51), null));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, empresasList, tablaEmpresas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idempresa}"));
        columnBinding.setColumnName("Idemp");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gcontrib}"));
        columnBinding.setColumnName("G.Cont");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablaEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpresasMouseClicked(evt);
            }
        });
        tablaEmpresas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaEmpresasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpresas);
        if (tablaEmpresas.getColumnModel().getColumnCount() > 0) {
            tablaEmpresas.getColumnModel().getColumn(0).setMinWidth(50);
            tablaEmpresas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaEmpresas.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaEmpresas.getColumnModel().getColumn(2).setMinWidth(75);
            tablaEmpresas.getColumnModel().getColumn(2).setPreferredWidth(75);
            tablaEmpresas.getColumnModel().getColumn(2).setMaxWidth(75);
            tablaEmpresas.getColumnModel().getColumn(3).setMinWidth(75);
            tablaEmpresas.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaEmpresas.getColumnModel().getColumn(3).setMaxWidth(75);
        }

        tablaClientes.setEnabled(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientesList, tablaClientes);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idclien}"));
        columnBinding.setColumnName("Idclien");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nrc}"));
        columnBinding.setColumnName("Nrc");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gcontrib}"));
        columnBinding.setColumnName("Gcontrib");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setMinWidth(50);
            tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaClientes.getColumnModel().getColumn(2).setMinWidth(100);
            tablaClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaClientes.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaClientes.getColumnModel().getColumn(3).setMinWidth(50);
            tablaClientes.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaClientes.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        tablaDatosIngresados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idVta", "Empresa", "# Doc", "T.Vta", "Grav", "IVA", "Percep", "total Vta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatosIngresados.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaDatosIngresados);
        if (tablaDatosIngresados.getColumnModel().getColumnCount() > 0) {
            tablaDatosIngresados.getColumnModel().getColumn(0).setMinWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(0).setMaxWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(2).setMinWidth(50);
            tablaDatosIngresados.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaDatosIngresados.getColumnModel().getColumn(2).setMaxWidth(50);
            tablaDatosIngresados.getColumnModel().getColumn(3).setMinWidth(30);
            tablaDatosIngresados.getColumnModel().getColumn(3).setPreferredWidth(30);
            tablaDatosIngresados.getColumnModel().getColumn(3).setMaxWidth(30);
            tablaDatosIngresados.getColumnModel().getColumn(5).setMinWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(5).setPreferredWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(5).setMaxWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(6).setMinWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(6).setPreferredWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(6).setMaxWidth(40);
        }

        jLabel2.setBackground(new java.awt.Color(0, 255, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Empresas");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos Ingresados");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clientes");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Gravado");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("IVA");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Percepcion");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Total Vtas");

        campoTotalIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        campoTotalGravado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        campoTotalPercepcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        campoTotalTotales.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTotalIva, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTotalPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTotalGravado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTotalTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTotalGravado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(campoTotalIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoTotalPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoTotalTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel9.setBackground(new java.awt.Color(102, 255, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Buscar transaccion por # Doc");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        campoBuscoTransaccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBuscoTransaccionKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso transacciones"));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("# doc");

        lblGravado_total.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGravado_total.setText("Gravado");

        lbl_iva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_iva.setText("IVA");

        lblPercepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPercepcion.setText("Percep.");

        campoGravado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoGravado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoGravadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoGravadoKeyTyped(evt);
            }
        });

        campoDocVta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoDocVta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDocVtaKeyTyped(evt);
            }
        });

        CampoIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CampoIva.setText("0.00");

        campoTotalVta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoTotalVta.setText("0.00");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Total");

        campoPercepcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoPercepcion.setText("0.00");

        btnGuardarCompra.setText("Guardar");
        btnGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPercepcion)
                            .addComponent(jLabel14)
                            .addComponent(lbl_iva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoIva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTotalVta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGravado_total)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDocVta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoGravado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnGuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDocVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGravado_total)
                    .addComponent(campoGravado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_iva)
                    .addComponent(CampoIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPercepcion)
                    .addComponent(campoPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(campoTotalVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnGuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelconfigProceso.setBackground(new java.awt.Color(51, 153, 255));
        panelconfigProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuacion de proceso"));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Fecha de Venta");

        grupoTipoVtas.add(chkTKT);
        chkTKT.setText("TKT");
        chkTKT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTKTActionPerformed(evt);
            }
        });

        grupoTipoVtas.add(chkFCF);
        chkFCF.setText("FCF");
        chkFCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFCFActionPerformed(evt);
            }
        });

        grupoTipoVtas.add(chkCCF);
        chkCCF.setText("CCF");
        chkCCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCCFActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Tipo de Venta");

        javax.swing.GroupLayout panelconfigProcesoLayout = new javax.swing.GroupLayout(panelconfigProceso);
        panelconfigProceso.setLayout(panelconfigProcesoLayout);
        panelconfigProcesoLayout.setHorizontalGroup(
            panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(chkTKT)
                        .addGap(20, 20, 20)
                        .addComponent(chkFCF)
                        .addGap(20, 20, 20)
                        .addComponent(chkCCF))
                    .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelconfigProcesoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelconfigProcesoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelconfigProcesoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelconfigProcesoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        panelconfigProcesoLayout.setVerticalGroup(
            panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel23)
                .addGap(8, 8, 8)
                .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFCF)
                    .addComponent(chkCCF)
                    .addComponent(chkTKT))
                .addGap(10, 10, 10))
        );

        jLabel21.setBackground(new java.awt.Color(102, 255, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Filtrado Empresa");
        jLabel21.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        campoSeleccionEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionEmpresaKeyTyped(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Seleccione Cliente");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), null, null));

        campoSeleccionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionClienteKeyTyped(evt);
            }
        });

        btnEliminarTransacc.setText("Eliminar Transaccion");
        btnEliminarTransacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTransaccActionPerformed(evt);
            }
        });

        btnConsuFinal.setText("Libro Consumidor Final");
        btnConsuFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsuFinalActionPerformed(evt);
            }
        });

        btnCreditoFiscal.setText("Libro Contribuyentes");
        btnCreditoFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoFiscalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(257, 257, 257))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane2)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelconfigProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoBuscoTransaccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsuFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreditoFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarTransacc))))
                    .addComponent(campoSeleccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21)
                        .addGap(10, 10, 10)
                        .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(panelconfigProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(campoBuscoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsuFinal)
                            .addComponent(btnCreditoFiscal)
                            .addComponent(btnEliminarTransacc))))
                .addGap(10, 10, 10)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSeleccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void campoDocVtaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocVtaKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_campoDocVtaKeyTyped

    private void campoGravadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoGravadoKeyTyped
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        //campoGravado.setText("0.00");
        Impuestos impuestos = em.find(Impuestos.class, 7);
        Double valorIVA = impuestos.getIva();
        Double valorPercepcion = impuestos.getPercepcion();
        Double valorConversion = impuestos.getConversion();
        double percepcion = 0.00;
        int filaEmpresas = tablaEmpresas.getSelectedRow();
        int filaClientes = tablaClientes.getSelectedRow();
        if(filaEmpresas==-1){
           JOptionPane.showMessageDialog(this,"Seleccione empresa");
           limpiarcamposTransacciones();
           return;
       }
        if(chkCCF.isSelected()&& filaClientes==-1){
            JOptionPane.showMessageDialog(this,"Seleccione Cliente");
           limpiarcamposTransacciones();
           return; 
        }
        
        String gContrEmpresa = tablaEmpresas.getValueAt(filaEmpresas, 3).toString();
     
        campoGravado.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(final KeyEvent e)
            {
                if(campoGravado.getText().isEmpty()){
                    limpiarcamposTransacciones();
                    campoGravado.setText("");
                    return;
                }
               double gravado = parseDouble(campoGravado.getText());
               double iva = parseDouble(CampoIva.getText());
               double percepcion = parseDouble(campoPercepcion.getText());
               double ventaTotal = parseDouble(campoTotalVta.getText());
               
               if((chkTKT.isSelected()||chkFCF.isSelected())){
                   double gravado1 = gravado/valorConversion;
                   CampoIva.setText("" + format("%.2f", gravado1));
                   
                   double iva1 = gravado-(gravado/valorConversion);
                    percepcion=0.00;
                    campoPercepcion.setText("" + format("%.2f", iva1));
                    
                     ventaTotal=gravado1+iva1+percepcion;
                     campoTotalVta.setText("" + format("%.2f", ventaTotal));
                   // ventaTotal=iva+
               }
               if(chkCCF.isSelected() ){
                   int filaClientes = tablaClientes.getSelectedRow();
                   int filaEmpresas = tablaEmpresas.getSelectedRow();
                   String gContrCliente1 = tablaClientes.getValueAt(filaClientes, 3).toString();
                   String gContrEmpresa1 = tablaEmpresas.getValueAt(filaEmpresas, 3).toString();
                   //System.out.println("es cliente gran contribuyente?? "+gContrCliente);
                   if((gContrEmpresa1.equals("true")&& gContrCliente1.equals("false")) && gravado>=100.00 ){
                     percepcion=gravado*valorPercepcion;
                     iva=gravado*valorIVA;
                     ventaTotal=gravado+iva+percepcion;
                     CampoIva.setText("" + format("%.2f", iva));
                     campoPercepcion.setText("" + format("%.2f", percepcion));
                     campoTotalVta.setText("" + format("%.2f", ventaTotal));
                   }else
                   {
                       percepcion=0.00;
                       iva=gravado*valorIVA;
                       ventaTotal=gravado+iva+percepcion;
                     CampoIva.setText("" + format("%.2f", iva));
                     campoPercepcion.setText("" + format("%.2f", percepcion));
                     campoTotalVta.setText("" + format("%.2f", ventaTotal));
                       
                   }
                   if(gContrEmpresa.equals("true")&&gContrCliente1.equals("true") ){
                       percepcion=0.00;
                       iva=gravado*valorIVA;
                       ventaTotal=gravado+iva+percepcion;
                       CampoIva.setText("" + format("%.2f", iva));
                        campoPercepcion.setText("" + format("%.2f", percepcion));
                        campoTotalVta.setText("" + format("%.2f", ventaTotal));
                   }
                   
               }
            }   
         });  
    }//GEN-LAST:event_campoGravadoKeyTyped

    private void btnGuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCompraActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        Calendar now = Calendar.getInstance();
        int mesActual = now.get(Calendar.MONTH)+1;
        int anno = now.get(Calendar.YEAR);
        int mesdigita = calendario.getDate().getMonth()+1;
        System.out.println("mes en la pc.... "+mesActual);
        System.out.println("mes digitacion.. "+mesdigita);
        if(mesActual==mesdigita){
            JOptionPane.showMessageDialog(this,"Mes de Proceso es IGUAL  mes actual\n"
                                             + "****** No puedo escribir data *****\n"
                                             + "       ======================      " );
            //limpiarCamposTotales();
            limpiarcamposTransacciones();
            return;
        }
        int fila = tablaEmpresas.getSelectedRow();
        if(fila==-1){
           JOptionPane.showMessageDialog(this,"Seleccione empresa");
           limpiarcamposTransacciones();
           return;
        }
      
       Ventas ventas = new Ventas();
        if(chkTKT.isSelected()||chkFCF.isSelected()){
           ventas.setIdcliente(null);
        }else{// seleccionar de tabla clientes
            int filaClientes = tablaClientes.getSelectedRow();
            String idclientes = tablaClientes.getValueAt(filaClientes, 0).toString();
            int idcliente1 = Integer.parseInt(idclientes);
            Clientes clienteid = em.find(Clientes.class,idcliente1 );
            ventas.setIdcliente(clienteid);
        }
       int filaClientes = tablaEmpresas.getSelectedRow();
       String idempresa = tablaEmpresas.getValueAt(filaClientes, 0).toString();
       int idempresa1 = Integer.parseInt(idempresa);
             //Clientes clienteid = em.find(Clientes.class,idcliente1 );
       Empresas empresaid=em.find(Empresas.class, idempresa1);
       ventas.setIdempresa(empresaid);
                
       
       if(chkTKT.isSelected()){
            ventas.setTipoventa("TKT");
            ventas.setGravado(new BigDecimal(CampoIva.getText()));
            ventas.setValorventa(new BigDecimal(campoTotalVta.getText()));
            ventas.setValoriva(new BigDecimal(campoPercepcion.getText()));
            ventas.setValorpercepcion(new BigDecimal(0.00));
       }
       if(chkFCF.isSelected()){
            ventas.setTipoventa("FCF");
            ventas.setGravado(new BigDecimal(CampoIva.getText()));
            ventas.setValorventa(new BigDecimal(campoTotalVta.getText()));
            ventas.setValoriva(new BigDecimal(campoPercepcion.getText()));
            ventas.setValorpercepcion(new BigDecimal(0.00));
       } 
       if(chkCCF.isSelected()){
            ventas.setTipoventa("CCF");
            ventas.setGravado(new BigDecimal(campoGravado.getText()));
            ventas.setValorventa(new BigDecimal(campoTotalVta.getText()));
            ventas.setValoriva(new BigDecimal(CampoIva.getText()));
            ventas.setValorpercepcion(new BigDecimal(campoPercepcion.getText()));
       }
      
       ventas.setFechaventa(calendario.getDate());
       ventas.setFechadigita(new Date());
       ventas.setNumdocvta(campoDocVta.getText());
       EntityTransaction tx = em.getTransaction();
       tx.begin();
        try {
            em.persist(ventas);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        tx.rollback();
        }
        
        limpiarcamposTransacciones();
        incrementaDoc();
        try {
            cargarDatadigitada();
        } catch (ParseException ex) {
            Logger.getLogger(Ventas1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarCompraActionPerformed

    private void chkCCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCCFActionPerformed
        // TODO add your handling code here:
        tablaClientes.setEnabled(true);
        if(chkCCF.isSelected()){
            lblGravado_total.setText("Gravado");
            lblPercepcion.setText("Percep.");
            lbl_iva.setText("IVA");
            limpiarcamposTransacciones();
        }
    }//GEN-LAST:event_chkCCFActionPerformed

    private void campoSeleccionEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeleccionEmpresaKeyTyped
        // TODO add your handling code here:
        campoSeleccionEmpresa.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoSeleccionEmpresa.getText());
                campoSeleccionEmpresa.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoSeleccionEmpresa.getText(), 1); // Busca nombre
                //RowFilter filtro2 = regexFilter("(?i)"+campoBuscarCliente.getText(), 3); // Busca Nombre
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                //filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaEmpresas.getModel());
        tablaEmpresas.setRowSorter(trs);  
        tablaEmpresas/**/.selectAll();
    }//GEN-LAST:event_campoSeleccionEmpresaKeyTyped

    private void campoSeleccionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeleccionClienteKeyTyped
        // TODO add your handling code here:
         campoSeleccionCliente.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoSeleccionCliente.getText());
                campoSeleccionCliente.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoSeleccionCliente.getText(), 1); // Busca nombre
                //RowFilter filtro2 = regexFilter("(?i)"+campoBuscarCliente.getText(), 3); // Busca Nombre
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                //filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaClientes.getModel());
        tablaClientes.setRowSorter(trs);  
        tablaClientes/**/.selectAll();
    }//GEN-LAST:event_campoSeleccionClienteKeyTyped

    private void chkTKTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTKTActionPerformed
        // TODO add your handling code here:
        if(chkTKT.isSelected()){
            lblGravado_total.setText("Valor Venta");
            lbl_iva.setText("Gravado");
            lblPercepcion.setText("IVA");
            limpiarcamposTransacciones();
        }
    }//GEN-LAST:event_chkTKTActionPerformed

    private void chkFCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFCFActionPerformed
        // TODO add your handling code here:
        if(chkFCF.isSelected()){
            lblGravado_total.setText("Valor Venta");
            lbl_iva.setText("Gravado");
            lblPercepcion.setText("IVA");
            limpiarcamposTransacciones();
        }
    }//GEN-LAST:event_chkFCFActionPerformed

    private void tablaEmpresasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEmpresasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEmpresasKeyPressed

    private void tablaEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpresasMouseClicked
        try {
            limpiarCamposTotales();
            cargarDatadigitada();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "No hay Data");
            return;
            //Logger.getLogger(Ventas1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaEmpresasMouseClicked

    private void campoGravadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoGravadoKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==VK_ENTER) {
            btnGuardarCompra.requestFocus();
        }
    }//GEN-LAST:event_campoGravadoKeyPressed

    private void campoBuscoTransaccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscoTransaccionKeyTyped
        // TODO add your handling code here:
        campoBuscoTransaccion.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoBuscoTransaccion.getText());
                campoBuscoTransaccion.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoBuscoTransaccion.getText(), 2); // Busca nombre
                //RowFilter filtro2 = regexFilter("(?i)"+campoBuscarCliente.getText(), 3); // Busca Nombre
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                //filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaDatosIngresados.getModel());
        tablaDatosIngresados.setRowSorter(trs);  
        tablaDatosIngresados/**/.selectAll();
    }//GEN-LAST:event_campoBuscoTransaccionKeyTyped

    private void btnEliminarTransaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTransaccActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        int fila = tablaDatosIngresados.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Seleccione Transaccion a ELIMINAR");
            return;
        }
        String idVta = tablaDatosIngresados.getValueAt(fila, 0).toString();
        int idVta1 = Integer.parseInt(idVta);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
        Ventas ventaBorrar = em.find(Ventas.class, idVta1);
        em.remove(ventaBorrar);
            tx.commit();
         } catch (Exception e){
            e.printStackTrace();
            tx.rollback();
         }finally{
            em.close();
            
            campoBuscoTransaccion = new javax.swing.JTextField();
            campoBuscoTransaccion.setText("");
            try {
                cargarDatadigitada();
            } catch (ParseException ex) {
                Logger.getLogger(Ventas1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnEliminarTransaccActionPerformed

    private void btnConsuFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsuFinalActionPerformed
        int fila = tablaEmpresas.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Seleccione Empresa");
            return;
        }
        String idEmpresa = tablaEmpresas.getValueAt(fila, 0).toString();
        int idEmpresa1 = Integer.parseInt(idEmpresa);        
        Calendar now = Calendar.getInstance();
        int mes = now.get(Calendar.MONTH);
        int anno = now.get(Calendar.YEAR);
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
        valores.put ( "MES" , mes );
        valores.put ( "ANNO" , anno );
        valores.put ( "IDEMPRESA" , idEmpresa1 );
        JasperPrint jasperPrint = fillReport(reporte, valores, conn);
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.toFront();
        viewer.setTitle("Reporte ventas a Consumidor Final");
        viewer.setSize(900, 600);
        viewer.setVisible(true);
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            //database.desconectar();
            conn.close();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this,"Error en Base de datos");
        }
       
    }//GEN-LAST:event_btnConsuFinalActionPerformed

    private void btnCreditoFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoFiscalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Pendiente codificacion" );
        return;
    }//GEN-LAST:event_btnCreditoFiscalActionPerformed

    TableRowSorter trs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoIva;
    private javax.persistence.EntityManager ContadorPUEntityManager;
    private javax.swing.JToggleButton btnConsuFinal;
    private javax.swing.JToggleButton btnCreditoFiscal;
    private javax.swing.JToggleButton btnEliminarTransacc;
    private javax.swing.JButton btnGuardarCompra;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JTextField campoBuscoTransaccion;
    private javax.swing.JTextField campoDocVta;
    private javax.swing.JTextField campoGravado;
    private javax.swing.JTextField campoPercepcion;
    private javax.swing.JTextField campoSeleccionCliente;
    private javax.swing.JTextField campoSeleccionEmpresa;
    private javax.swing.JTextField campoTotalGravado;
    private javax.swing.JTextField campoTotalIva;
    private javax.swing.JTextField campoTotalPercepcion;
    private javax.swing.JTextField campoTotalTotales;
    private javax.swing.JTextField campoTotalVta;
    private javax.swing.JCheckBox chkCCF;
    private javax.swing.JCheckBox chkFCF;
    private javax.swing.JCheckBox chkTKT;
    private java.util.List<pojos.Clientes> clientesList;
    private javax.persistence.Query clientesQuery;
    private java.util.List<pojos.Empresas> empresasList;
    private javax.persistence.Query empresasQuery;
    private javax.swing.ButtonGroup grupoTipoVtas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGravado_total;
    private javax.swing.JLabel lblPercepcion;
    private javax.swing.JLabel lbl_iva;
    private javax.swing.JPanel panelconfigProceso;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaDatosIngresados;
    private javax.swing.JTable tablaEmpresas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void limpiarcamposTransacciones() {
    CampoIva.setText("0.00");
    campoGravado.setText("");
    campoTotalVta.setText("0.00");
    campoPercepcion.setText("0.00");
    campoGravado.requestFocus();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void incrementaDoc() {
        int correlativo = Integer.parseInt(campoDocVta.getText());
        correlativo=correlativo+1;
        campoDocVta.setText(""+correlativo);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cargarDatadigitada() throws ParseException {
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        int filaempresa = tablaEmpresas.getSelectedRow();
        String idempresa = tablaEmpresas.getValueAt(filaempresa, 2).toString();
        double totalPercepcion = 0.00;
        double totalIva = 0.00;
        double totalVentas = 0.00;
        double totalGravado = 0.00;
        //int idempresa1 = Integer.parseInt(idempresa);
        DefaultTableModel tablaFactura = (DefaultTableModel) tablaDatosIngresados.getModel();
        
        tablaDatosIngresados.setFont(new java.awt.Font("Tahoma", 0, 9));
        String tipovta = "";
        if(chkTKT.isSelected()){
            tipovta="TKT";
        }
        if(chkFCF.isSelected()){
            tipovta="FCF";
        }
        if(chkCCF.isSelected()){
            tipovta="CCF";
        }
        Calendar now = Calendar.getInstance();
        try {//limpiando tabla ventas para CCF
           DefaultTableModel temp = (DefaultTableModel) tablaDatosIngresados.getModel();
           int a = temp.getRowCount();
           for (int i = 0; i < a; i++) {
                temp.removeRow(0);
            }
            } catch (Exception e) {
        }
        Query query;
        query = em.createQuery("Select v from Ventas v where (v.idempresa.ncr = :empresabuscar) AND v.tipoventa = :tipovta order by v.idventa asc")
                .setParameter("empresabuscar", idempresa)
                .setParameter("tipovta", tipovta) ;
                
        List<Ventas> list=query.getResultList();
        int mesActual = now.get(Calendar.MONTH)+1;
        for(Ventas ventas:list)
        {   
            Timestamp mesVta = new Timestamp(ventas.getFechaventa().getTime());
            int mesVta1 = mesVta.getMonth();
            int mesVta2 = mesVta1+2;// igualo mes ventas a mes digitacion
            if(mesActual==mesVta2)
            {
                String idvta = ventas.getIdventa().toString();
                String nomEmpresa = ventas.getIdempresa().getNombre();
                String numDoc = ventas.getNumdocvta();
                String tipoVta = ventas.getTipoventa();
                String grav = ventas.getGravado().toString();
                String iva = ventas.getValoriva().toString();
                String percep = ventas.getValorpercepcion().toString();
                String percep1 = ventas.getValorventa().toString();
                Object FilaElemento[] = {idvta, nomEmpresa, numDoc, tipoVta, grav, iva, percep, percep1 };
                
                tablaFactura.addRow(FilaElemento);
                totalIva=totalIva+Double.parseDouble(iva);
                totalPercepcion=totalPercepcion+Double.parseDouble(percep);
                totalVentas=totalVentas+Double.parseDouble(percep1);
                totalGravado=totalGravado+Double.parseDouble(grav);
                campoTotalGravado.setText(""+format("%.2f",totalGravado));
                campoTotalIva.setText(""+format("%.2f",totalIva));
                campoTotalPercepcion.setText(""+format("%.2f",totalPercepcion));
                campoTotalTotales.setText(""+format("%.2f",totalVentas));
            }
        }// for lista
    }

    private void limpiarCamposTotales() {
    campoTotalGravado.setText("0.00");
    campoTotalIva.setText("0.00");
    campoTotalPercepcion.setText("0.00");
    campoTotalTotales.setText("0.00");
    }

    
}
