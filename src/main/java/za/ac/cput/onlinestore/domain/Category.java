package za.ac.cput.onlinestore;

public class Category {

    private String categoryID, categoryName, categoryType;

    public Category() {

    }

    public Category(String categoryID, String categoryName, String categoryType) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID='" + categoryID + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType='" + categoryType + '\'' +
                '}';
    }
}