package fatty.a163animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button)findViewById(R.id.button);
        final ImageView view = (ImageView)findViewById(R.id.imageView);

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                switch(counter%6) {
                    case 0:
                        AlphaAnimation aa = new AlphaAnimation(0,1);
                        aa.setDuration(3000);
                        view.startAnimation(aa);
                        break;
                    case 1:
                        RotateAnimation ra = new RotateAnimation(0,360,100,100);
                        ra.setDuration(3000);
                        view.startAnimation(ra);
                        break;
                    case 2:
                        RotateAnimation rr = new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5F,RotateAnimation.RELATIVE_TO_SELF,0.5F);
                        rr.setDuration(3000);
                        view.startAnimation(rr);
                        break;
                    case 3:
                        TranslateAnimation ta = new TranslateAnimation(0,200,0,300);
                        ta.setDuration(3000);
                        view.startAnimation(ta);
                        break;
                    case 4:
                        ScaleAnimation sa = new ScaleAnimation(0,2,0,2);
                        sa.setDuration(3000);
                        view.startAnimation(sa);
                        break;
                    case 5:
                        ScaleAnimation ss = new ScaleAnimation(0,1,0,1, Animation.RELATIVE_TO_SELF,0.5F,Animation.RELATIVE_TO_SELF,0.5F);
                        ss.setDuration(3000);
                        view.startAnimation(ss);
                        break;
                }
                counter++;
            }
        });
    }
}
