package com.example.myhartbeat.modules

import java.io.OutputStream
import java.net.Socket

class TcpClient {

    var ip: String = ""
    var port: Int = 0

    constructor(ip: String, port: Int) {
        this.ip = ip
        this.port = port
    }

    fun sendData(data: String) {
        Thread {
            try {
                // 서버에 연결 (로컬 PC의 IP 주소를 사용하고 포트 번호는 서버와 동일하게)
                val socket = Socket(ip, port)

                // 데이터 전송을 위한 출력 스트림
                val outputStream: OutputStream = socket.getOutputStream()

                // 데이터 전송
                outputStream.write(data.toByteArray())

                // 소켓 닫기
                socket.close()

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.start()
    }
}