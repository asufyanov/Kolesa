package Nine;



import java.util.Date;

public class AnalyticsModel {

    
    private String mSection;
    
    private String mSubsection;
    
    private String mCategory;
    
    private String mRegionAlias;
    
    private String mAddress;
    private float mLatitude;
    private float mLongitude;
    
    private String mTitle;
    
    private String mSubTitle;
    
    private String mText;
    
    private String mPhone;
    
    private String mEmail;
    
    private Date mCreateDate;

    public AnalyticsModel(
            String section,
            String subsection,
            String category,
            String regionAlias,
            String address,
            float latitude,
            float longitude,
            String title,
            String subTitle,
            String text,
            String phone,
            String email,
            Date createDate
    ) {
        mSection = section;
        mSubsection = subsection;
        mCategory = category;
        mRegionAlias = regionAlias;
        mAddress = address;
        mLatitude = latitude;
        mLongitude = longitude;
        mTitle = title;
        mSubTitle = subTitle;
        mText = text;
        mPhone = phone;
        mEmail = email;
        mCreateDate = createDate;
    }

    public AnalyticsModel(
            String section,
            String subsection,
            String category
    ) {
        mSection = section;
        mSubsection = subsection;
        mCategory = category;
    }

    public AnalyticsModel(String section) {
        this(section, null, null);
    }

    public AnalyticsModel(
            String address,
            float latitude,
            float longitude
    ) {
        mAddress = address;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    
    public String getSection() {
        return mSection;
    }

    public void setSection(String section) {
        mSection = section;
    }

   
    public String getSubsection() {
        return mSubsection;
    }

    public void setSubsection(String subsection) {
        mSubsection = subsection;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

   public String getRegionAlias() {
        return mRegionAlias;
    }

    public void setRegionAlias(String regionAlias) {
        mRegionAlias = regionAlias;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public void setLatitude(float latitude) {
        mLatitude = latitude;
    }

    public float getLongitude() {
        return mLongitude;
    }

    public void setLongitude(float longitude) {
        mLongitude = longitude;
    }

    
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    
    public String getSubTitle() {
        return mSubTitle;
    }

    public void setSubTitle(String subTitle) {
        mSubTitle = subTitle;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    
    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    
    public Date getCreateDate() {
        return mCreateDate;
    }

    public void setCreateDate(Date createDate) {
        mCreateDate = createDate;
    }
}