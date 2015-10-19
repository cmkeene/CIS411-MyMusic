package com.wesleyreisz.mymusic.service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.wesleyreisz.mymusic.R;
import com.wesleyreisz.mymusic.model.Song;

import java.util.List;

/**
 * Created by CK on 10/19/2015.
 */
public class SongAdapter extends ArrayAdapter<Song> {
    private Context mContext;
    private List<Song> mEntries;

    public SongAdapter(Context context, int textViewResourceId, List<Song> entries) {
        super(context, textViewResourceId, entries);
        mContext = context;
        mEntries = entries;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view==null){
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.fragment_music_list, parent, false);
        }
        final Song song = mEntries.get(position);
        return view;
    }
}
