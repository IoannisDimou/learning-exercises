package gr.aueb.cf.oopProgramming.ch3;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.*;


public class FileServer extends Thread {

    private static final Logger logger = Logger.getLogger(FileServer.class.getName());

        @Override
        public void run() {
            ServerSocket serv;

            try {
                serv = new ServerSocket(0);
                int port = serv.getLocalPort();

                Files.writeString(Paths.get("server_port.txt"), String.valueOf(port));

                System.out.println("Server started on port " + port);

                for (;;) {
                    Socket connected = serv.accept();
                    new ClientHandler(connected).start();
                }
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Server error", e);
            }
        }

}
