package ag.ihopethisworkssequel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class DbSeeder implements CommandLineRunner {

    private LocationRepository locationRepository;

    public DbSeeder(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Place place = new Place(
                    "Iarna la Ion",
                    Arrays.asList(
                            new SportDetails("ski", "ian-mar", 118.52),
                            new SportDetails("atv", "tot Anul", 200.59),
                            new SportDetails("tiroliana", "apr-oct", 65.22)
                    )

        );

        Place place1 = new Place(
                "Iarna la Maria",
                Arrays.asList(
                        new SportDetails("ski", "ian-mar", 112.52),
                        new SportDetails("atv", "tot Anul", 220.59),
                        new SportDetails("traseu montan", "apr-oct", 45.22)
                )

        );

        Place place2 = new Place(
                "La Sandel",
                Arrays.asList(
                        new SportDetails("ski", "ian-mar", 125.52),
                        new SportDetails("atv", "tot Anul", 150.59),
                        new SportDetails("traseu montan", "apr-oct", 90.22)
                )
        );

        //drop existing collection;
        this.locationRepository.deleteAll();

        //add our places to the database
        List<Place> list = Arrays.asList(place,place1, place2);

        List<Places> places = Arrays.asList(new Places(list));
        Map<String,List<Places>> map = new LinkedHashMap<>();
        map.put("Romania", places);
        map.put("Valea Prahovei", places);
        map.put("Predeal", places);

        Location location = new Location(map);
        this.locationRepository.save(location);


    }
}
