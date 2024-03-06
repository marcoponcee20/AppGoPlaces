/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package goplaces;

import java.sql.Blob;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.util.JRLoader;
import java.awt.Image;
import java.io.FileInputStream;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

public class Login extends JFrame {

    ImageIcon Imagen[] = new ImageIcon[6];
    int contador = 1;
    String carpeta = "/ciudades/";
    String nombre = "img";
    String extension = ".jpg";
    Statement st;
    Connection conexion;
    ResultSet rs = null;
    String idioma = "Español";
    int aleatorio = 1;

    public JDialog getDlgPerfil() throws SQLException {
        dlgAjustes.dispose();
        ingles();

        dlgPerfil.setVisible(true);
        dlgPerfil.setSize(1550, 825);
        return dlgPerfil;
    }

    public JDialog getDlgAnadir() throws SQLException {
        dlgAjustes.dispose();
        ingles();
        dlgAnadir.setVisible(true);
        dlgAnadir.setSize(1500, 825);
        return dlgAnadir;
    }

    public JDialog getDlgMenu() {
        dlgAjustes.dispose();
        dlgMenu.setVisible(true);
        dlgMenu.setSize(1500, 750);
        return dlgMenu;
    }

    public JDialog getDlgConsultar() {
        dlgAjustes.dispose();
        dlgConsultar.setVisible(true);
        dlgConsultar.setSize(1550, 825);
        return dlgConsultar;
    }

    public Login() {
        initComponents();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/goplaces", "root", "");
            st = conexion.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 1; i < 6; i++) {
            this.aleatorio = (int) (Math.random() * 5 + 1);
            String nombreEntero = nombre + i + extension;
            String rutatotal = carpeta + nombreEntero;
            Imagen[i] = new ImageIcon(getClass().getResource(rutatotal));

        }
        lblFotos.setIcon(Imagen[aleatorio]);
        this.ocultar1.setVisible(false);
        this.ocultarR.setVisible(false);
        ocultarAjustes.setVisible(false);
        lblCamposVacios.setVisible(false);
        lblCamposVaciosRegistro.setVisible(false);
        lblLugar.setVisible(false);
        lblLugar2.setVisible(false);
        lblLugar3.setVisible(false);
        lblLugar4.setVisible(false);
        lblLugar5.setVisible(false);
        lblLugar6.setVisible(false);
        txtLugarAnadir.setVisible(false);
        txtLugarAnadir2.setVisible(false);
        txtLugarAnadir3.setVisible(false);
        txtLugarAnadir4.setVisible(false);
        txtLugarAnadir5.setVisible(false);
        txtLugarAnadir6.setVisible(false);
        lblComprobarContrasena.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgRegistro = new javax.swing.JDialog();
        pnlRegistroFondo = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        verR = new javax.swing.JLabel();
        ocultarR = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNombreRegistro = new javax.swing.JLabel();
        txtUsuarioRegistro = new javax.swing.JTextField();
        lblContraRegistro = new javax.swing.JLabel();
        txtContraRegistro = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        lblCamposVaciosRegistro = new javax.swing.JLabel();
        dlgMenu = new javax.swing.JDialog();
        pnlMenuFondo = new javax.swing.JPanel();
        pnlAjustes = new javax.swing.JPanel();
        lblajustes = new javax.swing.JLabel();
        lblFajustes = new javax.swing.JLabel();
        lblNombreapp = new javax.swing.JLabel();
        pnlAnadir = new javax.swing.JPanel();
        lblanadir = new javax.swing.JLabel();
        lblFanadir = new javax.swing.JLabel();
        pnlConsultar = new javax.swing.JPanel();
        lblconsultar = new javax.swing.JLabel();
        lblFconsultar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        pnlPerfil = new javax.swing.JPanel();
        lblperfil = new javax.swing.JLabel();
        lblFperfil = new javax.swing.JLabel();
        lblFotos = new javax.swing.JLabel();
        lblexplicar = new javax.swing.JLabel();
        lblAcercade = new javax.swing.JLabel();
        dlgPerfil = new javax.swing.JDialog();
        pnlPerfilFondo = new javax.swing.JPanel();
        lblNombreusuario = new javax.swing.JLabel();
        pnlHotel = new javax.swing.JPanel();
        scpHotel = new javax.swing.JScrollPane();
        txtAHoteles = new javax.swing.JTextArea();
        pnlRestuarante = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtARestaurante = new javax.swing.JTextArea();
        pnlMonumentos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAMonumento = new javax.swing.JTextArea();
        pnlMuseos = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAMuseo = new javax.swing.JTextArea();
        lblPerfilAtras = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        dlgAnadir = new javax.swing.JDialog();
        pnlAnadirFondo = new javax.swing.JPanel();
        pnlFormulario = new javax.swing.JPanel();
        lblpregunta = new javax.swing.JLabel();
        cmbEstacionamiento = new javax.swing.JComboBox<>();
        lblLugar = new javax.swing.JLabel();
        txtLugarAnadir2 = new javax.swing.JTextField();
        lblCuantos = new javax.swing.JLabel();
        spNumero = new javax.swing.JSpinner();
        lblLugar2 = new javax.swing.JLabel();
        lblLugar3 = new javax.swing.JLabel();
        lblLugar4 = new javax.swing.JLabel();
        lblLugar5 = new javax.swing.JLabel();
        lblLugar6 = new javax.swing.JLabel();
        txtLugarAnadir3 = new javax.swing.JTextField();
        txtLugarAnadir = new javax.swing.JTextField();
        txtLugarAnadir4 = new javax.swing.JTextField();
        txtLugarAnadir6 = new javax.swing.JTextField();
        txtLugarAnadir5 = new javax.swing.JTextField();
        btnAnadirLugar = new javax.swing.JButton();
        lblgif = new javax.swing.JLabel();
        lblpreguntaciudad = new javax.swing.JLabel();
        txtNombreCiudadAnadir = new javax.swing.JTextField();
        lblTituloAnadir = new javax.swing.JLabel();
        lblAnadirAtras = new javax.swing.JLabel();
        dlgConsultar = new javax.swing.JDialog();
        pnlConsultarFondo = new javax.swing.JPanel();
        lblTituloConsultar = new javax.swing.JLabel();
        lblConsultarAtras = new javax.swing.JLabel();
        pnlFiltros = new javax.swing.JPanel();
        lblFiltros = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscarFiltros = new javax.swing.JButton();
        txtBusquedaUsuario = new javax.swing.JTextField();
        btnBusquedaPorUsuario = new javax.swing.JButton();
        lblBusquedaUsuario = new javax.swing.JLabel();
        rbHotel = new javax.swing.JRadioButton();
        rbRestaurante = new javax.swing.JRadioButton();
        rbMuseo = new javax.swing.JRadioButton();
        rbMonumento = new javax.swing.JRadioButton();
        pnlResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAResultadosBusqueda = new javax.swing.JTextArea();
        txtBusqueda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnInforme = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        dlgAjustes = new javax.swing.JDialog();
        pnlAjusetsFondo = new javax.swing.JPanel();
        lblContraAjustes = new javax.swing.JLabel();
        passNueva = new javax.swing.JPasswordField();
        passNuevaConfirmar = new javax.swing.JPasswordField();
        lblContraAjustesConfirmar = new javax.swing.JLabel();
        btnContraUno = new javax.swing.JButton();
        lblElegirIdioma = new javax.swing.JLabel();
        cmbIdioma = new javax.swing.JComboBox<>();
        cmbColor = new javax.swing.JComboBox<>();
        lblTema = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCerrarSesionAjustes = new javax.swing.JLabel();
        btnCambiarContraseña = new javax.swing.JButton();
        lblBorrarCuenta = new javax.swing.JLabel();
        componenteMenu1 = new goplaces.ComponenteMenu();
        ocultarAjustes = new javax.swing.JLabel();
        verAjustes = new javax.swing.JLabel();
        lblComprobarContrasena = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlIniciarSesionFondo = new javax.swing.JPanel();
        pnlIniciarSesion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ocultar1 = new javax.swing.JLabel();
        btnInicio1 = new javax.swing.JButton();
        txtUsuarioLogin = new javax.swing.JTextField();
        lblCamposVacios = new javax.swing.JLabel();
        btnRegistroLogin = new javax.swing.JButton();
        txtContraLogin = new javax.swing.JPasswordField();
        lblNombreUsuario = new javax.swing.JLabel();
        ver1 = new javax.swing.JLabel();
        lblPasswordUsuario = new javax.swing.JLabel();

        dlgRegistro.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgRegistro.setTitle("Registro-GoPlaces");
        dlgRegistro.setBackground(new java.awt.Color(204, 0, 51));

        pnlRegistroFondo.setBackground(new java.awt.Color(0, 117, 0));

        pnlRegistro.setBackground(new java.awt.Color(90, 243, 90));
        pnlRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N

