package test;


public class AddCommand extends Command {

    public AddCommand(String word) {
        this.word = word;
        this.type = Command.ADD;
    }
}
