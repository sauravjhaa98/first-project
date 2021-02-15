package laptop.com.mygrid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class  Main2Activity   extends BaseAdapter{

        ArrayList<String> name=new ArrayList<String>();
        ArrayList<Integer>img=new ArrayList<Integer>();

        LayoutInflater lyt;
        Context cnt;

        public Main2Activity(Context context, ArrayList<String> name, ArrayList<Integer> img) {


            cnt=context;
            this.name=name;
            this.img=img;
            lyt=LayoutInflater.from(cnt);
        }

        @Override
        public int getCount() {
            return name.size();
        }

        @Override
        public Object getItem(int i) {
            return name.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }



    @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {

            view=lyt.inflate(R.layout.activity_main2,null);

            TextView t=(TextView)view.findViewById(R.id.textView);
            ImageView im=(ImageView)view.findViewById(R.id.imageView);

            im.setImageResource(img.get(i));
            t.setText(name.get(i));


            im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent obj=new Intent(cnt,MainST.class);
                    obj.putExtra("k",img.get(i));

                    cnt.startActivity(obj);
                }
            });
            return view;
        }
    }