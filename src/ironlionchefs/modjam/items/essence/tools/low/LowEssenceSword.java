package ironlionchefs.modjam.items.essence.tools.low;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LowEssenceSword extends ItemSword
{

	public LowEssenceSword(int par1)
	{
		super(par1, EnumToolMaterial.STONE);
	}

	public boolean hasEffect(ItemStack s)
	{
		return true;
	}
	
	@Override
	public void onCreated(ItemStack is, World w, EntityPlayer ep)
	{
		is.addEnchantment(Enchantment.smite, 1);
		is.addEnchantment(Enchantment.baneOfArthropods, 1);
		is.addEnchantment(Enchantment.sharpness, 1);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		this.itemIcon = register.registerIcon("ModJam:LowEssenceSword");
		this.setUnlocalizedName("Weak Essence Sword");
	}
}