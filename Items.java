package Financetool;



/**
 * The Items class represents the items that a subteam has been bought. It includes (or should)
 * the quantity, name, buyer, price, shipping, importance and description of the item bought
 */

public class Items {

    //Don't quite know if we should include the total in the items, as it would need to be calculated
    private String name;
    private String buyer;
    private double price;
    private int quantity;
    private double shipping;
    private int importance;
    private String description;
    private String link;
    private String invoice;
    /*
        Going to need to figure out how to include link to price, invoice
        Might be a pain to implement later...
     */


    /**
     * Construct of a new Item object with the given parameters
     *
     * @param name takes a name of the item
     * @param buyer takes a name of the buyer of the item
     * @param price takes a price of the item
     * @param quantity takes a quantity of the item
     * @param shipping takes the shipping price of the item
     * @param importance takes the importance of the item
     * @param description takes the description of the item
     * @param link takes the link of the item's website
     * @param invoice takes the invoice for the item
     */
    public Items (String name, String buyer, double price, int quantity, double shipping, int importance, String description, String link, String invoice) {
        this.name = name;
        this.buyer = buyer;
        this.price = price;
        this.quantity = quantity;
        this.shipping = shipping;
        this.importance = importance;
        this.description = description;
        this.link = link; //optional?
        this.invoice = invoice; //optional?
    }

    /**
     * Retrieves the name of the Item
     *
     * @return the stock's name
     */
    public String getNameItem() {
        return name;
    }

    /**
     * Retrieves the name of the Item
     *
     * @param name takes a new name of the item
     */
    public void setNameItem(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the Item's buyer
     *
     * @return the buyer's name
     */

    public String getBuyerItem() {
        return buyer;
    }

    /**
     * Sets the name of the Item's buyer
     *
     * @param buyer takes a new name of the buyer
     */

    public void setBuyerItem(String buyer) {
        this.buyer = buyer;
    }

    /**
     * Retrieves the price of the item
     *
     * @return the price of the item
     */
    public double getPriceItem() {
        return price;
    }

    /**
     * Sets the price of the item
     *
     * @param price takes the new price
     */
    public void setPriceItem(double price) {
        this.price = price;
    }

    /**
     * Retrieves the quantity of the stock
     *
     * @return the quantity
     */

    public int getQuantityItem() {
        return quantity;
    }

    /**
     * Sets the quantity of the stock
     *
     * @param quantity takes the new quantity
     */

    public void setQuantityItem(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Returns the shipping cost of an item
     */
    public double getShippingItem() {
        return shipping;
    }

    /**
     * Sets the shipping cost of an item
     * @param shipping takes the cost of shipping
     */
    public void setShippingItem(double shipping) {
        this.shipping = shipping;
    }

    /**
     * retrieves the importance of an item
     * @return importance
     */
    public int getImportanceItem() { return importance;}

    /**
     * Sets the importance level of an item
     * @param importance takes the importance of an item
     */
    public void setImportanceItem(int importance) { this.importance = importance;}


    /**
     * Retrieves the description of an item
     * @return description
     */
    public String getDescriptionItem() { return description;}

    /**
     * Sets the description of the item
     * @param description
     */
    public void setDescriptionItem(String description) { this.description = description;}

    /**
     * Retrieves the link of an item
     * @return
     */
    public String getLinkItem() { return link;}

    /**
     * Sets the link of an item
     * @param link
     */
    public void setLinkItem(String link) { this.link = link;}

    /**
     * Retrieves the invoice for an item
     * @return invoice
     */
    public String getInvoiceItem() { return invoice;}

    /**
     * sets the invoice for an item
     * @param invoice
     */
    public void setInvoiceItem(String invoice) { this.invoice = invoice;}

}