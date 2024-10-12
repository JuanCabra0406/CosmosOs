
package Udec.co;


import java.awt.BorderLayout;
import java.io.File;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javafx.embed.swing.JFXPanel;

public class Video extends JFrame {
    private JFXPanel jfxPanel; // Asegúrate de tener el JFXPanel declarado
    private JPanel jPanel1; // Asume que tienes un JPanel

    public Video() {
        jfxPanel = new JFXPanel(); // Inicializa el JFXPanel
        jPanel1 = new JPanel(); // Inicializa el JPanel
        initComponents();
        createScene();
        setUndecorated(true);
        setTitle("Carga");
        setResizable(false);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel, BorderLayout.CENTER);
        this.add(jPanel1); // Asegúrate de agregar el JPanel al JFrame
        pack();
        setSize(1200, 716); // Establece un tamaño adecuado para tu ventana
        setLocationRelativeTo(null); // Corrige la función de ubicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece la operación de cierre
    }

    private void createScene() {
        Platform.runLater(() -> {
            // Convierte la ruta del archivo en una URI válida
            String videoPath = "C:\\Users\\areva\\OneDrive\\Documentos\\NetBeansProjects\\ejemplo\\src\\Nueva_carpeta\\Video.mp4";
            File videoFile = new File(videoPath);
            
            // Verifica si el archivo existe
            if (videoFile.exists()) {
                // Convierte la ruta del archivo en una URL compatible con JavaFX
                Media media = new Media(videoFile.toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                MediaView mediaView = new MediaView(mediaPlayer);

                // Crea la escena y la asigna al JFXPanel
                Scene scene = new Scene(new Group(mediaView));
                jfxPanel.setScene(scene);

                // Reproduce el video
                mediaPlayer.play();
                
                mediaPlayer.setOnEndOfMedia(() -> {
                    Platform.runLater(() -> {
                        Cosmos Cosmos1 = new Cosmos();
                        Cosmos1.setVisible(true);
                        Video.this.dispose(); // Cierra la ventana
                    });
                });
            } else {
                System.out.println("El archivo de video no fue encontrado: " + videoPath);
            }
        });
    }

    private void initComponents() {
        // Inicializa otros componentes si es necesario
    }

    public static void main(String[] args) {
        // Inicia la aplicación
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Video().setVisible(true);
        });
    }
}

