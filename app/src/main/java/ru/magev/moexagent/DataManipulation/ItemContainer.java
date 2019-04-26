package ru.magev.moexagent.DataManipulation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import javax.inject.Inject;

import ru.magev.moexagent.Common.StartApplication;
import ru.magev.moexagent.R;

public class ItemContainer {


    protected Context context;
    @Inject
    StartApplication mStartApplication;

    public ItemContainer()
    {
        this.context = mStartApplication.getApplicationContext();
    }
    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return Float.toString(rate);
    }

    public void setRate(String rate) {
        this.rate = Float.parseFloat(rate);
    }

    public Bitmap isDirection() {
        Bitmap bitmap;
        if(direction)
        {
            bitmap= BitmapFactory.decodeResource(context.getResources(),R.drawable.chart_up);
        }
        else
        {
            bitmap=BitmapFactory.decodeResource(context.getResources(),R.drawable.chart_down);
        }
        return bitmap;

    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    private ImageView image;
    private String name;
    private float rate;
    private boolean direction;

}
