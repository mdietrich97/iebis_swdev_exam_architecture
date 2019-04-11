import java.util.ArrayList;

public class Season {
    int seasonnumber;
    ArrayList<Episode> episodes = new ArrayList<>();

    public Season(int seasonnum){

    episodes = addFullSeason(episodes);

    }
     ArrayList addFullSeason( ArrayList<Episode> episodes){
        this.episodes = episodes;
        System.out.println(episodes);
        return episodes;
    }
}
