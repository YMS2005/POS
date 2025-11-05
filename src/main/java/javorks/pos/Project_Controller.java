package javorks.pos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Project_Controller
{
    @FXML
    //imports for any type of object
    Button myButton = new Button();

    public void PrintMe(ActionEvent e)
    {
        System.out.println("Logged in");
    }
}
