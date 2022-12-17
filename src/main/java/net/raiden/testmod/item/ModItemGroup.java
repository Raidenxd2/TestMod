package net.raiden.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raiden.testmod.TestMod;

public class ModItemGroup {

    public static final ItemGroup TEST_MOD = FabricItemGroup.builder(new Identifier(TestMod.MOD_ID))
            .displayName(Text.literal("Test Mod Items/Blocks"))
            .icon(() -> new ItemStack(ModItems.TEST_ITEM))
            .build();

}
