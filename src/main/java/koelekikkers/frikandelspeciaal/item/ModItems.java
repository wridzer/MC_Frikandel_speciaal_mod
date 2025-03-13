package koelekikkers.frikandelspeciaal.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import koelekikkers.frikandelspeciaal.FrikandelSpeciaal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FRIKANDEL = registerItem("frikandel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FrikandelSpeciaal.MOD_ID,"frikandel")))));

    private static Item registerItem(String name, Item item) {
        FrikandelSpeciaal.LOGGER.info("Registering item: " + name);
        return Registry.register(Registries.ITEM, Identifier.of(FrikandelSpeciaal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FrikandelSpeciaal.LOGGER.info("Registering mod items for " + FrikandelSpeciaal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(FRIKANDEL);
        });
    }
}
