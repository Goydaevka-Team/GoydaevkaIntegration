package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import mcheli.aircraft.MCH_AircraftInfoManager;
import mcheli.vehicle.MCH_VehicleInfoManager;

import java.util.HashMap;

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
