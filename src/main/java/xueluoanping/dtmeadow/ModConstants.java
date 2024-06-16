package xueluoanping.dtmeadow;

import com.ferreusveritas.dynamictrees.DynamicTrees;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import xueluoanping.dtmeadow.util.LazyGet;
import xueluoanping.dtmeadow.util.RegisterFinderUtil;


public class ModConstants {


    public static final LazyGet<Block> POMEGRANATE_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("pomegranate_leaves")));
    public static final LazyGet<Block> POMEGRANATE = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("pomegranate")));
    public static final LazyGet<Block> POMEGRANATE_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("pomegranate_sapling")));
    // public static final LazyGet<Block> POMEGRANATE_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTFruitfulFun.rl("pomegranate_branch")));
    public static final LazyGet<Item> POMEGRANATE_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("pomegranate_seed")));

    public static final LazyGet<Block> CHERRY_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("cherry_leaves")));
    public static final LazyGet<Block> CHERRY = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("cherry")));
    public static final LazyGet<Block> CHERRY_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("cherry_sapling")));
    // public static final LazyGet<Block> CHERRY_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTFruitfulFun.rl("cherry_branch")));
    public static final LazyGet<Item> CHERRY_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("cherry_seed")));

    public static final LazyGet<Block> TANGERINE_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("tangerine_leaves")));
    public static final LazyGet<Block> TANGERINE = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("tangerine")));
    public static final LazyGet<Block> TANGERINE_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("tangerine_sapling")));
    public static final LazyGet<Block> TANGERINE_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("tangerine_branch")));
    public static final LazyGet<Item> TANGERINE_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("tangerine_seed")));

    public static final LazyGet<Block> LIME_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lime_leaves")));
    public static final LazyGet<Block> LIME = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lime")));
    public static final LazyGet<Block> LIME_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lime_sapling")));
    public static final LazyGet<Block> LIME_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lime_branch")));
    public static final LazyGet<Item> LIME_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("lime_seed")));

    public static final LazyGet<Block> CITRON_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("citron_leaves")));
    public static final LazyGet<Block> CITRON = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("citron")));
    public static final LazyGet<Block> CITRON_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("citron_sapling")));
    public static final LazyGet<Block> CITRON_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("citron_branch")));
    public static final LazyGet<Item> CITRON_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("citron_seed")));

    public static final LazyGet<Block> POMELO_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("pomelo_leaves")));
    public static final LazyGet<Block> POMELO = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("pomelo")));
    public static final LazyGet<Block> POMELO_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("pomelo_sapling")));
    public static final LazyGet<Block> POMELO_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("pomelo_branch")));
    public static final LazyGet<Item> POMELO_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("pomelo_seed")));

    public static final LazyGet<Block> ORANGE_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("orange_leaves")));
    public static final LazyGet<Block> ORANGE = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("orange")));
    public static final LazyGet<Block> ORANGE_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("orange_sapling")));
    public static final LazyGet<Block> ORANGE_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("orange_branch")));
    public static final LazyGet<Item> ORANGE_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("orange_seed")));

    public static final LazyGet<Block> LEMON_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lemon_leaves")));
    public static final LazyGet<Block> LEMON = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lemon")));
    public static final LazyGet<Block> LEMON_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lemon_sapling")));
    public static final LazyGet<Block> LEMON_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("lemon_branch")));
    public static final LazyGet<Item> LEMON_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("lemon_seed")));

    public static final LazyGet<Block> GRAPEFRUIT_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("grapefruit_leaves")));
    public static final LazyGet<Block> GRAPEFRUIT = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("grapefruit")));
    public static final LazyGet<Block> GRAPEFRUIT_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("grapefruit_sapling")));
    public static final LazyGet<Block> GRAPEFRUIT_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("grapefruit_branch")));
    public static final LazyGet<Item> GRAPEFRUIT_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("grapefruit_seed")));

    public static final LazyGet<Block> REDLOVE_LEAVES = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("redlove_leaves")));
    public static final LazyGet<Block> REDLOVE = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("redlove")));
    public static final LazyGet<Block> REDLOVE_SAPLING = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("redlove_sapling")));
    public static final LazyGet<Block> REDLOVE_BRANCH = LazyGet.of(() -> RegisterFinderUtil.getBlock(DTMeadow.rl("redlove_branch")));
    public static final LazyGet<Item> REDLOVE_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DTMeadow.rl("redlove_seed")));


    public static final LazyGet<Block> APPLE = LazyGet.of(() -> RegisterFinderUtil.getBlock(DynamicTrees.location("apple")));
    public static final LazyGet<Item> APPLE_OAK_SEED = LazyGet.of(() -> RegisterFinderUtil.getItem(DynamicTrees.location("apple_oak_seed")));
    public static final LazyGet<Item> CHERRY_SEED_V = LazyGet.of(() -> RegisterFinderUtil.getItem(DynamicTrees.location("cherry_seed")));
    public static final LazyGet<Block> CHERRY_LEAVES_V = LazyGet.of(() -> RegisterFinderUtil.getBlock(DynamicTrees.location("cherry_leaves")));



}
