package greenway.com.gt.samplegridview;

/**
 * Created by Pablo on 18/08/2015.
 */
public class Item {

    private String title;
    private String icono;

    public Item(String title, String icono) {
        this.title = title;
        this.icono = icono;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
}
