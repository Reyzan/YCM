package indosat.cendekiamilenia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import indosat.cendekiamilenia.R;
import indosat.cendekiamilenia.helper.SessionManager;

/**
 * Created by Ari on 8/18/2016.
 */
public class ScholarshipForm2 extends Fragment{
    private SessionManager session;
    private EditText inputReason, inputDescription, inputPlan, inputSocialMedia, inputLink;
    private String reason,description,plan,social_media,link;
    private Button btnSubmit;
    private ScholarshipForm1 form1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        session = new SessionManager(getContext());
        form1 = new ScholarshipForm1();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(form1.name.isEmpty()){
                    form1.inputName.setError("This field is required");
                }
            }
        });
    }
    @Override
    public View onCreateView (LayoutInflater layoutInflater, ViewGroup
            container, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.scholarship_form2,container,false);
        inputReason = (EditText) view.findViewById(R.id.reason);
        inputDescription = (EditText) view.findViewById(R.id.description);
        inputPlan = (EditText) view.findViewById(R.id.plan);
        inputSocialMedia = (EditText) view.findViewById(R.id.social_media);
        inputLink = (EditText) view.findViewById(R.id.link);
        btnSubmit = (Button) view.findViewById(R.id.submit);
        return view;
    }
    @Override
    public void onPause(){
        reason = inputReason.getText().toString();
        description = inputDescription.getText().toString();
        plan = inputPlan.getText().toString();
        social_media = inputSocialMedia.getText().toString();
        link = inputLink.getText().toString();
        session.setReason(reason);
        session.setDescription(description);
        session.setPlan(plan);
        session.setSocialMedia(social_media);
        session.setLink(link);
    }
}
