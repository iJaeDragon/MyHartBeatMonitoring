package server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame {
    private static int initialX, initialY;
    private static JLabel label;

    public static void main(String[] args) {
        // ������ ����
        JFrame frame = new JFrame("Heart Beat Monitoring");
        frame.setUndecorated(true);  // ������ ����
        frame.setAlwaysOnTop(true);  // �ֻ�ܿ� ����

        // �� ����
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 48));
        label.setForeground(Color.RED);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // ���� �����ӿ� �߰�
        frame.getContentPane().add(label);

        // ������ ũ�� ����
        frame.setSize(300, 200);

        // �������� ���� �� ���α׷� ���� ����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ���콺 �̺�Ʈ ó��
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

        // ������ ǥ��
        frame.setVisible(true);
    }

    public static void updateHeartRate(String heartRate) {
        label.setText(heartRate);
    }
}