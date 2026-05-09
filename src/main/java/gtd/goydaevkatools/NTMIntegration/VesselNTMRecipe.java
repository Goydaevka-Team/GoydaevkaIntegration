package gtd.goydaevkatools.NTMIntegration;

import com.hbm.inventory.RecipesCommon;
import com.hbm.inventory.recipes.loader.GenericRecipe;
import gtd.goydaevkatools.CORE;
import gtd.goydaevkatools.NTMIntegration.RecipeDefiner.VehicleManagerTarget;
import mcheli.plane.MCP_PlaneInfoManager;
import mcheli.tank.MCH_TankInfoManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class VesselNTMRecipe {
    private String vesselID;
    private VehicleManagerTarget _vesselType;
    private GenericRecipe recipe;

    public GenericRecipe getRecipe(){
        return recipe;
    }

    public String getVesselID(){
        return vesselID;
    }

    public VehicleManagerTarget getVehicleManagerTarget(){
        return _vesselType;
    }

    public boolean isRealVehicle(){
        return getVehicleManagerTarget().isHaveString(vesselID);
    }
    public VesselNTMRecipe(String name, VehicleManagerTarget veselType, int power, int duration, RecipesCommon.AStack... input){
        Item vesselItem = null;
        try {
            vesselItem = veselType.getVessel(name).getItem();

        } catch (NullPointerException e){

            CORE.LOGGER.error("Vessel with name " + name + " was not found!");
        }


        this.recipe = new GenericRecipe("ass." + name)
            .setup(duration, power)
            .outputItems(new ItemStack(vesselItem,1))
            .inputItems(input);

        this.vesselID = name;
    }
}
