package com.example.q.testapplication02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by q on 2016-12-26.
 */

public class ContactAdapter extends BaseAdapter {
    private ArrayList<ContactItem> contactItemList = new ArrayList<ContactItem>();

    public ContactAdapter() {

    }

    @Override
    public int getCount() {
        return contactItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.contact_item_1, parent, false);
        }

        TextView nameTextView = (TextView) convertView.findViewById(R.id.name);
        TextView phoneTextView = (TextView) convertView.findViewById(R.id.phone);

        ContactItem contactItem = contactItemList.get(position);

        nameTextView.setText(contactItem.getName());
        phoneTextView.setText(contactItem.getPhone());

        return convertView;
    }

    public void addItem(String nameStr, String phoneStr) {
        ContactItem newItem = new ContactItem();
        newItem.setName(nameStr);
        newItem.setPhone(phoneStr);

        contactItemList.add(newItem);
    }

}





























