package com.rafaelrc.nochatsignature;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoChatSignature extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

}
