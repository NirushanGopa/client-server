package it.gopalakrishnan;
import java.io.*;
import java.net.*;

public class Client 
{
    String nomeServeString = "nome Server";
    int portaServer = 6789;
    DataInputStream in;
    DataOutputStream out; 

    protected Socket connetti () throws IOException
    {
        Socket socket = new Socket(nomeServeString, portaServer);

        out = new DataOutputStream(socket.getOutputStream());
        in = new DataInputStream(socket.getInputStream());

        return socket;
    }
}
