package cyber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameCyber {
    public static void main(String[] args) {
        // 新しいJFrameを作成
        JFrame frame = new JFrame("JFrame Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(300, 200);
        frame.setLayout(null);

        // ボタンを作成
        JButton button = new JButton("Push");
        button.setBounds(100, 70, 100, 30);

        // ボタンにアクションリスナーを追加
        // button.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(frame, "Hello");
        //     }
        // });

        // ボタンをフレームに追加
        frame.add(button);

        // フレームを表示可能にする
        frame.setVisible(true);
    }
}