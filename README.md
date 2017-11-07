# AlphaTextColorView
设置TextView的textColor色值的透明度

# Usage

**XML文件**
``` Xml
<com.sam.alphatextcolor.AlphaTextColorView
        android:id="@+id/atv_content"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textColor="#15bfff"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
**Java 代码**
``` Java
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
```
