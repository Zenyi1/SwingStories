package uk.ac.abdn.csd;

import com.github.javafaker.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.lang.StringBuilder;
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
        String story = Story();

        // Labels
        JLabel introLabel = new JLabel("The story is: ");
        JTextPane storyPane = new JTextPane();
        storyPane.setText(story);
        frame.getContentPane().add(introLabel, BorderLayout.PAGE_START);
        frame.getContentPane().add(storyPane, BorderLayout.LINE_START);
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

    public static String Story(){
        Faker faker = new Faker();
        StringBuilder story = new StringBuilder();
        story.append("In a(n) ");
        story.append(faker.hipster().word());
        story.append(" ");
        story.append(faker.job().field());
        story.append(" a young ");
        story.append(faker.hobbit().character());
        story.append(" stumbles across a(n) ");
        story.append(faker.ancient().primordial());
        story.append(" which spurs them into conflict with ");
        story.append(faker.starTrek().villain());
        story.append(" and her ");
        story.append(faker.hacker().noun());
        story.append(" culminating in ");
        story.append(faker.leagueOfLegends().summonerSpell());
        story.append(" where someone shouts ");
        story.append(faker.gameOfThrones().quote());
        story.append("!");
        return story.toString();        
    }
}