        verR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        verR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verRMouseClicked(evt);
            }
        });

        ocultarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invisible.png"))); // NOI18N
        ocultarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarRMouseClicked(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GOPLACES");

        lblNombreRegistro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNombreRegistro.setText("NOMBRE*");

        txtUsuarioRegistro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtUsuarioRegistro.setToolTipText("Ingrese aquí tu nombre de usuario");

        lblContraRegistro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblContraRegistro.setText("CONTRASEÑA*");

        txtContraRegistro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtContraRegistro.setToolTipText("Ingrese aquí su contraseña");

        btnRegistro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroBTNrEGISTROActionPerformed(evt);
            }
        });
        btnRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistroKeyPressed(evt);
            }
        });

        lblCamposVaciosRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamposVaciosRegistro.setText("Por favor rellene todos los campos para completar el registro");

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroLayout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCamposVaciosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblContraRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtContraRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                            .addComponent(lblNombreRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ocultarR, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verR)))
                .addGap(168, 168, 168))
            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegistroLayout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(495, Short.MAX_VALUE)))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblNombreRegistro)
                .addGap(10, 10, 10)
                .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblContraRegistro)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtContraRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ocultarR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(verR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblCamposVaciosRegistro)
                .addGap(38, 38, 38)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegistroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo)
                    .addContainerGap(535, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlRegistroFondoLayout = new javax.swing.GroupLayout(pnlRegistroFondo);
        pnlRegistroFondo.setLayout(pnlRegistroFondoLayout);
        pnlRegistroFondoLayout.setHorizontalGroup(
            pnlRegistroFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroFondoLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        pnlRegistroFondoLayout.setVerticalGroup(
            pnlRegistroFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroFondoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgRegistroLayout = new javax.swing.GroupLayout(dlgRegistro.getContentPane());
        dlgRegistro.getContentPane().setLayout(dlgRegistroLayout);
        dlgRegistroLayout.setHorizontalGroup(
            dlgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistroFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgRegistroLayout.setVerticalGroup(
            dlgRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistroFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgMenu.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgMenu.setTitle("Menú-GoPlaces");
        dlgMenu.setBackground(new java.awt.Color(0, 0, 0));
        dlgMenu.setForeground(new java.awt.Color(255, 255, 255));
        dlgMenu.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                dlgMenuWindowClosing(evt);
            }
        });

        pnlMenuFondo.setBackground(new java.awt.Color(0, 117, 0));

        pnlAjustes.setBackground(new java.awt.Color(90, 243, 90));
        pnlAjustes.setToolTipText("Consulta los ajustes de tu cuenta");
        pnlAjustes.setPreferredSize(new java.awt.Dimension(213, 52));
        pnlAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAjustesMouseClicked(evt);
            }
        });

        lblajustes.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblajustes.setText("AJUSTES DE LA CUENTA");
        lblajustes.setPreferredSize(new java.awt.Dimension(64, 21));

        lblFajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings .png"))); // NOI18N

        javax.swing.GroupLayout pnlAjustesLayout = new javax.swing.GroupLayout(pnlAjustes);
        pnlAjustes.setLayout(pnlAjustesLayout);
        pnlAjustesLayout.setHorizontalGroup(
            pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAjustesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblFajustes)
                .addGap(43, 43, 43)
                .addComponent(lblajustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );
        pnlAjustesLayout.setVerticalGroup(
            pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAjustesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFajustes, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lblajustes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblNombreapp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNombreapp.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreapp.setText("GOPLACES");
        lblNombreapp.setToolTipText("¡Aquí podrás  viajar con comodida y sin miedo de no conocer algun lugar!");

        pnlAnadir.setBackground(new java.awt.Color(90, 243, 90));
        pnlAnadir.setToolTipText("Añade  el nombre de una selección de museos, restaurantes, hoteles y monumentos impresionantes.");
        pnlAnadir.setPreferredSize(new java.awt.Dimension(213, 52));
        pnlAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAnadirMouseClicked(evt);
            }
        });

        lblanadir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblanadir.setText("AÑADIR LUGAR");

        lblFanadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N

        javax.swing.GroupLayout pnlAnadirLayout = new javax.swing.GroupLayout(pnlAnadir);
        pnlAnadir.setLayout(pnlAnadirLayout);
        pnlAnadirLayout.setHorizontalGroup(
            pnlAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnadirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblFanadir)
                .addGap(48, 48, 48)
                .addComponent(lblanadir, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        pnlAnadirLayout.setVerticalGroup(
            pnlAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnadirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblanadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAnadirLayout.createSequentialGroup()
                        .addComponent(lblFanadir)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlConsultar.setBackground(new java.awt.Color(90, 243, 90));
        pnlConsultar.setToolTipText("Consulta una gran variedad de lugares fascinantes: museos, monumentos,hoteles,restaurantes");
        pnlConsultar.setPreferredSize(new java.awt.Dimension(213, 52));
        pnlConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsultarMouseClicked(evt);
            }
        });

        lblconsultar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblconsultar.setText("CONSULTAR LUGAR");
        lblconsultar.setPreferredSize(new java.awt.Dimension(64, 21));

        lblFconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N

        javax.swing.GroupLayout pnlConsultarLayout = new javax.swing.GroupLayout(pnlConsultar);
        pnlConsultar.setLayout(pnlConsultarLayout);
        pnlConsultarLayout.setHorizontalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblFconsultar)
                .addGap(46, 46, 46)
                .addComponent(lblconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        pnlConsultarLayout.setVerticalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblconsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        lblBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblBienvenida.setText("BIENVENID@ NombreDelUsuario");

        lblSalir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblSalir.setText("Salir");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        pnlPerfil.setBackground(new java.awt.Color(90, 243, 90));
        pnlPerfil.setToolTipText("Consulta tu perfil de usuario");
        pnlPerfil.setPreferredSize(new java.awt.Dimension(213, 52));
        pnlPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPerfilMouseClicked(evt);
            }
        });

        lblperfil.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblperfil.setText("PERFIL DE USUARIO");

        lblFperfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfilMenu (2).png"))); // NOI18N

        javax.swing.GroupLayout pnlPerfilLayout = new javax.swing.GroupLayout(pnlPerfil);
        pnlPerfil.setLayout(pnlPerfilLayout);
        pnlPerfilLayout.setHorizontalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblFperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblperfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
        pnlPerfilLayout.setVerticalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPerfilLayout.createSequentialGroup()
                        .addComponent(lblperfil, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lblFperfil, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
        );

        lblFotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotosMouseClicked(evt);
            }
        });

        lblexplicar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblexplicar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexplicar.setText("Explora aquí abajo algunos increibles lugares del mundo con un solo clic");

        lblAcercade.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAcercade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcercade.setText("Acerca de...");
        lblAcercade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAcercadeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuFondoLayout = new javax.swing.GroupLayout(pnlMenuFondo);
        pnlMenuFondo.setLayout(pnlMenuFondoLayout);
        pnlMenuFondoLayout.setHorizontalGroup(
            pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuFondoLayout.createSequentialGroup()
                        .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAcercade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(pnlConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(pnlAnadir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(pnlAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombreapp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                            .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                                .addComponent(lblexplicar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuFondoLayout.createSequentialGroup()
                        .addComponent(lblFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        pnlMenuFondoLayout.setVerticalGroup(
            pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreapp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuFondoLayout.createSequentialGroup()
                        .addComponent(pnlPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(pnlAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(pnlConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(pnlMenuFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAcercade)
                    .addComponent(lblSalir))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgMenuLayout = new javax.swing.GroupLayout(dlgMenu.getContentPane());
        dlgMenu.getContentPane().setLayout(dlgMenuLayout);
        dlgMenuLayout.setHorizontalGroup(
            dlgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgMenuLayout.setVerticalGroup(
            dlgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgPerfil.setTitle("Perfil-GoPlaces");

        pnlPerfilFondo.setBackground(new java.awt.Color(0, 117, 0));

        lblNombreusuario.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreusuario.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        lblNombreusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreusuario.setText("NOMBRE USUARIO ");

        pnlHotel.setBackground(new java.awt.Color(90, 243, 90));
        pnlHotel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hoteles introducidos por usted", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        txtAHoteles.setBackground(new java.awt.Color(90, 243, 90));
        txtAHoteles.setColumns(20);
        txtAHoteles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAHoteles.setRows(5);
        txtAHoteles.setEnabled(false);
        scpHotel.setViewportView(txtAHoteles);

        javax.swing.GroupLayout pnlHotelLayout = new javax.swing.GroupLayout(pnlHotel);
        pnlHotel.setLayout(pnlHotelLayout);
        pnlHotelLayout.setHorizontalGroup(
            pnlHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHotelLayout.createSequentialGroup()
                .addComponent(scpHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHotelLayout.setVerticalGroup(
            pnlHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHotelLayout.createSequentialGroup()
                .addComponent(scpHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlRestuarante.setBackground(new java.awt.Color(90, 243, 90));
        pnlRestuarante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Restaurantes introducidos por usted", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18))); // NOI18N

        txtARestaurante.setColumns(20);
        txtARestaurante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtARestaurante.setRows(5);
        txtARestaurante.setEnabled(false);
        jScrollPane2.setViewportView(txtARestaurante);

        javax.swing.GroupLayout pnlRestuaranteLayout = new javax.swing.GroupLayout(pnlRestuarante);
        pnlRestuarante.setLayout(pnlRestuaranteLayout);
        pnlRestuaranteLayout.setHorizontalGroup(
            pnlRestuaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestuaranteLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlRestuaranteLayout.setVerticalGroup(
            pnlRestuaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestuaranteLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMonumentos.setBackground(new java.awt.Color(90, 243, 90));
        pnlMonumentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monumentos introducidos por usted", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 18))); // NOI18N

        txtAMonumento.setColumns(20);
        txtAMonumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAMonumento.setRows(5);
        txtAMonumento.setEnabled(false);
        jScrollPane3.setViewportView(txtAMonumento);

        javax.swing.GroupLayout pnlMonumentosLayout = new javax.swing.GroupLayout(pnlMonumentos);
        pnlMonumentos.setLayout(pnlMonumentosLayout);
        pnlMonumentosLayout.setHorizontalGroup(
            pnlMonumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMonumentosLayout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        pnlMonumentosLayout.setVerticalGroup(
            pnlMonumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMonumentosLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMuseos.setBackground(new java.awt.Color(90, 243, 90));
        pnlMuseos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Museos introducidos por usted", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N

        txtAMuseo.setColumns(20);
        txtAMuseo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAMuseo.setRows(5);
        txtAMuseo.setEnabled(false);
        jScrollPane4.setViewportView(txtAMuseo);

        javax.swing.GroupLayout pnlMuseosLayout = new javax.swing.GroupLayout(pnlMuseos);
        pnlMuseos.setLayout(pnlMuseosLayout);
        pnlMuseosLayout.setHorizontalGroup(
            pnlMuseosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMuseosLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMuseosLayout.setVerticalGroup(
            pnlMuseosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMuseosLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblPerfilAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        lblPerfilAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilAtrasMouseClicked(evt);
            }
        });

        lblFotoPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoPerfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPerfilFondoLayout = new javax.swing.GroupLayout(pnlPerfilFondo);
        pnlPerfilFondo.setLayout(pnlPerfilFondoLayout);
        pnlPerfilFondoLayout.setHorizontalGroup(
            pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPerfilFondoLayout.createSequentialGroup()
                .addGroup(pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPerfilFondoLayout.createSequentialGroup()
                        .addComponent(lblPerfilAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPerfilFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlMonumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addGroup(pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRestuarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMuseos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(pnlPerfilFondoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblNombreusuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPerfilFondoLayout.setVerticalGroup(
            pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPerfilFondoLayout.createSequentialGroup()
                .addGroup(pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPerfilFondoLayout.createSequentialGroup()
                        .addComponent(lblPerfilAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addComponent(lblFotoPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRestuarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlPerfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMonumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMuseos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout dlgPerfilLayout = new javax.swing.GroupLayout(dlgPerfil.getContentPane());
        dlgPerfil.getContentPane().setLayout(dlgPerfilLayout);
        dlgPerfilLayout.setHorizontalGroup(
            dlgPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPerfilFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgPerfilLayout.setVerticalGroup(
            dlgPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPerfilFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgAnadir.setTitle("Añadir-GoPlaces");

        pnlAnadirFondo.setBackground(new java.awt.Color(0, 117, 0));

        pnlFormulario.setBackground(new java.awt.Color(90, 243, 90));
        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AÑADIR LUGAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        lblpregunta.setBackground(new java.awt.Color(255, 255, 255));
        lblpregunta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblpregunta.setForeground(new java.awt.Color(0, 0, 0));
        lblpregunta.setText("¿Qué deseas añadir?");

        cmbEstacionamiento.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbEstacionamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lugares", "Hotel", "Museo", "Restaurante", "Monumento" }));
        cmbEstacionamiento.setName("Lugares"); // NOI18N
        cmbEstacionamiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstacionamientoItemStateChanged(evt);
            }
        });

        lblLugar.setBackground(new java.awt.Color(255, 255, 255));
        lblLugar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLugar.setForeground(new java.awt.Color(0, 0, 0));
        lblLugar.setText("jLabel27");

        txtLugarAnadir2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLugarAnadir2.setToolTipText("Escribe aqui el nombre del lugar que deseas añadir");

        lblCuantos.setBackground(new java.awt.Color(255, 255, 255));
        lblCuantos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCuantos.setForeground(new java.awt.Color(0, 0, 0));
        lblCuantos.setText("¿Cuántos?");

        spNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        spNumero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spNumeroStateChanged(evt);
            }
        });

        lblLugar2.setBackground(new java.awt.Color(255, 255, 255));
        lblLugar2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLugar2.setForeground(new java.awt.Color(0, 0, 0));
        lblLugar2.setText("jLabel28");

        lblLugar3.setBackground(new java.awt.Color(255, 255, 255));
        lblLugar3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLugar3.setForeground(new java.awt.Color(0, 0, 0));
        lblLugar3.setText("jLabel28");

        lblLugar4.setBackground(new java.awt.Color(255, 255, 255));
        lblLugar4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLugar4.setForeground(new java.awt.Color(0, 0, 0));
        lblLugar4.setText("jLabel28");

        lblLugar5.setBackground(new java.awt.Color(255, 255, 255));
        lblLugar5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLugar5.setForeground(new java.awt.Color(0, 0, 0));
        lblLugar5.setText("jLabel28");

        lblLugar6.setBackground(new java.awt.Color(255, 255, 255));
        lblLugar6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLugar6.setForeground(new java.awt.Color(0, 0, 0));
        lblLugar6.setText("jLabel28");

        txtLugarAnadir3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLugarAnadir3.setToolTipText("Escribe aqui el nombre del lugar que deseas añadir");

        txtLugarAnadir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLugarAnadir.setToolTipText("Escribe aqui el nombre del lugar que deseas añadir");
        txtLugarAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarAnadirActionPerformed(evt);
            }
        });

        txtLugarAnadir4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLugarAnadir4.setToolTipText("Escribe aqui el nombre del lugar que deseas añadir");

        txtLugarAnadir6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLugarAnadir6.setToolTipText("Escribe aqui el nombre del lugar que deseas añadir");

        txtLugarAnadir5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLugarAnadir5.setToolTipText("Escribe aqui el nombre del lugar que deseas añadir");

        btnAnadirLugar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAnadirLugar.setText("AÑADIR");
        btnAnadirLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirLugarActionPerformed(evt);
            }
        });
        btnAnadirLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAnadirLugarKeyPressed(evt);
            }
        });

        lblgif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boladelmundo.png"))); // NOI18N

        lblpreguntaciudad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblpreguntaciudad.setForeground(new java.awt.Color(0, 0, 0));
        lblpreguntaciudad.setText("¿Qué ciudad quieres añadir?");

        txtNombreCiudadAnadir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtNombreCiudadAnadir.setToolTipText("Escribe aqui el nombre de la ciudad que deseas añadir");

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLugar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLugar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLugar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLugar5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(lblLugar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpregunta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblpreguntaciudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(188, 188, 188)))
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnadirLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addComponent(cmbEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCuantos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(spNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLugarAnadir6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLugarAnadir5)
                            .addComponent(txtLugarAnadir4)
                            .addComponent(txtLugarAnadir3)
                            .addComponent(txtLugarAnadir2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLugarAnadir, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCiudadAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addComponent(lblgif, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblpregunta)
                        .addGap(12, 12, 12)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblpreguntaciudad)
                                .addGap(36, 36, 36)
                                .addComponent(lblLugar)
                                .addGap(47, 47, 47)
                                .addComponent(lblLugar2)
                                .addGap(60, 60, 60)
                                .addComponent(lblLugar3)
                                .addGap(49, 49, 49)
                                .addComponent(lblLugar4)
                                .addGap(57, 57, 57)
                                .addComponent(lblLugar5)
                                .addGap(65, 65, 65)
                                .addComponent(lblLugar6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblgif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCuantos)
                            .addComponent(spNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(txtNombreCiudadAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtLugarAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtLugarAnadir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtLugarAnadir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtLugarAnadir4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtLugarAnadir5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(txtLugarAnadir6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(btnAnadirLugar))
        );

        lblTituloAnadir.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTituloAnadir.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloAnadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        lblTituloAnadir.setText("GOPLACES-AÑADIR");
        lblTituloAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTituloAnadirMouseClicked(evt);
            }
        });

        lblAnadirAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        lblAnadirAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnadirAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAnadirFondoLayout = new javax.swing.GroupLayout(pnlAnadirFondo);
        pnlAnadirFondo.setLayout(pnlAnadirFondoLayout);
        pnlAnadirFondoLayout.setHorizontalGroup(
            pnlAnadirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnadirFondoLayout.createSequentialGroup()
                .addGroup(pnlAnadirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAnadirFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAnadirAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblTituloAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAnadirFondoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pnlAnadirFondoLayout.setVerticalGroup(
            pnlAnadirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnadirFondoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlAnadirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnadirAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgAnadirLayout = new javax.swing.GroupLayout(dlgAnadir.getContentPane());
        dlgAnadir.getContentPane().setLayout(dlgAnadirLayout);
        dlgAnadirLayout.setHorizontalGroup(
            dlgAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAnadirFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgAnadirLayout.setVerticalGroup(
            dlgAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAnadirLayout.createSequentialGroup()
                .addComponent(pnlAnadirFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dlgConsultar.setTitle("Consultar-GoPlaces");

        pnlConsultarFondo.setBackground(new java.awt.Color(0, 117, 0));

        lblTituloConsultar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTituloConsultar.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloConsultar.setText("CONSULTAR-GOPLACES");

        lblConsultarAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        lblConsultarAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarAtrasMouseClicked(evt);
            }
        });

        pnlFiltros.setBackground(new java.awt.Color(90, 243, 90));

        lblFiltros.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        lblFiltros.setForeground(new java.awt.Color(0, 0, 0));
        lblFiltros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiltros.setText("FILTROS");

        btnBuscarFiltros.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnBuscarFiltros.setText("BUSCAR");
        btnBuscarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFiltrosActionPerformed(evt);
            }
        });
        btnBuscarFiltros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarFiltrosKeyPressed(evt);
            }
        });

        txtBusquedaUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnBusquedaPorUsuario.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnBusquedaPorUsuario.setText("BUSCAR");
        btnBusquedaPorUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaPorUsuarioActionPerformed(evt);
            }
        });
        btnBusquedaPorUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBusquedaPorUsuarioKeyPressed(evt);
            }
        });

        lblBusquedaUsuario.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblBusquedaUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblBusquedaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusquedaUsuario.setText("BÚSQUEDA POR USUARIO");

        rbHotel.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbHotel);
        rbHotel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbHotel.setText("Hotel");

        rbRestaurante.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbRestaurante);
        rbRestaurante.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbRestaurante.setText("Restaurante");

        rbMuseo.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbMuseo);
        rbMuseo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbMuseo.setText("Museo");

        rbMonumento.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbMonumento);
        rbMonumento.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbMonumento.setText("Monumento");

        javax.swing.GroupLayout pnlFiltrosLayout = new javax.swing.GroupLayout(pnlFiltros);
        pnlFiltros.setLayout(pnlFiltrosLayout);
        pnlFiltrosLayout.setHorizontalGroup(
            pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(pnlFiltrosLayout.createSequentialGroup()
                .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFiltrosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFiltrosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMonumento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarFiltros)))
                    .addGroup(pnlFiltrosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusquedaPorUsuario)
                            .addGroup(pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblBusquedaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBusquedaUsuario)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlFiltrosLayout.setVerticalGroup(
            pnlFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFiltros)
                .addGap(27, 27, 27)
                .addComponent(rbHotel)
                .addGap(27, 27, 27)
                .addComponent(rbRestaurante)
                .addGap(34, 34, 34)
                .addComponent(rbMuseo)
                .addGap(28, 28, 28)
                .addComponent(rbMonumento)
                .addGap(23, 23, 23)
                .addComponent(btnBuscarFiltros)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBusquedaUsuario)
                .addGap(33, 33, 33)
                .addComponent(txtBusquedaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnBusquedaPorUsuario)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pnlResultados.setBackground(new java.awt.Color(90, 243, 90));

        txtAResultadosBusqueda.setColumns(20);
        txtAResultadosBusqueda.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txtAResultadosBusqueda.setRows(5);
        txtAResultadosBusqueda.setEnabled(false);
        jScrollPane1.setViewportView(txtAResultadosBusqueda);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(17, 17, 17))
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        txtBusqueda.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        txtBusqueda.setText("Escribe aquí su búsqueda por ciudad(Madrid,Londres,Dublín,Barcelona...)");
        txtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBusquedaMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        btnInforme.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnInforme.setText("GENERAR INFORME");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });
        btnInforme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInformeKeyPressed(evt);
            }
        });

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultarFondoLayout = new javax.swing.GroupLayout(pnlConsultarFondo);
        pnlConsultarFondo.setLayout(pnlConsultarFondoLayout);
        pnlConsultarFondoLayout.setHorizontalGroup(
            pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblConsultarAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                        .addComponent(txtBusqueda)
                        .addGap(493, 493, 493))
                    .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                        .addGroup(pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlResultados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addComponent(pnlFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        pnlConsultarFondoLayout.setVerticalGroup(
            pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                .addGroup(pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlConsultarFondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblConsultarAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConsultarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnInforme)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout dlgConsultarLayout = new javax.swing.GroupLayout(dlgConsultar.getContentPane());
        dlgConsultar.getContentPane().setLayout(dlgConsultarLayout);
        dlgConsultarLayout.setHorizontalGroup(
            dlgConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConsultarFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgConsultarLayout.setVerticalGroup(
            dlgConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConsultarFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgAjustes.setTitle("Ajustes-GoPlaces");
        dlgAjustes.setBackground(new java.awt.Color(90, 243, 90));

        pnlAjusetsFondo.setBackground(new java.awt.Color(90, 243, 90));

        lblContraAjustes.setBackground(new java.awt.Color(0, 0, 0));
        lblContraAjustes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblContraAjustes.setForeground(new java.awt.Color(0, 0, 0));
        lblContraAjustes.setText("Contraseña Nueva");
        lblContraAjustes.setEnabled(false);

        passNueva.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        passNueva.setEnabled(false);

        passNuevaConfirmar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        passNuevaConfirmar.setEnabled(false);

        lblContraAjustesConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        lblContraAjustesConfirmar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblContraAjustesConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        lblContraAjustesConfirmar.setText("Confirmar Contraseña Nueva");
        lblContraAjustesConfirmar.setEnabled(false);

        btnContraUno.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnContraUno.setText("¿QUIERES CAMBIAR LA CONTRASEÑA?");
        btnContraUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraUnoActionPerformed(evt);
            }
        });
        btnContraUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnContraUnoKeyPressed(evt);
            }
        });

        lblElegirIdioma.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblElegirIdioma.setForeground(new java.awt.Color(0, 0, 0));
        lblElegirIdioma.setText("ELIGE EL IDIOMA");

        cmbIdioma.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        cmbIdioma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbIdiomaItemStateChanged(evt);
            }
        });

        cmbColor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Defecto", "Oscuro", "Claro" }));
        cmbColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbColorItemStateChanged(evt);
            }
        });

        lblTema.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTema.setForeground(new java.awt.Color(0, 0, 0));
        lblTema.setText("ELIGE EL TEMA");

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        lblCerrarSesionAjustes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCerrarSesionAjustes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCerrarSesionAjustes.setText("Cerrar Sesión");
        lblCerrarSesionAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionAjustesMouseClicked(evt);
            }
        });

        btnCambiarContraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCambiarContraseña.setText("Cambiar Contraseña");
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });
        btnCambiarContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCambiarContraseñaKeyPressed(evt);
            }
        });

        lblBorrarCuenta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblBorrarCuenta.setText("Borrar Cuenta");
        lblBorrarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarCuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout componenteMenu1Layout = new javax.swing.GroupLayout(componenteMenu1);
        componenteMenu1.setLayout(componenteMenu1Layout);
        componenteMenu1Layout.setHorizontalGroup(
            componenteMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        componenteMenu1Layout.setVerticalGroup(
            componenteMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        ocultarAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invisible.png"))); // NOI18N
        ocultarAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarAjustesMouseClicked(evt);
            }
        });

        verAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        verAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verAjustesMouseClicked(evt);
            }
        });

        lblComprobarContrasena.setBackground(new java.awt.Color(220, 53, 69));
        lblComprobarContrasena.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblComprobarContrasena.setForeground(new java.awt.Color(220, 53, 69));
        lblComprobarContrasena.setText("jLabel1");

        javax.swing.GroupLayout pnlAjusetsFondoLayout = new javax.swing.GroupLayout(pnlAjusetsFondo);
        pnlAjusetsFondo.setLayout(pnlAjusetsFondoLayout);
        pnlAjusetsFondoLayout.setHorizontalGroup(
            pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(componenteMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                        .addGroup(pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblComprobarContrasena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                                .addGroup(pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContraAjustesConfirmar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblContraAjustes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(87, 87, 87))
                            .addComponent(btnContraUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addComponent(passNueva, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passNuevaConfirmar)
                            .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(ocultarAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verAjustes)
                        .addGap(203, 203, 203)
                        .addGroup(pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblElegirIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                                .addComponent(lblBorrarCuenta)
                                .addGap(100, 100, 100)
                                .addComponent(lblCerrarSesionAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTema, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))))
        );
        pnlAjusetsFondoLayout.setVerticalGroup(
            pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                .addComponent(componenteMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                        .addComponent(btnContraUno)
                        .addGap(25, 25, 25)
                        .addComponent(lblContraAjustes)
                        .addGap(33, 33, 33)
                        .addGroup(pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ocultarAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(lblContraAjustesConfirmar))
                    .addGroup(pnlAjusetsFondoLayout.createSequentialGroup()
                        .addComponent(lblElegirIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblTema, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(pnlAjusetsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBorrarCuenta)
                            .addComponent(lblCerrarSesionAjustes))))
                .addGap(21, 21, 21)
                .addComponent(passNuevaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComprobarContrasena)
                .addGap(30, 30, 30)
                .addComponent(btnCambiarContraseña)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout dlgAjustesLayout = new javax.swing.GroupLayout(dlgAjustes.getContentPane());
        dlgAjustes.getContentPane().setLayout(dlgAjustesLayout);
        dlgAjustesLayout.setHorizontalGroup(
            dlgAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAjusetsFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgAjustesLayout.setVerticalGroup(
            dlgAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAjusetsFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOPLACES");

        pnlIniciarSesionFondo.setBackground(new java.awt.Color(0, 117, 0));

        pnlIniciarSesion.setBackground(new java.awt.Color(90, 243, 90));
        pnlIniciarSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicio Sesión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GOPLACES");

        ocultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invisible.png"))); // NOI18N
        ocultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        btnInicio1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnInicio1.setText("Iniciar Sesión");
        btnInicio1.setPreferredSize(new java.awt.Dimension(92, 33));
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        btnInicio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInicioKeyPressed(evt);
            }
        });

        txtUsuarioLogin.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        lblCamposVacios.setText("Por favor rellene todos los campos para completar el registro");

        btnRegistroLogin.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRegistroLogin.setText("Registro");
        btnRegistroLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNrEGISTROActionPerformed(evt);
            }
        });
        btnRegistroLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BTNrEGISTROKeyPressed(evt);
            }
        });

        txtContraLogin.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        lblNombreUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNombreUsuario.setText("NOMBRE*");

        ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        ver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        lblPasswordUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPasswordUsuario.setText("CONTRASEÑA*");

        javax.swing.GroupLayout pnlIniciarSesionLayout = new javax.swing.GroupLayout(pnlIniciarSesion);
        pnlIniciarSesion.setLayout(pnlIniciarSesionLayout);
        pnlIniciarSesionLayout.setHorizontalGroup(
            pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIniciarSesionLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlIniciarSesionLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIniciarSesionLayout.createSequentialGroup()
                        .addGroup(pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswordUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ocultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ver1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCamposVacios, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRegistroLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        pnlIniciarSesionLayout.setVerticalGroup(
            pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIniciarSesionLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(lblNombreUsuario)
                .addGap(10, 10, 10)
                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlIniciarSesionLayout.createSequentialGroup()
                        .addComponent(lblPasswordUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ver1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(lblCamposVacios)
                .addGap(18, 18, 18)
                .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout pnlIniciarSesionFondoLayout = new javax.swing.GroupLayout(pnlIniciarSesionFondo);
        pnlIniciarSesionFondo.setLayout(pnlIniciarSesionFondoLayout);
        pnlIniciarSesionFondoLayout.setHorizontalGroup(
            pnlIniciarSesionFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIniciarSesionFondoLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(pnlIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(131, 131, 131))
        );
        pnlIniciarSesionFondoLayout.setVerticalGroup(
            pnlIniciarSesionFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIniciarSesionFondoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(pnlIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIniciarSesionFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIniciarSesionFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spNumeroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spNumeroStateChanged
        String lugar = (String) cmbEstacionamiento.getSelectedItem();
        if (spNumero.getValue().equals(1)) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(false);
            txtLugarAnadir2.setVisible(false);

        }
        if (spNumero.getValue().equals(2) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);

            // JLabel no visibles
            lblLugar3.setVisible(false);
            txtLugarAnadir3.setVisible(false);
            lblLugar4.setVisible(false);
            txtLugarAnadir4.setVisible(false);
            lblLugar5.setVisible(false);
            txtLugarAnadir5.setVisible(false);
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(3) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);
            // JLabel no visibles
            lblLugar4.setVisible(false);
            txtLugarAnadir4.setVisible(false);
            lblLugar5.setVisible(false);
            txtLugarAnadir5.setVisible(false);
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(4) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);
            lblLugar4.setVisible(true);
            txtLugarAnadir4.setVisible(true);

            // JLabel no visibles
            lblLugar5.setVisible(false);
            txtLugarAnadir5.setVisible(false);
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(5) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);
            lblLugar4.setVisible(true);
            txtLugarAnadir4.setVisible(true);
            lblLugar5.setVisible(true);
            txtLugarAnadir5.setVisible(true);
            // JLabel no visibles
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(6) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);
            lblLugar4.setVisible(true);
            txtLugarAnadir4.setVisible(true);
            lblLugar5.setVisible(true);
            txtLugarAnadir5.setVisible(true);
            lblLugar6.setVisible(true);
            txtLugarAnadir6.setVisible(true);
        }

    }//GEN-LAST:event_spNumeroStateChanged

    private void cmbEstacionamientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstacionamientoItemStateChanged
        String lugar = (String) cmbEstacionamiento.getSelectedItem();

        if (lugar.equals("Lugares")) {
            lugares();
        }

        if (lugar.equals("Hotel")) {
            lblLugar.setText("Hotel");
            lblLugar2.setText("Hotel");
            lblLugar3.setText("Hotel");
            lblLugar4.setText("Hotel");
            lblLugar5.setText("Hotel");
            lblLugar6.setText("Hotel");
            MostrarValores();
        }
        if (lugar.equals("Museo")) {
            lblLugar.setText("Museo");
            lblLugar2.setText("Museo");
            lblLugar3.setText("Museo");
            lblLugar4.setText("Museo");
            lblLugar5.setText("Museo");
            lblLugar6.setText("Museo");
            MostrarValores();
        }
        if (lugar.equals("Restaurante")) {
            lblLugar.setText("Restaurante");
            lblLugar2.setText("Restaurante");
            lblLugar3.setText("Restaurante");
            lblLugar4.setText("Restaurante");
            lblLugar5.setText("Restaurante");
            lblLugar6.setText("Restaurante");
            MostrarValores();
        }
        if (lugar.equals("Monumento")) {
            lblLugar.setText("Monumento");
            lblLugar2.setText("Monumento");
            lblLugar3.setText("Monumento");
            lblLugar4.setText("Monumento");
            lblLugar5.setText("Monumento");
            lblLugar6.setText("Monumento");
            MostrarValores();
        }
        String restaruante = "";
        String hotel = "";
        String museo = "";
        String monumento = "";
        if (lugar.equals("Hotel")) {
            if (idioma.equals("Inglés")) {
                hotel = "Hotel";
                lblLugar.setText(hotel);
                lblLugar2.setText(hotel);
                lblLugar3.setText(hotel);
                lblLugar4.setText(hotel);
                lblLugar5.setText(hotel);
                lblLugar6.setText(hotel);

            } else {
                lblLugar.setText("Hotel");
                lblLugar2.setText("Hotel");
                lblLugar3.setText("Hotel");
                lblLugar4.setText("Hotel");
                lblLugar5.setText("Hotel");
                lblLugar6.setText("Hotel");
            }

        }
        if (lugar.equals("Restaurante")) {
            if (idioma.equals("Inglés")) {
                restaruante = "Restaurant";
                lblLugar.setText(restaruante);
                lblLugar2.setText(restaruante);
                lblLugar3.setText(restaruante);
                lblLugar4.setText(restaruante);
                lblLugar5.setText(restaruante);
                lblLugar6.setText(restaruante);

            } else {
                lblLugar.setText("Restaurante");
                lblLugar2.setText("Restaurante");
                lblLugar3.setText("Restaurante");
                lblLugar4.setText("Restaurante");
                lblLugar5.setText("Restaurante");
                lblLugar6.setText("Restaurante");
            }

        }
        if (lugar.equals("Museo")) {
            if (idioma.equals("Inglés")) {
                museo = "Museum";
                lblLugar.setText(museo);
                lblLugar2.setText(museo);
                lblLugar3.setText(museo);
                lblLugar4.setText(museo);
                lblLugar5.setText(museo);
                lblLugar6.setText(museo);
            }

        }
        if (lugar.equals("Monumento")) {
            if (idioma.equals("Inglés")) {
                monumento = "Monument";
                lblLugar.setText(monumento);
                lblLugar2.setText(monumento);
                lblLugar3.setText(monumento);
                lblLugar4.setText(monumento);
                lblLugar5.setText(monumento);
                lblLugar6.setText(monumento);
            } else {

            }

        }


    }//GEN-LAST:event_cmbEstacionamientoItemStateChanged

    private void btnAnadirLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAnadirLugarKeyPressed

        int valor = (int) spNumero.getValue();
        switch (valor) {
            case 1:
                lugar1();
                break;
            case 2:
                lugar2();
                break;
            case 3:
                lugar3();
                break;
            case 4:
                lugar4();
                break;

            case 5:
                lugar5();
                break;
            case 6:
                lugar6();
                break;

        }
        try {
            String lugar = (String) cmbEstacionamiento.getSelectedItem();

            String selectPerfil = "SELECT nombrelugar,nombreciudad FROM lugar where estacionamiento='" + lugar + "' and usuario='" + txtUsuarioLogin.getText() + "'";
            rs = st.executeQuery(selectPerfil);

            while (rs.next()) {
                Hotel();
                Restaurante();
                Museo();
                Monumento();

            }

            txtNombreCiudadAnadir.setText("");
            txtLugarAnadir.setText("");
            txtLugarAnadir2.setText("");
            txtLugarAnadir3.setText("");
            txtLugarAnadir4.setText("");
            txtLugarAnadir5.setText("");
            txtLugarAnadir6.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAnadirLugarKeyPressed

    private void btnAnadirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirLugarActionPerformed

        int valor = (int) spNumero.getValue();
        switch (valor) {
            case 1:
                lugar1();
                break;
            case 2:
                lugar2();
                break;
            case 3:
                lugar3();
                break;
            case 4:
                lugar4();
                break;

            case 5:
                lugar5();
                break;
            case 6:
                lugar6();
                break;

        }
        try {
            String lugar = (String) cmbEstacionamiento.getSelectedItem();

            String selectPerfil = "SELECT nombrelugar,nombreciudad FROM lugar where estacionamiento='" + lugar + "' and usuario='" + txtUsuarioLogin.getText() + "'";
            rs = st.executeQuery(selectPerfil);

            while (rs.next()) {
                Hotel();
                Restaurante();
                Museo();
                Monumento();

            }

            txtNombreCiudadAnadir.setText("");
            txtLugarAnadir.setText("");
            txtLugarAnadir2.setText("");
            txtLugarAnadir3.setText("");
            txtLugarAnadir4.setText("");
            txtLugarAnadir5.setText("");
            txtLugarAnadir6.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAnadirLugarActionPerformed

    private void ocultarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarRMouseClicked
        verR.setVisible(true);
        ocultarR.setVisible(false);
        txtContraRegistro.setEchoChar('*');
    }//GEN-LAST:event_ocultarRMouseClicked

    private void verRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verRMouseClicked
        verR.setVisible(false);
        ocultarR.setVisible(true);
        txtContraRegistro.setEchoChar((char) 0);
    }//GEN-LAST:event_verRMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked

        ver1.setVisible(true);
        ocultar1.setVisible(false);
        txtContraLogin.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked

        ver1.setVisible(false);
        ocultar1.setVisible(true);
        txtContraLogin.setEchoChar((char) 0);

    }//GEN-LAST:event_verMouseClicked

    private void btnInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInicioKeyPressed
        if (txtUsuarioLogin.getText().length() == 0 || txtContraLogin.getText().length() == 0) {
            lblCamposVacios.setVisible(true);

        } else {

            try {
                String nombre = txtUsuarioLogin.getText();
                String password = txtContraLogin.getText();

                String hashedPassword = encriptar(password);

                String select = "SELECT nombre, contrasena,foto FROM iniciosesion WHERE nombre=?";
                PreparedStatement statement = conexion.prepareStatement(select);
                statement.setString(1, nombre);

                rs = statement.executeQuery();

                if (rs.next()) {
                    String storedPassword = rs.getString("contrasena");

                    // Verificar si las contraseñas coinciden
                    if (hashedPassword.equals(storedPassword)) {
                        dlgMenu.setVisible(true);
                        dlgMenu.setSize(1500, 750);// TODO add your handling code here:
                        this.dispose();

                        String nom = rs.getString("nombre");
                        lblBienvenida.setText("Bienvenid@ " + nom.toUpperCase());
                        lblNombreusuario.setText(nom.toUpperCase());

                        Hotel();
                        Restaurante();
                        Museo();
                        Monumento();
                    } else {
                        lblCamposVacios.setVisible(true);
                        lblCamposVacios.setText("Contraseña incorrecta");
                    }
                } else {
                    lblCamposVacios.setVisible(true);
                    lblCamposVacios.setText("Usuario no registrado");
                }
                rs.close();

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }//GEN-LAST:event_btnInicioKeyPressed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (txtUsuarioLogin.getText().length() == 0 || txtContraLogin.getText().length() == 0) {
            lblCamposVacios.setVisible(true);

        } else {

            try {
                String nombre = txtUsuarioLogin.getText();
                String password = txtContraLogin.getText();

                String hashedPassword = encriptar(password);

                String select = "SELECT nombre, contrasena,foto FROM iniciosesion WHERE nombre=?";
                PreparedStatement statement = conexion.prepareStatement(select);
                statement.setString(1, nombre);

                rs = statement.executeQuery();

                if (rs.next()) {
                    String storedPassword = rs.getString("contrasena");

                    // Verificar si las contraseñas coinciden
                    if (hashedPassword.equals(storedPassword)) {
                        dlgMenu.setVisible(true);
                        dlgMenu.setSize(1600, 850);// TODO add your handling code here:
                        this.dispose();

                        String almacenarFoto = "SELECT foto FROM iniciosesion  WHERE nombre=?";
                        PreparedStatement ps = conexion.prepareStatement(almacenarFoto);
                        ps.setString(1, txtUsuarioLogin.getText());
                        ResultSet result = ps.executeQuery();

                        if (result.next()) {
                            if (result.getBlob("foto") != null) {
                                Blob blob = result.getBlob("foto");
                                byte[] imgByte = blob.getBytes(1, (int) blob.length());
                                ImageIcon icono = new ImageIcon(imgByte);
                                Image image = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                                lblFotoPerfil.setIcon(new ImageIcon(image));
                            } else {
                                String ruta = "src/imagenes/perfildefault.png";
                                ImageIcon icono = new ImageIcon(ruta);
                                Image image = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                                lblFotoPerfil.setIcon(new ImageIcon(image));

                            }

                        }
                        ps.close();
                        result.close();

                        String nom = rs.getString("nombre");
                        lblBienvenida.setText("Bienvenid@ " + nom.toUpperCase());
                        lblNombreusuario.setText(nom.toUpperCase());

                        Hotel();
                        Restaurante();
                        Museo();
                        Monumento();
                    } else {
                        if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                            lblCamposVacios.setVisible(true);
                            lblCamposVacios.setText("Wrong password");
                        } else {
                            lblCamposVacios.setVisible(true);
                            lblCamposVacios.setText("Contraseña incorrecta");
                        }

                    }
                } else {
                    if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                        lblCamposVacios.setVisible(true);
                        lblCamposVacios.setText("Unregistered user");
                    } else {
                        lblCamposVacios.setVisible(true);
                        lblCamposVacios.setText("Usuario no registrado");
                    }

                }
                rs.close();

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

            }
        }


    }//GEN-LAST:event_btnInicioActionPerformed

    private void BTNrEGISTROKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTNrEGISTROKeyPressed

        dlgRegistro.setVisible(true);
        dlgRegistro.setSize(1550, 850);
        this.dispose();

    }//GEN-LAST:event_BTNrEGISTROKeyPressed

    private void BTNrEGISTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNrEGISTROActionPerformed

        dlgRegistro.setVisible(true);
        dlgRegistro.setSize(1550, 850);
        this.dispose();

    }//GEN-LAST:event_BTNrEGISTROActionPerformed

    private void pnlPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPerfilMouseClicked

        dlgPerfil.setVisible(true);
        dlgPerfil.setSize(1550, 825);


    }//GEN-LAST:event_pnlPerfilMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        try {
            conexion.close();
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_lblSalirMouseClicked

    private void pnlConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultarMouseClicked

        dlgConsultar.setVisible(true);
        dlgConsultar.setSize(1550, 825);


    }//GEN-LAST:event_pnlConsultarMouseClicked

    private void pnlAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirMouseClicked

        dlgAnadir.setVisible(true);
        dlgAnadir.setSize(1600, 850);

    }//GEN-LAST:event_pnlAnadirMouseClicked

    private void pnlAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAjustesMouseClicked

        dlgAjustes.setVisible(true);
        dlgAjustes.setSize(1550, 850);
        componenteMenu1.setLogin(this);

    }//GEN-LAST:event_pnlAjustesMouseClicked

    private void lblPerfilAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilAtrasMouseClicked
        dlgPerfil.dispose();
        dlgMenu.setVisible(true);
        dlgMenu.setSize(1550, 900);
    }//GEN-LAST:event_lblPerfilAtrasMouseClicked

    private void btnRegistroBTNrEGISTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroBTNrEGISTROActionPerformed

        String idioma = (String) cmbIdioma.getSelectedItem();
        if (txtUsuarioRegistro.getText().length() == 0 || txtContraRegistro.getText().length() == 0) {
            lblCamposVaciosRegistro.setVisible(true);
            if (idioma.equals("Inglés")) {
                lblCamposVaciosRegistro.setVisible(true);
                lblCamposVaciosRegistro.setText("Please,fill in all fields");
            }

        } else {
            try {
                String nom = txtUsuarioRegistro.getText();
                String password = String.valueOf(txtContraRegistro.getPassword());
                String encryptedPassword;
                encryptedPassword = encriptar(password);
                String sql = "INSERT INTO iniciosesion(nombre,contrasena)VALUES('" + nom + "', '" + encryptedPassword + "')";
                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.executeUpdate();

                String select = "SELECT nombre, contrasena FROM iniciosesion WHERE nombre='" + nom + "'";
                rs = st.executeQuery(select);
                if (rs.next()) {
                    dlgRegistro.dispose();

                    String ruta = "src/imagenes/perfildefault.png";
                    ImageIcon icono = new ImageIcon(ruta);
                    Image image = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    lblFotoPerfil.setIcon(new ImageIcon(image));

                    String resultado = rs.getString("nombre");
                    lblBienvenida.setText("Bienvenid@ " + resultado.toUpperCase());
                    if (idioma.equals("Inglés")) {
                        lblBienvenida.setText("Welcome " + resultado.toUpperCase());
                    }
                    lblNombreusuario.setText(resultado);
                    dlgMenu.setVisible(true);
                    dlgMenu.setSize(1550, 900);
                }

            } catch (SQLException ex) {
                lblCamposVaciosRegistro.setVisible(true);
                if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                    lblCamposVaciosRegistro.setText("This user is already registered");
                } else {
                    lblCamposVaciosRegistro.setText("Este usuario ya existe, prueba con otro nombre");
                }

            }
        }
    }//GEN-LAST:event_btnRegistroBTNrEGISTROActionPerformed

    private void txtLugarAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarAnadirActionPerformed

    }//GEN-LAST:event_txtLugarAnadirActionPerformed

    private void lblAnadirAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnadirAtrasMouseClicked
        lblLugar.setVisible(false);
        lblLugar2.setVisible(false);
        lblLugar3.setVisible(false);
        lblLugar4.setVisible(false);
        lblLugar5.setVisible(false);
        lblLugar6.setVisible(false);
        txtLugarAnadir.setVisible(false);
        txtLugarAnadir2.setVisible(false);
        txtLugarAnadir3.setVisible(false);
        txtLugarAnadir4.setVisible(false);
        txtLugarAnadir5.setVisible(false);
        txtLugarAnadir6.setVisible(false);
        spNumero.setValue(1);
        txtLugarAnadir.setText("");
        txtLugarAnadir2.setText("");
        txtLugarAnadir3.setText("");
        txtLugarAnadir4.setText("");
        txtLugarAnadir5.setText("");
        txtLugarAnadir6.setText("");

        dlgAnadir.dispose();
        dlgMenu.setVisible(true);
        dlgMenu.setSize(1550, 900);


    }//GEN-LAST:event_lblAnadirAtrasMouseClicked

    private void lblConsultarAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarAtrasMouseClicked
        dlgConsultar.dispose();
        dlgMenu.setVisible(true);
        dlgMenu.setSize(1550, 900);
        txtAResultadosBusqueda.setText("");
    }//GEN-LAST:event_lblConsultarAtrasMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        dlgMenu.setVisible(true);
        dlgMenu.setSize(1550, 900);


    }//GEN-LAST:event_jLabel8MouseClicked

    private void lblTituloAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTituloAnadirMouseClicked
        dlgMenu.setVisible(true);
        dlgMenu.setSize(1550, 700);
    }//GEN-LAST:event_lblTituloAnadirMouseClicked

    private void lblFotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotosMouseClicked

        if (contador == 5) {
            contador = 0;
        }
        contador++;
        lblFotos.setIcon(Imagen[contador]);


    }//GEN-LAST:event_lblFotosMouseClicked

    private void txtBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaMouseClicked

        txtBusqueda.setEnabled(true);
        txtBusqueda.setText("");
        Font fuente2 = new Font("Arial", Font.ITALIC, 14);
        if (txtBusqueda.equals(" ")) {
            txtBusqueda.setFont(fuente2);
        }


    }//GEN-LAST:event_txtBusquedaMouseClicked

    private void dlgMenuWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dlgMenuWindowClosing
        System.exit(0);

    }//GEN-LAST:event_dlgMenuWindowClosing

    private void lblAcercadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercadeMouseClicked

        if (cmbIdioma.getSelectedItem().equals("Inglés")) {
            JOptionPane.showMessageDialog(null, "GoPlaces  is a project created by Marco Ponce Gómez(2ºDAM).\nThe main objetive of this app is to reach all audience and enjoy travelling.\nGoPlaces, ¡Enjoy travelling!",
                    "About",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "GoPlaces es un proyecto creado por Marco Ponce Gómez, de 2ºDAM.\nEl objetivo principal que tiene esta aplicación es llegar a todos los públicos y disfrutar de los viajes.\nGoPlaces, ¡Disfruta viajando!",
                    "ACERCA DE",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_lblAcercadeMouseClicked

    private void btnRegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistroKeyPressed

        if (txtUsuarioRegistro.getText().length() == 0 || txtContraRegistro.getText().length() == 0) {
            lblCamposVaciosRegistro.setVisible(true);

        } else {
            try {
                String nom = txtUsuarioRegistro.getText();
                String password = String.valueOf(txtContraRegistro.getPassword());
                String encryptedPassword;
                encryptedPassword = encriptar(password);
                String sql = "INSERT INTO iniciosesion (nombre, contraseña) VALUES ('" + nom + "', '" + encryptedPassword + "')";
                st = conexion.prepareStatement(sql);
                int filasInsertadas = st.executeUpdate(sql);
                String select = "SELECT nombre, contraseña FROM iniciosesion WHERE nombre='" + nom + "'";
                rs = st.executeQuery(select);
                if (rs.next()) {
                    dlgRegistro.dispose();
                    String resultado = rs.getString("nombre");
                    lblBienvenida.setText("Bienvenid@ " + resultado);
                    lblNombreusuario.setText(resultado);
                    dlgMenu.setVisible(true);
                    dlgMenu.setSize(1550, 900);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

            }
        }


    }//GEN-LAST:event_btnRegistroKeyPressed

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        try {
            String nombreCiudad = txtBusqueda.getText();
            String select = "SELECT  * from lugar where nombreciudad='" + nombreCiudad + "'";
            rs = st.executeQuery(select);
            StringBuilder rc = new StringBuilder(); // Para almacenar todos los registros
            while (rs.next()) {
                String nombreLugar = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String estacionamiento = rs.getString("estacionamiento");

                String resultado = ciudad.toUpperCase() + "-" + nombreLugar + "-" + estacionamiento;
                rc.append(resultado).append("\n");
            }
            txtAResultadosBusqueda.setText(rc.toString());

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_lblBuscarMouseClicked

    private void btnBuscarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFiltrosActionPerformed
        try {
            String estacionamiento = "";

            if (rbHotel.isSelected()) {
                estacionamiento = "Hotel";
            }
            if (rbMonumento.isSelected()) {
                estacionamiento = "Monumento";
            }
            if (rbMuseo.isSelected()) {
                estacionamiento = "Museo";
            }
            if (rbRestaurante.isSelected()) {
                estacionamiento = "Restaurante";
            }
            String select = "SELECT  * from lugar where estacionamiento='" + estacionamiento + "'";
            rs = st.executeQuery(select);
            StringBuilder rc = new StringBuilder(); // Para almacenar todos los registros
            while (rs.next()) {
                String nombreLugar = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String estacion = rs.getString("estacionamiento");

                String resultado = estacion.toUpperCase() + "-" + ciudad + "-" + nombreLugar;
                rc.append(resultado).append("\n");
            }
            txtAResultadosBusqueda.setText(rc.toString());

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnBuscarFiltrosActionPerformed

    private void btnBusquedaPorUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaPorUsuarioActionPerformed

        try {
            String buscar = "Select * from lugar where usuario='" + txtBusquedaUsuario.getText() + "'";
            rs = st.executeQuery(buscar);
            if (rs.next()) {
                String nombreUsuario = rs.getString("usuario");

                String select = "Select * from lugar where usuario='" + nombreUsuario + "'";
                rs = st.executeQuery(select);
                StringBuilder sb = new StringBuilder();
                while (rs.next()) {

                    String nombredelugar = rs.getString("nombrelugar");
                    String ciudad = rs.getString("nombreciudad");
                    String estacion = rs.getString("estacionamiento");
                    String resultado = estacion + "-" + ciudad + "-" + nombredelugar + "(" + nombreUsuario.toUpperCase() + ")";
                    sb.append(resultado).append("\n");

                    txtAResultadosBusqueda.setText(sb.toString());
                }

            } else {
                txtAResultadosBusqueda.setText("Lo siento, no existen resultados con ese usuario");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtBusquedaUsuario.setText("");
    }//GEN-LAST:event_btnBusquedaPorUsuarioActionPerformed

    private void btnBuscarFiltrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarFiltrosKeyPressed
        try {
            String estacionamiento = "";

            if (rbHotel.isSelected()) {
                estacionamiento = "Hotel";
            }
            if (rbMonumento.isSelected()) {
                estacionamiento = "Monumento";
            }
            if (rbMuseo.isSelected()) {
                estacionamiento = "Museo";
            }
            if (rbRestaurante.isSelected()) {
                estacionamiento = "Restaurante";
            }
            String select = "SELECT  * from lugar where estacionamiento='" + estacionamiento + "'";
            rs = st.executeQuery(select);
            StringBuilder rc = new StringBuilder(); // Para almacenar todos los registros
            while (rs.next()) {
                String nombreLugar = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String estacion = rs.getString("estacionamiento");

                String resultado = estacion.toUpperCase() + "-" + ciudad + "-" + nombreLugar;
                rc.append(resultado).append("\n");
            }
            txtAResultadosBusqueda.setText(rc.toString());

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnBuscarFiltrosKeyPressed

    private void btnBusquedaPorUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBusquedaPorUsuarioKeyPressed

        try {
            String buscar = "Select * from lugar where usuario='" + txtBusquedaUsuario.getText() + "'";
            rs = st.executeQuery(buscar);
            if (rs.next()) {
                String nombreUsuario = rs.getString("usuario");

                String select = "Select * from lugar where usuario='" + nombreUsuario + "'";
                rs = st.executeQuery(select);
                StringBuilder sb = new StringBuilder();
                while (rs.next()) {

                    String nombredelugar = rs.getString("nombrelugar");
                    String ciudad = rs.getString("nombreciudad");
                    String estacion = rs.getString("estacionamiento");
                    String resultado = estacion + "-" + ciudad + "-" + nombredelugar + "(" + nombreUsuario.toUpperCase() + ")";
                    sb.append(resultado).append("\n");

                    txtAResultadosBusqueda.setText(sb.toString());
                }

            } else {
                txtAResultadosBusqueda.setText("Lo siento, no existen resultados con ese usuario");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtBusquedaUsuario.setText("");
    }//GEN-LAST:event_btnBusquedaPorUsuarioKeyPressed

    private void btnContraUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraUnoActionPerformed
        lblContraAjustesConfirmar.setEnabled(true);
        lblContraAjustes.setEnabled(true);
        passNueva.setEnabled(true);
        passNuevaConfirmar.setEnabled(true);
    }//GEN-LAST:event_btnContraUnoActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dlgAjustes.dispose();
        dlgMenu.setVisible(true);
        dlgMenu.setSize(1550, 900);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lblCerrarSesionAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionAjustesMouseClicked

        this.setVisible(true);
        this.setSize(1550, 850);

        txtUsuarioLogin.setText("");
        txtContraLogin.setText("");
        dlgAjustes.dispose();
    }//GEN-LAST:event_lblCerrarSesionAjustesMouseClicked

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed

        try {

            String nombre = txtUsuarioLogin.getText();
            if (passNuevaConfirmar.getText().equals(passNueva.getText())) {
                String password = String.valueOf(passNueva.getPassword());

                //Encriptar la contraseña usando SHA-256
                String encryptedPassword;

                // INSERTAR UN NUEVO USUARIO
                encryptedPassword = encriptar(password);

                String sql = "UPDATE iniciosesion set contrasena='" + encryptedPassword + "' where nombre='" + nombre + "'";
                st = conexion.prepareStatement(sql);
                st.executeUpdate(sql);
                lblComprobarContrasena.setVisible(false);
                if (cmbIdioma.getSelectedItem().equals("Inglés")) {

                    JOptionPane.showMessageDialog(null, "Password update succesfully",
                            "Change password",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(null, "Contraseña cambiada correctamente",
                            "Cambio contraseña",
                            JOptionPane.INFORMATION_MESSAGE);

                }

            } else {
                lblComprobarContrasena.setText("Las contraseñas no son iguales");
                lblComprobarContrasena.setVisible(true);
                if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                    lblComprobarContrasena.setText("The passwords do not match");
                    lblComprobarContrasena.setVisible(true);
                } else {
                    lblComprobarContrasena.setText("Las contraseñas no son iguales");
                    lblComprobarContrasena.setVisible(true);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed

    private void lblBorrarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarCuentaMouseClicked

        try {
            JPanel panel = new JPanel();
            JLabel label = new JLabel("Introduce tu contraseña para borrar");
            JPasswordField contra = new JPasswordField(50);
            panel.add(label);
            panel.add(contra);
            String contraEncriptada;

            // INSERTAR UN NUEVO USUARIO
            String[] options = new String[]{"OK", "Cancelar"};
            int option = JOptionPane.showOptionDialog(null, panel, "Borrar cuenta",
                    JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[1]);
            if (option == 0) // pressing OK button
            {

                String select = "SELECT Nombre, Contrasena FROM iniciosesion WHERE Nombre='" + txtUsuarioLogin.getText() + "'";

                PreparedStatement statement = conexion.prepareStatement(select);
                ResultSet rs = statement.executeQuery();
                if (rs.next()) {
                    contraEncriptada = encriptar(contra.getText());
                    System.out.println(contraEncriptada);
                    if (contraEncriptada.equals(rs.getString("Contrasena"))) {
                        String delete = "Delete from iniciosesion where Nombre='" + txtUsuarioLogin.getText() + "'";
                        statement.executeUpdate(delete);
                    } else {

                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblBorrarCuentaMouseClicked

    private void cmbIdiomaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbIdiomaItemStateChanged

        String cmb = (String) cmbIdioma.getSelectedItem();

        if (cmb.equals("Inglés")) {

            try {
                ingles();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            espaniol();
        }

    }//GEN-LAST:event_cmbIdiomaItemStateChanged

    private void cmbColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbColorItemStateChanged
        String color = (String) cmbColor.getSelectedItem();
        Color rgbFondo = new Color(0, 117, 0);
        Color rgb = new Color(90, 243, 90);
        Font fuente = new Font("Arial", Font.BOLD, 18);
        if (color.equals("Oscuro")) {
            Color rgbFondoOscuro = new Color(0, 41, 0);
            Color rgbOscuro = new Color(0, 102, 0);
            pnlAjustes.setBackground(rgbOscuro);
            pnlAnadir.setBackground(rgbOscuro);
            pnlConsultar.setBackground(rgbOscuro);
            pnlFormulario.setBackground(rgbOscuro);
            pnlHotel.setBackground(rgbOscuro);
            pnlIniciarSesion.setBackground(rgbOscuro);
            pnlMonumentos.setBackground(rgbOscuro);
            pnlMuseos.setBackground(rgbOscuro);
            pnlPerfil.setBackground(rgbOscuro);
            pnlRegistro.setBackground(rgbOscuro);
            pnlRestuarante.setBackground(rgbOscuro);
            pnlFiltros.setBackground(rgbOscuro);
            pnlResultados.setBackground(rgbOscuro);

            lblTituloAnadir.setForeground(Color.WHITE);
            lblBienvenida.setForeground(Color.WHITE);
            lblTituloConsultar.setForeground(Color.WHITE);
            lblAcercade.setForeground(Color.WHITE);
            lblSalir.setForeground(Color.WHITE);
            lblBorrarCuenta.setForeground(Color.WHITE);
            lblBuscar.setForeground(Color.WHITE);
            lblBusquedaUsuario.setForeground(Color.WHITE);
            lblCamposVacios.setForeground(Color.WHITE);
            lblCamposVaciosRegistro.setForeground(Color.WHITE);
            lblCerrarSesionAjustes.setForeground(Color.WHITE);
            lblContraAjustes.setForeground(Color.WHITE);
            lblContraAjustesConfirmar.setForeground(Color.WHITE);
            lblContraRegistro.setForeground(Color.WHITE);
            lblCuantos.setForeground(Color.WHITE);
            lblElegirIdioma.setForeground(Color.WHITE);
            lblFajustes.setForeground(Color.WHITE);
            lblFanadir.setForeground(Color.WHITE);
            lblFconsultar.setForeground(Color.WHITE);
            lblFiltros.setForeground(Color.WHITE);
            lblLugar.setForeground(Color.WHITE);
            lblLugar2.setForeground(Color.WHITE);
            lblLugar3.setForeground(Color.WHITE);
            lblLugar4.setForeground(Color.WHITE);
            lblLugar5.setForeground(Color.WHITE);
            lblLugar6.setForeground(Color.WHITE);
            lblpreguntaciudad.setForeground(Color.WHITE);
            lblpregunta.setForeground(Color.WHITE);
            lblexplicar.setForeground(Color.WHITE);
            lblperfil.setForeground(Color.WHITE);
            lblanadir.setForeground(Color.WHITE);
            lblajustes.setForeground(Color.WHITE);
            lblTitulo.setForeground(Color.WHITE);
            lblNombreRegistro.setForeground(Color.WHITE);
            lblNombreusuario.setForeground(Color.WHITE);
            lblNombreapp.setForeground(Color.WHITE);
            lblPasswordUsuario.setForeground(Color.WHITE);
            lblTema.setForeground(Color.WHITE);
            lblconsultar.setForeground(Color.WHITE);
            rbRestaurante.setForeground(Color.WHITE);
            rbMuseo.setForeground(Color.WHITE);
            rbMonumento.setForeground(Color.WHITE);
            rbHotel.setForeground(Color.WHITE);
            lblNombreUsuario.setForeground(Color.WHITE);
            TitledBorder borderHotel = BorderFactory.createTitledBorder("Hoteles escritos por usted");
            borderHotel.setTitleColor(Color.WHITE);
            borderHotel.setTitleFont(fuente);
            pnlHotel.setBorder(borderHotel);

            TitledBorder borderRestaurante = BorderFactory.createTitledBorder("Restaurantes escritos por usted");
            borderRestaurante.setTitleFont(fuente);
            borderRestaurante.setTitleColor(Color.WHITE);
            pnlRestuarante.setBorder(borderRestaurante);

            TitledBorder borderMuseo = BorderFactory.createTitledBorder("Museos escritos por usted ");
            borderMuseo.setTitleFont(fuente);
            borderMuseo.setTitleColor(Color.WHITE);
            pnlMuseos.setBorder(borderMuseo);

            TitledBorder borderMonumento = BorderFactory.createTitledBorder("Monumentos escritos por usted");
            borderMonumento.setTitleFont(fuente);
            borderMonumento.setTitleColor(Color.WHITE);
            pnlMonumentos.setBorder(borderMonumento);
            //fondo
            pnlAjusetsFondo.setBackground(rgbFondoOscuro);
            pnlConsultarFondo.setBackground(rgbFondoOscuro);
            pnlMenuFondo.setBackground(rgbFondoOscuro);
            pnlIniciarSesionFondo.setBackground(rgbFondoOscuro);
            pnlRegistroFondo.setBackground(rgbFondoOscuro);
            pnlAnadirFondo.setBackground(rgbFondoOscuro);
            pnlPerfilFondo.setBackground(rgbFondoOscuro);
        }

        if (color.equals("Por Defecto")) {
            pnlAjustes.setBackground(rgb);
            pnlAnadir.setBackground(rgb);
            pnlConsultar.setBackground(rgb);
            pnlFormulario.setBackground(rgb);
            pnlHotel.setBackground(rgb);
            pnlIniciarSesion.setBackground(rgb);
            pnlMonumentos.setBackground(rgb);
            pnlMuseos.setBackground(rgb);
            pnlPerfil.setBackground(rgb);
            pnlRegistro.setBackground(rgb);
            pnlRestuarante.setBackground(rgb);
            pnlFiltros.setBackground(rgb);
            pnlResultados.setBackground(rgb);
            pnlAjusetsFondo.setBackground(rgb);
            //fondo

            pnlConsultarFondo.setBackground(rgbFondo);
            pnlMenuFondo.setBackground(rgbFondo);
            pnlIniciarSesionFondo.setBackground(rgbFondo);
            pnlRegistroFondo.setBackground(rgbFondo);
            pnlAnadirFondo.setBackground(rgbFondo);
            pnlPerfilFondo.setBackground(rgbFondo);
        }

        if (color.equals("Claro")) {
            Color rgbFondoClaro = new Color(204, 255, 204);
            Color rgbClaro = new Color(204, 204, 255);
            pnlAjustes.setBackground(rgbClaro);
            pnlAnadir.setBackground(rgbClaro);
            pnlConsultar.setBackground(rgbClaro);
            pnlFormulario.setBackground(rgbClaro);
            pnlHotel.setBackground(rgbClaro);
            pnlIniciarSesion.setBackground(rgbClaro);
            pnlMonumentos.setBackground(rgbClaro);
            pnlMuseos.setBackground(rgbClaro);
            pnlPerfil.setBackground(rgbClaro);
            pnlRegistro.setBackground(rgbClaro);
            pnlRestuarante.setBackground(rgbClaro);
            pnlFiltros.setBackground(rgbClaro);
            pnlResultados.setBackground(rgbClaro);
            lblTituloAnadir.setForeground(Color.BLACK);
            lblBienvenida.setForeground(Color.BLACK);
            lblTituloConsultar.setForeground(Color.BLACK);
            lblAcercade.setForeground(Color.BLACK);
            lblSalir.setForeground(Color.BLACK);
            lblBorrarCuenta.setForeground(Color.BLACK);
            lblBuscar.setForeground(Color.BLACK);
            lblBusquedaUsuario.setForeground(Color.BLACK);
            lblCamposVacios.setForeground(Color.BLACK);
            lblCamposVaciosRegistro.setForeground(Color.BLACK);
            lblCerrarSesionAjustes.setForeground(Color.BLACK);
            lblContraAjustes.setForeground(Color.BLACK);
            lblContraAjustesConfirmar.setForeground(Color.BLACK);
            lblContraRegistro.setForeground(Color.BLACK);
            lblCuantos.setForeground(Color.BLACK);
            lblElegirIdioma.setForeground(Color.BLACK);
            lblFajustes.setForeground(Color.BLACK);
            lblFanadir.setForeground(Color.BLACK);
            lblFconsultar.setForeground(Color.BLACK);
            lblFiltros.setForeground(Color.BLACK);
            lblLugar.setForeground(Color.BLACK);
            lblLugar2.setForeground(Color.BLACK);
            lblLugar3.setForeground(Color.BLACK);
            lblLugar4.setForeground(Color.BLACK);
            lblLugar5.setForeground(Color.BLACK);
            lblLugar6.setForeground(Color.BLACK);
            lblpreguntaciudad.setForeground(Color.BLACK);
            lblpregunta.setForeground(Color.BLACK);
            lblexplicar.setForeground(Color.BLACK);
            lblperfil.setForeground(Color.BLACK);
            lblanadir.setForeground(Color.BLACK);
            lblajustes.setForeground(Color.BLACK);
            lblTitulo.setForeground(Color.BLACK);
            lblNombreRegistro.setForeground(Color.BLACK);
            lblNombreusuario.setForeground(Color.BLACK);
            lblNombreapp.setForeground(Color.BLACK);
            lblPasswordUsuario.setForeground(Color.BLACK);
            lblTema.setForeground(Color.BLACK);
            lblconsultar.setForeground(Color.BLACK);
            rbRestaurante.setForeground(Color.BLACK);
            rbMuseo.setForeground(Color.BLACK);
            rbMonumento.setForeground(Color.BLACK);
            rbHotel.setForeground(Color.BLACK);
            lblNombreUsuario.setForeground(Color.BLACK);
            TitledBorder borderHotel = BorderFactory.createTitledBorder("Hoteles escritos por usted");
            borderHotel.setTitleColor(Color.BLACK);
            borderHotel.setTitleFont(fuente);
            pnlHotel.setBorder(borderHotel);

            TitledBorder borderRestaurante = BorderFactory.createTitledBorder("Restaurantes escritos por usted");
            borderRestaurante.setTitleFont(fuente);
            borderRestaurante.setTitleColor(Color.BLACK);
            pnlRestuarante.setBorder(borderRestaurante);

            TitledBorder borderMuseo = BorderFactory.createTitledBorder("Museos escritos por usted ");
            borderMuseo.setTitleFont(fuente);
            borderMuseo.setTitleColor(Color.BLACK);
            pnlMuseos.setBorder(borderMuseo);

            TitledBorder borderMonumento = BorderFactory.createTitledBorder("Monumentos escritos por usted");
            borderMonumento.setTitleFont(fuente);
            borderMonumento.setTitleColor(Color.BLACK);
            pnlMonumentos.setBorder(borderMonumento);
            //fondo
            pnlAjusetsFondo.setBackground(rgbFondoClaro);
            pnlConsultarFondo.setBackground(rgbFondoClaro);
            pnlMenuFondo.setBackground(rgbFondoClaro);
            pnlIniciarSesionFondo.setBackground(rgbFondoClaro);
            pnlRegistroFondo.setBackground(rgbFondoClaro);
            pnlAnadirFondo.setBackground(rgbFondoClaro);
            pnlPerfilFondo.setBackground(rgbFondoClaro);
        }


    }//GEN-LAST:event_cmbColorItemStateChanged

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        String txtResultado = txtAResultadosBusqueda.getText();
        if (txtResultado.equals("")) {
            JOptionPane alertaNoResultados = new JOptionPane();
            alertaNoResultados.showMessageDialog(null, "No se puede generar el informe sin resultados", "Informe",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("txtresultados", txtAResultadosBusqueda.getText());
            JasperReport mireporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/informe/goplaces.jasper"));
            File file = new File("src/informe/goplaces.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(mireporte, params, new JREmptyDataSource());

            String pdf = "src/informe/goplaces.pdf";
            JasperViewer jasperView;
            jasperView = new JasperViewer(jasperPrint, false);
            jasperView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jasperView.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnInformeActionPerformed

    private void lblFotoPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoPerfilMouseClicked

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG,PNG & GIF", "jpg", "png", "gif");
        jfc.setFileFilter(filtro);
        int foto = jfc.showOpenDialog(this);
        if (foto == jfc.APPROVE_OPTION) {
            try {
                File file = jfc.getSelectedFile();
                String ruta = String.valueOf(file);
                Image fImage = getToolkit().getImage(ruta);
                fImage = fImage.getScaledInstance(120, 120, Image.SCALE_DEFAULT);

                lblFotoPerfil.setIcon(new ImageIcon(fImage));
                String almacenarFoto = "UPDATE iniciosesion  SET foto=? where nombre=?";
                PreparedStatement ps = conexion.prepareStatement(almacenarFoto);
                FileInputStream fis = new FileInputStream(ruta);
                ps.setBinaryStream(1, fis);
                ps.setString(2, txtUsuarioLogin.getText());
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblFotoPerfilMouseClicked

    private void ocultarAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarAjustesMouseClicked
        verAjustes.setVisible(true);
        ocultarAjustes.setVisible(false);
        passNueva.setEchoChar('*');


    }//GEN-LAST:event_ocultarAjustesMouseClicked

    private void verAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verAjustesMouseClicked

        verAjustes.setVisible(false);
        ocultarAjustes.setVisible(true);
        passNueva.setEchoChar((char) 0);


    }//GEN-LAST:event_verAjustesMouseClicked

    private void btnInformeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInformeKeyPressed
        String txtResultado = txtAResultadosBusqueda.getText();
        if (txtResultado.equals("")) {
            JOptionPane alertaNoResultados = new JOptionPane();
            alertaNoResultados.showMessageDialog(null, "No se puede generar el informe sin resultados", "Informe",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("txtresultados", txtAResultadosBusqueda.getText());
            JasperReport mireporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/informe/goplaces.jasper"));
            File file = new File("src/informe/goplaces.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(mireporte, params, new JREmptyDataSource());

            String pdf = "src/informe/goplaces.pdf";
            JasperViewer jasperView;
            jasperView = new JasperViewer(jasperPrint, false);
            jasperView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jasperView.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnInformeKeyPressed

    private void btnContraUnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnContraUnoKeyPressed
        lblContraAjustesConfirmar.setEnabled(true);
        lblContraAjustes.setEnabled(true);
        passNueva.setEnabled(true);
        passNuevaConfirmar.setEnabled(true);
    }//GEN-LAST:event_btnContraUnoKeyPressed

    private void btnCambiarContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaKeyPressed

        try {

            String nombre = txtUsuarioLogin.getText();
            if (passNuevaConfirmar.getText().equals(passNueva.getText())) {
                String password = String.valueOf(passNueva.getPassword());

                //Encriptar la contraseña usando SHA-256
                String encryptedPassword;

                // INSERTAR UN NUEVO USUARIO
                encryptedPassword = encriptar(password);

                String sql = "UPDATE iniciosesion set contrasena='" + encryptedPassword + "' where nombre='" + nombre + "'";
                st = conexion.prepareStatement(sql);
                st.executeUpdate(sql);
                lblComprobarContrasena.setVisible(false);
                if (cmbIdioma.getSelectedItem().equals("Inglés")) {

                    JOptionPane.showMessageDialog(null, "Password update succesfully",
                            "Change password",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(null, "Contraseña cambiada correctamente",
                            "Cambio contraseña",
                            JOptionPane.INFORMATION_MESSAGE);

                }

            } else {
                lblComprobarContrasena.setText("Las contraseñas no son iguales");
                lblComprobarContrasena.setVisible(true);
                if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                    lblComprobarContrasena.setText("The passwords do not match");
                    lblComprobarContrasena.setVisible(true);
                } else {
                    lblComprobarContrasena.setText("Las contraseñas no son iguales");
                    lblComprobarContrasena.setVisible(true);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCambiarContraseñaKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login app = new Login();
                app.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirLugar;
    private javax.swing.JButton btnBuscarFiltros;
    private javax.swing.JButton btnBusquedaPorUsuario;
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JButton btnContraUno;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnInicio1;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegistroLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbEstacionamiento;
    private javax.swing.JComboBox<String> cmbIdioma;
    private goplaces.ComponenteMenu componenteMenu1;
    private javax.swing.JDialog dlgAjustes;
    private javax.swing.JDialog dlgAnadir;
    private javax.swing.JDialog dlgConsultar;
    private javax.swing.JDialog dlgMenu;
    private javax.swing.JDialog dlgPerfil;
    private javax.swing.JDialog dlgRegistro;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAcercade;
    private javax.swing.JLabel lblAnadirAtras;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblBorrarCuenta;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBusquedaUsuario;
    private javax.swing.JLabel lblCamposVacios;
    private javax.swing.JLabel lblCamposVaciosRegistro;
    private javax.swing.JLabel lblCerrarSesionAjustes;
    private javax.swing.JLabel lblComprobarContrasena;
    private javax.swing.JLabel lblConsultarAtras;
    private javax.swing.JLabel lblContraAjustes;
    private javax.swing.JLabel lblContraAjustesConfirmar;
    private javax.swing.JLabel lblContraRegistro;
    private javax.swing.JLabel lblCuantos;
    private javax.swing.JLabel lblElegirIdioma;
    private javax.swing.JLabel lblFajustes;
    private javax.swing.JLabel lblFanadir;
    private javax.swing.JLabel lblFconsultar;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblFotos;
    private javax.swing.JLabel lblFperfil;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JLabel lblLugar2;
    private javax.swing.JLabel lblLugar3;
    private javax.swing.JLabel lblLugar4;
    private javax.swing.JLabel lblLugar5;
    private javax.swing.JLabel lblLugar6;
    private javax.swing.JLabel lblNombreRegistro;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNombreapp;
    private javax.swing.JLabel lblNombreusuario;
    private javax.swing.JLabel lblPasswordUsuario;
    private javax.swing.JLabel lblPerfilAtras;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAnadir;
    private javax.swing.JLabel lblTituloConsultar;
    private javax.swing.JLabel lblajustes;
    private javax.swing.JLabel lblanadir;
    private javax.swing.JLabel lblconsultar;
    private javax.swing.JLabel lblexplicar;
    private javax.swing.JLabel lblgif;
    private javax.swing.JLabel lblperfil;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JLabel lblpreguntaciudad;
    private javax.swing.JLabel ocultar1;
    private javax.swing.JLabel ocultarAjustes;
    private javax.swing.JLabel ocultarR;
    private javax.swing.JPasswordField passNueva;
    private javax.swing.JPasswordField passNuevaConfirmar;
    private javax.swing.JPanel pnlAjusetsFondo;
    private javax.swing.JPanel pnlAjustes;
    private javax.swing.JPanel pnlAnadir;
    private javax.swing.JPanel pnlAnadirFondo;
    private javax.swing.JPanel pnlConsultar;
    private javax.swing.JPanel pnlConsultarFondo;
    private javax.swing.JPanel pnlFiltros;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlHotel;
    private javax.swing.JPanel pnlIniciarSesion;
    private javax.swing.JPanel pnlIniciarSesionFondo;
    private javax.swing.JPanel pnlMenuFondo;
    private javax.swing.JPanel pnlMonumentos;
    private javax.swing.JPanel pnlMuseos;
    private javax.swing.JPanel pnlPerfil;
    private javax.swing.JPanel pnlPerfilFondo;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlRegistroFondo;
    private javax.swing.JPanel pnlRestuarante;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JRadioButton rbHotel;
    private javax.swing.JRadioButton rbMonumento;
    private javax.swing.JRadioButton rbMuseo;
    private javax.swing.JRadioButton rbRestaurante;
    private javax.swing.JScrollPane scpHotel;
    private javax.swing.JSpinner spNumero;
    private javax.swing.JTextArea txtAHoteles;
    private javax.swing.JTextArea txtAMonumento;
    private javax.swing.JTextArea txtAMuseo;
    private javax.swing.JTextArea txtARestaurante;
    private javax.swing.JTextArea txtAResultadosBusqueda;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtBusquedaUsuario;
    private javax.swing.JPasswordField txtContraLogin;
    private javax.swing.JPasswordField txtContraRegistro;
    private javax.swing.JTextField txtLugarAnadir;
    private javax.swing.JTextField txtLugarAnadir2;
    private javax.swing.JTextField txtLugarAnadir3;
    private javax.swing.JTextField txtLugarAnadir4;
    private javax.swing.JTextField txtLugarAnadir5;
    private javax.swing.JTextField txtLugarAnadir6;
    private javax.swing.JTextField txtNombreCiudadAnadir;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JTextField txtUsuarioRegistro;
    private javax.swing.JLabel ver1;
    private javax.swing.JLabel verAjustes;
    private javax.swing.JLabel verR;
    // End of variables declaration//GEN-END:variables

    public void MostrarValores() {
        String lugar = (String) cmbEstacionamiento.getSelectedItem();

        if (spNumero.getValue().equals(1) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);

        }
        if (spNumero.getValue().equals(2) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);

            //JLabel no visibles
            lblLugar3.setVisible(false);
            txtLugarAnadir3.setVisible(false);
            lblLugar4.setVisible(false);
            txtLugarAnadir4.setVisible(false);
            lblLugar5.setVisible(false);
            txtLugarAnadir5.setVisible(false);
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(3) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);

            //JLabel no visibles 
            lblLugar4.setVisible(false);
            txtLugarAnadir4.setVisible(false);
            lblLugar5.setVisible(false);
            txtLugarAnadir5.setVisible(false);
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(4) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);
            lblLugar4.setVisible(true);
            txtLugarAnadir4.setVisible(true);

            //JLabel no visibles
            lblLugar5.setVisible(false);
            txtLugarAnadir5.setVisible(false);
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(5) && !lugar.equals("Lugares")) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);
            lblLugar4.setVisible(true);
            txtLugarAnadir4.setVisible(true);
            lblLugar5.setVisible(true);
            txtLugarAnadir5.setVisible(true);
            //JLabel no visibles
            lblLugar6.setVisible(false);
            txtLugarAnadir6.setVisible(false);
        }
        if (spNumero.getValue().equals(6)) {
            lblLugar.setVisible(true);
            txtLugarAnadir.setVisible(true);
            lblLugar2.setVisible(true);
            txtLugarAnadir2.setVisible(true);
            lblLugar3.setVisible(true);
            txtLugarAnadir3.setVisible(true);
            lblLugar4.setVisible(true);
            txtLugarAnadir4.setVisible(true);
            lblLugar5.setVisible(true);
            txtLugarAnadir5.setVisible(true);
            lblLugar6.setVisible(true);
            txtLugarAnadir6.setVisible(true);
        }

    }

    public void lugares() {
        lblLugar.setVisible(false);
        txtLugarAnadir.setVisible(false);
        lblLugar2.setVisible(false);
        txtLugarAnadir2.setVisible(false);
        lblLugar3.setVisible(false);
        txtLugarAnadir3.setVisible(false);
        lblLugar4.setVisible(false);
        txtLugarAnadir4.setVisible(false);
        lblLugar5.setVisible(false);
        txtLugarAnadir5.setVisible(false);
        lblLugar6.setVisible(false);
        txtLugarAnadir6.setVisible(false);
    }

    private String encriptar(String contra) {

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] contrasenaByte = contra.getBytes();
            byte[] hashedBytes = md.digest(contrasenaByte);
            StringBuilder sb = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                sb.append(String.format("%02x", hashedByte));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void lugar1() {

        if (!txtLugarAnadir.getText().equals("") && !txtNombreCiudadAnadir.getText().equals("")) {
            String insertQuery = "INSERT INTO lugar (nombrelugar,nombreciudad,estacionamiento,usuario) VALUES (?,?, ?,?)";

            try ( PreparedStatement statement = conexion.prepareStatement(insertQuery)) {

                String nombrelugar = txtLugarAnadir.getText();
                String ciudad = txtNombreCiudadAnadir.getText();
                String estacionamiento = (String) cmbEstacionamiento.getSelectedItem();
                String usuario = txtUsuarioLogin.getText();

                statement.setString(1, nombrelugar);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();
                if (!estacionamiento.equals("Lugares")) {
                    statement.executeBatch();
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes añadir esto", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                JOptionPane.showMessageDialog(null, "Please, fill in all the gaps to add a place", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos necesarios para poder añadir un nuevo lugar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void lugar2() {
        if (!txtLugarAnadir.getText().equals("") && !txtLugarAnadir2.getText().equals("") && !txtNombreCiudadAnadir.getText().equals("")) {
            String insertQuery = "INSERT INTO lugar (nombrelugar,nombreciudad,estacionamiento,usuario) VALUES (?,?, ?,?)";

            try ( PreparedStatement statement = conexion.prepareStatement(insertQuery)) {

                String lugar = txtLugarAnadir.getText();
                String ciudad = txtNombreCiudadAnadir.getText();
                String estacionamiento = (String) cmbEstacionamiento.getSelectedItem();
                String usuario = txtUsuarioLogin.getText();

                statement.setString(1, lugar);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar2 = txtLugarAnadir2.getText();
                statement.setString(1, lugar2);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                statement.executeBatch();

            } catch (SQLException e) {
                e.printStackTrace();

            }
        } else {
            if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                JOptionPane.showMessageDialog(null, "Please, fill in all the gaps to add a place", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos necesarios para poder añadir un nuevo lugar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void lugar3() {
        if (!txtLugarAnadir.getText().equals("") && !txtLugarAnadir2.getText().equals("") && !txtLugarAnadir3.getText().equals("") && !txtNombreCiudadAnadir.getText().equals("")) {
            String insertQuery = "INSERT INTO lugar (nombrelugar,nombreciudad,estacionamiento,usuario) VALUES (?,?, ?,?)";

            try ( PreparedStatement statement = conexion.prepareStatement(insertQuery)) {

                String lugar = txtLugarAnadir.getText();
                String ciudad = txtNombreCiudadAnadir.getText();
                String estacionamiento = (String) cmbEstacionamiento.getSelectedItem();
                String usuario = txtUsuarioLogin.getText();

                statement.setString(1, lugar);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar2 = txtLugarAnadir2.getText();
                statement.setString(1, lugar2);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar3 = txtLugarAnadir3.getText();
                statement.setString(1, lugar3);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                statement.executeBatch();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                JOptionPane.showMessageDialog(null, "Please, fill in all the gaps to add a place", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos necesarios para poder añadir un nuevo lugar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void lugar4() {
        if (!txtLugarAnadir.getText().equals("") && !txtLugarAnadir2.getText().equals("") && !txtLugarAnadir3.getText().equals("") && !txtLugarAnadir4.getText().equals("")
                && txtNombreCiudadAnadir.getText().equals("")) {
            String insertQuery = "INSERT INTO lugar (nombrelugar,nombreciudad,estacionamiento,usuario) VALUES (?,?, ?,?)";

            try ( PreparedStatement statement = conexion.prepareStatement(insertQuery)) {

                String lugar = txtLugarAnadir.getText();
                String ciudad = txtNombreCiudadAnadir.getText();
                String estacionamiento = (String) cmbEstacionamiento.getSelectedItem();
                String usuario = txtUsuarioLogin.getText();

                statement.setString(1, lugar);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar2 = txtLugarAnadir2.getText();
                statement.setString(1, lugar2);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar3 = txtLugarAnadir3.getText();
                statement.setString(1, lugar3);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                statement.executeBatch();

                String lugar4 = txtLugarAnadir4.getText();
                statement.setString(1, lugar4);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                statement.executeBatch();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                JOptionPane.showMessageDialog(null, "Please, fill in all the gaps to add a place", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos necesarios para poder añadir un nuevo lugar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void lugar5() {
        if (!txtLugarAnadir.getText().equals("") && !txtLugarAnadir2.getText().equals("") && !txtLugarAnadir3.getText().equals("") && !txtLugarAnadir4.getText().equals("") && !txtLugarAnadir5.getText().equals("")
                && !txtNombreCiudadAnadir.getText().equals("")) {

            String insertQuery = "INSERT INTO lugar (nombrelugar,nombreciudad,estacionamiento,usuario) VALUES (?,?, ?,?)";

            try ( PreparedStatement statement = conexion.prepareStatement(insertQuery)) {

                String lugar = txtLugarAnadir.getText();
                String ciudad = txtNombreCiudadAnadir.getText();
                String estacionamiento = (String) cmbEstacionamiento.getSelectedItem();
                String usuario = txtUsuarioLogin.getText();

                statement.setString(1, lugar);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar2 = txtLugarAnadir2.getText();
                statement.setString(1, lugar2);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar3 = txtLugarAnadir3.getText();
                statement.setString(1, lugar3);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar4 = txtLugarAnadir4.getText();
                statement.setString(1, lugar4);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar5 = txtLugarAnadir5.getText();
                statement.setString(1, lugar5);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                statement.executeBatch();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else {
            if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                JOptionPane.showMessageDialog(null, "Please, fill in all the gaps to add a place", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos necesarios para poder añadir un nuevo lugar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void lugar6() {
        if (!txtLugarAnadir.getText().equals("") && !txtLugarAnadir2.getText().equals("") && !txtLugarAnadir3.getText().equals("") && !txtLugarAnadir4.getText().equals("") && !txtLugarAnadir5.getText().equals("")
                && !txtLugarAnadir6.getText().equals("") && !txtNombreCiudadAnadir.getText().equals("")) {
            String insertQuery = "INSERT INTO lugar (nombrelugar,nombreciudad,estacionamiento,usuario) VALUES (?,?, ?,?)";

            try ( PreparedStatement statement = conexion.prepareStatement(insertQuery)) {

                String lugar = txtLugarAnadir.getText();
                String ciudad = txtNombreCiudadAnadir.getText();
                String estacionamiento = (String) cmbEstacionamiento.getSelectedItem();
                String usuario = txtUsuarioLogin.getText();

                statement.setString(1, lugar);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar2 = txtLugarAnadir2.getText();
                statement.setString(1, lugar2);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar3 = txtLugarAnadir3.getText();
                statement.setString(1, lugar3);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                String lugar4 = txtLugarAnadir4.getText();
                statement.setString(1, lugar4);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();
                statement.executeBatch();

                String lugar5 = txtLugarAnadir5.getText();
                statement.setString(1, lugar5);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();
                statement.executeBatch();

                String lugar6 = txtLugarAnadir6.getText();
                statement.setString(1, lugar6);
                statement.setString(2, ciudad);
                statement.setString(3, estacionamiento);
                statement.setString(4, usuario);
                statement.addBatch();

                statement.executeBatch();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            if (cmbIdioma.getSelectedItem().equals("Inglés")) {
                JOptionPane.showMessageDialog(null, "Please, fill in all the gaps to add a place", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos necesarios para poder añadir un nuevo lugar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void mostrarHotel() {
        try {
            String lugar = "Hotel";
            String selectPerfil = "SELECT nombrelugar,nombreciudad FROM lugar where estacionamiento='" + lugar + "' and usuario='" + txtUsuarioLogin.getText() + "'";
            System.out.println("SELECT nombrelugar,nombreciudad FROM lugar where estacionamiento='" + lugar + "' and usuario='" + txtUsuarioLogin.getText() + "'");
            rs = st.executeQuery(selectPerfil);
            StringBuilder resultadoCompleto = new StringBuilder();
            while (rs.next()) {

                String nombreLugar = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String resultado = nombreLugar + "-" + ciudad;
                resultadoCompleto.append(resultado).append("\n");

                txtAHoteles.setText(resultadoCompleto.toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Hotel() {
        try {
            String estacionamiento = "Hotel";
            String datos = "Select nombrelugar,nombreciudad from lugar where estacionamiento='" + estacionamiento + "' and usuario='" + txtUsuarioLogin.getText() + "'";
            rs = st.executeQuery(datos);
            StringBuilder resultadoCompleto = new StringBuilder();
            while (rs.next()) {
                String nombre = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String resultado = nombre + "-" + ciudad;
                resultadoCompleto.append(resultado).append("\n");

                txtAHoteles.setText(resultadoCompleto.toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Restaurante() {
        try {
            String estacionamiento = "Restaurante";
            String datos = "Select nombrelugar,nombreciudad from lugar where estacionamiento='" + estacionamiento + "' and usuario='" + txtUsuarioLogin.getText() + "'";
            rs = st.executeQuery(datos);
            StringBuilder resultadoCompleto = new StringBuilder();
            while (rs.next()) {
                String nombre = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String resultado = nombre + "-" + ciudad;
                resultadoCompleto.append(resultado).append("\n");

                txtARestaurante.setText(resultadoCompleto.toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Museo() {
        try {
            String estacionamiento = "Museo";
            String datos = "Select nombrelugar,nombreciudad from lugar where estacionamiento='" + estacionamiento + "' and usuario='" + txtUsuarioLogin.getText() + "'";
            rs = st.executeQuery(datos);
            StringBuilder resultadoCompleto = new StringBuilder();
            while (rs.next()) {
                String nombre = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String resultado = nombre + "-" + ciudad;
                resultadoCompleto.append(resultado).append("\n");

                txtAMuseo.setText(resultadoCompleto.toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Monumento() {
        try {
            String estacionamiento = "Monumento";
            String datos = "Select nombrelugar,nombreciudad from lugar where estacionamiento='" + estacionamiento + "' and usuario='" + txtUsuarioLogin.getText() + "'";
            rs = st.executeQuery(datos);
            StringBuilder resultadoCompleto = new StringBuilder();
            while (rs.next()) {
                String nombre = rs.getString("nombrelugar");
                String ciudad = rs.getString("nombreciudad");
                String resultado = nombre + "-" + ciudad;
                resultadoCompleto.append(resultado).append("\n");

                txtAMonumento.setText(resultadoCompleto.toString());

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingles() throws SQLException {
        idioma = (String) cmbIdioma.getSelectedItem();
        String estac = (String) cmbEstacionamiento.getSelectedItem();
        Font fuente = new Font("Arial", Font.BOLD, 18);
        if (idioma.equals("Inglés")) {
            String nombre = txtUsuarioLogin.getText();
            String password = txtContraLogin.getText();

            String hashedPassword = encriptar(password);
            String select = "SELECT nombre, contrasena FROM iniciosesion WHERE nombre=?";
            PreparedStatement statement = conexion.prepareStatement(select);
            statement.setString(1, nombre);

            rs = statement.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("contrasena");

                // Verificar si las contraseñas coinciden
                if (hashedPassword.equals(storedPassword)) {
                    String nom = rs.getString("nombre");
                    lblBienvenida.setText("Welcome " + nom.toUpperCase());
                    lblNombreusuario.setText(nom.toUpperCase());
                }
            }
            lblNombreUsuario.setText("Name");
            lblPasswordUsuario.setText("Password");
            btnInicio1.setText("Login");
            btnRegistroLogin.setText("Create an account");
            lblNombreRegistro.setText("Name");
            lblContraRegistro.setText("Password");
            btnRegistro.setText("Login");

            lblperfil.setFont(fuente);
            lblanadir.setFont(fuente);
            lblajustes.setFont(fuente);
            lblconsultar.setFont(fuente);
            pnlPerfil.setToolTipText("Check your user profile");
            pnlAnadir.setToolTipText("Add some places");
            pnlAjustes.setToolTipText("Check your account settings");
            pnlConsultar.setToolTipText("Consult a wide variety of fascinating places: restaurant, museum, hotel, monument");
            lblperfil.setText("Profile");
            lblanadir.setText("Add place");
            lblconsultar.setText("Search place");
            lblajustes.setText("Settings");
            lblexplicar.setText("Explore below some incredible places in the world with a single click");
            lblComprobarContrasena.setText("Passwords do not match");

            //perfil
            TitledBorder borderHotel = BorderFactory.createTitledBorder("Hotel typed by you");
            borderHotel.setTitleFont(fuente);
            pnlHotel.setBorder(borderHotel);

            TitledBorder borderRestaurante = BorderFactory.createTitledBorder("Restaurant typed by you");
            borderRestaurante.setTitleFont(fuente);
            pnlRestuarante.setBorder(borderRestaurante);

            TitledBorder borderMuseo = BorderFactory.createTitledBorder("Museum typed by you");
            borderMuseo.setTitleFont(fuente);
            pnlMuseos.setBorder(borderMuseo);

            TitledBorder borderMonumento = BorderFactory.createTitledBorder("Monument typed by you");
            borderMonumento.setTitleFont(fuente);
            pnlMonumentos.setBorder(borderMonumento);

            //consultar
            lblBusquedaUsuario.setText("Search by user");
            rbHotel.setText("Hotel");
            rbMonumento.setText("Monument");
            rbMuseo.setText("Museum");
            rbRestaurante.setText("Restaurant");
            btnBuscarFiltros.setText("Search");
            btnBusquedaPorUsuario.setText("Search");
            btnInforme.setText("Generate report");
            txtBusqueda.setText("Type here you search by city");
            this.CambioIdiomaMenuAjustes();
            //añadir
            lblpregunta.setText("What do you want to add?");
            lblpreguntaciudad.setText("What is the name of the city?");
            lblCuantos.setText("How many?");
            btnAnadirLugar.setText("Add");
            lblTituloAnadir.setText("GOPLACES-ADD");
            lblTituloConsultar.setText("GOPLACES-SEARCH");
            btnContraUno.setText("Do you want to change your password?");
            lblContraAjustes.setText("Change password");
            lblContraAjustesConfirmar.setText("Type again your password to confirm");
            btnCambiarContraseña.setText("Change password");
            lblElegirIdioma.setText("Choose lenaguaje");
            lblTema.setText("Choose theme");
            lblFiltros.setText("Filters");
            btnCambiarContraseña.setText("Change password");
            lblAcercade.setText("About...");
            lblSalir.setText("Exit");
            lblCerrarSesionAjustes.setText("Sign off");
            lblBorrarCuenta.setText("Delete account");
            //bordes de los paneles
            TitledBorder border = BorderFactory.createTitledBorder("Login");
            pnlIniciarSesion.setBorder(border);
            border.setTitleFont(fuente);

            TitledBorder borderRegistro = BorderFactory.createTitledBorder("Create an account");
            borderRegistro.setTitleFont(fuente);
            pnlRegistro.setBorder(borderRegistro);
            String lugar = (String) cmbEstacionamiento.getSelectedItem();
            int valor = (int) spNumero.getValue();
            String idioma = (String) cmbIdioma.getSelectedItem();
            String restaruante = "";
            String hotel = "";
            String museo = "";
            String monumento = "";

            if (estac.equals("Hotel")) {
                if (idioma.equals("Inglés")) {
                    hotel = "Hotel";
                    lblLugar.setText(hotel);
                    lblLugar2.setText(hotel);
                    lblLugar3.setText(hotel);
                    lblLugar4.setText(hotel);
                    lblLugar5.setText(hotel);
                    lblLugar6.setText(hotel);

                } else {
                    lblLugar.setText("Hotel");
                    lblLugar2.setText("Hotel");
                    lblLugar3.setText("Hotel");
                    lblLugar4.setText("Hotel");
                    lblLugar5.setText("Hotel");
                    lblLugar6.setText("Hotel");
                }

            }
            if (estac.equals("Restaurante")) {
                if (idioma.equals("Inglés")) {
                    restaruante = "Restaurant";
                    lblLugar.setText(restaruante);
                    lblLugar2.setText(restaruante);
                    lblLugar3.setText(restaruante);
                    lblLugar4.setText(restaruante);
                    lblLugar5.setText(restaruante);
                    lblLugar6.setText(restaruante);

                } else {
                    lblLugar.setText("Restaurante");
                    lblLugar2.setText("Restaurante");
                    lblLugar3.setText("Restaurante");
                    lblLugar4.setText("Restaurante");
                    lblLugar5.setText("Restaurante");
                    lblLugar6.setText("Restaurante");
                }

            }
            if (estac.equals("Museo")) {
                if (idioma.equals("Inglés")) {
                    museo = "Museum";
                    lblLugar.setText(museo);
                    lblLugar2.setText(museo);
                    lblLugar3.setText(museo);
                    lblLugar4.setText(museo);
                    lblLugar5.setText(museo);
                    lblLugar6.setText(museo);
                } else {
                    lblLugar.setText("Museo");
                    lblLugar2.setText("Museo");
                    lblLugar3.setText("Museo");
                    lblLugar4.setText("Museo");
                    lblLugar5.setText("Museo");
                    lblLugar6.setText("Museo");

                }

            }
            if (estac.equals("Monumento")) {
                if (idioma.equals("Inglés")) {
                    monumento = "Monument";
                    lblLugar.setText(monumento);
                    lblLugar2.setText(monumento);
                    lblLugar3.setText(monumento);
                    lblLugar4.setText(monumento);
                    lblLugar5.setText(monumento);
                    lblLugar6.setText(monumento);

                } else {
                    lblLugar.setText("Monumento");
                    lblLugar2.setText("Monumento");
                    lblLugar3.setText("Monumento");
                    lblLugar4.setText("Monumento");
                    lblLugar5.setText("Monumento");
                    lblLugar6.setText("Monumento");
                }

            }
        }
    }

    public void CambioIdiomaMenuAjustes() {

        componenteMenu1.cambioIdioma(idioma);

    }

    public void espaniol() {
        try {
            String estacionamiento = (String) cmbEstacionamiento.getSelectedItem();
            this.idioma = "Español";
            //Jlabels y Botones
            lblTema.setText("Elige tema");
            lblNombreUsuario.setText("Nombre");
            lblPasswordUsuario.setText("Contraseña");
            btnInicio1.setText("Iniciar Sesión");
            btnRegistroLogin.setText("Registrate");
            lblNombreRegistro.setText("Nombre");
            lblContraRegistro.setText("Contraseña");
            lblComprobarContrasena.setText("Las contraseñas no son iguales");
            btnRegistro.setText("Iniciar Sesión");
            //menú
            pnlPerfil.setToolTipText("Consulta tu cuenta de usuario");
            pnlAnadir.setToolTipText("Añade nuevos lugares");
            pnlAjustes.setToolTipText("Consulta tus ajustes de cuentaCheck your account settings");
            pnlConsultar.setToolTipText("Consulta una gran variedad de lugares fascinantes: restaurantes, museos, hoteles, monumentos");
            lblperfil.setText("PERFIL DE USUARIO");
            lblanadir.setText("AÑADIR LUGAR");
            lblconsultar.setText("CONSULTAR LUGAR");
            lblajustes.setText("AJUSTES DE USUARIO");
            lblexplicar.setText("Explora aquí abajo algunos increibles lugares del mundo con un solo clic");
            String nombre = txtUsuarioLogin.getText();
            String password = txtContraLogin.getText();
            this.CambioIdiomaMenuAjustes();
            String hashedPassword = encriptar(password);

            String select = "SELECT nombre, contrasena FROM iniciosesion WHERE nombre=?";
            PreparedStatement statement = conexion.prepareStatement(select);
            statement.setString(1, nombre);

            rs = statement.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("contrasena");

                // Verificar si las contraseñas coinciden
                if (hashedPassword.equals(storedPassword)) {
                    String nom = rs.getString("nombre");
                    lblBienvenida.setText("Bienvenid@ " + nom.toUpperCase());
                    lblNombreusuario.setText(nom.toUpperCase());
                }
            }
            Font fuente = new Font("Arial", Font.BOLD, 18);
            //perfil
            TitledBorder borderHotel = BorderFactory.createTitledBorder("Hoteles esritos por usted");
            borderHotel.setTitleFont(fuente);
            pnlHotel.setBorder(borderHotel);

            TitledBorder borderRestaurante = BorderFactory.createTitledBorder("Restaurantes escritos por usted");
            borderRestaurante.setTitleFont(fuente);
            pnlRestuarante.setBorder(borderRestaurante);

            TitledBorder borderMuseo = BorderFactory.createTitledBorder("Musos escritos or usted");
            borderMuseo.setTitleFont(fuente);
            pnlMuseos.setBorder(borderMuseo);

            TitledBorder borderMonumento = BorderFactory.createTitledBorder("Monumentos escritos por usted");
            borderMonumento.setTitleFont(fuente);
            pnlMonumentos.setBorder(borderMonumento);

            //consultar
            lblBusquedaUsuario.setText("Búsuqeda por usuario");
            rbHotel.setText("Hotel");
            rbMonumento.setText("Monumento");
            rbMuseo.setText("Museo");
            rbRestaurante.setText("Restaurante");
            btnBuscarFiltros.setText("Buscar");
            btnBusquedaPorUsuario.setText("Buscar");
            btnInforme.setText("Generar reporte");
            txtBusqueda.setText("Escribe aquí su búsqueda por ciudad(Madrid,Londres,Dublín,Barcelona...)");
            //añadir
            lblpregunta.setText("¿Qué quieres añadir?");
            lblpreguntaciudad.setText("¿Cuál es el nombre de la ciudad?");
            lblCuantos.setText("¿Cuántos?");
            btnAnadirLugar.setText("AÑADIR");
            lblTituloAnadir.setText("GOPLACES-AÑADIR");
            lblTituloConsultar.setText("GOPLACES-CONSULTAR");
            btnContraUno.setText("¿Quieres cambiar tu contraseña?");
            lblContraAjustes.setText("Cambiar contraseña");
            lblContraAjustesConfirmar.setText("Escribe otra vez tu contraseña para confirmar");
            btnCambiarContraseña.setText("Cambiar contraseña");
            lblElegirIdioma.setText("Elige el lenguaje");
            lblFiltros.setText("Filtros");
            lblAcercade.setText("Acerca de");
            lblSalir.setText("Salir");
            lblCerrarSesionAjustes.setText("Cerrar Sesión");
            lblBorrarCuenta.setText("Borrar cuenta");
            lblComprobarContrasena.setText("Las contraseñas no son iguales");
            //bordes de los paneles
            TitledBorder border = BorderFactory.createTitledBorder("Iniciar Sesión");
            pnlIniciarSesion.setBorder(border);
            border.setTitleFont(fuente);

            TitledBorder borderRegistro = BorderFactory.createTitledBorder("Registrate");
            borderRegistro.setTitleFont(fuente);
            pnlRegistro.setBorder(borderRegistro);

            String idioma = (String) cmbIdioma.getSelectedItem();
            String restaruante = "";
            String hotel = "";
            String museo = "";
            String monumento = "";

            if (estacionamiento.equals("Hotel")) {
                if (idioma.equals("Inglés")) {
                    hotel = "Hotel";
                    lblLugar.setText(hotel);
                    lblLugar2.setText(hotel);
                    lblLugar3.setText(hotel);
                    lblLugar4.setText(hotel);
                    lblLugar5.setText(hotel);
                    lblLugar6.setText(hotel);

                } else {
                    lblLugar.setText("Hotel");
                    lblLugar2.setText("Hotel");
                    lblLugar3.setText("Hotel");
                    lblLugar4.setText("Hotel");
                    lblLugar5.setText("Hotel");
                    lblLugar6.setText("Hotel");
                }

            }
            if (estacionamiento.equals("Restaurante")) {
                if (idioma.equals("Inglés")) {
                    restaruante = "Restaurante";
                    lblLugar.setText(restaruante);
                    lblLugar2.setText(restaruante);
                    lblLugar3.setText(restaruante);
                    lblLugar4.setText(restaruante);
                    lblLugar5.setText(restaruante);
                    lblLugar6.setText(restaruante);

                } else {
                    lblLugar.setText("Restaurante");
                    lblLugar2.setText("Restaurante");
                    lblLugar3.setText("Restaurante");
                    lblLugar4.setText("Restaurante");
                    lblLugar5.setText("Restaurante");
                    lblLugar6.setText("Restaurante");
                }

            }
            if (estacionamiento.equals("Museo")) {
                if (idioma.equals("Inglés")) {
                    museo = "Museo";
                    lblLugar.setText(museo);
                    lblLugar2.setText(museo);
                    lblLugar3.setText(museo);
                    lblLugar4.setText(museo);
                    lblLugar5.setText(museo);
                    lblLugar6.setText(museo);
                }

            }
            if (estacionamiento.equals("Monumento")) {
                if (idioma.equals("Inglés")) {
                    monumento = "Monumento";
                    lblLugar.setText(restaruante);
                    lblLugar2.setText(monumento);
                    lblLugar3.setText(monumento);
                    lblLugar4.setText(monumento);
                    lblLugar5.setText(monumento);
                    lblLugar6.setText(monumento);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
