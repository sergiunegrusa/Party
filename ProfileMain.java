public class ProfileMain {
    public static void main(String[] args){
        Profile profile1 = new Profile("Cenan", "Mircea", 20, 2,
                1977, "Cluj-Napoca","Romania", "romanian",
                "safjsaho@yahoo.com", new String[]{"sports", "music", "ultras"});

        Profile profile2 = new Profile("Cyril", "Thereaux", 17, 9,
                1985, "Lyon", "France", "France", "cyril@gmail.com",
                new String[]{"football", "cars", "music"});

        Profile profile3 = new Profile("Veselovsky", "Robert", 3, 5,
                1980, "Sarajevo", "Bosnia", "Bosniac",
                "oknikjn@yahls.fkjs", new String[]{"football", "ultras", "fireworks"});

        System.out.println(profile1.toString() + "\n");
        System.out.println(profile2.toString() + "\n");
        System.out.println(profile3.toString() + "\n");

        System.out.println(profile1.getCountry() + "\n");
        System.out.println(profile2.getBirth() + "\n");
        System.out.println(profile3.getEmail() + "\n");
    }
}
