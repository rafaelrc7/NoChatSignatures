package com.rafaelrc.nochatsignature;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

final class ChatListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        event.setCancelled(true);
        String msg = String.format(event.getFormat(), event.getPlayer().getDisplayName(), event.getMessage());
        Bukkit.getServer().getConsoleSender().sendMessage(msg);
        event.getRecipients().forEach(p -> p.sendMessage(msg));
    }
}
