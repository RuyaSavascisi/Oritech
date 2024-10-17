package rearth.oritech.item.tools.armor;

import net.fabricmc.fabric.api.entity.event.v1.FabricElytraItem;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class JetpackExoElytraItem extends BackstorageExoArmorItem implements BaseJetpackItem, FabricElytraItem {
    public JetpackExoElytraItem(RegistryEntry<ArmorMaterial> material, Type type, Item.Settings settings) {
        super(material, type, settings);
    }
    
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        
        if (world.isClient && MinecraftClient.getInstance().player.isFallFlying()) {
            tickJetpack(stack, entity);
        } else {
            super.inventoryTick(stack, world, entity, slot, selected);
        }
    }
    
    @Override
    public boolean useCustomElytra(LivingEntity entity, ItemStack chestStack, boolean tickElytra) {
        if (tickElytra)
            doVanillaElytraTick(entity, chestStack);
        
        return true;
    }
    
    @Override
    public int getItemBarColor(ItemStack stack) {
        return getJetpackBarColor(stack);
    }
    
    @Override
    public int getItemBarStep(ItemStack stack) {
        return getJetpackBarStep(stack);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        addJetpackTooltip(stack, tooltip, false);
    }
    
    @Override
    public float getSpeed() {
        return 1.6f;
    }
    
    @Override
    public boolean requireUpward() {
        return true;
    }
    
    @Override
    public int getRfUsage() {
        return 256;
    }
    
    @Override
    public int getFuelUsage() {
        return (int) (10 * (FluidConstants.BUCKET / 1000));
    }
    
    @Override
    public long getFuelCapacity() {
        return 4 * FluidConstants.BUCKET;
    }
}