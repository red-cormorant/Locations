package ag.ihopethisworkssequel;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/locations")
public class LocationController {
    private LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    @GetMapping("/all")
    public List<Location> getAll(){
        List<Location> location = this.locationRepository.findAll();

        return location;
    }

    @PutMapping("/insert")
    public void insert(@RequestBody Location location) {
        this.locationRepository.insert(location);

    }

    @PutMapping("/save")
    public void update(@RequestBody Location location) {

        this.locationRepository.save(location);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {

        this.locationRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Location> getById(@PathVariable("id") String id) {

        Optional<Location> location = this.locationRepository.findById(id);

        return location;
    }

    @GetMapping("/price/{averagePrice}")
    public List<Location> getByAverageNight(@PathVariable("averagePrice") int maxPrice) {
        List<Location> locations = this.locationRepository.findByAveragePriceLessThan(maxPrice);

        return locations;
    }










}
