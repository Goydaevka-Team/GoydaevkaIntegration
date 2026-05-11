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
import mcheli.helicopter.MCH_HeliInfoManager;
import net.minecraft.item.Item;

import static com.hbm.inventory.OreDictManager.AL;
import static com.hbm.inventory.OreDictManager.STEEL;
import static com.hbm.inventory.OreDictManager.TI;

public class HeliDefiner extends AbstractDefiner
{
    private static HeliDefiner INSTANCE;

    public static HeliDefiner getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new HeliDefiner();
        }
        return INSTANCE;
    }
    @Override
    MCH_AircraftInfoManager GetOperatingManager() {
        return MCH_HeliInfoManager.getInstance();
    }

    @Override
    void AbstractDefineProcedure() {
        DefineRecipe(new VesselNTMRecipe(
            "mi8amtsh-2",VESSEL_TYPE.HELI,100, 100,
            new RecipesCommon.OreDictStack(AL.plateCast(), 22),
            new RecipesCommon.OreDictStack(TI.plateCast(), 16),
            new RecipesCommon.ComparableStack(GTDITems.wheel,3),
            new RecipesCommon.ComparableStack(hbm:item.blade_titanium,8),
            new RecipesCommon.ComparableStack(ModItems.motor, 8),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 2),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "mh60g",VESSEL_TYPE.HELI,100, 100,
            new RecipesCommon.OreDictStack(AL.plateCast(), 32),
            new RecipesCommon.OreDictStack(TI.plateCast(), 32),
            new RecipesCommon.ComparableStack(GTDITems.wheel,3),
            new RecipesCommon.ComparableStack(hbm:item.blade_titanium,8),
            new RecipesCommon.ComparableStack(ModItems.motor, 8),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 2,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
    }
}
