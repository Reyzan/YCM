package indosat.cendekiamilenia.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by Ari on 8/18/2016.
 */
public class SessionManager {
    // LogCat tag
    private static String TAG = SessionManager.class.getSimpleName();

    // Shared Preferences
    SharedPreferences pref;

    SharedPreferences.Editor editor;
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "YCM";
    private static final String KEY_NAME = "name";
    private static final String KEY_BIRTHDATE = "birth_date";
    private static final String KEY_ADDRESSKTP = "address_KTP";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_EDUCATION = "education";
    private static final String KEY_CURRENTSCHOOL = "current_school";
    private static final String KEY_CURRENTFACULTY = "current_faculty";
    private static final String KEY_AWARD = "award";
    private static final String KEY_ACTIVITY = "activity";
    private static final String KEY_COMMUNITY = "community";
    private static final String KEY_DESTINATIONUNIVERSITY = "destination_university";
    private static final String KEY_DESTINATIONFACULTY = "destination_faculty";
    private static final String KEY_MAJOR = "major";
    private static final String KEY_EDUCATIONALLEVEL = "educational_level";
    private static final String KEY_REASON = "reason";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_PLAN = "plan";
    private static final String KEY_SOCIALMEDIA = "social_media";
    private static final String KEY_LINK = "link";
    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    public void setName(String name){
        editor.putString(KEY_NAME,name);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Name");
    }
    public void setBirthDate(String birth_date){
        editor.putString(KEY_BIRTHDATE,birth_date);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set BirthDate");
    }public void setAddressKTP(String address_KTP){
        editor.putString(KEY_ADDRESSKTP,address_KTP);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set AddressKTP");
    }
    public void setEmail(String email){
        editor.putString(KEY_EMAIL,email);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Email");
    }public void setEducation(String education){
        editor.putString(KEY_EDUCATION,education);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Education");
    }public void setCurrentSchool(String current_school){
        editor.putString(KEY_CURRENTSCHOOL,current_school);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set CurrentSchool");
    }
    public void setCurrentFaculty(String current_faculty){
        editor.putString(KEY_CURRENTFACULTY,current_faculty);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set CurrentFaculty");
    }
    public void setAward(String award){
        editor.putString(KEY_AWARD,award);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Award");
    }public void setActivity(String activity){
        editor.putString(KEY_ACTIVITY,activity);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Activity");
    }public void setCommunity(String community){
        editor.putString(KEY_COMMUNITY,community);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Community");
    }
    public void setDestinationUniversity(String destination_university){
        editor.putString(KEY_DESTINATIONUNIVERSITY,destination_university);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set DestinationUniversity");
    }public void setDestinationFaculty(String destination_faculty){
        editor.putString(KEY_DESTINATIONFACULTY,destination_faculty);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set DestinationFaculty");
    }public void setMajor(String major){
        editor.putString(KEY_MAJOR,major);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Major");
    }
    public void setEducationallevel(String educational_level){
        editor.putString(KEY_EDUCATIONALLEVEL,educational_level);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set EducationalLevel");
    }
    public void setReason(String reason){
        editor.putString(KEY_REASON,reason);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Reason");
    }
    public void setDescription(String description){
        editor.putString(KEY_DESCRIPTION,description);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Description");
    }
    public void setPlan(String plan){
        editor.putString(KEY_PLAN,plan);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Plan");
    }
    public void setSocialMedia(String social_media){
        editor.putString(KEY_SOCIALMEDIA,social_media);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set SocialMedia");
    }
    public void setLink(String link){
        editor.putString(KEY_LINK,link);
        // commit changes
        editor.commit();
        Log.d("TAG","Session Set Link");
    }
    public String getKeyName(){
        return pref.getString(KEY_NAME,null);
    }
    public String getKeyBirthdate(){
        return pref.getString(KEY_BIRTHDATE,null);
    }
    public String getKeyAddressktp(){
        return pref.getString(KEY_ADDRESSKTP,null);
    }
    public String getKeyEmail(){
        return pref.getString(KEY_EMAIL,null);
    }
    public String getKeyEducation(){
        return pref.getString(KEY_EDUCATION,null);
    }
    public String getKeyCurrentschool(){
        return pref.getString(KEY_CURRENTSCHOOL,null);
    }
    public String getKeyCurrentfaculty(){
        return pref.getString(KEY_CURRENTFACULTY,null);
    }
    public String getKeyAward(){
        return pref.getString(KEY_AWARD,null);
    }
    public String getKeyActivity(){
        return pref.getString(KEY_ACTIVITY,null);
    }
    public String getKeyCommunity(){
        return pref.getString(KEY_COMMUNITY,null);
    }
    public String getKeyDestinationuniversity(){
        return pref.getString(KEY_DESTINATIONUNIVERSITY,null);
    }
    public String getKeyDestinationfaculty(){
        return pref.getString(KEY_DESTINATIONFACULTY,null);
    }
    public String getKeyMajor(){
        return pref.getString(KEY_MAJOR,null);
    }
    public String getKeyEducationallevel(){
        return pref.getString(KEY_EDUCATIONALLEVEL,null);
    }
    public String getKeyReason(){
        return pref.getString(KEY_REASON,null);
    }
    public String getKeyDescription(){
        return pref.getString(KEY_DESCRIPTION,null);
    }
    public String getKeyPlan(){
        return pref.getString(KEY_PLAN,null);
    }
    public String getKeySocialmedia(){
        return pref.getString(KEY_SOCIALMEDIA,null);
    }
    public String getKeyLink(){
        return pref.getString(KEY_LINK,null);
    }
}
