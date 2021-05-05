public class Game {

    private int id;
    private int categoryId;
    private String gameName;
    private double unitPrice;
    private double discountRate;
    private double discountPrice;

    public Game(int id, int categoryId, double unitPrice, double discountRate, String gameName) {
        this.id=id;
       this.categoryId=categoryId;
        this.unitPrice=unitPrice;
        this.discountRate=discountRate;
        this.gameName=gameName;

    }
    public Game(int id, int categoryId, double unitPrice, String gameName) {
        this.id=id;
        this.categoryId=categoryId;
        this.unitPrice=unitPrice;
        this.gameName=gameName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountPrice() {
        return unitPrice-(unitPrice*discountRate/100);
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
