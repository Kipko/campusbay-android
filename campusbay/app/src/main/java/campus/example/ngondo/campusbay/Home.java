package campus.example.ngondo.campusbay;




import android.os.Bundle;
import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;





public class Home extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle savedInstanceState) {
        this.setDrawerHeaderImage(R.drawable.header1);

        this.addSection(newSection("Main", new Main()));
        this.addSection(newSection("Furniture", new Furniture()));

    }
}
