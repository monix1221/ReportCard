public class ReportCard {

    private int mMathGrade;
    private int mPolishGrade;
    private int mBiologyGrade;
    private int mPhysicsGrade;
    private int mArtGrade;
    private int mMusicGrade;
    private String mName;
    private String mSurname;

    /**
     * Default constructor fills the grades with default grade: 2
     * In polish system of education, 2 is the lowest grade (not pass the subject), while 6 is the highest grade (excellent grade)
     */
    ReportCard(){
        this.mName = "Name";
        this.mSurname = "Surname";
        this.mMathGrade = 2;
        this.mPolishGrade = 2;
        this.mBiologyGrade = 2;
        this.mPhysicsGrade = 2;
        this.mArtGrade = 2;
        this.mMusicGrade = 2;
    }

    ReportCard(String name, String surname, int mMathGrade, int mPolishGrade, int mBiologyGrade, int mPhysicsGrade, int mArtGrade, int mMusicGrade){
        this.mName = name;
        this.mSurname = surname;
        this.mMathGrade = mMathGrade;
        this.mPolishGrade = mPolishGrade;
        this.mBiologyGrade = mBiologyGrade;
        this.mPhysicsGrade = mPhysicsGrade;
        this.mArtGrade = mArtGrade;
        this.mMusicGrade = mMusicGrade;
    }

    public int getmMathGrade() {
        return mMathGrade;
    }

    public void setmMathGrade(int mMathGrade) {
        this.mMathGrade = mMathGrade;
    }

    public int getmPolishGrade() {
        return mPolishGrade;
    }

    public void setmPolishGrade(int mPolishGrade) {
        this.mPolishGrade = mPolishGrade;
    }

    public int getmBiologyGrade() {
        return mBiologyGrade;
    }

    public void setmBiologyGrade(int mBiologyGrade) {
        this.mBiologyGrade = mBiologyGrade;
    }

    public int getmPhysicsGrade() {
        return mPhysicsGrade;
    }

    public void setmPhysicsGrade(int mPhysicsGrade) {
        this.mPhysicsGrade = mPhysicsGrade;
    }

    public int getmArtGrade() {
        return mArtGrade;
    }

    public void setmArtGrade(int mArtGrade) {
        this.mArtGrade = mArtGrade;
    }

    public int getmMusicGrade() {
        return mMusicGrade;
    }

    public void setmMusicGrade(int mMusicGrade) {
        this.mMusicGrade = mMusicGrade;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSurname() {
        return mSurname;
    }

    public void setmSurname(String mSurname) {
        this.mSurname = mSurname;
    }

    @Override
    public String toString(){
        return "name: " + this.mName + ", surname: " + this.mSurname + ", grades: \n"+"Maths: " +getmMathGrade() + "\nPolish: " + getmPolishGrade() + "\nBiology: "+ getmBiologyGrade()
                + "\nPhysics: "+getmPhysicsGrade()+"\nArt: "+getmArtGrade()+"\nMusic: "+getmMusicGrade();
    }
}