package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class socket {

    public static void main(String[] args) {
        int portNumber = 12145; // ��Ʈ ��ȣ
        
        Frame.main(args);
        
        try {
            // ���� ���� ����
            ServerSocket serverSocket = new ServerSocket(portNumber);

            System.out.println("������ ���۵Ǿ����ϴ�. Ŭ���̾�Ʈ ���� ��� ��...");

            while (true) {
                // Ŭ���̾�Ʈ ���� ���
                Socket clientSocket = serverSocket.accept();

                // ������ ������ ���� �Է� ��Ʈ��
                BufferedReader inStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // Ŭ���̾�Ʈ�κ��� ������ �ޱ�
                String inputData = inStream.readLine();
                Frame.updateHeartRate(inputData);

                // ���� �ݱ�
                clientSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}