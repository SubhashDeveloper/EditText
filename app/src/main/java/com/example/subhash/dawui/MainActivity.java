package com.example.subhash.dawui;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mindorks.editdrawabletext.DrawablePosition;
import com.mindorks.editdrawabletext.EditDrawableText;
import com.mindorks.editdrawabletext.onDrawableClickListener;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    Button button;
    EditDrawableText editDrawableText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit_test);
        editText1=findViewById(R.id.edit_test1);
        button=findViewById(R.id.button);
        editDrawableText=findViewById(R.id.drawable_editText_left);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        final Drawable customErrorDrawable = getResources().getDrawable(R.drawable.ic_launcher_background);
        customErrorDrawable.setBounds(0, 0, customErrorDrawable.getIntrinsicWidth(), customErrorDrawable.getIntrinsicHeight());

        editDrawableText.setDrawableClickListener(new onDrawableClickListener() {
            @Override
            public void onClick(@NotNull DrawablePosition drawablePosition) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_action_name, 0);
                editText.setError("ERROR");
                Toast.makeText(MainActivity.this, ""+editText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b)
                {
                    editText.setBackgroundResource(R.drawable.sty);
                }
                else
                {
                    editText.setBackgroundResource(0);
                }
            }
        });
        editText1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b)
                {
                    editText1.setBackgroundResource(R.drawable.sty);
                }
                else
                {
                    editText1.setBackgroundResource(0);
                }
            }
        });
    }
}
