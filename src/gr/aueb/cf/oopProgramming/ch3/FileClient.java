package gr.aueb.cf.oopProgramming.ch3;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClient {

    private static final Logger logger = Logger.getLogger(FileServer.class.getName());

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Socket socket = null;

        try {
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int servPort = Integer.parseInt(Files.readString(Path.of("server_port.txt")).trim());

            socket = new Socket(serverAddress, servPort);

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //writer.write("src/gr/aueb/cf/oopProgramming/ch3/test.txt\n");
            writer.write("C:\\Windows\\System32\\config\\SAM\n");

            writer.flush();

            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";

            while ((line = bf.readLine()) != null) sb.append(line).append("\n");

            System.out.println(sb);


        } catch (IOException e) {
            logger.log(Level.SEVERE, "Server error", e);
        } finally {
            try {
                if (socket != null) socket.close();
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Server error", e);
            }
        }
    }

}
