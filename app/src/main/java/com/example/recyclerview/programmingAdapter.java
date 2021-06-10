package com.example.recyclerview;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class programmingAdapter extends RecyclerView.Adapter<programmingAdapter.ProgrammingViewHolder> {
    private String[] data;
    public programmingAdapter(String[] data)//As we have to input the string type in the recycler view. that is why we have taken the string type in the constructor
    {
        this.data=data;
    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType)//This method will create view that we require and place them in the view holder
    {
        //onCreateViewHolder will be called when recycler view is loaded for each item on the screen
        LayoutInflater inflater=LayoutInflater.from(parent.getContext()); //Layout Inflater class returns a corresponding object for the views that are described in our layout folder
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);

        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(programmingAdapter.ProgrammingViewHolder holder, int position)//This method will bind the data with the views. All data binding will take place here
    {
        //This method will be called for each data binding. OnCreate will only called once the view is created, after than only onBind method is called
        String title=data[position];
        holder.title.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgIcon;
        TextView title;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcon=(ImageView) itemView.findViewById(R.id.imgIcon);
            title=(TextView)itemView.findViewById(R.id.textTitle);
        }
    }
}
