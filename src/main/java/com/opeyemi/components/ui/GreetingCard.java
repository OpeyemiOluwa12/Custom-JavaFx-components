package com.opeyemi.components.ui;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;

public class GreetingCard extends VBox {

    @FXML
    private VBox container;

    @FXML
    private ImageView cardImage;

    @FXML
    private Text title;

    @FXML
    private Text content;

    @FXML
    private Button readMoreButton;

    @FXML
    private Text author;

    @FXML
    private Label date;

    @FXML
    private Label noOfComment;


    public GreetingCard() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/card.fxml"));
        fxmlLoader.setRoot(GreetingCard.this);
        fxmlLoader.setController(GreetingCard.this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public StringProperty cardTitleProperty() {
        return title.textProperty();
    }

    public String getCardTitle() {
        return cardTitleProperty().get();
    }
    public void setCardTitle(String title){
        cardTitleProperty().set(title);
    }

    public StringProperty contentProperty(){
        return content.textProperty();
    }
    public String getContent(){
        return contentProperty().get();
    }
    public void setContent(String content){
        contentProperty().set(content);
    }

    public StringProperty readMoreButtonProperty(){
        return readMoreButton.textProperty();
    }
    public String getReadMoreButton(){
        return readMoreButtonProperty().get();
    }
    public void setReadMoreButton(String text){
        readMoreButtonProperty().set(text);
    }
    public StringProperty authorProperty() {
        return author.textProperty();
    }

    public String getAuthor() {
        return authorProperty().get();
    }
    public void setAuthor(String title){
        authorProperty().set(title);
    }

    public StringProperty dateProperty() {
        return date.textProperty();
    }

    public String getDate() {
        return dateProperty().get();
    }
    public void setDate(String title){
        dateProperty().set(title);
    }

    public StringProperty commentProperty() {
        return noOfComment.textProperty();
    }

    public String getComment() {
        return commentProperty().get();
    }
    public void setComment(String title){
        commentProperty().set(title);
    }

    public ObjectProperty<Image> cardImageProperty(){
        return cardImage.imageProperty();
    }
    public Image getCardImage(){
        return cardImageProperty().get();
    }
    public void setCardImage(Image image){
        cardImageProperty().set(image);
    }

}
