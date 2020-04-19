import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * The all amazing Dwarf Quoter is back! JAVA STYLE!!
 * Hooray for everything. 
 *
 * @author  Benjo
 * @version 1.7
 */

public class DwarfQuoter{

    public static void main(String[] args) {
        new DwarfQuoter();
    }

    private ArrayList<String> dwarfQuotes = new ArrayList<>();

    /**
     * Calls the buildQuoter ArrayList
     */
    private DwarfQuoter() {
        JOptionPane.showMessageDialog(null, this.buildQuoter());
    }

    /**
     * Builds an array list with the dwarf quotes
     */
    private String buildQuoter() {
        Random rand = new Random();
        this.dwarfQuotes.add("I'm always last and I don't like it.");
        this.dwarfQuotes.add("Faithless is he who says farewell when the road darkens.");
        this.dwarfQuotes.add("They had no honor in life. They have none now in death.");
        this.dwarfQuotes.add("Whatever luck you live by... let's hope it lasts the night.");
        this.dwarfQuotes.add("It's true you don't see many dwarf women. \n" +
                "And in fact they are so alike in voice and appearance, that they are often mistaken for dwarf men.");
        this.dwarfQuotes.add("I cannot jump the distance, you'll have to toss me.");
        this.dwarfQuotes.add("And you know what this Dwarf says to that?\n" +
                "Ishkhaqwi ai durugnul! I spit upon your grave!");
        this.dwarfQuotes.add("There is some good stonework here.");
        this.dwarfQuotes.add("You may do as you please in madness.");
        this.dwarfQuotes.add("I have but returned to take what is mine; for I am the last of my people.");
        this.dwarfQuotes.add("The new Gandalf is grumpier than the old one.");
        this.dwarfQuotes.add("The Dwarves delved too greedily and too deep.");
        this.dwarfQuotes.add("The air must be thin up there, elf, for ye are daft to come up with that plan");
        this.dwarfQuotes.add("Never turn down an ale, who knows if it may be your last.");
        this.dwarfQuotes.add("Her beard is winking at me.");
        this.dwarfQuotes.add("Wherever there are elves, there are lies!");
        this.dwarfQuotes.add("Nothing a hammer can't solve.");
        this.dwarfQuotes.add("You can kill a dwarf, but you can never vanquish one!");
        this.dwarfQuotes.add("The stones will sing if you let them.");
        this.dwarfQuotes.add("Dwarven women are like axes. As dangerous from the back as from the front.");
        this.dwarfQuotes.add("A mead in the hand, is worth two goblin heads in the bush.");
        this.dwarfQuotes.add("Leave iron to rest before you hammer it.");
        this.dwarfQuotes.add("You are softer than sandstone and drier than talc!");
        this.dwarfQuotes.add("Cave toads speak little, but when they do, listen.");
        this.dwarfQuotes.add("A pebble will stay dry inside, no matter how long it is submerged in a pool of water.");
        this.dwarfQuotes.add("Nothing evens a race like an axe to the kneecaps.");
        this.dwarfQuotes.add("The smallest pebble was once the biggest stone, the biggest stone was once bigger.");
        this.dwarfQuotes.add("Jon:'What are you doing up there? Why aren\'t you at the feast?\'\n" +
                "Tyrion: \'Too hot, too noisy, and I\'d drunk too much wine\', the dwarf told him. \n" +
                "\'I learned long ago that it is considered rude to vomit on your brother.");
        this.dwarfQuotes.add("\"Silverfish looked down.\n" +
                "\"Oh. Are you a dwarf?\"\n" +
                "Cuddy gave him a blank stare.\n" +
                "\"Are you a giant?\" He said.\n" +
                "\"Me? Of course not!\"\n" +
                "\"Ah. Then I must be a dwarf, yes.”");
        this.dwarfQuotes.add("\"And what would you do, if an uninvited dwarf came and \n" +
                "hung his things up in your hall without a word of explanation?”");
        this.dwarfQuotes.add("\"One of the dwarfs walked in front of Thor to get a better view of the prye, and \n" +
                "Thor kicked him irritably into the middle of the flames, which made Thor feel slightly \n" +
                "better and made all the dwarfs feel much worse.”");
        this.dwarfQuotes.add("\"This dwarf still observes the world from his own self-imposed height.”");
        this.dwarfQuotes.add("\"Among other possibilities, money was invented to make it possible for a foolish \n"+
                "man to control wise men; a weak man, strong men; a child, old men; an ignorant man, \n"+
                "knowledgeable men; and for a dwarf to control giants.”");
        this.dwarfQuotes.add("\"Orcs do not have enemies.” Monde tried to search for the proper term... \n" +
                "\"We have…adversaries.”\n" +
                "\"Isn’t that the same thing?”\n" +
                "\"Depends on who’s winning the war.”");
        this.dwarfQuotes.add("\"Unsure how to answer, I took another grape. Time was no problem for me, \n" +
                "but I wasn't eager to hear the long life story of a dwarf. And besides, this was a dream. \n" +
                "It could evaporate any moment.”");
        this.dwarfQuotes.add("\"He who makes fun of a short and fat man’s weight is much less cruel \n" +
                "than he who makes fun of his height.”");
        this.dwarfQuotes.add("\"Every dwarf is a bastard in his father's eyes.”");
        return dwarfQuotes.get(rand.nextInt(dwarfQuotes.size()));
    }
}