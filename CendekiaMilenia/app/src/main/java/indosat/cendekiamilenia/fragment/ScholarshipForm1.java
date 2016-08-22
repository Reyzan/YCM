package indosat.cendekiamilenia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import indosat.cendekiamilenia.R;
import indosat.cendekiamilenia.helper.SessionManager;

/**
 * Created by Ari on 8/18/2016.
 */
public class ScholarshipForm1 extends Fragment{
    private static String TAG = SessionManager.class.getSimpleName();
    public EditText inputName, inputBirthDate, inputAddressKTP, inputEmail, inputCurrentSchool, inputCurrentFaculty, inputAward, inputActivity, inputCommunity, inputDestinationUniversity, inputDestinationFaculty, inputMajor;
    public Spinner inputEducation, inputEducationalLevel;
    public String name,birth_date,address_KTP,email,education,current_school,current_faculty,award,activity,community,destination_university,destination_faculty,major,educational_level;
    private Button btnNext;
    private SessionManager session;
    private boolean valid = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        session = new SessionManager(getContext());
    }
    @Override
    public View onCreateView (LayoutInflater layoutInflater, ViewGroup
            container, Bundle savedInstanceState){
        View rootView = layoutInflater.inflate(R.layout.scholarship_form1,container,false);
        inputName = (EditText) rootView.findViewById(R.id.name);
        inputBirthDate = (EditText) rootView.findViewById(R.id.birth_date);
        inputAddressKTP = (EditText) rootView.findViewById(R.id.address_KTP);
        inputEmail = (EditText) rootView.findViewById(R.id.email);
        inputEducation = (Spinner) rootView.findViewById(R.id.education);
        inputCurrentSchool = (EditText) rootView.findViewById(R.id.current_school);
        inputCurrentFaculty = (EditText) rootView.findViewById(R.id.current_faculty);
        inputAward = (EditText) rootView.findViewById(R.id.award);
        inputActivity = (EditText) rootView.findViewById(R.id.activity);
        inputCommunity = (EditText) rootView.findViewById(R.id.community);
        inputDestinationUniversity = (EditText) rootView.findViewById(R.id.destination_university);
        inputDestinationFaculty = (EditText) rootView.findViewById(R.id.destination_faculty);
        inputMajor = (EditText) rootView.findViewById(R.id.major);
        inputEducationalLevel = (Spinner) rootView.findViewById(R.id.educational_level);
        btnNext = (Button) rootView.findViewById(R.id.next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // assign input to variable
                name = inputName.getText().toString();
                birth_date = inputBirthDate.getText().toString();
                address_KTP = inputAddressKTP.getText().toString();
                email = inputEmail.getText().toString();
                education = inputEducation.getSelectedItem().toString();
                current_school = inputCurrentSchool.getText().toString();
                current_faculty = inputCurrentFaculty.getText().toString();
                award = inputAward.getText().toString();
                activity = inputActivity.getText().toString();
                community = inputCommunity.getText().toString();
                destination_university = inputDestinationUniversity.getText().toString();
                destination_faculty = inputDestinationFaculty.getText().toString();
                major = inputMajor.getText().toString();
                educational_level = inputEducationalLevel.getSelectedItem().toString();
                session.setName(name);
                session.setBirthDate(birth_date);
                session.setAddressKTP(address_KTP);
                session.setEmail(email);
                session.setEducation(education);
                session.setCurrentSchool(current_school);
                session.setCurrentFaculty(current_faculty);
                session.setAward(award);
                session.setActivity(activity);
                session.setCommunity(community);
                session.setDestinationUniversity(destination_university);
                session.setDestinationFaculty(destination_faculty);
                session.setMajor(major);
                session.setEducationallevel(educational_level);
                if(session.getKeyName().isEmpty()){
                    inputName.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputName.setError(null);
                }
                if(session.getKeyBirthdate().isEmpty()){
                    inputBirthDate.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputBirthDate.setError(null);
                }
                if(session.getKeyAddressktp().isEmpty()){
                    inputAddressKTP.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputAddressKTP.setError(null);
                }
                if(session.getKeyEmail().isEmpty()){
                    inputEmail.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputEmail.setError(null);
                }
                if(session.getKeyCurrentschool().isEmpty()){
                    inputCurrentSchool.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputCurrentSchool.setError(null);
                }
                if(session.getKeyCurrentfaculty().isEmpty()){
                    inputCurrentFaculty.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputCurrentFaculty.setError(null);
                }
                if(session.getKeyAward().isEmpty()){
                    inputAward.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputAward.setError(null);
                }
                if(session.getKeyActivity().isEmpty()){
                    inputActivity.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputActivity.setError(null);
                }
                if(session.getKeyCommunity().isEmpty()){
                    inputCommunity.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputCommunity.setError(null);
                }
                if(session.getKeyDestinationuniversity().isEmpty()){
                    inputDestinationUniversity.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputDestinationUniversity.setError(null);
                }
                if(session.getKeyDestinationfaculty().isEmpty()){
                    inputDestinationFaculty.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputDestinationFaculty.setError(null);
                }
                if(session.getKeyMajor().isEmpty()){
                    inputMajor.setError("This field is required");
                    valid = false;
                }else{
                    valid = true;
                    inputMajor.setError(null);
                }
                if (valid){
                    Log.d(TAG, "onClick: masuk");
                    FragmentTransaction trans = getFragmentManager()
                            .beginTransaction();
				/*
				 * IMPORTANT: We use the "scholarship frame" defined in
				 * "scholarship_form.xml" as the reference to replace fragment
				 */
                    trans.replace(R.id.scholarship_frame, new ScholarshipForm2());

				/*
				 * IMPORTANT: The following lines allow us to add the fragment
				 * to the stack and return to it later, by pressing back
				 */
                    trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                    trans.addToBackStack(null);

                    trans.commit();
                }
            }
        });
        return rootView;
    }
}
