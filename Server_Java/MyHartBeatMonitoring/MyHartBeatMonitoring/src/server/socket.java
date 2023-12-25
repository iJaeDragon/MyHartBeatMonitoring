package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class socket {

    public static void main(String[] args) {
        int portNumber = 12145; // 포트 번호
        
        Frame.main(args);
        
        try {
            // 서버 소켓 생성
            ServerSocket serverSocket = new ServerSocket(portNumber);

            System.out.println("서버가 시작되었습니다. 클라이언트 연결 대기 중...");

            while (true) {
                // 클라이언트 연결 대기
                Socket clientSocket = serverSocket.accept();

                // 데이터 수신을 위한 입력 스트림
                BufferedReader inStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // 클라이언트로부터 데이터 받기
                String inputData = inStream.readLine();
                Frame.updateHeartRate(inputData);

                // 소켓 닫기
                clientSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}