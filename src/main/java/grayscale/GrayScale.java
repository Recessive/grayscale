package grayscale;


import arc.Events;
import arc.graphics.Color;
import mindustry.game.EventType;
import mindustry.plugin.Plugin;
import mindustry.entities.type.Player;

public class GrayScale extends Plugin {

    @Override
    public void init(){
        Events.on(EventType.PlayerConnect.class, event -> {
            filterColor(event.player);
        });
    }
    public void filterColor(Player player){
        player.name = player.name.replaceAll("\\[(.*?)]","");
        player.color = Color.white;
    }
}
