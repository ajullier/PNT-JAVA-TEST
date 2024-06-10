package somospnt.com.Models;


public class Product implements Comparable<Product>{
    private String Name;
    private Double Price;
    private String Currency;
    private float Quantity;
    private String UnitOfMeasure;

    public Product(String nameParam,
    Double priceParam,
    String currencyParam,
    float quantityParam,
    String unitOfMeasure){
        Name = nameParam;
        Price = priceParam;
        Currency = currencyParam;
        Quantity = quantityParam;
        UnitOfMeasure = unitOfMeasure;
    }    

    public Product(String nameParam,
    Double priceParam,
    float quantityParam,
    String unitOfMeasure){
        Name = nameParam;
        Price = priceParam;
        Currency = "$";
        Quantity = quantityParam;
        UnitOfMeasure = unitOfMeasure;
    }

    public Product(String nameParam,
    Double priceParam){
        Name = nameParam;
        Price = priceParam;
        Currency = "$";
        UnitOfMeasure = "Kg";
    }
    
    public String getName(){
        return Name;
    }

    @Override
    public String toString(){
        String message = "";
        if(Name != null){
            message += "Nombre: " + Name + " /// ";
        };
        if(UnitOfMeasure == "L"){
            message += "Litros: " + Quantity + " /// ";
        }
        if(UnitOfMeasure == "ml"){
            message += "Contenido: " + (int)Math.round(Quantity) + "ml /// ";
        }
        if(Price != Double.NaN && Currency != null){
            message += "Precio: " + Currency + (int)Math.round(Price);
        }

        if(UnitOfMeasure == "Kg"){
            message += " /// Unidad de venta: kilo";
        }

        return message;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.Price, otherProduct.Price);
    }

}
