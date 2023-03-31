package com.zeynep.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnZar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnZar=findViewById(R.id.btnZar);
        btnZar.setImageResource(R.drawable.dice1);
    }

    public void btnZar(View view){
        int randomSayi=(int)(Math.random()*6)+1;


        ObjectAnimator rotate= ObjectAnimator.ofFloat(btnZar,"rotation",0f,360f);
        rotate.setDuration(500);

        rotate.addListener(new Animator.AnimatorListener() {

            public void onAnimationStart(Animator animator) {

            }

            public void onAnimationEnd(Animator animator) {


                switch(randomSayi){
                    case 1:
                        btnZar.setImageResource(R.drawable.dice1);
                        break;

                    case 2:
                        btnZar.setImageResource(R.drawable.dice2);
                        break;

                    case 3:
                        btnZar.setImageResource(R.drawable.dice3);
                        break;

                    case 4:
                        btnZar.setImageResource(R.drawable.dice4);
                        break;

                    case 5:
                        btnZar.setImageResource(R.drawable.dice5);
                        break;

                    case 6:
                        btnZar.setImageResource(R.drawable.d6);
                        break;
                }
                btnZar.setEnabled(true);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        rotate.start();
    }
}
