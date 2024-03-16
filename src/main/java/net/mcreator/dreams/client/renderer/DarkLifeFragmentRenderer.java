
package net.mcreator.dreams.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.dreams.entity.DarkLifeFragmentEntity;

public class DarkLifeFragmentRenderer extends HumanoidMobRenderer<DarkLifeFragmentEntity, HumanoidModel<DarkLifeFragmentEntity>> {
	public DarkLifeFragmentRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(DarkLifeFragmentEntity entity) {
		return new ResourceLocation("dreams:textures/entities/a2i2e_layer_2.png");
	}
}
