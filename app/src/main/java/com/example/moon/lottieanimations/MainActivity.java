package com.example.moon.lottieanimations;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    int number = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView = (LottieAnimationView)findViewById(R.id.lottie_animation_view);

        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number%2==0) {
                    lottieAnimationView.setProgress(0.5f);
                    lottieAnimationView.playAnimation();
                } else{
                    lottieAnimationView.setProgress(0);
                    lottieAnimationView.pauseAnimation();

                }
                number++;
            }
        });

    }
}
