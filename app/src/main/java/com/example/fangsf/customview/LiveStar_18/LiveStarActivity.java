package com.example.fangsf.customview.LiveStar_18;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fangsf.customview.R;

public class LiveStarActivity extends AppCompatActivity {

    private LoveStarLayout mStarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_star);

        mStarLayout = findViewById(R.id.star);
    }

    public void click1(View view) {
        for (int i = 0; i < 20; i++) {
            mStarLayout.addLove();
        }
    }
}
