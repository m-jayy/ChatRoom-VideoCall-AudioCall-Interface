package com.mohsin.chatappinterface.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.mohsin.chatappinterface.Models.ActivityLobbyModel;
import com.mohsin.chatappinterface.R;
import com.mohsin.chatappinterface.UI.Dialogs.LobbyAdapterActionDialog;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class lobbyActivityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<ActivityLobbyModel> userList;


    public lobbyActivityAdapter(Context context, ArrayList<ActivityLobbyModel> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.lobby_row_users, parent, false);
        return new ViewHolderUser(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolderUser _viewHolder = (ViewHolderUser) holder;

        _viewHolder.userName.setText(userList.get(position).getUserName());
        _viewHolder.status.setText(userList.get(position).getUserStatus());
        _viewHolder.profilePic.setImageResource(userList.get(position).getUserProfileImg());

        _viewHolder.constrainRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new LobbyAdapterActionDialog(context, "userId");
            }
        });

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class ViewHolderUser extends RecyclerView.ViewHolder {

        TextView userName, status;
        ConstraintLayout constrainRow;
        CircleImageView profilePic;
        View view;

        public ViewHolderUser(@NonNull View itemView) {
            super(itemView);
            view = itemView;

            profilePic = view.findViewById(R.id.profilePic);
            constrainRow = view.findViewById(R.id.constrainRow);
            userName = (TextView) view.findViewById(R.id.userName);
            status = (TextView) view.findViewById(R.id.status);
        }
    }
}
