package com.example.akif.dovizapi;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.akif.dovizapi.remote.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView tv_usd, tv_euro,tv_gram,tv_ceyrek,tv_yarim,tv_tam;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView2);
        tv_euro = (TextView) findViewById(R.id.tv_euro);
        tv_usd = (TextView) findViewById(R.id.tv_usd);
        tv_gram = (TextView) findViewById(R.id.tv_gram);
        tv_ceyrek = (TextView) findViewById(R.id.tv_ceyrek);
        tv_tam = (TextView) findViewById(R.id.tv_tam);
        tv_yarim = (TextView) findViewById(R.id.tv_yarim);



        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            private boolean resim1=false;

            @Override
            public void run() {

                if (!resim1) {
                    img.setImageResource(R.drawable.yesil);
                } else if (!resim1){
                    img.setImageResource(R.drawable.kirmizi);
                }

                resim1 = !resim1;
                if (!resim1){
                    img.setImageResource(R.drawable.mavi);
                }
                handler.postDelayed(this, 300);
            }
        }, 300);

        altingetir();
        dovizgetir();



    }



     public void dovizgetir() {

        ApiService.Factory.getInstance().getdoviz().enqueue(new Callback<List<ExampleDoviz>>() {
            @Override
            public void onResponse(Call<List<ExampleDoviz>> call, Response<List<ExampleDoviz>> response) {

                List<ExampleDoviz> jsondoviz = response.body();


                tv_usd.setText(String.valueOf(jsondoviz.get(0).getSelling()) + " TL");
                tv_euro.setText(String.valueOf(jsondoviz.get(1).getSelling()) + " TL");
            }

            @Override
            public void onFailure(Call<List<ExampleDoviz>> call, Throwable t) {

            }
        });
     }


    public void altingetir() {
        ApiService.Factory.getInstance().getaltin().enqueue(new Callback<List<ExampleAltin>>() {
            @Override
            public void onResponse(Call<List<ExampleAltin>> call, Response<List<ExampleAltin>> response) {

                List<ExampleAltin> jsonaltin = response.body();



                tv_gram.setText(String.valueOf(jsonaltin.get(1).getSelling()) + " TL");
                tv_ceyrek.setText(String.valueOf(jsonaltin.get(2).getSelling()) + " TL");
                tv_yarim.setText(String.valueOf(jsonaltin.get(3).getSelling()) + " TL");
                tv_tam.setText(String.valueOf(jsonaltin.get(4).getSelling()) + " TL");


            }

            @Override
            public void onFailure(Call<List<ExampleAltin>> call, Throwable t) {
                String hata = t.getMessage();
            }
        });


    }

}




