package net.tuscan.modularmultiblocks.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tuscan.modularmultiblocks.ModularMultiblocks;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModularMultiblocks.MOD_ID);

    public static final DeferredItem<Item> TEST = ITEMS.register("test", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
