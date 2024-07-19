package com.example.easyassist;

import android.os.Bundle;
import java.util.ArrayList;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel("https://media.istockphoto.com/id/1069568218/photo/electrician-mounting-sockets-indoors.jpg?s=1024x1024&w=is&k=20&c=lzFJVsbzzTXQhThuse3lBECppjVz0ZzFpXVtTOvv_P8=", "Electrician.", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://t3.ftcdn.net/jpg/00/27/61/68/360_F_27616800_mP42aLqY152iln3kHDTiAvlMrDoYU606.jpg", "Plumber.",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://www.nobroker.in/blog/wp-content/uploads/2024/04/home-cleaning-service-apps.jpg", "Cleaning.",ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);
    }
}