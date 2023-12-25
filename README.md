# MyHartBeatMonitoring

![image](https://github.com/iJaeDragon/MyHartBeatMonitoring/assets/66985977/e644c5a9-2157-4a18-a94c-771005fc0281)

https://github.com/iJaeDragon/MyHartBeatMonitoring/assets/66985977/f8d7c7f9-ef93-4678-b475-a217253aa73a

## Android Sensor Client

<table>
    <tr>
        <th>Android Studio</th>
        <td>android-studio-2022.3.1.21-windows</td>
    </tr>
    <tr>
        <th>Project Templates</th>
        <td>Wear OS</td>
    </tr>
    <tr>
        <th>Minimum SDK</th>
        <td>API 30  ("30"; Android 11.0)</td>
    </tr>
    <tr>
        <th>Build configuration language</th>
        <td>Groovy DSL (build.gradle)</td>
    </tr>
    <tr>
        <th>Development language</th>
        <td>Kotlin</td>
    </tr>
    <tr>
        <th>Android Gradle Plugin Version</th>
        <td>8.1.3</td>
    </tr>
    <tr>
        <th>Gradle Version</th>
        <td>8.0</td>
    </tr>
    <tr>
        <th>JDK</th>
        <td>jdk-8u191-windows-x64</td>
    </tr>
</table>

<table>
    <tr>
        <th>
            Required Permission List
        </th>
    </tr>
    <tr>
        <td>
            WAKE_LOCK
        </td>
    </tr>
    <tr>
        <td>
            BODY_SENSORS
        </td>
    </tr>
    <tr>
        <td>
            INTERNET
        </td>
    </tr>
</table>


### MainActivity.kt

My Monitoring Server of ip and port Setting

```
···
var tcpClient = TcpClient("192.168.35.62", 12145)
···
```

## Java Monitoring Server

<table>
    <tr>
        <th>Eclipse</th>
        <td>eclipse-jee-2019-09-R-win32-x86_64</td>
    </tr>
    <tr>
        <th>JDK</th>
        <td>jdk-8u191-windows-x64</td>
    </tr>
</table>


### socket.java

Server Port Setting

```
···
int portNumber = 12145; // 포트 번호
···
```