import java.util.ArrayList;
import java.util.List;

public class Command18 {
    public static void main(){
        Reciver reciver = new Reciver();
        reciver.addCommand(new MouceClisk());
        reciver.addCommand(new MoucePress());
        reciver.RunCommand();
    }
}

interface Command{
    void execute();
}

class MouceClisk implements Command{
    @Override
    public void execute() {
        System.out.println("click command");
    }
}

class MoucePress implements Command{
    @Override
    public void execute() {
        System.out.println("press command");
    }
}

class Reciver{
    List<Command> commands = new ArrayList<>();

    void addCommand(Command command){
        commands.add(command);
    }

    void RunCommand(){
        for (Command command : commands){
            command.execute();
        }
    }
}
