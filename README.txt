WGU JavaFX Electronics Store Project
Rubric Mapping: C–J

GIT Link - https://github.com/ewicp0/WGU-web-project

====================================
C. Customized HTML UI
------------------------------------
File: src/electronicsstore/views/MainScreen.fxml  
Lines: 10–25  
Changes: Updated labels and titles to reflect "ElectroHub Electronics" store name, product names, and part names.

====================================
D. About Page
------------------------------------
File: src/electronicsstore/views/About.fxml  
Lines: 1–20  
Changes: Created new About page FXML with company description.  
File: src/electronicsstore/controllers/AboutController.java  
Lines: 1–30  
Changes: Added controller to handle About page navigation.  
File: src/electronicsstore/controllers/MainScreenController.java  
Lines: 60–75  
Changes: Added nav logic to switch between About and Main screens.

====================================
E. Sample Inventory
------------------------------------
File: src/electronicsstore/utils/InventoryInitializer.java  
Lines: 1–50  
Changes: Added logic to check for empty inventory lists and populate 5 parts + 5 products. Uses Set to prevent duplicates and creates a multi-pack if duplicate parts added.

====================================
F. Buy Now Button
------------------------------------
File: src/electronicsstore/views/MainScreen.fxml  
Lines: 100–110  
Changes: Added "Buy Now" button next to update/delete for products.  
File: src/electronicsstore/controllers/MainScreenController.java  
Lines: 120–150  
Changes: On click, decrements product stock and displays success/failure.

====================================
G. Min/Max Inventory for Parts
------------------------------------
File: src/electronicsstore/models/Part.java  
Lines: 6–40  
Changes: Added minInventory, maxInventory fields and validation helper method.  
File: src/electronicsstore/views/InhousePartForm.fxml  
Lines: 35–45  
Changes: Added input fields for min and max inventory.  
File: src/electronicsstore/views/OutsourcedPartForm.fxml  
Lines: 35–45  
Changes: Same as above.  
File: src/electronicsstore/utils/FileStorage.java  
Lines: (varies)  
Changes: Renamed the persistent data file to include updated part structure.

====================================
H. Validation for Inventory Bounds
------------------------------------
File: src/electronicsstore/controllers/PartFormController.java  
Lines: 80–120  
Changes: Added input validation logic for min ≤ stock ≤ max. Shows error alerts if constraints are violated.  
File: src/electronicsstore/controllers/ProductFormController.java  
Lines: 90–120  
Changes: Validates that modifying a product doesn't reduce part stock below min.

====================================
I. Unit Tests
------------------------------------
File: src/test/PartTest.java  
Lines: 1–30  
Changes: Added two tests for inventory < min and inventory > max. Uses JUnit 5.

====================================
J. Code Cleanup
------------------------------------
File: src/electronicsstore/validators/  
Changes: Removed unused validator classes to clean project.

====================================
