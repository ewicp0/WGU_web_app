package electronicsstore.controller;

import electronicsstore.models.Part;
import electronicsstore.models.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainScreenController {
    @FXML
    private Label welcomeLabel;
    @FXML
    private Label messageLabel;  // Label to show success/failure messages

    // Sample inventory lists
    private List<Part> parts = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public void initialize() {
        welcomeLabel.setText("Welcome to the Electronics Store!");

        // Sample parts
        parts.add(new Part(1, "Resistor", 100, 0.10, 10, 500));
        parts.add(new Part(2, "Capacitor", 50, 0.20, 5, 300));
        parts.add(new Part(3, "Transistor", 200, 1.50, 15, 1000));
        parts.add(new Part(4, "LED", 500, 0.05, 20, 1500));
        parts.add(new Part(5, "Microcontroller", 10, 5.00, 2, 50));

        // Sample products
        List<Part> productParts1 = new ArrayList<>();
        productParts1.add(parts.get(0)); // Resistor
        productParts1.add(parts.get(3)); // LED
        products.add(new Product(1, "Basic Circuit", 2.50, 10, productParts1));

        List<Part> productParts2 = new ArrayList<>();
        productParts2.add(parts.get(1)); // Capacitor
        productParts2.add(parts.get(4)); // Microcontroller
        products.add(new Product(2, "Microcontroller Kit", 10.50, 5, productParts2));
    }

    @FXML
    private void goToAboutPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/electronicsstore/views/AboutPage.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void buyProduct(ActionEvent event) {
        // For simplicity, we'll try to buy the first product in the list
        Product productToBuy = products.get(0);

        if (productToBuy.getStock() > 0) {
            productToBuy.setStock(productToBuy.getStock() - 1);
            messageLabel.setText("Purchase successful! Remaining stock: " + productToBuy.getStock());
        } else {
            messageLabel.setText("Sorry, this product is out of stock!");
        }
    }
}
