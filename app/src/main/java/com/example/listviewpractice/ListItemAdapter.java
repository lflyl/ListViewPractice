package com.example.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListItemAdapter extends ArrayAdapter<ImageAndText> {
    private int recourceId;
    public ListItemAdapter( Context context,  int resource,  List<ImageAndText> objects) {
        super(context, resource, objects);
        recourceId = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageAndText imageandtext = getItem(position); //得到集合中指定位置的一组数据，并且实例化
        View view = LayoutInflater.from(getContext()).inflate(recourceId,parent,false); //用布局裁剪器(又叫布局膨胀器)，将导入的布局裁剪并且放入到当前布局中
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);//从裁剪好的布局里获取ImageView布局ID
        TextView textView = (TextView)view.findViewById(R.id.textView); //从裁剪好的布局里获取TextView布局Id
        imageView.setImageResource(imageandtext.getImageId());//将当前一组imageListArray类中的图片iamgeId导入到ImageView布局中
        textView.setText(imageandtext.getText());//将当前一组imageListArray类中的TextView内容导入到TextView布局中
        return view;
    }
}
