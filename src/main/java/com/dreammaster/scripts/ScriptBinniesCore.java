package com.dreammaster.scripts;

import static gregtech.api.enums.Mods.BinnieCore;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.util.GT_ModHandler.getModItem;

import java.util.Collections;
import java.util.List;

import net.minecraftforge.fluids.FluidRegistry;

import forestry.api.recipes.RecipeManagers;

public class ScriptBinniesCore implements IScriptLoader {

    @Override
    public String getScriptName() {
        return "Binnies Core";
    }

    @Override
    public List<String> getDependencies() {
        return Collections.singletonList(BinnieCore.ID);
    }

    @Override
    public void loadRecipes() {
        addShapedRecipe(
                getModItem(BinnieCore.ID, "fieldKit", 1, 63, missing),
                "lensGlass",
                "ringSteel",
                "screwSteel",
                "ringSteel",
                "stickSteel",
                "craftingToolSaw",
                "screwSteel",
                "craftingToolScrewdriver",
                "stickSteel");

        RecipeManagers.carpenterManager.addRecipe(
                5,
                FluidRegistry.getFluidStack("creosote", 1000),
                null,
                getModItem(BinnieCore.ID, "storage", 1, 0, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwWood",
                'b',
                "craftingChest",
                'c',
                "screwWood",
                'd',
                "craftingChest",
                'e',
                "frameGtWood",
                'f',
                "craftingChest",
                'g',
                "screwWood",
                'h',
                "craftingChest",
                'i',
                "screwWood");
        RecipeManagers.carpenterManager.addRecipe(
                10,
                FluidRegistry.getFluidStack("creosote", 2000),
                getModItem(BinnieCore.ID, "storage", 1, 0, missing),
                getModItem(BinnieCore.ID, "storage", 1, 1, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwCopper",
                'b',
                "gearCopper",
                'c',
                "screwCopper",
                'd',
                "gearCopper",
                'e',
                "frameGtCopper",
                'f',
                "gearCopper",
                'g',
                "screwCopper",
                'h',
                "gearCopper",
                'i',
                "screwCopper");
        RecipeManagers.carpenterManager.addRecipe(
                10,
                FluidRegistry.getFluidStack("creosote", 2000),
                getModItem(GregTech.ID, "gt.blockcasings2", 1, 3, missing),
                getModItem(BinnieCore.ID, "storage", 1, 1, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwCopper",
                'b',
                "chestCopper",
                'c',
                "screwCopper",
                'd',
                "chestCopper",
                'e',
                "frameGtCopper",
                'f',
                "chestCopper",
                'g',
                "screwCopper",
                'h',
                "chestCopper",
                'i',
                "screwCopper");
        RecipeManagers.carpenterManager.addRecipe(
                15,
                FluidRegistry.getFluidStack("creosote", 3000),
                getModItem(BinnieCore.ID, "storage", 1, 1, missing),
                getModItem(BinnieCore.ID, "storage", 1, 2, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwBronze",
                'b',
                "gearBronze",
                'c',
                "screwBronze",
                'd',
                "gearBronze",
                'e',
                "frameGtBronze",
                'f',
                "gearBronze",
                'g',
                "screwBronze",
                'h',
                "gearBronze",
                'i',
                "screwBronze");
        RecipeManagers.carpenterManager.addRecipe(
                15,
                FluidRegistry.getFluidStack("creosote", 3000),
                getModItem(BinnieCore.ID, "storage", 1, 1, missing),
                getModItem(BinnieCore.ID, "storage", 1, 3, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwIron",
                'b',
                "gearIron",
                'c',
                "screwIron",
                'd',
                "gearIron",
                'e',
                "frameGtIron",
                'f',
                "gearIron",
                'g',
                "screwIron",
                'h',
                "gearIron",
                'i',
                "screwIron");
        RecipeManagers.carpenterManager.addRecipe(
                15,
                FluidRegistry.getFluidStack("creosote", 3000),
                getModItem(GregTech.ID, "gt.blockcasings2", 1, 3, missing),
                getModItem(BinnieCore.ID, "storage", 1, 3, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwIron",
                'b',
                "chestIron",
                'c',
                "screwIron",
                'd',
                "chestIron",
                'e',
                "frameGtIron",
                'f',
                "chestIron",
                'g',
                "screwIron",
                'h',
                "chestIron",
                'i',
                "screwIron");
        RecipeManagers.carpenterManager.addRecipe(
                20,
                FluidRegistry.getFluidStack("creosote", 4000),
                getModItem(BinnieCore.ID, "storage", 1, 2, missing),
                getModItem(BinnieCore.ID, "storage", 1, 4, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwGold",
                'b',
                "gearGold",
                'c',
                "screwGold",
                'd',
                "gearGold",
                'e',
                "frameGtGold",
                'f',
                "gearGold",
                'g',
                "screwGold",
                'h',
                "gearGold",
                'i',
                "screwGold");
        RecipeManagers.carpenterManager.addRecipe(
                20,
                FluidRegistry.getFluidStack("creosote", 4000),
                getModItem(BinnieCore.ID, "storage", 1, 3, missing),
                getModItem(BinnieCore.ID, "storage", 1, 4, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwGold",
                'b',
                "gearGold",
                'c',
                "screwGold",
                'd',
                "gearGold",
                'e',
                "frameGtGold",
                'f',
                "gearGold",
                'g',
                "screwGold",
                'h',
                "gearGold",
                'i',
                "screwGold");
        RecipeManagers.carpenterManager.addRecipe(
                20,
                FluidRegistry.getFluidStack("creosote", 4000),
                getModItem(GregTech.ID, "gt.blockcasings2", 1, 3, missing),
                getModItem(BinnieCore.ID, "storage", 1, 4, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwGold",
                'b',
                "chestGold",
                'c',
                "screwGold",
                'd',
                "chestGold",
                'e',
                "frameGtGold",
                'f',
                "chestGold",
                'g',
                "screwGold",
                'h',
                "chestGold",
                'i',
                "screwGold");
        RecipeManagers.carpenterManager.addRecipe(
                25,
                FluidRegistry.getFluidStack("creosote", 5000),
                getModItem(BinnieCore.ID, "storage", 1, 4, missing),
                getModItem(BinnieCore.ID, "storage", 1, 5, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwDiamond",
                'b',
                "gearDiamond",
                'c',
                "screwDiamond",
                'd',
                "gearDiamond",
                'e',
                getModItem(NewHorizonsCoreMod.ID, "tile.DiamondFrameBox", 1, 0, missing),
                'f',
                "gearDiamond",
                'g',
                "screwDiamond",
                'h',
                "gearDiamond",
                'i',
                "screwDiamond");
        RecipeManagers.carpenterManager.addRecipe(
                25,
                FluidRegistry.getFluidStack("creosote", 5000),
                getModItem(GregTech.ID, "gt.blockcasings2", 1, 3, missing),
                getModItem(BinnieCore.ID, "storage", 1, 5, missing),
                "abc",
                "def",
                "ghi",
                'a',
                "screwDiamond",
                'b',
                "chestDiamond",
                'c',
                "screwDiamond",
                'd',
                "chestDiamond",
                'e',
                getModItem(NewHorizonsCoreMod.ID, "tile.DiamondFrameBox", 1, 0, missing),
                'f',
                "chestDiamond",
                'g',
                "screwDiamond",
                'h',
                "chestDiamond",
                'i',
                "screwDiamond");

    }
}
