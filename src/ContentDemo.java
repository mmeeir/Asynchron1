import java.util.ArrayList;
import java.time.Year;

public class ContentDemo {
    public static void main(String[] args) {

        ArrayList<Contentitem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced Java", 2022, 120, "4K"));
        items.add(new PodcastEpisode("Tech Talks", 2023, 45, "John Smith"));
        items.add(new PodcastEpisode("Programming Life", 2021, 60, "Anna Brown"));

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

