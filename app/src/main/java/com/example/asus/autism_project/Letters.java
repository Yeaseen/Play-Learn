package com.example.asus.autism_project;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.asus.autism_project.R.drawable.rsz_math;

public class Letters extends AppCompatActivity implements View.OnClickListener {

    int[] backgroundArray={R.drawable.letter1back,R.drawable.rsz_letter_2back};
    int[] button1Array={R.drawable.apple,R.drawable.rsz_horse};
    int[] button2Array={R.drawable.banana,R.drawable.rsz_fish};
    int[] button3Array={R.drawable.elephant,R.drawable.rsz_ball};
    int[] button4Array={R.drawable.cat,R.drawable.rsz_doll};

    ImageButton[] imgButton=new ImageButton[4];
    public  ImageButton button1;
    public  ImageButton button2;
    public  ImageButton button3;
    public ImageButton button4;
    public ImageView background;
    public int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);

        background = (ImageView)findViewById(R.id.letters);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        background.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
        background.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
        background.setAdjustViewBounds(false);
        background.setScaleType(ImageView.ScaleType.FIT_XY);
        background.setImageResource(backgroundArray[0]);

        imgButton[0] =findViewById(R.id.appleBttn);
        imgButton[1] =findViewById(R.id.bananaBttn);
        imgButton[2] =findViewById(R.id.catBttn);
        imgButton[3] =findViewById(R.id.elephantBttn);



        imgButton[0].setBackgroundResource(button1Array[0]);
        imgButton[0].setOnClickListener(this);
        imgButton[1].setImageResource(button2Array[0]);
        imgButton[1].setOnClickListener(this);
        imgButton[2].setImageResource(button3Array[0]);
        imgButton[2].setOnClickListener(this);
        imgButton[3].setImageResource(button4Array[0]);
        imgButton[3].setOnClickListener(this);


    }



    @Override
    public void onClick(View view) {

        if(view == imgButton[0]) Toast.makeText(Letters.this,"Congratulations !!",Toast.LENGTH_SHORT).show();
        else if(view == imgButton[1]) Toast.makeText(Letters.this,"Ops, its not ok",Toast.LENGTH_SHORT).show();
        else if(view == imgButton[2]) Toast.makeText(Letters.this,"Ops, its not ok",Toast.LENGTH_SHORT).show();
        else if(view == imgButton[3] ) {
            Toast.makeText(Letters.this,"Ops, its not ok",Toast.LENGTH_SHORT).show();

        }

    }
}
