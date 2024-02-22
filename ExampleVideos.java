class User {
    String username;
    String fullname;
    int subCount;
    int videoCount;

    User(String username, String fullname, int subCount, int videoCount) {
        this.username = username;
        this.fullname = fullname;
        this.subCount = subCount;
        this.videoCount = videoCount;
    }

    String toText() {
        return fullname + " @" + username;
    }
}

class Video {
    String title;
    User user;
    int likes;
    String videoId;

    Video(String title, User user, int likes, String videoId) {
        this.title = title;
        this.user = user;
        this.likes = likes;
        this.videoId = videoId;
    }

    boolean longerThan(Video other) { 
        return this.title.length() > other.title.length();
    }

    boolean moreLikes(Video other) {
        return this.likes > other.likes;
    }

    String toText() {
        String userInfo = user.toText();
        return userInfo + " : " + this.title + " : " + likes + " Likes";
    }

    String toLink() {
        return "https://www.youtube.com/watch?v=" + this.videoId;
    }
}

class ExampleVideos {

    /*
      “Were there any parts of the Video that you couldn’t represent with the class design we chose?”
            The class design never had anything related to the viewcount, so that is a part of the video we couldnt represent
      
      Links: https://www.youtube.com/watch?v=U3aXWizDbQ4&ab_channel=Fireship - C Programming
             https://www.youtube.com/watch?v=SmyPTnlqhlk&ab_channel=Fireship - 10 Weird Algorithms
     */
    User user1 = new User("JacobsSchoolNews", "JacobsSchoolNews", 3000, 444);

    /*
      Were there any parts of the Video that you couldn’t represent with the class design we chose?”
       Here we could not represent the duration of the video with the current class design
      Link: https://www.youtube.com/watch?v=SlX53ETNx_o&ab_channel=JacobsSchoolNews - Discovery
     */

    User user2 = new User("Fireship", "Fireship", 2000000, 601);
    
    /*
      Were there any parts of the Video that you couldn’t represent with the class design we chose?”
       The class design did not allow us to represent the amount of comments the video has
      Link: https://www.youtube.com/watch?v=NaBF7qsPxWg&ab_channel=Skyward - Kami No Katoba
     */

    User user3 = new User("skyward9195", "Skyward", 800, 199);

    Video video1 = new Video("C in 100 Seconds", user2, 94000, "U3aXWizDbQ4");
    Video video2 = new Video("10 Weird Algorithms", user2, 38000, "SmyPTnlqhlk");
    Video video3 = new Video("Researchers discover a new superhighway system in the Solar System", user1, 207, "SlX53ETNx_o");
    Video video4 = new Video("Luschka - Kami no Kotoba", user3, 29000, "NaBF7qsPxWg");

    String UserToText1 = user1.toText();
    String UserToText2 = user2.toText();

    boolean LongerVid1 = video2.longerThan(video1);
    boolean LongerVid2 = video1.longerThan(video3);

    boolean Morelikes1 = video3.moreLikes(video2);
    boolean Morelikes2 = video1.moreLikes(video4);

    String VideoToText1 = video2.toText();
    String VideoToText2 = video4.toText();

    String Link1 = video3.toLink();
    String Link2 = video2.toLink();

}