/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.monprojet.test4javafx;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author Amadou Coulibaly
 */
public class VBoxExemple extends VBox{
    public VBoxExemple() {
    for(Button b : CompoTestSets.desBoutons()) {
    this.getChildren().add(b);
}
}
}