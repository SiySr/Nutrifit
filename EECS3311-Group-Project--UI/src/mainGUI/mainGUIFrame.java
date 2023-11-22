package mainGUI;

import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Exercise.ExerciseUI;
import Meal.mealLogFrame;

public class mainGUIFrame extends JFrame implements ActionListener {
    JFrame guiFrame = new JFrame();
    JButton mealFrameButton = new JButton("Log Meal");
    JButton exerciseFrameButton = new JButton("Log Exercise");
    JButton visualizeFrameButton = new JButton("Visualize");
    JButton editProfileButton = new JButton("Edit Profile");
    JButton settingsButton = new JButton("Settings");
    JLabel profileLabel;

    public mainGUIFrame(String selectedProfile) {
        mealFrameButton.addActionListener(this);
        exerciseFrameButton.addActionListener(this);
        visualizeFrameButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setSize(400, 300);

        JPanel mainPanel = new JPanel();
        JPanel userPanel = new JPanel();
        JPanel settingsPanel = new JPanel();
        userPanel.setLayout(new GridLayout(1, 6));
        settingsPanel.setLayout(new GridLayout(1, 2));
        mainPanel.setLayout(new GridLayout(5, 1));

        mealFrameButton.setBackground(Color.BLACK);
        mealFrameButton.setForeground(Color.WHITE);

        exerciseFrameButton.setBackground(Color.BLACK);
        exerciseFrameButton.setForeground(Color.WHITE);

        visualizeFrameButton.setBackground(Color.BLACK);
        visualizeFrameButton.setForeground(Color.WHITE);

        profileLabel = new JLabel(selectedProfile);
        profileLabel.setForeground(new Color(139, 69, 19)); 
        profileLabel.setFont(new Font("Arial", Font.BOLD, 20));
        
        settingsPanel.add(editProfileButton);
        settingsPanel.add(settingsButton);

        userPanel.add(mealFrameButton);
        userPanel.add(exerciseFrameButton);
        
        mainPanel.add(profileLabel);
        mainPanel.add(userPanel);
        mainPanel.add(visualizeFrameButton);
        mainPanel.add(createBlankSpace());
        mainPanel.add(settingsPanel);
        add(mainPanel);
    }
    
    private JLabel createBlankSpace() {
        JLabel blankLabel = new JLabel(" ");
        return blankLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mealFrameButton) {
            dispose();
            mealLogFrame mealFrame = new mealLogFrame();
            mealFrame.setVisible(true);
        }
        if (e.getSource() == exerciseFrameButton) {
            dispose();
            ExerciseUI exerciseFrame = new ExerciseUI();
            exerciseFrame.setVisible(true);
        }
        if (e.getSource() == visualizeFrameButton) {
            // Add code for visualize button action
        }
    }
}