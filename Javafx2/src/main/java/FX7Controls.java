import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swt.FXCanvas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FX7Controls extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception{

        FlowPane flowPane = new FlowPane();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPrefSize(800, 600);
        scrollPane.setContent(flowPane);


       // scrollPane.setContent(flowPane);
        //flowPane2.getChildren().add(flowPane);


        flowPane.getChildren().add(new Label("lable"));
        //flowPane.getChildren().add(new Button("Button"));
        Button lableButton = new Button("Lable button");
        //lableButton.setSpacing(5);

        flowPane.getChildren().add(lableButton);

        //Radio
        ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("one");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        RadioButton rb2 = new RadioButton("two");
        rb2.setToggleGroup(group);
        RadioButton rb3 = new RadioButton("three");
        rb3.setToggleGroup(group);
        flowPane.getChildren().addAll(rb1, rb2, rb3);

        flowPane.getChildren().add(new ToggleButton("toogle"));
        flowPane.getChildren().add(new CheckBox("check box"));
        flowPane.getChildren().add(new ChoiceBox<String>(FXCollections.<String>observableArrayList("first", "second", "third")));
        flowPane.getChildren().add(new TextField("text fild"));
        flowPane.getChildren().add(new PasswordField());

        ScrollBar sc = new ScrollBar();
        sc.setMin(0);
        sc.setMax(100);
        sc.setValue(50);
        flowPane.getChildren().add(sc);

        TreeItem<String> rootItem = new TreeItem<String>("Inbox");
        rootItem.setExpanded(true);
        for (int i = 0; i < 6; i++) {

            TreeItem<String> item = new TreeItem<String>("Message" + i);
            rootItem.getChildren().add(item);
        }
        TreeView<String> tree = new TreeView<String>(rootItem);
        tree.setMaxHeight(100);
        flowPane.getChildren().add(tree);

        ObservableList<String> options = FXCollections.observableArrayList("Opt 1", "Opt 2", "Opt3" );
        ComboBox comboBox = new ComboBox(options);
        flowPane.getChildren().add(comboBox);

        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);
        flowPane.getChildren().add(separator);
        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMajorTickUnit(100);
        slider.setValue(40);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);
        flowPane.getChildren().add(slider);

        ProgressBar pb = new ProgressBar(0.6);
        ProgressIndicator pi = new ProgressIndicator(0.6);
        flowPane.getChildren().add(pb);
        flowPane.getChildren().add(pi);

        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setText("http://yandex.ru");
        hyperlink.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("This link is clicked");
            }
        });
        flowPane.getChildren().add(hyperlink);

        Tooltip tooltip = new Tooltip();
        tooltip.setText("this is link to yandex");
        hyperlink.setTooltip(tooltip);

        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(245);
        flowPane.getChildren().add(htmlEditor);

        TitledPane tp = new TitledPane("My titled pane", new Button("Button"));
        flowPane.getChildren().add(tp);

        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(tp, new TitledPane("second", new TextField("text filed")));
        accordion.setExpandedPane(tp);
        flowPane.getChildren().add(accordion);

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("file");
        Menu menuEdit = new Menu("edit");
        MenuItem menuItem = new MenuItem("open");
        MenuItem menuItem2 = new MenuItem("save");
        menuFile.getItems().addAll(menuItem, menuItem2);
        MenuItem menuItem3 = new MenuItem("cut");
        MenuItem menuItem4 = new MenuItem("copy");
        menuEdit.getItems().addAll(menuItem3, menuItem4);
        menuBar.getMenus().addAll(menuFile, menuEdit);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(menuBar, flowPane);

        ColorPicker colorPicker1 = new ColorPicker();
        flowPane.getChildren().add(colorPicker1);

        Pagination pagination1 = new Pagination();
        flowPane.getChildren().add(pagination1);

        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Ressource File");

        Button button = new Button("Opem dialog");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                fileChooser.showOpenDialog(primaryStage);
            }
        });

        flowPane.getChildren().add(button);


        javafx.scene.Group root = new javafx.scene.Group();
        Scene scene = new Scene(root, 800, 600);
        root.getChildren().add(flowPane);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
