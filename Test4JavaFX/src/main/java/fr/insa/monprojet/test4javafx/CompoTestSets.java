/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.monprojet.test4javafx;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Button;

/**
 *
 * @author Amadou Coulibaly
 */
public class CompoTestSets {
    public static List<Button> desBoutons() {   
    List<Button> res = new ArrayList<>();
    Button jb1 = new Button("Valider");
    res.add(jb1);
    Button jb3 = new Button("Annuler");
    res.add(jb3);
    Button jb2 = new Button("Un Bouton avec un Grand Nom");
    res.add(jb2);

    int ph = 150;
    Button jb4 = new Button("pref H = " + ph);
    jb4.setPrefHeight(ph);
    res.add(jb4);
    int pw = 400;
    Button jb5 = new Button("pref W = " + pw);
    jb4.setPrefWidth(pw);
    res.add(jb5);
    return res;
    }
}