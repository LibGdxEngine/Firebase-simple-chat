package com.devahmed.firebasesimplechat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.ViewHolder> {

    private List<Message> MessagesList;

    public MessagesAdapter(List<Message> MessagesList) {
        this.MessagesList = MessagesList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_row_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Message model = MessagesList.get(position);
        holder.sender.setText(model.getSender());
        holder.messageBody.setText(model.getMessage());
        holder.date.setText(model.getDate() + "");
    }

    @Override
    public int getItemCount() {
        return MessagesList.size();
    }

    public void setList(List<Message> newList) {
        MessagesList = newList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView sender , messageBody , date;
        public ViewHolder(View view) {
            super(view);
            sender = view.findViewById(R.id.sender);
            messageBody = view.findViewById(R.id.messageBody);
            date = view.findViewById(R.id.date);
        }
    }
}