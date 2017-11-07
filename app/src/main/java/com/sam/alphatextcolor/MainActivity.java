package com.sam.alphatextcolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * @author luys
 * @describe 动态改变TextColor色值的透明度
 * @date 2017/11/7
 * @email samluys@foxmail.com
 */
public class MainActivity extends AppCompatActivity {

    private SeekBar sb_percent;
    private TextView tv_process;
    private AlphaTextColorView atv_content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         atv_content = findViewById(R.id.atv_content);

         sb_percent = findViewById(R.id.sb_percent);
         tv_process = findViewById(R.id.tv_process);


        sb_percent.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                try {
                    tv_process.setText("当前百分比：" + progress + "%");
                    int alpha = 255 * progress/100;
                    Log.e(MainActivity.class.getSimpleName(), alpha + "");
                    atv_content.setAlphaPercent(alpha);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
