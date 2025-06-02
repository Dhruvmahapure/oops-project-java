package pizzabillgenerator;


class pizza {
    private int price;

    private boolean veg;

    private int baseprice;

    private int extrcheese = 100;
    private int extretoping = 50;
    private int takebag = 20;

    private boolean isExtracheese = false;
    private boolean isExtratoping = false;
    private boolean isExtrabag = false;

    public pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        baseprice = this.price;
    }

    public int Extracheese() {

        isExtracheese = true;
        this.price += extrcheese;

        return this.price;
    }

    public int topping() {

        isExtratoping = true;
        this.price += extretoping; // Fixed: added instead of assigning

        return this.price;
    }

    public int takeaway() {

        isExtrabag = true;
        this.price += takebag; // Fixed: added instead of assigning

        return this.price;
    }

    public void getPrice() {
        String bill = "";
        if (isExtracheese) {
            bill += "extracheese price is= " + extrcheese + "\n";
        }

        if (isExtratoping) {
            bill += "Extra topping price is= " + extretoping + "\n";
        }

        if (isExtrabag) {
            bill += "Extra takeaway bag price is= " + takebag + "\n"; // Fixed: print correct value
        }

        bill += "bill is = " + this.price + "\n";
        System.out.println(bill);
    }
}

class specialPizza extends pizza {
    public specialPizza(boolean veg) {
        super(veg);
        super.Extracheese();
        super.topping();
    }
}

public class Main {
    public static void main(String[] args) {
        pizza obj = new pizza(true);
        obj.Extracheese();
        obj.takeaway();
        obj.topping();
        obj.getPrice();


        System.out.println("special pizza");

        specialPizza obj1=new specialPizza(false);
        obj.takeaway();
        obj.getPrice();
    }
}
