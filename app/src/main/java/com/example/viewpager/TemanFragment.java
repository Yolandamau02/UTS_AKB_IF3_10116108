/*
    Tanggal pengerjaan : 18 Mei 2019
    Nama               : Yolanda Mau
    Nim                : 10116108
    Kelas              : AKB-3
 */



package com.example.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TemanFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_teman, container, false);

    }
}
