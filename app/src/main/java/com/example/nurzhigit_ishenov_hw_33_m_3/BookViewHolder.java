package com.example.nurzhigit_ishenov_hw_33_m_3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {
    private ImageView cover;
    private TextView name;
    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        cover = itemView.findViewById(R.id.iv_cover_book);
        name = itemView.findViewById(R.id.tv_name_book);
    }
    public void onBind(Book book){
        cover.setImageResource(book.getCover());
        name.setText(book.getName());
    }
}
