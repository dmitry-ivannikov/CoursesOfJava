public class ChainOfResponsibility17 {
    public static void main(String[] args){
        MessagePrinter messagePrinter = new ConspleMessagePrinter();
        FileMessagePrinter fileMessagePrinter = new FileMessagePrinter();
        messagePrinter.setNexMessagePrinter(fileMessagePrinter);
        fileMessagePrinter.setNexMessagePrinter(new DBMessagePrinter());
        messagePrinter.print("hello");
    }
}

abstract class MessagePrinter{
    MessagePrinter nexMessagePrinter;
    void setNexMessagePrinter(MessagePrinter messagePrinter){
        nexMessagePrinter = messagePrinter;
    }
    void print(String message){
        printMessage(message);
        if(nexMessagePrinter != null){
            nexMessagePrinter.print(message);
        }
    }
    abstract void  printMessage(String message);
}

class ConspleMessagePrinter extends MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to console: " + message);
    }
}

class FileMessagePrinter extends MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to file: " + message);
    }
}

class DBMessagePrinter extends MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to db: " + message);
    }
}