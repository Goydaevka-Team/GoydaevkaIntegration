package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import mcheli.aircraft.MCH_AircraftInfoManager;
import mcheli.plane.MCP_PlaneInfoManager;

public class PlaneDefiner extends AbstractDefiner {
    private static PlaneDefiner INSTANCE;

    public static PlaneDefiner getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new PlaneDefiner();
        }
        return INSTANCE;
    }

    @Override
    MCH_AircraftInfoManager GetOperatingManager() {
        return MCP_PlaneInfoManager.getInstance();
    }

    @Override
    void AbstractDefineProcedure() {

    }
}
