package sv.com.pereira.gui;

import static java.awt.EventQueue.invokeLater;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.lang.Class.forName;
import static java.lang.String.format;
import static java.lang.System.exit;
import java.net.InetAddress;
import static java.net.InetAddress.getLocalHost;
import java.net.NetworkInterface;
import static java.net.NetworkInterface.getByInetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static org.apache.commons.codec.digest.DigestUtils.md5Hex;
import pojos.Pcs;
import static sv.com.pereira.gui.Principal.campoUsuarioActivo;
import pojos.Usuarios;

public class logueo extends javax.swing.JFrame {

    public JFrame Ingresando;

    public String flagTipoUsuario; 

    public int flagUsuario;

    public int flagClave;

    public int flagAprobado;

    public String tipousuario;


    public String nombreEmpleado;

  
    public static String nombreEmpleadoqueIngresa;
   int idUserParaSesion = 0;
   int idterminalParaSesion = 0;

    public int pcs1=0;
   String vocales="";

    public logueo() throws SocketException {
        initComponents();
       // Image icon = getDefaultToolkit().getImage(getClass().getResource("/sv/com/pereira/gui/folderIco/marca1.png"));
       // setIconImage(icon);

         this.setLocationRelativeTo(null);
       }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoUsuario = new javax.swing.JTextField();
        campoPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setIconImages(null);
        setName("frmIngresar"); // NOI18N

        campoUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        campoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoUsuarioKeyTyped(evt);
            }
        });

        campoPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPasswordKeyPressed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llaveEstrella.gif"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digite los datos");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(campoPassword)))
                            .addComponent(btnIngresar))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngresar))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            String driverName = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.1.10:5432/contabledb";
            String usuario = "postgres";
            String passwd = "root";
            forName(driverName);
            Connection conn = getConnection(url, usuario, passwd);
            if (conn != null) {
               // JOptionPane.showMessageDialog(null, "Conexión establecida con éxito!!", "suceso", JOptionPane.INFORMATION_MESSAGE);
                conn.close();
                //return conn;
            }
        } catch (ClassNotFoundException exc) {
            showMessageDialog(null, "No se encontró el Driver de la BD", "Error", ERROR_MESSAGE);
        } catch (SQLException e) {
            showMessageDialog(null, "No encuentro conexion a server \n"
                                               + "       Revise su direccion IP    \n"
                                               + "       *************************\n"
                                               + "O contacte para asistencia Tecnica\n"
                                               + "Tel. 7230 - 1884 *** 2658 - 8265", "Error", ERROR_MESSAGE);
            return;
        }
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        String usuarioEncrip=campoUsuario.getText(); 
        String usuarioEncriptado=md5Hex(usuarioEncrip); 
        String paswordEncrip=campoPassword.getText(); 
        String passwordEncriptado=md5Hex(paswordEncrip); 
        int idusuarioQIngresa = 0;
        String pcsmac = "";
        InetAddress direccion = null;// obteniendo ip locAL
        try {
            direccion = getLocalHost();
        } catch (UnknownHostException ex) {
            //getLogger(AdministracionCaja.class.getName()).log(SEVERE, null, ex);
        }
        try {
            NetworkInterface red=getByInetAddress(direccion);
            byte[] mac = red.getHardwareAddress();
            StringBuilder sb= new StringBuilder();
            
            
            for (int i = 0; i < mac.length; i++) {
                sb.append(format("%02x%s", mac[i],(i<mac.length -1)?"-":"" ));
             }
            pcsmac = ""+sb;
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(this, "Error de red");
            //getLogger(logueo.class.getName()).log(SEVERE, null, ex);
        }
       List<Pcs>resultList1=em.createQuery("Select p from Pcs p",Pcs.class).getResultList();
       for( Pcs next:resultList1){
            String pcs = next.getPcs();
            if(pcsmac.equals(pcs)) {
                pcs1=1;
            }
        }
       if(campoUsuario.getText().equals("pcs")&& campoPassword.getText().equals("pcs")){
               Pcs pcs=new Pcs();
               em.persist(pcs);
           try {
                em.getTransaction().begin();
                pcs.setPcs(pcsmac);
                em.persist(pcs);
                em.getTransaction().commit();
           }
           catch (Exception e) {
           }finally {
           }
       }
       if(pcs1==0){
            showMessageDialog(this,"Esta ejecutando Software sin adquirir LICENCIA\n"
                                             + "** contacte a Pereira Computer Services **\n"
                                             + "Tel.  :  (503)2658 - 8265\n"
                                             + "e-mail:  pereira1003@gmail.com");
            exit(0);       
        }
        List<Usuarios>resultList=em.createQuery("Select u from Usuarios u",Usuarios.class).getResultList();
        Usuarios usuarioencontrado = null;
        Usuarios idUserEncontrado = null;
        for(Usuarios next:resultList){
            usuarioencontrado = next;
            flagTipoUsuario = usuarioencontrado.getNombre();
            String usuario = usuarioencontrado.getUsuario();
            nombreEmpleado=usuario;
            String contrasenna = usuarioencontrado.getPassw();
            if(usuarioEncriptado.equals(usuario)){
                flagUsuario=1;
              }
            if(passwordEncriptado.equals(contrasenna)){
                flagClave=1;
                break;
            }
        }
        if(flagClave==1 && flagUsuario==1)
        {
            flagAprobado=1;
            Principal principal=new Principal();
            principal.setVisible(true);
            principal.campoUsuarioActivo.setText("Bienvenido/a a sus labores:.... ".concat(usuarioencontrado.getNombre()));
            dispose();
        }else
        {
            showMessageDialog(this,"No puedo Autorizar Ingreso al Sistema\n sus datos no son correctos");
            campoUsuario.setText("");
            campoPassword.setText("");
            campoUsuario.requestFocus();
        }//** FIN COMPARANDO BANDERAS DE ACCESO
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void campoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuarioKeyPressed
        
        
        if(evt.getKeyCode()==VK_ENTER) {
            campoPassword.requestFocus();
        }
    }//GEN-LAST:event_campoUsuarioKeyPressed

    private void campoPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPasswordKeyPressed
         if(evt.getKeyCode()==VK_ENTER) {
             btnIngresar.requestFocus();
         }
    }//GEN-LAST:event_campoPasswordKeyPressed

    private void campoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuarioKeyTyped
       
    }//GEN-LAST:event_campoUsuarioKeyTyped

  
    public static void main(String args[]) {
        invokeLater(() -> {
            try {
                new logueo().setVisible(true);
            } catch (SocketException ex) {
                getLogger(logueo.class.getName()).log(SEVERE, null, ex);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    public static javax.swing.JPasswordField campoPassword;
    public static javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(logueo.class.getName());
 
 
}
