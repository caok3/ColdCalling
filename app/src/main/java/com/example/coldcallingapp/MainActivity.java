package com.example.coldcallingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Date Time Code
        TextView textView;
        textView = findViewById(R.id.textView);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM/dd/yyyy   hh:mm a");
        String dateTime = simpleDateFormat.format(calendar.getTime());
        textView.setText(dateTime);

        //Get Random Image
        ImageView imageView;
        Button button3;
        Random r;
        Integer[] images = {
                R.drawable.aamir_ali,
                R.drawable.adrian_yan,
                R.drawable.alex_aney,
                R.drawable.bipra_dey,
                R.drawable.darren_dong,
                R.drawable.dennis_wang,
                R.drawable.dhruv_amin,
                R.drawable.dultsin,
                R.drawable.eden_kogan,
                R.drawable.eli_bui,
                R.drawable.elie_belkin,
                R.drawable.evelyn_paskhaver,
                R.drawable.fardin_iqbal,
                R.drawable.jerry_he,
                R.drawable.kenny_cao,
                R.drawable.marc_rosenberg,
                R.drawable.matthew_chen,
                R.drawable.michael,
                R.drawable.ming_lin,
                R.drawable.mohammed_ihtisham,
                R.drawable.noam,
                R.drawable.ralf_pacia,
                R.drawable.samuel_iskhakov,
                R.drawable.sean,
                R.drawable.sebastian_marinescu,
                R.drawable.selina_li,
                R.drawable.shuyue_chen,
                R.drawable.tanushri_sundaram,
                R.drawable.tejas_ravi,
                R.drawable.vasu,
                R.drawable.xinrui_ge,
                R.drawable.zhian_maysoon
        };
        int pickedImage;
        imageView = (ImageView) findViewById(R.id.imageView);
        r = new Random();
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //shows the random image
                imageView.setImageResource(images[r.nextInt(images.length)]);
            }
        });
    }
}