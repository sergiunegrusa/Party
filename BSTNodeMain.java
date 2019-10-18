public class BSTNodeMain {
    public static void main(String[] args){
        Profile profile1 = new Profile("Negrusa", "Sergiu", 20, 2,
                2000, "Cluj-Napoca","Romania", "romanian",
                "safjsaho@yahoo.com", new String[]{"sports", "music", "science"});

        Profile profile2 = new Profile("Cyril", "Thereaux", 17, 9,
                1985, "Lyon", "France", "France", "cyril@gmail.com",
                new String[]{"football", "cars", "music"});

        Profile profile3 = new Profile("Veselovsky", "Robert", 3, 5,
                1980, "Sarajevo", "Bosnia", "Bosniac",
                "oknikjn@yahls.fkjs", new String[]{"football", "ultras", "fireworks"});

        BSTNode node1 = new BSTNode(profile1);
        BSTNode node2 = new BSTNode(profile2);
        BSTNode node3 = new BSTNode(profile3);

        node1.setL(node2);
        node1.setR(node3);

        System.out.println("Root Profile: " + "\n" + node1.getProfile().toString() + "\n");
        System.out.println("Left: " + "\n" + node1.getL().getProfile().toString() + "\n");
        System.out.println("Right: " + "\n" + node1.getR().getProfile().toString() + "\n");
    }

}
