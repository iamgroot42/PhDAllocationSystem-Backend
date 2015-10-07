package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class FilteredControl {
	
	static Stage primaryStage;
	static Scene scene;
	ObservableList<TableEntry> data;
	
	@FXML
    private TableView<TableEntry> FilteredTable;

	@FXML
    private TableColumn<TableEntry, String> Name;

    @FXML
    private TableColumn<TableEntry, String> EnID;

    @FXML
    private TableColumn<TableEntry, String> Link;
    
    @FXML
    private TableColumn<TableEntry, String> CVLink;

    @FXML
    private TableColumn<TableEntry, String> SOPLink;

    @FXML
    void BackToFilters(ActionEvent event) {
    	primaryStage.setScene(scene);
        primaryStage.setTitle("PhD Admissions Admin Portal");
    }
    
    @FXML
    void initialize() {
    	Link.setCellValueFactory(
    			new PropertyValueFactory<TableEntry,String>("Link")
	        );
    	EnID.setCellValueFactory(
    			new PropertyValueFactory<TableEntry,String>("EnrollmentID")
	        );
    	Name.setCellValueFactory(
	            new PropertyValueFactory<TableEntry,String>("Name")
	        );
    	CVLink.setCellValueFactory(
    			new PropertyValueFactory<TableEntry,String>("CVLink")
    	    );
    	SOPLink.setCellValueFactory(
    			new PropertyValueFactory<TableEntry,String>("SOPLink")
    	    );
    }
    void setTableData(ArrayList<TableEntry> data) {
    	this.data = FXCollections.observableArrayList(data);
    	FilteredTable.setItems(this.data);
    }
}

