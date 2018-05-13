import javafx.application.Application;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FX5Properties_binding {
//    int i;
//    Integer integer;
//    SimpleIntegerProperty simpleIntegerProperty;
//    StringProperty stringProperty;
  public static void main(String[] args){
      final IntegerProperty integerProperty = new SimpleIntegerProperty(1);
      final IntegerProperty integerProperty2 = new SimpleIntegerProperty(2);

     // System.out.println(integerProperty.add(integerProperty2).getValue());


      IntegerBinding integerBinding = new IntegerBinding() {
          {super.bind (integerProperty, integerProperty2);}
          @Override
          protected int computeValue() {
              return integerProperty.get() + integerProperty2.get();
          }
      };
      System.out.println(integerBinding.get());

//      integerProperty.addListener(new ChangeListener<Number>() {
//          public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//              System.out.println("new value = " + newValue);
//          }
//      });
//
//
//      integerProperty.bindBidirectional(integerProperty2);
//      integerProperty2.set(698);
//
//     // System.out.println("pertya1 is: " + integerProperty.get());
//      integerProperty.set(777);
//      //System.out.println("pertya2 is: " + integerProperty2.get());
//
//
  }


}

class User{
    StringProperty stringProperty = new SimpleStringProperty("Dima");

    public String getStringProperty() {
        return stringProperty.get();
    }

    public StringProperty stringPropertyProperty() {
        return stringProperty;
    }

    public void setStringProperty(String stringProperty) {
        this.stringProperty.set(stringProperty);
    }
}
