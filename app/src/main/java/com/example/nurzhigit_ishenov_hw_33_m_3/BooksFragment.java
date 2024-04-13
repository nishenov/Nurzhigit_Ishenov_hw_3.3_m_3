package com.example.nurzhigit_ishenov_hw_33_m_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BooksFragment extends Fragment {
    private RecyclerView rvBooks;
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBooks = requireActivity().findViewById(R.id.rv_books);
        loadData();
        BookAdapter bookAdapter = new BookAdapter(books);
        rvBooks.setAdapter(bookAdapter);
    }
    public void loadData(){
        Book book1 = new Book();
        book1.setCover(R.drawable.black_message_icon_1);
        book1.setName("Азбука");
        Book book2 = new Book();
        book2.setCover(R.drawable.ic_launcher_background);
        book2.setName("Властелин колец");
        Book book3 = new Book();
        book3.setCover(R.drawable.ic_launcher_foreground);
        book3.setName("Гарри Поттер");
        Book book4 = new Book();
        book4.setCover(R.drawable.message_icon_1);
        book4.setName("Автостопом по Галактике");
        Book book5 = new Book();
        book5.setCover(R.drawable.paper_document_icon_1);
        book5.setName("Программирование с нуля до профи");
        Book book6 = new Book();
        book6.setCover(R.drawable.black_message_icon_1);
        book6.setName("Что я думаю, когда думаю о беге");
        Book book7 = new Book();
        book7.setCover(R.drawable.message_icon_1);
        book7.setName("Алиппе");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
    }
}