package grayscale;


import arc.Events;
import arc.graphics.Color;
import arc.util.Log;
import mindustry.game.EventType;
import mindustry.plugin.Plugin;
import mindustry.entities.type.Player;

import java.util.HashMap;
import java.util.Map;

public class GrayScale extends Plugin {
    @Override
    public void init(){
        Events.on(EventType.PlayerConnect.class, event -> {
            filterColor(event.player);
        });

    }
    public void filterColor(Player player){
        player.name = Strings.stripColors(player.name);
        player.color = Color.white;
    }
}
