/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goplaces;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ComponenteMenu extends JPanel {

    private Color color;
    JLabel perfil = new JLabel("Perfil");
    JLabel menu = new JLabel("Menú");
    JLabel logo = new JLabel("GoPlaces");
    JLabel anadir = new JLabel("Añadir");
    JLabel consultar = new JLabel("Consultar");
    Login login;
    private final String ESPAÑOL = "Español";
    private final String INGLES = "Inglés";

    public ComponenteMenu() {
        color = Color.BLACK;

        perfil();
        anadir();
        consultar();
        menu();
        logo();

    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void perfil() {
        perfil.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    JDialog parentFrame = (JDialog) SwingUtilities.getWindowAncestor(perfil);
                    parentFrame.setVisible(true);
                    login.getDlgPerfil();
                    login.ingles();

                } catch (SQLException ex) {
                    Logger.getLogger(ComponenteMenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
    }

    public JLabel getPerfil() {
        return perfil;
    }

    public void cambioIdioma(String idioma) {
        if (idioma.equals(this.INGLES)) {
            this.perfil.setText("Profile");
            this.consultar.setText("Search");
            this.anadir.setText("Add");
        } else if (idioma.equals(this.ESPAÑOL)) {
            this.perfil.setText("Perfil");
            this.consultar.setText("Consultar");
            this.anadir.setText("Añadir ");
        }
    }

    public void setPerfil(JLabel perfil) {
        this.perfil = perfil;
        perfil.revalidate();
    }

    public void anadir() {
        anadir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    JDialog parentFrame = (JDialog) SwingUtilities.getWindowAncestor(anadir);
                    parentFrame.setVisible(true);
                    login.getDlgAnadir();
                    login.ingles();
                } catch (SQLException ex) {
                    Logger.getLogger(ComponenteMenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        );

    }

    public void menu() {
        menu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    JDialog parentFrame = (JDialog) SwingUtilities.getWindowAncestor(menu);
                    parentFrame.setVisible(true);

                    login.getDlgMenu();
                    login.ingles();
                } catch (SQLException ex) {
                    Logger.getLogger(ComponenteMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

    public void consultar() {
        consultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    JDialog parentFrame = (JDialog) SwingUtilities.getWindowAncestor(consultar);
                    parentFrame.setVisible(true);
                    login.getDlgConsultar();
                    login.ingles();
                } catch (SQLException ex) {
                    Logger.getLogger(ComponenteMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
    }

    public void logo() {
        logo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logo.setToolTipText("GoPlaces, el lugar donde los viajes se hacen realidad");
            }

        });

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody  
        Color rgb = new Color(0, 117, 0);
        g.setColor(rgb);
        int width = this.getWidth();
        int height = this.getHeight();
        g.fillRect(0, 0, 130 * width, 15 * height);

        Font fuente = new Font("Arial", Font.BOLD, 16);
        this.logo.setFont(fuente);
        this.logo.setBounds(50, 5, 100, 100);
        this.logo.setForeground(Color.WHITE);
        add(this.logo);

        Font fPerfil = new Font("Arial", Font.BOLD, 16);
        this.perfil.setFont(fPerfil);
        this.perfil.setBounds(400, 5, 100, 100);
        this.perfil.setForeground(Color.WHITE);
        add(this.perfil);

        Font fanadir = new Font("Arial", Font.BOLD, 16);
        this.anadir.setFont(fanadir);
        this.anadir.setBounds(650, 5, 100, 100);
        this.anadir.setForeground(Color.WHITE);
        add(this.anadir);

        Font fconsultar = new Font("Arial", Font.BOLD, 16);
        this.consultar.setFont(fconsultar);
        this.consultar.setBounds(900, 5, 100, 100);
        this.consultar.setForeground(Color.WHITE);
        add(this.consultar);

        Font fmenu = new Font("Arial", Font.BOLD, 16);
        this.menu.setFont(fmenu);
        this.menu.setBounds(1150, 5, 100, 100);
        this.menu.setForeground(Color.WHITE);
        add(this.menu);

    }

}
