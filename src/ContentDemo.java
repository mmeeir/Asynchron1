import java.util.ArrayList;
import java.time.Year;

public class ContentDemo {
    public static void main(String[] args) {

        ArrayList<Contentitem> items = new ArrayList<>();

        items.add(new VideoLecture("Video 1", 2024, 90, "HD"));
        items.add(new VideoLecture("Video 2", 2022, 120, "4K"));
        items.add(new PodcastEpisode("Podcat 1", 2023, 45, "Host 1"));
        items.add(new PodcastEpisode("Podcast 2", 2021, 60, "Host 2"));

        int currentYear = Year.now().getValue();

        for (Contentitem item : items) {
            System.out.println(item + " | licenseCost=" +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " +
                        d.getMaxDownloadsPerDay());
            }

            System.out.println("--------------------------------");
        }
    }
}

