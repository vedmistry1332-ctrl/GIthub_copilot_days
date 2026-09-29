import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuizApp extends JFrame implements ActionListener {
  
    JLabel questionLabel;
    JRadioButton option1, option2, option3, option4;
    JButton nextButton;
    ButtonGroup optionsGroup;

  
    String[] questions = {
        "Which language is platform independent?",
        "Which keyword is used to inherit a class in Java?",
        "Which method is the entry point of a Java program?",
        "Which of these is not an OOP principle?",
        "Which package contains Swing classes?"
    };

    String[][] options = {
        {"C", "C++", "Java", "Python"},
        {"this", "extends", "implement", "inherits"},
        {"start()", "main()", "run()", "init()"},
        {"Encapsulation", "Polymorphism", "Compilation", "Inheritance"},
        {"java.awt", "java.swing", "javax.swing", "java.io"}
    };

    String[] answers = {
        "Java",
        "extends",
        "main()",
        "Compilation",
        "javax.swing"
    };

    int index = 0, score = 0;

    public QuizApp() {
      
        setTitle("Online Quiz Application");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        questionLabel = new JLabel();
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel, BorderLayout.NORTH);

     
        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();

        optionsGroup = new ButtonGroup();
        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));
        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);
        add(optionsPanel, BorderLayout.CENTER)  ;

        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        add(nextButton, BorderLayout.SOUTH);

        loadQuestion();
        setVisible(true);
    }
    
 void loadQuestion() {
    if (index < questions.length) {
     questionLabel.setText("Q" + (index + 1) + ": " + questions[index]);
     option1.setText(options[index][0]);
            option2.setText(options[index][1]);
        option3.setText(options[index][2]);
             option4.setText(options[index][3]);
        } else {
            JOptionPane.showMessageDialog(this, "Quiz Over! Your Score is: " + score);
            System.exit(0);
        }
    }

    
    public void actionPerformed(ActionEvent e) {
        JRadioButton selected = null;
        if (option1.isSelected()) selected = option1;
        else if (option2.isSelected()) selected = option2;
        else if (option3.isSelected()) selected = option3;
        else if (option4.isSelected()) selected = option4;

        if (selected != null && selected.getText().equals(answers[index])) {
            score++;
        }

        index++;
        optionsGroup.clearSelection();
        loadQuestion();
    }

    public static void main(String[] args) {
        new QuizApp();
    }
}