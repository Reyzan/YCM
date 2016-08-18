package indosat.cendekiamilenia.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import indosat.cendekiamilenia.R;

/**
 * Created by Ari on 8/18/2016.
 */
public class ScholarshipForm2 extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView (LayoutInflater layoutInflater, ViewGroup
            viewGroup, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.scholarship_form1,viewGroup,false);
        return view;
    }
}
