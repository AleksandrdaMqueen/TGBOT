package bot;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Data
@PropertySource("application.properties")
public class BotConfig {

    @Value("${bot.name}")
    public String name;

    @Value("${bot.token}")
    String token;

    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }
}
