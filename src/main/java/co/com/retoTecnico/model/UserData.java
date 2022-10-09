package co.com.retoTecnico.model;

public class UserData {
    private String fistName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String currentCity;
    private String zipCode;
    private String currentCountry;
    private String yourComputer;
    private String versionPC;
    private String languagePc;
    private String mobileDevice;
    private String modelMD;
    private String operatingSystemMD;
    private String passwordUser;
    private String languageUser;
    private String questionUser;

    public UserData(String fistName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String currentCity, String zipCode, String currentCountry, String yourComputer, String versionPC, String languagePc, String mobileDevice, String modelMD, String operatingSystemMD, String passwordUser, String languageUser, String questionUser) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.currentCity = currentCity;
        this.zipCode = zipCode;
        this.currentCountry = currentCountry;
        this.yourComputer = yourComputer;
        this.versionPC = versionPC;
        this.languagePc = languagePc;
        this.mobileDevice = mobileDevice;
        this.modelMD = modelMD;
        this.operatingSystemMD = operatingSystemMD;
        this.passwordUser = passwordUser;
        this.languageUser = languageUser;
        this.questionUser = questionUser;
    }

    public String getStrFistName() {
        return fistName;
    }

    public void setStrFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getStrLastName() {
        return lastName;
    }

    public void setStrLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStrEmail() {
        return email;
    }

    public void setStrEmail(String email) {
        this.email = email;
    }

    public String getStrMonth() {
        return birthMonth;
    }

    public void setStrMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getStrDay() {
        return birthDay;
    }

    public void setStrDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getStrYear() {
        return birthYear;
    }

    public void setStrYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getStrCity() {
        return currentCity;
    }

    public void setStrCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getStrZipCode() {
        return zipCode;
    }

    public void setStrZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStrCountry() {
        return currentCountry;
    }

    public void setStrCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getStrComputer() {
        return yourComputer;
    }

    public void setStrComputer(String yourComputer) {
        this.yourComputer = yourComputer;
    }

    public String getStrVersion() {
        return versionPC;
    }

    public void setStrVersion(String versionPC) {
        this.versionPC = versionPC;
    }

    public String getStrLanguagePc() {
        return languagePc;
    }

    public void setStrLanguagePc(String languagePc) {
        this.languagePc = languagePc;
    }

    public String getStrMobileDevice() {
        return mobileDevice;
    }

    public void setStrMobileDevice(String mobileDevice) {
        this.mobileDevice = mobileDevice;
    }

    public String getStrModel() {
        return modelMD;
    }

    public void setStrModel(String modelMD) {
        this.modelMD = modelMD;
    }

    public String getStrOS() {
        return operatingSystemMD;
    }

    public void setStrOS(String operatingSystemMD) {
        this.operatingSystemMD = operatingSystemMD;
    }

    public String getStrPassword() {
        return passwordUser;
    }

    public void setStrPassword(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getStrLanguageUser() {
        return languageUser;
    }

    public void setStrLanguageUser(String languageUser) {
        this.languageUser = languageUser;
    }

    public String getStrQuestion() {
        return questionUser;
    }

    public void setStrQuestion(String questionUser) {
        this.questionUser = questionUser;
    }
}
