package name.claymen.item;

import name.claymen.Claymen;

import name.claymen.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CLAYMEN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Claymen.MOD_ID, "claymen"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.claymen"))
                    .icon(() -> new ItemStack(ModItems.CLAYDOLL)).entries((displayContext, entries) -> {

                        //Adds items to mod group
                        entries.add(ModItems.CLAYDOLL);
                        entries.add(ModItems.CLOD);

                        //Adds blocks to mod gorup
                        entries.add(ModBlocks.CLAY_POT);
                    }).build());

    public static void registerItemGroups(){
        Claymen.LOGGER.info("Registering Item Groups for Claymen");
    }
}
