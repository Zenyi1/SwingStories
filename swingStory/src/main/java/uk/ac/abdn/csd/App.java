package uk.ac.abdn.csd;

import com.github.javafaker.*;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String genStory()
    {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String story = "Hello " + name + " and " + lastName + ", " + firstName;
        return story;
    }

    private static void createAndShowGUI()
    {
        // Window
        JFrame frame = new JFrame("Swing Story Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // getting story
        String story = genStory();

        // Labels
        JLabel introLabel = new JLabel("The story goes: ");
        JLabel storyLabel = new JLabel(story);
        frame.getContentPane().add(introLabel, BorderLayout.PAGE_START);
        frame.getContentPane().add(storyLabel, BorderLayout.LINE_START);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        createAndShowGUI();
                    }
                });
    }
}
