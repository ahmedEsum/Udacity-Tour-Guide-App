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
public class MuseumFragment extends Fragment {
    public MuseumFragment(){}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list,container,false);
        ArrayList<AppDataModel> info = new ArrayList<>();
        info.add(new AppDataModel(R.string.Cairo_Coptic_Museum,R.string.Cairo_Coptic_Museum_article,R.mipmap.cairocopticmuseum));
        info.add(new AppDataModel(R.string.Egyptian_Museum,R.string.Egyptian_Museum_article,R.mipmap.egyption));
        info.add(new AppDataModel(R.string.Islamic_Museum,R.string.Islamic_Museum_article,R.mipmap.museumislamic));
        info.add(new AppDataModel(R.string.The_GayerAnderson_Museum,R.string.The_GayerAnderson_Museum_article,R.mipmap.thegayeranderson));
        info.add(new AppDataModel(R.string.Luxor_Museum,R.string.Luxor_article,R.mipmap.luxormuseumsegypt));
        DataAdapter adapter = new DataAdapter(getContext(),0,info);
        ListView listView=rootView.findViewById(R.id.display_list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
