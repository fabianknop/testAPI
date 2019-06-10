package nl.inholland;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HeroService {

    private List<Hero> heroes = new ArrayList<Hero>(
            Arrays.asList(
                    new Hero("1", "Tracer", "DPS"),
                    new Hero("2", "Widowmaker", "DPS"),
                    new Hero("3", "Hanzo", "DPS")
            )
    );

    public List<Hero> getHeroes() {
        return heroes;
    }

    public Hero getHero(String id) {
        for (Hero hero : heroes) {
            if (hero.getId().equals(id)) {
                return hero;
            }
        }
        return null;
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }
}
