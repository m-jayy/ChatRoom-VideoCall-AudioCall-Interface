package com.mohsin.chatappinterface.UI.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.widget.LinearLayout;

import com.mohsin.chatappinterface.R;
import com.mohsin.chatappinterface.UI.Activites.AudioCall;
import com.mohsin.chatappinterface.UI.Activites.ChatRoom;
import com.mohsin.chatappinterface.UI.Activites.VideoChat;


public class LobbyAdapterActionDialog extends Dialog implements View.OnClickListener {

    private LinearLayout llVideoCall;
    private LinearLayout llAudioCall;
    private LinearLayout llChat;
    Context context;
    String title;

    public LobbyAdapterActionDialog(Context context, String _title) {
        super(context);
        this.context = context;
        title = _title;

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setCanceledOnTouchOutside(true);
        setContentView(R.layout.dialog_lobby_adapter_action);

        Display display = getWindow().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        width = (int) (width * 0.9);
        getWindow()
                .setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT);

        llVideoCall = (LinearLayout) findViewById(R.id.llVideoCall);
        llAudioCall = (LinearLayout) findViewById(R.id.llAudioCall);
        llChat = (LinearLayout) findViewById(R.id.llChat);

        llVideoCall.setOnClickListener(this);
        llAudioCall.setOnClickListener(this);
        llChat.setOnClickListener(this);

        show();
    }

    @Override
    public void onClick(View view) {
        if (view == llVideoCall) {
            context.startActivity(new Intent(context, VideoChat.class));
            dismiss();
        } else if (view == llAudioCall) {
            context.startActivity(new Intent(context, AudioCall.class));
            dismiss();
        } else if (view == llChat) {
            context.startActivity(new Intent(context, ChatRoom.class));
            dismiss();
        }
    }
}
