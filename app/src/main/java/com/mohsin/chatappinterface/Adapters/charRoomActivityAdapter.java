package com.mohsin.chatappinterface.Adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohsin.chatappinterface.Models.ActivityChatRoomModel;
import com.mohsin.chatappinterface.R;

public class charRoomActivityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_From_You = 0;
    private static final int TYPE_Msg_From = 1;

    private Context context;
    private List<ActivityChatRoomModel> messagesItems;

    public charRoomActivityAdapter(Context _context, List<ActivityChatRoomModel> navDrawerItems) {
        context = _context;
        this.messagesItems = navDrawerItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        switch (viewType) {
            case TYPE_From_You: {
                View view = LayoutInflater.from(context).inflate(R.layout.list_item_message_right, parent, false);
                return new ViewHolderChat(view);
            }
            case TYPE_Msg_From: {
                View view = LayoutInflater.from(context).inflate(R.layout.list_item_message_left, parent, false);
                return new ViewHolderChat(view);
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolderChat _viewHolderHeader = (ViewHolderChat) holder;

        ActivityChatRoomModel m = messagesItems.get(position);
        _viewHolderHeader.txtMsg.setText(m.getMessage());
        _viewHolderHeader.lblFrom.setText(m.getNameStr());
        _viewHolderHeader.txtDate.setText(m.getDate());
        _viewHolderHeader.txtStatus.setText(m.getStatus());
    }

    @Override
    public int getItemCount() {
        return messagesItems.size();
    }

    @Override
    public int getItemViewType(int position) {

        if (messagesItems.get(position).isLeMien()) {
            return TYPE_From_You;
        } else {
            return TYPE_Msg_From;
        }
    }


    class ViewHolderChat extends RecyclerView.ViewHolder {

        TextView lblFrom, txtMsg, txtDate, txtStatus;

        View view;

        public ViewHolderChat(@NonNull View itemView) {
            super(itemView);
            view = itemView;

            lblFrom = (TextView) view.findViewById(R.id.lblMsgFrom);
            txtMsg = (TextView) view.findViewById(R.id.txtMsg);
            txtDate = (TextView) view.findViewById(R.id.txtDate);
            txtStatus = (TextView) view.findViewById(R.id.txtStatus);


        }
    }
}
