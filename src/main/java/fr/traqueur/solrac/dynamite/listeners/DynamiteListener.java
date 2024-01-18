package fr.traqueur.solrac.dynamite.listeners;

import com.destroystokyo.paper.event.player.PlayerLaunchProjectileEvent;
import fr.traqueur.solrac.dynamite.DynamiteManager;
import io.papermc.paper.event.block.BlockPreDispenseEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class DynamiteListener implements Listener {

    private DynamiteManager dynamiteManager;

    public DynamiteListener(DynamiteManager dynamiteManager) {
         this.dynamiteManager = dynamiteManager;
    }

    @EventHandler
    public void onProjectileLaunch(ProjectileHitEvent event) {
        dynamiteManager.handleEggShoot(event);
    }

}
