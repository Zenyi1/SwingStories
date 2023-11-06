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
    protected static JTextField tempField;
    protected static JButton newStory;
    protected static JTextPane storyPane;
    protected static String story;

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
        String story = Story(55);

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

    public static String Story(int temp){
        Faker faker = new Faker();
        StringBuilder story = new StringBuilder();
        story.append("One summer day of ");story.append(convert(temp));
        story.append(" degrees celsius a(n) \n");
        story.append(faker.hipster().word());
        story.append("In a(n) ");
        story.append(faker.hipster().word());
        story.append(" ");
        story.append(faker.job().field());
        story.append(" a young \n");
        story.append(faker.hobbit().character());
        story.append(" stumbles across a(n) \n");
        story.append(faker.ancient().primordial());
        story.append(" which spurs them into conflict with \n");
        story.append(faker.starTrek().villain());
        story.append(" and her ");
        story.append(faker.hacker().noun());
        story.append(" culminating in \n");
        story.append(faker.leagueOfLegends().summonerSpell());
        story.append(" where someone shouts \n");
        story.append(faker.gameOfThrones().quote());
        story.append("!");
        return story.toString();        
    }

    public static Integer convert(Integer temp){Integer converted = (temp -32) * 5/9;return converted;
    }
}
