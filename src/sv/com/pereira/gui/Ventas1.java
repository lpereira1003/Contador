package sv.com.pereira.gui;


import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import static java.lang.System.out;
import java.math.BigDecimal;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
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
import static sv.com.pereira.gui.Principal.jDesktopPane1;

public class Ventas1 extends javax.swing.JInternalFrame {
    public Ventas1() {
        initComponents();
        PlaceHolder holder = new PlaceHolder(campoSeleccionEmpresa, "Nombre de Empresa o NRC");
        PlaceHolder holder1 = new PlaceHolder(campoSeleccionCliente, "Nombre de Cliente o NRC");
        PlaceHolder holder2 = new PlaceHolder(campoBuscoTransaccion, "# de Documento");
   
        grupoTipoVtas.add(chkCCF);
        grupoTipoVtas.add(chkFCF);
        grupoTipoVtas.add(chkTKT);
        Date fechaProceso1=calendario.getDate();
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
        lblPpal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpresas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatosIngresados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblDataIng = new javax.swing.JLabel();
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
        campoBuscoTransaccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblGravado_total = new javax.swing.JLabel();
        lbl_iva = new javax.swing.JLabel();
        lblPercepcion = new javax.swing.JLabel();
        campoGravado = new javax.swing.JTextField();
        campoDocVtaI = new javax.swing.JTextField();
        CampoIva = new javax.swing.JTextField();
        campoTotalVta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoPercepcion = new javax.swing.JTextField();
        btnGuardarCompra = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        campoDocVtaF = new javax.swing.JTextField();
        panelconfigProceso = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        chkTKT = new javax.swing.JCheckBox();
        chkFCF = new javax.swing.JCheckBox();
        chkCCF = new javax.swing.JCheckBox();
        calendario = new com.toedter.calendar.JCalendar();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        campoSeleccionEmpresa = new javax.swing.JTextField();
        campoSeleccionCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnEliminarTransacc = new javax.swing.JToggleButton();
        btnConsuFinal = new javax.swing.JToggleButton();
        btnCreditoFiscal = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("** Ingresando Ventas **");
        setToolTipText("");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1050, 650));
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

        lblPpal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPpal.setForeground(new java.awt.Color(0, 0, 255));
        lblPpal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPpal.setText("Procesando Ventas");
        lblPpal.setToolTipText("");
        lblPpal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 51), null));
        lblPpal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                "idVta", "F. Vta", "# Doc", "T.Vta", "Grav", "IVA", "Percep", "total Vta"
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

        lblDataIng.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDataIng.setForeground(new java.awt.Color(255, 0, 51));
        lblDataIng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataIng.setText("Datos Ingresados");
        lblDataIng.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoTotalPercepcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(campoTotalIva, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoTotalGravado, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(campoTotalTotales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTotalGravado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(campoTotalIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoTotalPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoTotalTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campoBuscoTransaccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBuscoTransaccionKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso transacciones"));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("# doc I");

        lblGravado_total.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGravado_total.setText("Grav.");

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

        campoDocVtaI.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoDocVtaI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDocVtaIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDocVtaIKeyTyped(evt);
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
        campoPercepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPercepcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPercepcionKeyTyped(evt);
            }
        });

        btnGuardarCompra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarCompra.setText("Guardar");
        btnGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCompraActionPerformed(evt);
            }
        });
        btnGuardarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarCompraKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("# doc F");

        campoDocVtaF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoDocVtaF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDocVtaFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGravado_total)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoGravado)
                                    .addComponent(campoDocVtaI)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPercepcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14)
                                    .addComponent(lbl_iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardarCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoTotalVta, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(campoPercepcion)
                                    .addComponent(CampoIva)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDocVtaF)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDocVtaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(campoDocVtaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGravado_total)
                    .addComponent(campoGravado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        calendario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calendarioFocusLost(evt);
            }
        });
        calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calendarioMousePressed(evt);
            }
        });
        calendario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calendarioKeyPressed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelconfigProcesoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelconfigProcesoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                                .addComponent(chkTKT)
                                .addGap(30, 30, 30)
                                .addComponent(chkFCF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkCCF))
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelconfigProcesoLayout.setVerticalGroup(
            panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTKT)
                    .addComponent(chkFCF)
                    .addComponent(chkCCF))
                .addGap(9, 9, 9))
        );

        campoSeleccionEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionEmpresaKeyTyped(evt);
            }
        });

        campoSeleccionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionClienteKeyTyped(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.darkGray, null, null));

        btnEliminarTransacc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarTransacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarTransacc.setText("Eliminar Transaccion");
        btnEliminarTransacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTransaccActionPerformed(evt);
            }
        });

        btnConsuFinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConsuFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro_ventas_tkt_fcf.png"))); // NOI18N
        btnConsuFinal.setText("Lib. Cons. Final");
        btnConsuFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsuFinalActionPerformed(evt);
            }
        });

        btnCreditoFiscal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreditoFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro_ventas_ccf.png"))); // NOI18N
        btnCreditoFiscal.setText("Lib Contrib.");
        btnCreditoFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoFiscalActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreditoFiscal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsuFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTransacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnEliminarTransacc)
                .addGap(15, 15, 15)
                .addComponent(btnConsuFinal)
                .addGap(15, 15, 15)
                .addComponent(btnCreditoFiscal)
                .addGap(15, 15, 15)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(3, 3, 3)))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(14, 14, 14)
                                .addComponent(campoSeleccionEmpresa)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoSeleccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNuevoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(panelconfigProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(campoBuscoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(jLabel9)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(lblDataIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPpal)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataIng, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoBuscoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(panelconfigProceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNuevoCliente)
                                .addComponent(campoSeleccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        lblPpal.getAccessibleContext().setAccessibleName("Ventas");

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
         //campoFechaProceso.setText(calendario.getDate().toGMTString());

    }//GEN-LAST:event_formInternalFrameClosed

    private void campoDocVtaIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocVtaIKeyTyped
   
         
    }//GEN-LAST:event_campoDocVtaIKeyTyped

    private void campoGravadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoGravadoKeyTyped
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        Impuestos impuestos = em.find(Impuestos.class, 7);
        Double valorIVA = impuestos.getIva();
        Double valorPercepcion = impuestos.getPercepcion();
        Double valorConversion = impuestos.getConversion();
        double percepcion = 0.00;
        int filaEmpresas = tablaEmpresas.getSelectedRow();
        int filaClientes = tablaClientes.getSelectedRow();
        if(filaEmpresas==-1){
            showMessageDialog(this,"Seleccione empresa");
           limpiarcamposTransacciones();
           return;
       }
        if(chkCCF.isSelected()&& filaClientes==-1){
            showMessageDialog(this,"Seleccione Cliente");
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
                    //limpiarcamposTransacciones();
                    campoGravado.setText("");
                    return;
                }
               double gravado = parseDouble(campoGravado.getText());
               double iva = parseDouble(CampoIva.getText());
               double percepcion=0.00;
               if(campoPercepcion.getText().isEmpty()){
                   percepcion=0.00;
               }else{
                   percepcion = parseDouble(campoPercepcion.getText());
               }
                
               double ventaTotal = parseDouble(campoTotalVta.getText());
               
               if((chkTKT.isSelected()||chkFCF.isSelected())){
                   double gravado1 = gravado/valorConversion;
                   CampoIva.setText("" + format("%.2f", gravado1));
                   double iva1 = gravado-(gravado/valorConversion);
                    percepcion=0.00;
                    campoPercepcion.setText("" + format("%.2f", iva1));
                     ventaTotal=gravado1+iva1+percepcion;
                     campoTotalVta.setText("" + format("%.2f", ventaTotal));
               }
               if(chkCCF.isSelected() ){
                   int filaClientes = tablaClientes.getSelectedRow();
                   int filaEmpresas = tablaEmpresas.getSelectedRow();
                   String gContrCliente1 = tablaClientes.getValueAt(filaClientes, 3).toString();
                   String gContrEmpresa1 = tablaEmpresas.getValueAt(filaEmpresas, 3).toString();
                   if((gContrEmpresa1.equals("true")&& gContrCliente1.equals("false")) && gravado>=100.00 ){
                     //percepcion=gravado*valorPercepcion;
                     campoPercepcion.setText("");
                     iva=gravado*valorIVA;
                     ventaTotal=gravado+iva;//+percepcion;
                     CampoIva.setText("" + format("%.2f", iva));
                     //campoPercepcion.setText("" + format("%.2f", percepcion));
                     campoTotalVta.setText("" + format("%.2f", ventaTotal));
                   }else
                   {
                       percepcion=0.00;
                       iva=gravado*valorIVA;
                       ventaTotal=gravado+iva;//+percepcion;
                     CampoIva.setText("" + format("%.2f", iva));
                     
                     campoPercepcion.setText("" + format("%.2f", percepcion));
                     campoTotalVta.setText("" + format("%.2f", ventaTotal));
                   }
                   if(gContrEmpresa.equals("true")&&gContrCliente1.equals("true") ){
                       percepcion=0.00;
                       iva=gravado*valorIVA;
                       ventaTotal=gravado+iva;//+percepcion;
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
        boolean tkt = chkTKT.isSelected();
        boolean fcf = chkFCF.isSelected();
        boolean ccf = chkCCF.isSelected();
        int filaEmpresa = tablaEmpresas.getSelectedRow();
        int filaClientes1 = tablaClientes.getSelectedRow();
        
        if((tkt==false) && (fcf==false) && (ccf==false)){
            showMessageDialog(this, "Seleccione el TIPO Vta");  
             btnGuardarCompra.setBackground(Color.lightGray);
            return;
        }
        
        if(filaEmpresa==-1){
            showMessageDialog(this,"Seleccione empresa");
           limpiarcamposTransacciones();
            btnGuardarCompra.setBackground(Color.lightGray);
           return;
        }
        if(chkCCF.isSelected()&& filaClientes1==-1){
            showMessageDialog(this, "Seleccione CLIENTE para esta VENTA");
             btnGuardarCompra.setBackground(Color.lightGray);
            return;
        }
        
        if(campoDocVtaI.getText().isEmpty()){
            showMessageDialog(this, "ingrese # Inicial en Vta");
            campoDocVtaI.requestFocus();
             btnGuardarCompra.setBackground(Color.lightGray);
            return;
        }
       if((chkTKT.isSelected()||chkFCF.isSelected())&& campoDocVtaF.getText().isEmpty()){
            showMessageDialog(this, "ingrese # Final en Vta");
            campoDocVtaF.requestFocus();
             btnGuardarCompra.setBackground(Color.lightGray);
            return;
       }
         if(campoGravado.getText().isEmpty()){
            showMessageDialog(this, "valor Gravado es nulo \n"
                                              + "Puede Ingresar 0.00 si NO hay VTA");
            campoGravado.requestFocus();
             btnGuardarCompra.setBackground(Color.lightGray);
            return;
        }
        if(campoPercepcion.getText().isEmpty()){
            campoPercepcion.setText("0.00");
        }
        Calendar now = getInstance();
        Date fechaSistema = new Date();
        Date fechaProceso=calendario.getDate();
        
        out.println("fecha del sistema.. "+fechaSistema);
        out.println("Fecha digitacion... "+fechaProceso);
        int comparoFechas = fechaSistema.compareTo(fechaProceso);
        if(comparoFechas<0){
            showMessageDialog(this,"La Fecha de Venta MAYOR a Fecha del PC\n"
                                             + "No Puedo procesar este dato \n"                                             
                                             + "Verifique que fecha del PC sea Correcta..");
           return;
        }
        int mesActual = now.get(MONTH)+1;
        int ventaAnticipada = mesActual+1;
        int anno = now.get(YEAR);
        int mesdigita = calendario.getDate().getMonth()+1;
        out.println("mes en la pc.... "+mesActual);
        out.println("mes digitacion.. "+mesdigita);
        
        if(mesActual==mesdigita){
            showMessageDialog(this,"Estás ingresando una venta anticipada en mes.... "+(ventaAnticipada-1)
                                             +"\n"                                            
                                             + "Verifiquelo en Reporte Histórico............... \n"                                             
                                             + "La transaccion sera mostrada si PC = mes ...... " +ventaAnticipada);
            //limpiarcamposTransacciones();
        }
        
        Ventas ventas = new Ventas();
        Ventas ventasTKTFCF=new Ventas();
        if(chkTKT.isSelected()||chkFCF.isSelected()){
            Clientes clienteidTKT = em.find(Clientes.class,10 );
            ventas.setIdcliente(clienteidTKT);
            ventasTKTFCF.setIdcliente(clienteidTKT);
        }else{// seleccionar de tabla clientes
            int filaClientes = tablaClientes.getSelectedRow();
            String idclientes = tablaClientes.getValueAt(filaClientes, 0).toString();
            int idcliente1 = parseInt(idclientes);
            Clientes clienteid = em.find(Clientes.class,idcliente1 );
            ventas.setIdcliente(clienteid);
        }
       int filaClientes = tablaEmpresas.getSelectedRow();
       String idempresa = tablaEmpresas.getValueAt(filaClientes, 0).toString();
       int idempresa1 = parseInt(idempresa);
       Empresas empresaid=em.find(Empresas.class, idempresa1);
       ventas.setIdempresa(empresaid);
       ventasTKTFCF.setIdempresa(empresaid);
       if(chkTKT.isSelected()){
            ventas.setTipoventa("TKT");
            ventas.setGravado(new BigDecimal(CampoIva.getText()));
            ventas.setValorventa(new BigDecimal(campoTotalVta.getText()));
            ventas.setValoriva(new BigDecimal(campoPercepcion.getText()));
            ventas.setValorpercepcion(new BigDecimal(0.00));
            ventas.setNumdocvta(campoDocVtaI.getText());
            ventas.setFechaventa(calendario.getDate());
            ventas.setFechadigita(new Date());
            //**
            ventasTKTFCF.setTipoventa("TKT");// num final
            ventasTKTFCF.setGravado(new BigDecimal(0.00));
            ventasTKTFCF.setValorventa(new BigDecimal(0.00));
            ventasTKTFCF.setValoriva(new BigDecimal(0.00));
            ventasTKTFCF.setValorpercepcion(new BigDecimal(0.00));
            ventasTKTFCF.setNumdocvta(campoDocVtaF.getText());
            ventasTKTFCF.setFechaventa(calendario.getDate());
            ventasTKTFCF.setFechadigita(new Date());
       }
       if(chkFCF.isSelected()){
            ventas.setTipoventa("FCF");
            ventas.setGravado(new BigDecimal(CampoIva.getText()));
            ventas.setValorventa(new BigDecimal(campoTotalVta.getText()));
            ventas.setValoriva(new BigDecimal(campoPercepcion.getText()));
            ventas.setValorpercepcion(new BigDecimal(0.00));
            ventas.setNumdocvta(campoDocVtaI.getText());
            ventas.setFechaventa(calendario.getDate());
            ventas.setFechadigita(new Date());
            //***
            ventasTKTFCF.setTipoventa("FCF");//num final
            ventasTKTFCF.setGravado(new BigDecimal(0.00));
            ventasTKTFCF.setValorventa(new BigDecimal(0.00));
            ventasTKTFCF.setValoriva(new BigDecimal(0.00));
            ventasTKTFCF.setValorpercepcion(new BigDecimal(0.00));
            ventasTKTFCF.setNumdocvta(campoDocVtaF.getText());
            ventasTKTFCF.setFechaventa(calendario.getDate());
            ventasTKTFCF.setFechadigita(new Date());
       } 
       if(chkCCF.isSelected()){
            ventas.setTipoventa("CCF");
            ventas.setGravado(new BigDecimal(campoGravado.getText()));
            ventas.setValorventa(new BigDecimal(campoTotalVta.getText()));
            ventas.setValoriva(new BigDecimal(CampoIva.getText()));
            ventas.setValorpercepcion(new BigDecimal(campoPercepcion.getText()));
            ventas.setNumdocvta(campoDocVtaI.getText());
            ventas.setFechaventa(calendario.getDate());
            ventas.setFechadigita(new Date());
            incrementaDoc();
       }

       EntityTransaction tx = em.getTransaction();
       tx.begin();
        try {
            if(chkTKT.isSelected()||chkFCF.isSelected()){
               em.persist(ventasTKTFCF); 
            }
            em.persist(ventas);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
       
        try {
            cargarDatadigitada();
            //limpiarcamposTransacciones();
            irUltimoRegistro();
            btnGuardarCompra.setBackground(Color.lightGray);
            System.out.println("fecha actual calendario "+calendario.getDate());
            
            if(chkTKT.isSelected()||chkFCF.isSelected()){
                Calendar fechaHoy = calendario.getCalendar();
                fechaHoy.add(Calendar.DATE, 1);
                calendario.setDate(fechaHoy.getTime());
                limpiarcamposTransacciones();
            }
            if(chkCCF.isSelected()){
               // incrementaDoc();
            }
            
        } catch (ParseException ex) {
            
            getLogger(Ventas1.class.getName()).log(SEVERE, null, ex);
        }
        campoPercepcion.setBackground(Color.lightGray);
    }//GEN-LAST:event_btnGuardarCompraActionPerformed

    private void chkCCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCCFActionPerformed
        // TODO add your handling code here:
        tablaClientes.setEnabled(true);
        if(chkCCF.isSelected()){
            lblGravado_total.setText("Gravado");
            lblPercepcion.setText("Percep.");
            lbl_iva.setText("IVA");
            limpiarcamposTransacciones();
            campoDocVtaF.enable(false);
            limpiarCamposTotales();
            btnGuardarCompra.setBackground(Color.lightGray);
            try {
                cargarDatadigitada();
            } catch (ParseException ex) {
                Logger.getLogger(Ventas1.class.getName()).log(Level.SEVERE, null, ex);
            }
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

    private void campoSeleccionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeleccionClienteKeyTyped
        // TODO add your handling code here:
         campoSeleccionCliente.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoSeleccionCliente.getText());
                campoSeleccionCliente.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoSeleccionCliente.getText(), 1); // Busca nombre
                RowFilter filtro2 = regexFilter("(?i)"+campoSeleccionCliente.getText(), 2); // Busca Nombre
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                filtros.add(filtro2);
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
            try {
                lblGravado_total.setText("Valor Venta");
                lbl_iva.setText("Gravado");
                lblPercepcion.setText("IVA");
                limpiarcamposTransacciones();
                campoDocVtaF.enable();
                limpiarCamposTotales();
                btnGuardarCompra.setBackground(Color.lightGray);
                cargarDatadigitada();
                //limpiarcamposTransacciones();
            } catch (ParseException ex) {
                Logger.getLogger(Ventas1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_chkTKTActionPerformed

    private void chkFCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFCFActionPerformed
        // TODO add your handling code here:
        if(chkFCF.isSelected()){
            try {
                lblGravado_total.setText("Valor Venta");
                lbl_iva.setText("Gravado");
                lblPercepcion.setText("IVA");
                limpiarcamposTransacciones();
                campoDocVtaF.enable();
                btnGuardarCompra.setBackground(Color.lightGray);
                cargarDatadigitada();
            } catch (ParseException ex) {
                Logger.getLogger(Ventas1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_chkFCFActionPerformed

    private void tablaEmpresasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEmpresasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEmpresasKeyPressed

    private void tablaEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpresasMouseClicked
       
        try {
            limpiarCamposTotales();
            cargarDatadigitada();
            btnGuardarCompra.setBackground(Color.lightGray);
        } catch (ParseException ex) {
            showMessageDialog(this, "No hay Data");
            //Logger.getLogger(Ventas1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaEmpresasMouseClicked

    private void campoGravadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoGravadoKeyPressed
        // TODO add your handling code here:
        if(chkCCF.isSelected()){
            int filaEmpresa = tablaEmpresas.getSelectedRow();
            String esGranC = tablaEmpresas.getValueAt(filaEmpresa, 3).toString();
            //System.out.println("dame Gran Con "+gContribuyente);
            if(evt.getKeyCode()==VK_ENTER) {
                if(esGranC.equals("true")){
                    campoTotalPercepcion.setText("");
                    campoPercepcion.requestFocus();
                    campoPercepcion.setBackground(Color.green);
                }
                else{
                    campoPercepcion.setText("0.00");
                               btnGuardarCompra.requestFocus();
            btnGuardarCompra.setBackground(Color.green);
                }

        }
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
            showMessageDialog(this,"Seleccione Transaccion a ELIMINAR");
            return;
        }
        String idVta = tablaDatosIngresados.getValueAt(fila, 0).toString();
        int idVta1 = parseInt(idVta);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
        Ventas ventaBorrar = em.find(Ventas.class, idVta1);
        em.remove(ventaBorrar);
            tx.commit();
         } catch (Exception e){
            tx.rollback();
         }finally{
            em.close();
            
            campoBuscoTransaccion = new javax.swing.JTextField();
            campoBuscoTransaccion.setText("");
            try {
                cargarDatadigitada();
            } catch (ParseException ex) {
                getLogger(Ventas1.class.getName()).log(SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnEliminarTransaccActionPerformed

    private void btnConsuFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsuFinalActionPerformed
        int fila = tablaEmpresas.getSelectedRow();
        if(fila==-1){
            showMessageDialog(this,"Seleccione Empresa");
            return;
        }
        String idEmpresa = tablaEmpresas.getValueAt(fila, 0).toString();
        int idEmpresa1 = parseInt(idEmpresa);        
        Calendar now = getInstance();
        int mes = now.get(MONTH);
        int anno = now.get(YEAR);
        if(mes==0){
            anno -= 1;
            mes=12;
            out.println("nuevo ano mificado.... = "+anno);
        }
        //System.out.println("ano para REPORTE es .. "+anno);
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
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }
    }//GEN-LAST:event_btnConsuFinalActionPerformed

    private void btnCreditoFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoFiscalActionPerformed
        // TODO add your handling code here:
        int fila = tablaEmpresas.getSelectedRow();
        if(fila==-1){
            showMessageDialog(this,"Seleccione Empresa");
            btnGuardarCompra.setBackground(Color.lightGray);
            return;
        }
        String idEmpresa = tablaEmpresas.getValueAt(fila, 0).toString();
        int idEmpresa1 = parseInt(idEmpresa);        
        Calendar now = getInstance();
        int mes = now.get(MONTH);
        int anno = now.get(YEAR);
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
            valores.put ( "MES" , mes );
            valores.put ( "ANNO" , anno );
            valores.put ( "IDEMPRESA" , idEmpresa1 );
            JasperPrint jasperPrint = fillReport(reporte, valores, conn);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.toFront();
            viewer.setTitle("Reporte ventas a Contribuyentes");
            viewer.setSize(1_100, 600);
            viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            
            showMessageDialog(this,"Error en Base de datos");
        }
    }//GEN-LAST:event_btnCreditoFiscalActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void campoDocVtaIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocVtaIKeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            if(chkTKT.isSelected()|| chkFCF.isSelected())
            {
                campoDocVtaF.requestFocus();
            }
            else 
            {
                campoGravado.requestFocus();
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_campoDocVtaIKeyPressed

    private void campoDocVtaFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocVtaFKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode()==VK_ENTER){
           campoGravado.requestFocus();
       }
    }//GEN-LAST:event_campoDocVtaFKeyPressed

    private void calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_calendarioMouseClicked

    private void calendarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMousePressed
      
        campoDocVtaI.requestFocus();
    }//GEN-LAST:event_calendarioMousePressed

    private void calendarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarioKeyPressed

    private void calendarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calendarioFocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_calendarioFocusLost

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        this.dispose();

        ClientesToVentas contribuyentes1 = new ClientesToVentas();
        jDesktopPane1.add(contribuyentes1);
        //jDesktopPane1.getDesktopManager().maximizeFrame(contribuyentes1);
        contribuyentes1.setVisible(true);
        contribuyentes1.setIconifiable(true);
        contribuyentes1.setMaximizable(true);
        contribuyentes1.setClosable(true);
        contribuyentes1.setResizable(true); 
        contribuyentes1.toFront();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnGuardarCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarCompraKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode()==VK_ENTER) {
             btnGuardarCompra.doClick();
             btnGuardarCompra.setBackground(Color.lightGray);
            // btnIngresar.setBackground(Color.green);
         }
    }//GEN-LAST:event_btnGuardarCompraKeyPressed

    private void campoPercepcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPercepcionKeyTyped
        // TODO add your handling code here:
//        double ventaTotal = 0.00;
//        gravado=0.00;
          campoPercepcion.addKeyListener(new KeyAdapter() 
        {
            @Override
            
            public void keyReleased(final KeyEvent e) {
                double ventaTotal = 0.00;
                double gravado = 0.00;
                if(campoPercepcion.getText().isEmpty()){
                    return;
                }
                String gravado1 = campoGravado.getText();
                gravado=Double.parseDouble(gravado1);
                String percepcion1 = campoPercepcion.getText();
                
                double percepcion = Double.parseDouble(percepcion1);
                String iva1 = CampoIva.getText();
                double iva = Double.parseDouble(iva1);
                                      
                       ventaTotal=gravado+iva+percepcion;
                       campoTotalVta.setText(""+ventaTotal);
            }
        });
    }//GEN-LAST:event_campoPercepcionKeyTyped

    private void campoPercepcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPercepcionKeyPressed
             if(evt.getKeyCode()==VK_ENTER) {
             btnGuardarCompra.requestFocus();
            btnGuardarCompra.setBackground(Color.green);
             }
        
        
    }//GEN-LAST:event_campoPercepcionKeyPressed

    
    TableRowSorter trs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoIva;
    private javax.persistence.EntityManager ContadorPUEntityManager;
    private javax.swing.JToggleButton btnConsuFinal;
    private javax.swing.JToggleButton btnCreditoFiscal;
    private javax.swing.JToggleButton btnEliminarTransacc;
    private javax.swing.JButton btnGuardarCompra;
    private javax.swing.JToggleButton btnNuevoCliente;
    private javax.swing.JToggleButton btnSalir;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JTextField campoBuscoTransaccion;
    private javax.swing.JTextField campoDocVtaF;
    private javax.swing.JTextField campoDocVtaI;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDataIng;
    private javax.swing.JLabel lblGravado_total;
    private javax.swing.JLabel lblPercepcion;
    private javax.swing.JLabel lblPpal;
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
    campoDocVtaF.setText("");
    campoDocVtaI.setText("");
    campoDocVtaI.requestFocus();
    btnGuardarCompra.setBackground(Color.lightGray);
    }

    private void incrementaDoc() {
        int correlativo = parseInt(campoDocVtaI.getText());
        correlativo += 1;
        campoDocVtaI.setText(""+correlativo);
        limpiarcamposTransaccionesCCF();
    }

    private void cargarDatadigitada() throws ParseException {
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        int filaempresa = tablaEmpresas.getSelectedRow();
        if(filaempresa==-1){
            showMessageDialog(this, "Seleccione Empresa");
            return;
        }
        String idempresa = tablaEmpresas.getValueAt(filaempresa, 2).toString();
        String nombreEmpresa = tablaEmpresas.getValueAt(filaempresa, 1).toString();
        
       
        lblDataIng.setText("Datos Ingresados a:  ".concat(nombreEmpresa));
        lblPpal.setText("Procesando Ventas Empresa: >> ".concat(nombreEmpresa));
        btnGuardarCompra.setBackground(Color.lightGray);
        double totalPercepcion = 0.00;
        double totalIva = 0.00;
        double totalVentas = 0.00;
        double totalGravado = 0.00;
        DefaultTableModel tablaFactura = (DefaultTableModel) tablaDatosIngresados.getModel();
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
        Calendar now = getInstance();
		out.println("Fecha actual  " +(now.get(MONTH) + 1));
        try {//limpiando tabla ventas para CCF
           DefaultTableModel temp = (DefaultTableModel) tablaDatosIngresados.getModel();
           int a = temp.getRowCount();
           for (int i = 0; i < a; i++) {
                temp.removeRow(0);
            }
        } catch (Exception e) {
        }
         Query query;
        query = em.createQuery("Select v from Ventas v where (v.idempresa.ncr = :empresabuscar) AND v.tipoventa = :tipovta order by v.fechaventa asc")
                .setParameter("empresabuscar", idempresa)
                .setParameter("tipovta", tipovta) ;
      List<Ventas> list=query.getResultList();
        int mesDigitado = now.get(MONTH);
      for(Ventas ventas:list)
      {
            Date fechaVenta = ventas.getFechaventa();
            out.println(" fecha de venta es "+fechaVenta);
            int mesdig = fechaVenta.getMonth()+1;
            int mesVta=now.get(MONTH);
            if(mesdig==12){
                mesVta=12;
            }
            out.println("MES ACTUAL ES "+mesVta);
            if(mesdig==mesVta)
            {
                String idvta = ventas.getIdventa().toString();
                String nomEmpresa = ventas.getIdempresa().getNombre();
                String fechaVenta1=ventas.getFechaventa().toLocaleString();
                String numDoc = ventas.getNumdocvta();
                String tipoVta = ventas.getTipoventa();
                String grav = ventas.getGravado().toString();
                String iva = ventas.getValoriva().toString();
                String percep = ventas.getValorpercepcion().toString();
                String percep1 = ventas.getValorventa().toString();
                Object FilaElemento[] = {idvta, fechaVenta1, numDoc, tipoVta, grav, iva, percep, percep1 };
                tablaFactura.addRow(FilaElemento);
                totalIva += parseDouble(iva);
                totalPercepcion += parseDouble(percep);
                totalVentas += parseDouble(percep1);
                totalGravado += parseDouble(grav);
                campoTotalGravado.setText(""+format("%.2f",totalGravado));
                campoTotalIva.setText(""+format("%.2f",totalIva));
                campoTotalPercepcion.setText(""+format("%.2f",totalPercepcion));
                campoTotalTotales.setText(""+format("%.2f",totalVentas));
            }
      }
        int lineasTablaData = tablaDatosIngresados.getRowCount();
        tablaDatosIngresados.getSelectionModel().setSelectionInterval(lineasTablaData-1,lineasTablaData-1);
    }

    private void limpiarCamposTotales() {
    campoTotalGravado.setText("0.00");
    campoTotalIva.setText("0.00");
    campoTotalPercepcion.setText("0.00");
    campoTotalTotales.setText("0.00");
    campoDocVtaI.setText("");
    campoDocVtaF.setText("");
    }

    private void limpiarcamposTransaccionesCCF() {
        CampoIva.setText("0.00");
    campoGravado.setText("");
    campoTotalVta.setText("0.00");
    campoPercepcion.setText("0.00");
    campoDocVtaF.setText("");
    //campoDocVtaI.setText("");
    campoDocVtaI.requestFocus();
    }

    private void irUltimoRegistro() {
    // para presentar en tabla digitacion ultimo rec ingresado    
    tablaDatosIngresados.scrollRectToVisible(tablaDatosIngresados.getCellRect(tablaDatosIngresados.getRowCount()-1, 0, true));

}
    private static final Logger LOG = Logger.getLogger(Ventas1.class.getName());

}
