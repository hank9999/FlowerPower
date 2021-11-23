package io.ncbpfluffybear.flowerpower;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import io.ncbpfluffybear.flowerpower.items.InfinityApple;
import io.ncbpfluffybear.flowerpower.items.InfinityBandage;
import io.ncbpfluffybear.flowerpower.items.RecallCharm;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import utils.Constants;
import utils.ItemTags;

/**
 * SlimefunItemStack registration
 * @author NCBPFluffyBear
 */
public class FlowerPowerItems {

    public static final ItemGroup FLOWERPOWER_CATEGORY = new ItemGroup(new NamespacedKey(FlowerPowerPlugin.getInstance(),
            "flowerpower_category"), new CustomItemStack(Material.ALLIUM, "&5源之花")
    );
    // Multiblocks
    public static final SlimefunItemStack MAGIC_BASIN = new SlimefunItemStack("MAGIC_BASIN",
            Material.CAULDRON,
            "&b魔法坩埚",
            "",
            "&7&o制作魔法物品的基础物品",
            "",
            "&e右键&7使用魔杖激活它",
            ItemTags.MULTIBLOCK
    );
    // Blocks
    public static final SlimefunItemStack EXPERIENCE_CAULDRON = new SlimefunItemStack("EXPERIENCE_CAULDRON",
            Material.CAULDRON,
            "&a经验之釜",
            "",
            "&7&o用于储存经验",
            "&7&o也用于制作魔法物品",
            "",
            "&e右键&7储存经验",
            "&e蹲下+右键&7取出经验",
            ItemTags.MULTIBLOCK
    );
    // Glistening Flowers
    public static final SlimefunItemStack GLISTENING_POPPY = new SlimefunItemStack("GLISTENING_POPPY",
            Material.POPPY,
            "&a闪耀的玫瑰",
            "",
            "&7&o魔法之花的一种",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_DANDELION = new SlimefunItemStack("GLISTENING_DANDELION",
            Material.DANDELION,
            "&a闪耀的蒲公英",
            "",
            "&7&o魔法之花的一种",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_OXEYE_DAISY = new SlimefunItemStack("GLISTENING_OXEYE_DAISY",
            Material.OXEYE_DAISY,
            "&a闪耀的滨菊",
            "",
            "&7&o魔法之花的一种",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_ALLIUM = new SlimefunItemStack("GLISTENING_ALLIUM",
            Material.ALLIUM,
            "&a闪耀的绒球葱",
            "",
            "&7&o魔法之花的一种",
            "",
            ItemTags.CRAFTING_ITEM
    );
    // Items
    public static final SlimefunItemStack MAGICAL_WAND = new SlimefunItemStack("MAGICAL_WAND",
            Material.BLAZE_ROD,
            "&5魔杖",
            "",
            "&e右键&7激活魔法坩埚",
            "",
            ItemTags.TOOL
    );
    public static final SlimefunItemStack MAGIC_CREAM = new SlimefunItemStack("MAGIC_CREAM",
            Material.MAGMA_CREAM,
            "&6&l魔法奶油",
            "",
            "&7&o黏糊糊的,有点好吃的样子?",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack OVERGROWTH_SEED = new SlimefunItemStack("OVERGROWTH_SEED",
            Material.WHEAT_SEEDS,
            "&3魔法花种",
            "",
            "",
            "&e右键&7你喜欢的花朵",
            "&7可以给予你更多的花朵",
            "",
            ItemTags.MAGICAL_ITEM
    );
    // Flower Crystals
    public static final SlimefunItemStack RED_CRYSTAL = new SlimefunItemStack("RED_CRYSTAL",
            Material.RED_GLAZED_TERRACOTTA,
            "&c红水晶",
            "",
            "&7&o它看起来闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack YELLOW_CRYSTAL = new SlimefunItemStack("YELLOW_CRYSTAL",
            Material.YELLOW_GLAZED_TERRACOTTA,
            "&e黄水晶",
            "",
            "&7&o它看起来闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack WHITE_CRYSTAL = new SlimefunItemStack("WHITE_CRYSTAL",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&f白水晶",
            "",
            "&7&o它看起来闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack PURPLE_CRYSTAL = new SlimefunItemStack("PURPLE_CRYSTAL",
            Material.PURPLE_GLAZED_TERRACOTTA,
            "&5紫水晶",
            "",
            "&7&o它看起来闪闪发光的...",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack MOVEMENT_SPEED_CHARM = new SlimefunItemStack("MOVEMENT_SPEED_CHARM",
            Material.SUGAR,
            "&a移动符尘",
            "",
            "&e右键&c以获得随机的速度属性",
            "&7&o将其拿在副手可以让你健步如飞",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack ATTACK_SPEED_CHARM = new SlimefunItemStack("ATTACK_SPEED_CHARM",
            Material.SUGAR,
            "&a攻速浮尘",
            "",
            "&e右键&c以获得随机的攻速属性",
            "&7&o将其拿在副手可以让您的攻速变得更快",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack FLY_SPEED_CHARM = new SlimefunItemStack("FLY_SPEED_CHARM",
            Material.SUGAR,
            "&a飞翔符尘",
            "",
            "&e右键&c以获得随机的飞行速度属性",
            "&7&o将其拿在副手可以让您的飞行速度变得更快",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack DAMAGE_CHARM = new SlimefunItemStack("DAMAGE_CHARM",
            Material.SUGAR,
            "&a攻击符尘",
            "",
            "&e右键&c以获得随机的攻击伤害属性",
            "&7&o将其拿在副手可以增强您的攻击力",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack HEALTH_CHARM = new SlimefunItemStack("HEALTH_CHARM",
            Material.SUGAR,
            "&a生命符尘",
            "",
            "&e右键&c以获得随机的生命上限属性",
            "&7&o将其拿在副手可以增加您的生命上限",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack EXPERIENCE_TOME = new SlimefunItemStack("EXPERIENCE_TOME",
            Material.ENCHANTED_BOOK,
            "&e经验之书 &a(0 / 1000000)",
            "",
            "&7&o它能够储存大量经验",
            "",
            "&e右键&7储存经验",
            "&e&e蹲下+右键&7取出经验",
            "&e左键&7进行批量操作",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack INFINITY_APPLE = new SlimefunItemStack("INFINITY_APPLE",
            new CustomItemStack(SlimefunUtils.getCustomHead("99a79d7e5d1ba739ab4471643e744ef781f7c1d4ea52efc99168d6cb5732326")),
            "&e无尽苹果",
            "",
            "&7&o将经验转化为饥饿值",
            "",
            "&e右键&7食用",
            "",
            "&a消耗: " + InfinityApple.EXP_PER_CONSUME + " 经验值每 " + InfinityApple.FOOD_PER_CONSUME + " 饥饿值",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack INFINITY_BANDAGE = new SlimefunItemStack("INFINITY_BANDAGE",
            Material.PAPER,
            "&c无尽绷带",
            "",
            "&7&o将经验转化为生命值",
            "",
            "&e右键&7治疗",
            "",
            "&a消耗: " + InfinityBandage.EXP_PER_CONSUME + " 经验值每 " + InfinityBandage.HEALTH_PER_CONSUME + " 生命值",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack RECALL_CHARM = new SlimefunItemStack("RECALL_CHARM",
            Material.ENDER_EYE,
            "&5传送符文",
            "",
            "&7&o将您传送回标记地点",
            "&7&并消耗经验",
            "",
            "&e蹲下+右键&7绑定当前位置",
            "&e右键&7传送",
            "",
            "&3绑定地点: 无",
            "",
            "&a消耗: " + RecallCharm.TELEPORT_COST + " 经验值每传送一次",
            ItemTags.MAGICAL_ITEM
    );


    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        GLISTENING_POPPY.addEnchantment(glowEnchant, 1);
        GLISTENING_DANDELION.addEnchantment(glowEnchant, 1);
        GLISTENING_OXEYE_DAISY.addEnchantment(glowEnchant, 1);
        GLISTENING_ALLIUM.addEnchantment(glowEnchant, 1);

        OVERGROWTH_SEED.addEnchantment(glowEnchant, 1);
        INFINITY_BANDAGE.addEnchantment(glowEnchant, 1);
        RECALL_CHARM.addEnchantment(glowEnchant, 1);
    }


    private FlowerPowerItems() {
    }

}
