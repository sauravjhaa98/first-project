package laptop.com.mygrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> name;
    ArrayList<Integer>img;
    GridView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g=(GridView)findViewById(R.id.gridview);
        name=new ArrayList<String>();
        img=new ArrayList<Integer>();

        name.add("Img-1");
        name.add("Img-2");
        name.add("Img-3");
        name.add("Img-4");
        name.add("Img-5");
        name.add("Img-6");
        name.add("Img-7");
        name.add("Img-8");
        img.add(R.drawable.one);
        img.add(R.drawable.two);
        img.add(R.drawable.three);
        img.add(R.drawable.four);
        img.add(R.drawable.five);
        img.add(R.drawable.six);
        img.add(R.drawable.seven);
        img.add(R.drawable.eight);


        name.add("Img-1");
        name.add("Img-2");
        name.add("Img-3");
        name.add("Img-4");
        name.add("Img-5");
        name.add("Img-6");
        name.add("Img-7");
        name.add("Img-8");
        img.add(R.drawable.one);
        img.add(R.drawable.two);
        img.add(R.drawable.three);
        img.add(R.drawable.four);
        img.add(R.drawable.five);
        img.add(R.drawable.six);
        img.add(R.drawable.seven);
        img.add(R.drawable.eight);




        Main2Activity obj=new Main2Activity(getApplicationContext(),name,img);

        g.setAdapter(obj);


    }
}
