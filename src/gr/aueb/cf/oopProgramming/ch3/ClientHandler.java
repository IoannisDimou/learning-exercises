package gr.aueb.cf.oopProgramming.ch3;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientHandler extends Thread {
    private final Socket socket;
    private static final Logger logger = Logger.getLogger(ClientHandler.class.getName());

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ) {
            String filePath = reader.readLine();

            File file = new File(filePath);

            if (file.exists() && file.isFile()) {
                try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = fileReader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            } else {
                writer.write("ERROR: File not found\n");
            }
            writer.flush();

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error handling client", e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Error closing socket", e);
            }
        }
    }

}
