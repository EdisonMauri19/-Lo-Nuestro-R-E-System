
package ec.edu.espe.restaurantSystem.model;


public class ExtraService {
    private int id;
    private String nameService;
    private float priceService;

    public ExtraService(int id, String nameService, float priceService) {
        this.id = id;
        this.nameService = nameService;
        this.priceService = priceService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
    
   
}
