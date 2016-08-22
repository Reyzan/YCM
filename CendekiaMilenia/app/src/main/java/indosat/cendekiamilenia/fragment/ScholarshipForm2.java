package indosat.cendekiamilenia.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import indosat.cendekiamilenia.R;
import indosat.cendekiamilenia.app.AppConfig;
import indosat.cendekiamilenia.app.AppController;
import indosat.cendekiamilenia.helper.SessionManager;

/**
 * Created by Ari on 8/18/2016.
 */
public class ScholarshipForm2 extends Fragment{
    private static final String TAG = ScholarshipForm2.class.getSimpleName();
    private SessionManager session;
    private EditText inputReason, inputDescription, inputPlan, inputSocialMedia, inputLink;
    private String  reason,description,plan,social_media,link;
    private Button btnSubmit;
    public boolean valid = true;
    private ScholarshipForm1 form1;
    private ProgressDialog pDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        session = new SessionManager(getContext());
        form1 = new ScholarshipForm1();

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
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                if(session.getKeyReason().isEmpty()){
                    inputReason.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputReason.setError(null);
                }
                if(session.getKeyDescription().isEmpty()){
                    inputDescription.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputDescription.setError(null);
                }
                if(session.getKeyPlan().isEmpty()){
                    inputPlan.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputPlan.setError(null);
                }
                if(session.getKeySocialmedia().isEmpty()){
                    inputSocialMedia.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputSocialMedia.setError(null);
                }
                if(session.getKeyLink().isEmpty()){
                    inputLink.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputLink.setError(null);
                }
                if (valid){
                    addApplicant(session.getKeyName(),session.getKeyBirthdate(),session.getKeyAddressktp(),session.getKeyEmail(),session.getKeyEducation(),session.getKeyCurrentschool(),session.getKeyCurrentfaculty(),session.getKeyAward(),session.getKeyActivity(),session.getKeyCommunity(),session.getKeyDestinationuniversity(),session.getKeyDestinationfaculty(),session.getKeyMajor(),session.getKeyEducationallevel(),session.getKeyReason(),session.getKeyDescription(),session.getKeyPlan(),session.getKeySocialmedia(),session.getKeyLink());
                } else {
                    Toast.makeText(getContext(),"Please check your details again",Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }
    private void addApplicant(final String name, final String birth_date, final String address_KTP, final String email, final String education, final String current_school, final String current_faculty, final String award, final String activity, final String community, final String destination_university, final String destination_faculty, final String major, final String educational_level, final String reason, final String description, final String plan, final String social_media, final String link){
        StringRequest strReq = new StringRequest(Request.Method.POST,
                AppConfig.URL_ADD, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, "Register Response: " + response.toString());
                Toast.makeText(getContext(),"Thank You",Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Registration Error: " + error.getMessage());
                Toast.makeText(getContext(),
                        error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting params to register url
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", name);
                params.put("birth_date", birth_date);
                params.put("address_KTP", address_KTP);
                params.put("email", email);
                params.put("education", education);
                params.put("current_school", current_school);
                params.put("current_faculty", current_faculty);
                params.put("award", award);
                params.put("activity", activity);
                params.put("community", community);
                params.put("destination_university", destination_university);
                params.put("destination_faculty", destination_faculty);
                params.put("major", major);
                params.put("educational_level", educational_level);
                params.put("reason", reason);
                params.put("description", description);
                params.put("plan", plan);
                params.put("social_media", social_media);
                params.put("link", link);
                return params;
            }

        };

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(strReq);
    }
}
