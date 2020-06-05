package com.mohsin.chatappinterface.UI.Activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mohsin.chatappinterface.Adapters.charRoomActivityAdapter;
import com.mohsin.chatappinterface.Models.ActivityChatRoomModel;
import com.mohsin.chatappinterface.R;

import java.util.ArrayList;

public class ChatRoom extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvExistingMedList;
    charRoomActivityAdapter _charRoomActivityAdapter;
    EditText input;
    Button sendButton;
    TextView tvHeader;
    ArrayList<ActivityChatRoomModel> listMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        sendButton = (Button) findViewById(R.id.sendButton);
        tvHeader = findViewById(R.id.tvHeader);

        tvHeader.setText("Chat Room");

        rvExistingMedList = (RecyclerView) findViewById(R.id.Rv);

        listMessages = new ArrayList<ActivityChatRoomModel>();

        listMessages.add(new ActivityChatRoomModel("Mohsin Javed", "Hey how are you", true, "http", "Read", "Jul 3, 2020"));
        listMessages.add(new ActivityChatRoomModel("Mohsin Javed", "Hello!!", true, "http", "Read", "Jul 3, 2020"));
        listMessages.add(new ActivityChatRoomModel("Austin Bryan", "Fine Man", false, "http", "Read", "Jul 3, 2020"));


        _charRoomActivityAdapter = new charRoomActivityAdapter(this, listMessages);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        rvExistingMedList.setLayoutManager(mLayoutManager);
        rvExistingMedList.setItemAnimator(new DefaultItemAnimator());
        rvExistingMedList.setAdapter(_charRoomActivityAdapter);

        sendButton.setOnClickListener(this);


        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!input.getText().toString().isEmpty()) {
                    sendButton.setTextColor(getResources().getColor(R.color.green));
                } else {
                    sendButton.setTextColor(getResources().getColor(R.color.button_grey));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        String Message = input.getText().toString();

        if (v == sendButton) {
            if (!Message.isEmpty()) {
                listMessages.add(new ActivityChatRoomModel("Mohsin Javed", Message, true, "http", "Read", "Jul 3, 2020"));
                _charRoomActivityAdapter.notifyDataSetChanged();
                input.setText("");
            }
        }
    }
}
