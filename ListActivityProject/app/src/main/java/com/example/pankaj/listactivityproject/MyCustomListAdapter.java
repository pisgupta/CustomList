package com.example.pankaj.listactivityproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pankaj on 7/31/2015.
 */
public class MyCustomListAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    String[] item;
     ViewHolder viewHolder = null;
    public MyCustomListAdapter(Context mContext, String[] item) {
        this.mContext = mContext;
        this.item = item;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_layout, parent, false);
            viewHolder.icon_photo = (ImageView) convertView.findViewById(R.id.icon_photo);
            viewHolder.name_text = (TextView) convertView.findViewById(R.id.name_text);
            viewHolder.icon_call = (ImageView) convertView.findViewById(R.id.icon_call);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder=(ViewHolder)convertView.getTag();
        }
        //viewHolder.icon_call.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.ic_launcher));
        viewHolder.name_text.setText(item[position]);
      //  viewHolder.icon_photo.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.ic_launcher));

        viewHolder.icon_photo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,position+"",Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.name_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,item[position],Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    class ViewHolder {
        ImageView icon_photo;
        TextView name_text;
        ImageView icon_call;
    }

}
