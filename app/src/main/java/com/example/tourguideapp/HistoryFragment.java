package com.example.tourguideapp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
public class HistoryFragment extends Fragment {
    public HistoryFragment(){}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list,container,false);
        ArrayList<AppDataModel> info = new ArrayList<>();
        info.add(new AppDataModel(R.string.EgyptianPyramids,R.string.Egyptian_Pyramids_article,R.mipmap.egptioanpyaramids));
        info.add(new AppDataModel(R.string.AbuSimbelvillage,R.string.AbuSimbelvillage_article,R.mipmap.abusimple));
        info.add(new AppDataModel(R.string.TheKarnakTemple,R.string.TheKarnakTemple_article,R.mipmap.lkarnak));
        info.add(new AppDataModel(R.string.ValleyOfTheKingsTombs,R.string.ValleyOfTheKingsTombs_article,R.mipmap.valleyofthekingstombs));
        DataAdapter adapter = new DataAdapter(getContext(),0,info);
        ListView listView = rootView.findViewById(R.id.display_list);
        listView.setAdapter(adapter);
        return  rootView;
    }
}
