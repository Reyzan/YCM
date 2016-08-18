package indosat.cendekiamilenia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import indosat.cendekiamilenia.R;
import indosat.cendekiamilenia.helper.SessionManager;

/**
 * Created by Ari on 8/18/2016.
 */
public class ScholarshipForm1 extends Fragment{
    public EditText inputName, inputBirthDate, inputAddressKTP, inputEmail, inputCurrentSchool, inputCurrentFaculty, inputAward, inputActivity, inputCommunity, inputDestinationUniversity, inputDestinationFaculty, inputMajor;
    private Spinner inputEducation, inputEducationalLevel;
    public String name,birth_date,address_KTP,email,education,current_school,current_faculty,award,activity,community,destination_university,destination_faculty,major,educational_level;
    private boolean valid;
    private SessionManager session;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        session = new SessionManager(getContext());
    }
    @Override
    public View onCreateView (LayoutInflater layoutInflater, ViewGroup
            container, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.scholarship_form1,container,false);
        inputName = (EditText) view.findViewById(R.id.name);
        inputBirthDate = (EditText) view.findViewById(R.id.birth_date);
        inputAddressKTP = (EditText) view.findViewById(R.id.address_KTP);
        inputEmail = (EditText) view.findViewById(R.id.email);
        inputEducation = (Spinner) view.findViewById(R.id.education);
        inputCurrentSchool = (EditText) view.findViewById(R.id.current_school);
        inputCurrentFaculty = (EditText) view.findViewById(R.id.current_faculty);
        inputAward = (EditText) view.findViewById(R.id.award);
        inputActivity = (EditText) view.findViewById(R.id.activity);
        inputCommunity = (EditText) view.findViewById(R.id.community);
        inputDestinationUniversity = (EditText) view.findViewById(R.id.destination_university);
        inputDestinationFaculty = (EditText) view.findViewById(R.id.destination_faculty);
        inputMajor = (EditText) view.findViewById(R.id.major);
        inputEducationalLevel = (Spinner) view.findViewById(R.id.educational_level);
        return view;
    }
    @Override
    public void onPause(){
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
    }
}
