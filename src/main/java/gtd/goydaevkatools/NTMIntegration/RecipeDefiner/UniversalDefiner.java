package gtd.goydaevkatools.NTMIntegration.RecipeDefiner;

import gtd.goydaevkatools.CORE;
import gtd.goydaevkatools.NTMIntegration.Loaders.NTMRecipesLoader;
import gtd.goydaevkatools.NTMIntegration.VesselNTMRecipe;

public class UniversalDefiner {
    public static void DefineRecipe(VesselNTMRecipe recipe){
        if (recipe.isRealVehicle()){
            NTMRecipesLoader.recipeList.add(recipe);
        } else {
            CORE.LOGGER.error(recipe.getVesselID() + " WAS NOT FOUND IN " + recipe.getVehicleManagerTarget().getClass().getSimpleName());
        }
    }
}
