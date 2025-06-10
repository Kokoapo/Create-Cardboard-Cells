package net.kokoapo.createcardboardcells.item.custom;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class CardboardCell extends Item {
    private int capacity;
    private Dictionary<String, Integer> storage;

    public CardboardCell(Properties pProperties, int capacity) {
        super(pProperties);
        this.capacity = capacity;
        storage = new Hashtable<>();
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();

            player.sendSystemMessage(Component.literal("Cardboard Cell Used Storage: " + GetCurrentStorage() + "/" + capacity));
        }
        return super.useOn(pContext);
    }

    public int GetCurrentStorage() {
        int size = 0;

        Enumeration<String> keys = storage.keys();
        while(keys.hasMoreElements()) {
            String k = keys.nextElement();
            size += storage.get(k);
        }

        return size;
    }
}
