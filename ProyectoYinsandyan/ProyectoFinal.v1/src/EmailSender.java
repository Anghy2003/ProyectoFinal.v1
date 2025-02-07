
import Conexion.Conexion_db;
import Models.Cliente;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class EmailSender {
    // Método para enviar correo con adjunto
    public static void enviarCorreoConAdjunto(String destinatario, String asunto, String cuerpo, String rutaAdjunto) {
        // Configuración del servidor de correo
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // Servidor SMTP de Gmail
        props.put("mail.smtp.port", "587"); // Puerto SMTP de Gmail
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // TLS

        // La contraseña de la aplicación generada en lugar de la contraseña de tu cuenta de Google
        String username = "yingsyyangmecanica@gmail.com";
        String password = "wkwrppwavqchijor"; // Esta es la contraseña de aplicación generada

        // Autenticación
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Crear el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(asunto);

            // Crear la parte del mensaje
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(cuerpo);

            // Crear la parte del archivo adjunto
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(rutaAdjunto);
            attachmentBodyPart.setDataHandler(new DataHandler(source));
            attachmentBodyPart.setFileName(new File(rutaAdjunto).getName());

            // Combinar las partes del mensaje
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentBodyPart);

            // Configurar el contenido del mensaje
            message.setContent(multipart);

            // Enviar el mensaje
            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Correo enviado con éxito!");

        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + e.getMessage());
        }
    }

    // Método para obtener el correo del cliente desde Db4o
    public static String obtenerCorreoCliente(int clienteId) {
        String correo = null;
        ObjectContainer db = Conexion_db.ConectarBD(); // Conectar a la base de datos

        // Crear la consulta para buscar el cliente por ID
        Query query = db.query();
        query.constrain(Cliente.class);
        query.descend("iD_Cliente").constrain(clienteId);
        ObjectSet<Cliente> resultado = query.execute();

        if (resultado.hasNext()) {
            Cliente cliente = resultado.next();
            correo = cliente.getCorreo();
        }

        db.close();
        return correo;
    }

    public static void main(String[] args) {
        // Obtener el correo del cliente desde la base de datos
        int clienteId = 1; // ID del cliente (modifica según sea necesario)
        String clienteCorreo = obtenerCorreoCliente(clienteId);

        if (clienteCorreo != null) {
            String asunto = "Recibo de Factura";
            String cuerpo = "Estimado cliente, adjuntamos su recibo de factura. Gracias por su preferencia.";
            String rutaAdjunto = "ruta/al/archivo/recibo.pdf"; // Ruta al archivo adjunto (modifica según sea necesario)

            // Enviar correo al cliente
            enviarCorreoConAdjunto(clienteCorreo, asunto, cuerpo, rutaAdjunto);
        } else {
            System.out.println("No se encontró el correo del cliente.");
        }
    }
}
