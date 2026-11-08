package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		 Label title = new Label("College Student Services");
	        Label subtitle = new Label("JavaFX Layout Managers Lab");

	        VBox heading = new VBox(5, title, subtitle);
	        heading.setPadding(new Insets(15));

	     

	        Label menuTitle = new Label("MENU");

	        Button dashboardButton = new Button("Dashboard");
	        Button registrationButton = new Button("Registration");
	        Button coursesButton = new Button("Courses");
	        Button helpButton = new Button("Help");

	        VBox navigation = new VBox(12, menuTitle,
	                dashboardButton, registrationButton,
	                coursesButton, helpButton);

	        navigation.setPadding(new Insets(15));

	      

	        Label formTitle = new Label("Student Registration");

	        Label studentIdLabel = new Label("Student ID:");
	        Label fullNameLabel = new Label("Full Name:");
	        Label emailLabel = new Label("Email:");
	        Label programLabel = new Label("Program:");

	        TextField studentIdField = new TextField();
	        studentIdField.setPromptText("e.g. S1001");

	        TextField fullNameField = new TextField();
	        fullNameField.setPromptText("Enter full name");

	        TextField emailField = new TextField();
	        emailField.setPromptText("name@example.com");

	        ComboBox<String> programComboBox = new ComboBox<>();

	        programComboBox.getItems().addAll(
	                "Software Engineering",
	                "Computer Programming",
	                "Business",
	                "Artificial Intelligence"
	        );

	        programComboBox.setPromptText("Select a program");

	       

	        GridPane formGrid = new GridPane();

	        formGrid.setHgap(15);
	        formGrid.setVgap(15);

	        formGrid.add(studentIdLabel, 0, 0);
	        formGrid.add(studentIdField, 1, 0);

	        formGrid.add(fullNameLabel, 0, 1);
	        formGrid.add(fullNameField, 1, 1);

	        formGrid.add(emailLabel, 0, 2);
	        formGrid.add(emailField, 1, 2);

	        formGrid.add(programLabel, 0, 3);
	        formGrid.add(programComboBox, 1, 3);

	        studentIdField.setPrefWidth(280);
	        fullNameField.setPrefWidth(280);
	        emailField.setPrefWidth(280);
	        programComboBox.setPrefWidth(280);

	        // 5. HBOX: Register and Clear buttons

	        Button registerButton = new Button("Register");
	        Button clearButton = new Button("Clear");

	        HBox actionButtons = new HBox(10,
	                registerButton, clearButton);

	        Label statusLabel = new Label(
	                "Complete the form and select Register.");

	        // Register button action

	        registerButton.setOnAction(e -> {

	            if (studentIdField.getText().isEmpty()
	                    || fullNameField.getText().isEmpty()
	                    || emailField.getText().isEmpty()
	                    || programComboBox.getValue() == null) {

	                statusLabel.setText("Please complete all fields.");

	            } else if (!emailField.getText().contains("@")) {

	                statusLabel.setText("Please enter a valid email.");

	            } else {

	                statusLabel.setText(
	                        "Registration successful for "
	                        + fullNameField.getText());
	            }
	        });

	    

	        clearButton.setOnAction(e -> {

	            studentIdField.clear();
	            fullNameField.clear();
	            emailField.clear();
	            programComboBox.setValue(null);

	            statusLabel.setText(
	                    "Complete the form and select Register.");
	        });

	       

	        dashboardButton.setOnAction(e ->
	                statusLabel.setText("Dashboard selected."));

	        registrationButton.setOnAction(e ->
	                statusLabel.setText("Registration selected."));

	        coursesButton.setOnAction(e ->
	                statusLabel.setText("Courses selected."));

	        helpButton.setOnAction(e ->
	                statusLabel.setText("Help selected."));

	       

	        VBox centerContent = new VBox(20,
	                formTitle, formGrid, actionButtons, statusLabel);

	        centerContent.setPadding(new Insets(30));
	        centerContent.setAlignment(Pos.TOP_LEFT);



	        BorderPane root = new BorderPane();

	        root.setTop(heading);
	        root.setLeft(navigation);
	        root.setCenter(centerContent);

	       
	        Scene scene = new Scene(root, 850, 550);

	        primaryStage.setTitle("JavaFX Layout Managers Lab");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        }

	       
	        
	    
		
		
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
