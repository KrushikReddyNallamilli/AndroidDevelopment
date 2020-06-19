package com.example.retrofitkrushikdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    ProgressDialog progress;
    MyPhotosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.mrrecyclerview);
        progress=new ProgressDialog(this);
        progress.setTitle("Fectchin Data from internet");
        progress.setMessage("please wait..Loading..");
        progress.show();
        EndPointDataInterface service=Retrofitinstance.getJsonResponds().create(EndPointDataInterface.class);
        Call<List<Response>> call=service.getAllPhotos();
        call.enqueue(new Callback<List<Response>>() {
            @Override
            public void onResponse(Call<List<Response>> call, retrofit2.Response<List<Response>> response) {
                progress.dismiss();
                getDataResponds(response.body());
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<List<Response>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void getDataResponds(List<Response> body) {
        adapter=new MyPhotosAdapter(this,body);
        Toast.makeText(MainActivity.this, ""+body.size(), Toast.LENGTH_SHORT).show();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }


}
