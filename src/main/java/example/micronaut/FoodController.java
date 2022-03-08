package example.micronaut;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Controller("/food")
public class FoodController {

    @Introspected
    public class Food {
        @NonNull
        @NotBlank
        private String name = "";

        @NonNull
        @NotBlank
        private BigDecimal price = new BigDecimal("0");

        public Food() {
            setName("Super Food");
            setPrice(BigDecimal.valueOf(50000));
        }

        @NonNull
        public String getName() {
            return name;
        }

        public void setName(@NonNull String name) {
            this.name = name;
        }

        @NonNull
        public @NotBlank BigDecimal getPrice() {
            return price;
        }

        public void setPrice(@NonNull BigDecimal price) {
            this.price = price;
        }

    }

    @Post
    public Food saveFood() {
        Food food = new Food();
        food.setName("Post Food");
        return food;
    }

    @Post("/more")
    public Food moreSaveFood() {
        Food food = new Food();
        food.setName("More Post Food");
        return food;
    }

    @Get
    public Food getFood() {
        return new Food();
    }

    @Get("/more")
    public Food moreGetFood() {
        return new Food();
    }

}
