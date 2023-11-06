package uk.ac.abdn.csd;

class StoryButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        String tempText = tempFild.getText();
        story = story(Integer.valueOf(tempText));
        storyPane.setText(story);
    }
}