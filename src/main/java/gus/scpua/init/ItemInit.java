package gus.scpua.init;

import java.util.ArrayList;
import java.util.List;

import gus.scpua.items.armour.COMSuit;
import gus.scpua.items.*;
import gus.scpua.items.scp.SelfReplecatingCake;
import gus.scpua.items.scp.WeedScp;
import gus.scpua.items.tools.Medical;
import gus.scpua.items.tools.ToolSword;
import gus.scpua.util.enums.XKInventory;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    /* Material */
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_COMS = EnumHelper.addArmorMaterial("armor_material_coms", "scpua:coms", 7,
            new int[]{2, 4, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

    /* Logos */
    public static final Item LOGO_YELLOW = new ItemBase("logoy", null);
    public static final Item LOGO_ORANGE = new ItemBase("logoo", null);
    public static final Item LOGO_GREEN = new ItemBase("logog", null);
    public static final Item LOGO_RED = new ItemBase("logor", null);
    public static final Item LOGO_BLUE = new ItemBase("logob", null);

    /* Combat */
    public static final Item CROWBAR = new ToolSword("ucrowbar", EnumHelper.addToolMaterial("tool_crowbar", 0, 180, 5.0F, 1.0F, 0));
    public static final Item COMBATKNIFE = new ToolSword("ucombatknife", EnumHelper.addToolMaterial("tool_combatknife", 0, 300, 13.0F, 3.0F, 0));
    public static final Item FIREAXE = new ToolSword("ufireaxe", EnumHelper.addToolMaterial("tool_fireaxe", 0, 270, 2.0F, 4.0F, 0));
    public static final Item BROKENPIPE = new ToolSword("ubrokenpipe", EnumHelper.addToolMaterial("tool_brokenpipe", 0, 120, 3.0F, 1.5F, 0));
    public static final Item ABLESWORD = new ToolSword("uablesword", EnumHelper.addToolMaterial("tool_ablesword", 0, 1000, 2.0F, 10.0F, 0));

    /* Medical */
    public static final Item MEDKIT = new Medical("umedkit", 1, Medical.MedicalTool.MEDKIT);
    public static final Item PK_CONTAINER = new Medical("painkiller", 1, Medical.MedicalTool.PK_CONTAINER);
    public static final Item PK_PILL = new Medical("painkillerpill", 5, Medical.MedicalTool.PK_PILL);
    public static final Item ADRENALINE = new Medical("uadrenaline", 1, Medical.MedicalTool.ADREN);
    public static final Item BANDAGE = new Medical("ubandage", 5, Medical.MedicalTool.BANDAGE);

    /* SCP Items */
    public static final Item SELF_REPLECATING_CAKE = new SelfReplecatingCake("uselfreplicatingcake", 2, false);
    public static final Item DRUGS_SCP = new WeedScp("420-j", 1, false);

    // Misc Items \\
    public static final Item WRENCH = new ItemBase("wrench", XKInventory.XKUnity);


    /* COM Suit */
    public static final Item COMS_HELMET = new COMSuit("coms_helmet", ARMOR_MATERIAL_COMS, EntityEquipmentSlot.HEAD);
    public static final Item COMS_CHESTPLATE = new COMSuit("coms_chestplate", ARMOR_MATERIAL_COMS, EntityEquipmentSlot.CHEST);
    public static final Item COMS_LEGGINGS = new COMSuit("coms_leggings", ARMOR_MATERIAL_COMS, EntityEquipmentSlot.LEGS);
    public static final Item COMS_BOOTS = new COMSuit("coms_boots", ARMOR_MATERIAL_COMS, EntityEquipmentSlot.FEET);
}
