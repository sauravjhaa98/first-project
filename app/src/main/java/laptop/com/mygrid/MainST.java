package laptop.com.mygrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainST extends AppCompatActivity {


    ImageView imgg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_st);
        imgg=(ImageView)findViewById(R.id.imageView);

        Intent i=getIntent();

        imgg.setImageResource(i.getIntExtra("k",0));
    }
}