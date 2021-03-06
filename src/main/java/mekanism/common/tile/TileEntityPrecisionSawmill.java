package mekanism.common.tile;

import java.util.Map;
import mekanism.common.block.states.BlockStateMachine;
import mekanism.common.config.MekanismConfig;
import mekanism.common.recipe.RecipeHandler.Recipe;
import mekanism.common.recipe.inputs.ItemStackInput;
import mekanism.common.recipe.machines.SawmillRecipe;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityPrecisionSawmill extends TileEntityChanceMachine<SawmillRecipe> {

    public TileEntityPrecisionSawmill() {
        super("sawmill", "PrecisionSawmill", BlockStateMachine.MachineType.PRECISION_SAWMILL.baseEnergy,
              MekanismConfig.current().usage.precisionSawmillUsage.val(), 200,
              MekanismUtils.getResource(ResourceType.GUI, "GuiBasicMachine.png"));
    }

    @Override
    public Map<ItemStackInput, SawmillRecipe> getRecipes() {
        return Recipe.PRECISION_SAWMILL.get();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public float getVolume() {
        return 0.7F * super.getVolume();
    }
}
