package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import mcheli.aircraft.MCH_AircraftInfoManager;
import mcheli.helicopter.MCH_HeliInfoManager;

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

    }
}
