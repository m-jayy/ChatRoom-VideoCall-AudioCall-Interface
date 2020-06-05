package com.mohsin.chatappinterface.UI.Activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.mohsin.chatappinterface.Adapters.lobbyActivityAdapter;
import com.mohsin.chatappinterface.Models.ActivityLobbyModel;
import com.mohsin.chatappinterface.R;

import java.util.ArrayList;

public class Lobby extends AppCompatActivity {
    RecyclerView lobbyRv;
    lobbyActivityAdapter _lobbyActivityAdapter;
    ArrayList<ActivityLobbyModel> listUsers;
    TextView tvHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        lobbyRv = findViewById(R.id.lobbyRv);

        tvHeader = findViewById(R.id.tvHeader);
        tvHeader.setText("Lobby");

        listUsers = new ArrayList<ActivityLobbyModel>();

        listUsers.add(new ActivityLobbyModel("Mohsin", R.drawable.img1, "Available"));
        listUsers.add(new ActivityLobbyModel("Haris", R.drawable.defaultdp_img, "Available"));
        listUsers.add(new ActivityLobbyModel("Ali Ghani", R.drawable.defaultdp_img, "Do Not Disturb"));
        listUsers.add(new ActivityLobbyModel("Daniyal", R.drawable.defaultdp_img, "Urgent Calls Only"));

        _lobbyActivityAdapter = new lobbyActivityAdapter(Lobby.this, listUsers);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        lobbyRv.setLayoutManager(mLayoutManager);
        lobbyRv.setItemAnimator(new DefaultItemAnimator());
        lobbyRv.setAdapter(_lobbyActivityAdapter);


    }
}
