package nl.inholland;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
public class HeroController {
    @Autowired
    private HeroService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hero> getAllHeroes() {
        return service.getHeroes();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Hero getHeroById(@PathVariable String id) {
        return service.getHero(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addHero(@RequestBody Hero Hero) {
        service.addHero(Hero);
    }

}
