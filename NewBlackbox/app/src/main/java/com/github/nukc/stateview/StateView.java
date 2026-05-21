package com.github.nukc.stateview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;

public class StateView extends FrameLayout {

    public StateView(Context context) {
        super(context);
    }

    public StateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public StateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void showLoading() {
        setVisibility(VISIBLE);
    }

    public void showContent() {
        setVisibility(VISIBLE);
    }

    public void showEmpty() {
        setVisibility(VISIBLE);
    }
}
