package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import mcheli.aircraft.MCH_AircraftInfo;
import mcheli.aircraft.MCH_AircraftInfoManager;
import mcheli.helicopter.MCH_HeliInfo;
import mcheli.helicopter.MCH_HeliInfoManager;
import mcheli.plane.MCP_PlaneInfo;
import mcheli.plane.MCP_PlaneInfoManager;
import mcheli.tank.MCH_TankInfo;
import mcheli.tank.MCH_TankInfoManager;
import mcheli.vehicle.MCH_VehicleInfo;
import mcheli.vehicle.MCH_VehicleInfoManager;

import java.util.Map;

public enum VehicleManagerTarget {
    TANK{
        @Override
        public MCH_TankInfo getVessel(String name){
            return MCH_TankInfoManager.get(name);
        }

        @Override
        public boolean isHaveString(String name) {
            return MCH_TankInfoManager.map.containsKey(name);
        }
    },
    PLANE{
        @Override
        public MCP_PlaneInfo getVessel(String name){
            return MCP_PlaneInfoManager.get(name);
        }
        @Override
        public boolean isHaveString(String name) {
            return MCP_PlaneInfoManager.map.containsKey(name);
        }
    },
    VEHICLE{
        @Override
        public MCH_VehicleInfo getVessel(String name){
            return MCH_VehicleInfoManager.get(name);
        }
        @Override
        public boolean isHaveString(String name) {
            return MCH_VehicleInfoManager.map.containsKey(name);
        }
    },
    HELI{
        @Override
        public MCH_HeliInfo getVessel(String name){
            return MCH_HeliInfoManager.get(name);
        }
        @Override
        public boolean isHaveString(String name) {
            return MCH_HeliInfoManager.map.containsKey(name);
        }
    };

    public abstract MCH_AircraftInfo getVessel(String name);
    public abstract boolean isHaveString(String name);
}
