package indosat.cendekiamilenia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import indosat.cendekiamilenia.R;

/**
 * Created by Ari on 7/1/2016.
 */
public class ScholarshipOverview extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView (LayoutInflater layoutInflater, ViewGroup
                              container, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.scholarship_overview,container,false);
        return view;
    }

}
