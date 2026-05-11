package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import com.hbm.blocks.ModBlocks;
import com.hbm.inventory.RecipesCommon;
import com.hbm.items.ModItems;
import com.hbm.items.weapon.sedna.factory.GunFactory;
import gtd.goydaevkatools.ModItems.GTDITems;
import gtd.goydaevkatools.NTMIntegration.VESSEL_TYPE;
import gtd.goydaevkatools.NTMIntegration.VesselNTMRecipe;
import gtd.goydaevkatools.VesselsComponents.TankComponentEnum;
import mcheli.aircraft.MCH_AircraftInfoManager;
import mcheli.vehicle.MCH_VehicleInfoManager;
import net.minecraft.item.Item;

import static com.hbm.inventory.OreDictManager.AL;
import static com.hbm.inventory.OreDictManager.STEEL;
import static com.hbm.inventory.OreDictManager.TI;

public class VehicleDefiner extends AbstractDefiner
{
    private static VehicleDefiner INSTANCE;

    public static VehicleDefiner getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new VehicleDefiner();
        }
        return INSTANCE;
    }

    @Override
    MCH_AircraftInfoManager GetOperatingManager() {
        return MCH_VehicleInfoManager.getInstance();
    }

    @Override
    void AbstractDefineProcedure() {
        
    }
}
