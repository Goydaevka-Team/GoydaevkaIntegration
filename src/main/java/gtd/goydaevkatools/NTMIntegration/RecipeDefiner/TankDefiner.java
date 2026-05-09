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
import mcheli.tank.MCH_TankInfo;
import mcheli.tank.MCH_TankInfoManager;
import net.minecraft.item.Item;

import static com.hbm.inventory.OreDictManager.AL;
import static com.hbm.inventory.OreDictManager.STEEL;

public class TankDefiner extends AbstractDefiner{
    private static TankDefiner INSTANCE;

    public static TankDefiner getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new TankDefiner();
        }
        return INSTANCE;
    }

    @Override
    MCH_AircraftInfoManager GetOperatingManager() {
        return MCH_TankInfoManager.getInstance();
    }

    @Override
    void AbstractDefineProcedure() {
        DefineRecipe(new VesselNTMRecipe(
            "t90m",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 16),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.RUSSIAN_ARMOR),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.SECOND_ERA),
            new RecipesCommon.ComparableStack(ModItems.motor, 16),
            new RecipesCommon.OreDictStack(STEEL.heavyBarrel(), 8),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "m1a2",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 24),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.NATO_ARMOR),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.FIRST_ERA),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.OreDictStack(STEEL.heavyBarrel(), 8),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "embt",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 24),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.NATO_ARMOR),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.FIRST_ERA),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "bmp2m",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(AL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 8),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "m2a3",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.FIRST_ERA),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 8),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "puma",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.FIRST_ERA)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "vt4a1",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 16),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 16),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.SECOND_ERA),
            new RecipesCommon.OreDictStack(STEEL.heavyBarrel(), 8),
        new RecipesCommon.ComparableStack(GTDITems.tankComponents, 4, TankComponentEnum.NATO_ARMOR)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "ebrc",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(AL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.wheel,8),
            new RecipesCommon.ComparableStack(ModItems.motor, 6),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "zbd04a",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 4),
            new RecipesCommon.OreDictStack(AL.plateCast(), 6),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.OreDictStack(STEEL.heavyBarrel(), 8),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 8),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        Item T90 = ((MCH_TankInfo) MCH_TankInfoManager.get("t90m")).getItem();
        DefineRecipe(new VesselNTMRecipe(
            "tos1m",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.ComparableStack(T90, 1),
            new RecipesCommon.ComparableStack(ModBlocks.turret_himars,1)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "zbl08",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 8),
            new RecipesCommon.ComparableStack(GTDITems.wheel,8),
            new RecipesCommon.ComparableStack(ModItems.motor, 6),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "2k22",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 4),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 8, TankComponentEnum.ROLLER),
            new RecipesCommon.ComparableStack(ModBlocks.machine_radar,1),
            new RecipesCommon.ComparableStack(ModItems.motor, 4),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 6),
            new RecipesCommon.OreDictStack(STEEL.shell(), 2),
            new RecipesCommon.ComparableStack(ModItems.weapon_mod_special, 1,GunFactory.EnumModSpecial.ENGINE_DIESEL)
        ));
        DefineRecipe(new VesselNTMRecipe(
            "m224",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 3),
            new RecipesCommon.OreDictStack(STEEL.wireFine(), 2),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 3),
            new RecipesCommon.OreDictStack(STEEL.shell(), 1)
        ));
            DefineRecipe(new VesselNTMRecipe(
            "m1161itv",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 3),
            new RecipesCommon.ComparableStack(GTDITems.wheel,4),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 4),
            new RecipesCommon.ComparableStack(ModItems.motor, 2)
        ));
            DefineRecipe(new VesselNTMRecipe(
            "vdv",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 3),
            new RecipesCommon.ComparableStack(GTDITems.wheel,4),
            new RecipesCommon.OreDictStack(STEEL.lightBarrel(), 4),
            new RecipesCommon.ComparableStack(ModItems.motor, 2)
        ));
            DefineRecipe(new VesselNTMRecipe(
            "mstab",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 3),
            new RecipesCommon.ComparableStack(GTDITems.wheel,2),
            new RecipesCommon.OreDictStack(STEEL.heavyBarrel(), 8),
            new RecipesCommon.OreDictStack(STEEL.shell(), 4)
        ));
            DefineRecipe(new VesselNTMRecipe(
            "2c35",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 20),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 14, TankComponentEnum.ROLLER),
            new RecipesCommon.OreDictStack(STEEL.heavyBarrel(), 20),
            new RecipesCommon.OreDictStack(STEEL.shell(), 2)
        ));
            DefineRecipe(new VesselNTMRecipe(
            "m109",VESSEL_TYPE.TANK,100, 100,
            new RecipesCommon.OreDictStack(STEEL.plateCast(), 28),
            new RecipesCommon.ComparableStack(GTDITems.tankComponents, 12, TankComponentEnum.ROLLER),
            new RecipesCommon.OreDictStack(STEEL.heavyBarrel(), 12),
            new RecipesCommon.OreDictStack(STEEL.shell(), 3)
        ));

        //2S38
        //AL CAST PLATES
        //M2A3 STEEL CAST PLATES
        //PUMA FIRST ERA + STEEL CAST
        //VT4A1 SECOND ERA + NERA
        //ZBD04A STEEL + AL
        //EBRC AL PLATES + WHEELS
        //EMBT M2A3 COPY
        //M2A3 USES BUSK ERA
    }
}
