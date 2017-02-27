package com.sheylavc.leanbacklist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sheylavc.leanbacklist.MaterialLean.MaterialLeanBack;

/**
 * Created by Sheylavc on 24/02/2017.
 */

public class TestViewHolder extends MaterialLeanBack.ViewHolder {

    protected TextView textView;
    protected ImageView imageView;

    public TestViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}