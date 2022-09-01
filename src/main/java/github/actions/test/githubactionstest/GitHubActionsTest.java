package github.actions.test.githubactionstest;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Llama;
import org.bukkit.plugin.java.JavaPlugin;

public final class GitHubActionsTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
//        World world = Bukkit.getWorlds().get(0);
        world.spawn(world.getSpawnLocation(), Llama.class);
        getLogger().info("Spawned llama at spawn.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
