import java.util.ArrayList;
import java.util.Arrays;

/**
 * this class is used to create a profile object
 * with all the information we need
 */
public class Profile {

    private String lastName;
    private String firstName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String town;
    private String country;
    private String nationality;
    private String email;
    private String[] interests;
    private ArrayList<Profile> friends;

    /**
     * this constructor creates a Profile object
     * @param lastName is a reference to the last name of the person
     * @param firstName is a reference to the first name of the person
     * @param dayOfBirth is a refence to the day of birth
     * @param monthOfBirth is a reference to the month
     * @param yearOfBirth is a referece to the year
     * @param town is a reference to the town
     * @param country is a reference to the country
     * @param nationality is a reference to the nationality
     * @param email is a reference to the email
     * @param interests is a reference to the interests
     */
    public Profile(String lastName, String firstName, int dayOfBirth, int monthOfBirth,
                   int yearOfBirth, String town, String country, String nationality,
                   String email, String[] interests){

        setLastName(lastName);
        setFirstName(firstName);
        setDayOfBirth(dayOfBirth);
        setMonthOfBirth(monthOfBirth);
        setYearOfBirth(yearOfBirth);
        setTown(town);
        setCountry(country);
        setNationality(nationality);
        setEmail(email);
        setInterests(interests);
        this.friends = new ArrayList<>();

    }

    /**
     * this method sets the person's last name
     * @param lastName is a reference to the last name of the person
     */
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * this method sets the person's first name
     * @param firstName is a reference to the first name of the person
     */
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * this method sets the person's day of birth
     * @param dayOfBirth is a refence to the day of birth
     */
    private void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    /**
     * this method sets the person's month of birth
     * @param monthOfBirth is a reference to the month
     */
    private void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    /**
     * this method sets the person's year of birth
     * @param yearOfBirth is a referece to the year
     */
    private void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * this method sets the person's town
     * @param town is a reference to the town
     */
    private void setTown(String town) {
        this.town = town;
    }

    /**
     * this method sets the person's country
     * @param country is a reference to the country
     */
    private void setCountry(String country) {
        this.country = country;
    }

    /**
     * this method sets the person's nationality
     * @param nationality is a reference to the nationality
     */
    private void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * this method sets the person's email
     * @param email is a reference to the email
     */
    private void setEmail(String email) {
        this.email = email;
    }

    /**
     * this method sets the person's interests
     * @param interests is a reference to the interests
     */
    private void setInterests(String interests[]) {
        this.interests = interests;
    }

    /**
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the date of birth
     */
    public String getBirth(){
        return dayOfBirth + "." + monthOfBirth + "." + yearOfBirth;
    }

    /**
     * @return the town
     */
    public String getTown() {
        return town;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**\
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the interests
     */
    private String getInterests() {
        return Arrays.toString(this.interests);
    }

    /**
     * this method adds a friend into the friend list
     * @param p is a reference to the profile
     *          we want to add into the friend list
     */
    public void addFriend(Profile p){
        this.friends.add(p);
    }

    /**
     * @param i is a reference to the number
     *          of the friend we want to return
     * @return another Profile object
     */
    private Profile getFriend(int i){
        return this.friends.get(i);
    }

    /**
     * @return the number of friends the current
     * profile have
     */
    private int numOfFriends(){
        return this.friends.size();
    }

    /**
     * this method prints the profiles, the current
     * one is friend with
     */
    public void getFriends(){
        for(int i = 0; i < this.numOfFriends(); i++){
            System.out.println(this.getFriend(i));
        }
    }

    /**
     * @return the full name of the current profile
     */
    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    /**
     * @return the profile's information as a string
     */
    @Override
    public String toString(){

        String nameMsg = "Name: " + this.getFirstName() + " " + this.getLastName() + "\n";
        String birthMsg ="Birth: " + this.getBirth() + "\n";
        String townMsg = "Town: " + this.getTown() + "\n";
        String countryMsg = "Country: " + this.getCountry() + "\n";
        String natMsg = "Nationality: " + this.getNationality() + "\n";
        String emailMsg = "Email: " + this.getEmail() + "\n";
        String interMsg = "Interests: " + this.getInterests() + "\n";
        String friendsMsg = "Friends: " + Arrays.toString(this.friends.toArray());
        return nameMsg + birthMsg + townMsg + countryMsg + natMsg + emailMsg + interMsg + friendsMsg + "\n";

    }
}
