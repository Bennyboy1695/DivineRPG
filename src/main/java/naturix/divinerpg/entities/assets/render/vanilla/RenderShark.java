package naturix.divinerpg.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import naturix.divinerpg.entities.assets.model.vanilla.model.ModelShark;
import naturix.divinerpg.entities.entity.vanilla.Shark;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderShark extends RenderLiving<Shark> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/shark.png");
    
	public RenderShark(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelShark(), 1F);
    }

	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(Shark entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<Shark> {

	        @Override
	        public Render<? super Shark> createRenderFor(RenderManager manager) {
	            return new RenderShark(manager, new ModelShark(), 0.5F);
	        }
	    }

	}