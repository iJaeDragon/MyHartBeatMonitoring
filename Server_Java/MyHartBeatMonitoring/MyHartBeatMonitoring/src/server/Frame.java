package server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame {
    private static int initialX, initialY;
    private static JLabel label;

    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Heart Beat Monitoring");
        frame.setUndecorated(true);  // 상태줄 제거
        frame.setAlwaysOnTop(true);  // 최상단에 고정

        // 라벨 생성
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 48));
        label.setForeground(Color.RED);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // 라벨을 프레임에 추가
        frame.getContentPane().add(label);

        // 프레임 크기 설정
        frame.setSize(300, 200);

        // 프레임을 닫을 때 프로그램 종료 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 마우스 이벤트 처리
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialX = e.getX();
                initialY = e.getY();
            }
        });

        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int newX = frame.getLocation().x + e.getX() - initialX;
                int newY = frame.getLocation().y + e.getY() - initialY;
                frame.setLocation(newX, newY);
            }
        });

        // 프레임 표시
        frame.setVisible(true);
    }

    public static void updateHeartRate(String heartRate) {
        label.setText(heartRate);
    }
}