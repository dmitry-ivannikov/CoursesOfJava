import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.IndexRange;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FX8CustomControll extends TextField{
    String naumderRegEx = "[0-9]*";

    @Override
    public void replaceText(int start, int end, String text) {
        String oldValue = getText();
        if((validate(text))){
            super.replaceText(start, end, text);
            String newText = super.getText();
            if(!validate(newText)){
                super.setText(oldValue);
            }
        }
    }

    private boolean validate(String text){
        return ("".equals(text) || text.matches(naumderRegEx));
    }
}




