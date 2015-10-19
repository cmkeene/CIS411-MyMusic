package com.wesleyreisz.mymusic.service;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.wesleyreisz.mymusic.R;
import com.wesleyreisz.mymusic.model.Song;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MusicListFragment extends Fragment {

    public MusicListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_music_list, container, false);

        ListView listView = (ListView) view.findViewById(R.id.listViewMusic);
        List<Song> songs = new MockMusicService().findAll();
        SongAdapter songAdapter = new SongAdapter(this.getContext(), R.layout.fragment_music_list, songs);
        listView.setAdapter(songAdapter);

        return view;
    }
}
