package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.navigation_account:
                    mTextMessage.setText(R.string.title_account);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsHolder> {
        @NonNull
        @Override
        public NewsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull NewsHolder newsHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class NewsHolder extends RecyclerView.ViewHolder{

            public NewsHolder(@NonNull View itemView) {
                super(itemView);
                view = itemView;
                txtFullName = itemView.findViewById(R.id.txt_fullName);
                txtPostDateTime = itemView.findViewById(R.id.txt_postDate);
                imgAvatar = itemView.findViewById(R.id.img_avatar);
                txtPost = itemView.findViewById(R.id.txt_post);
            }

            public View view;
            public TextView txtFullName;
            public TextView txtPostDateTime;
            public ImageView imgAvatar;
            public TextView txtPost;

        }
    }



}
