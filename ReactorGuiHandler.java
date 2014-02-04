/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import Reika.DragonAPI.Base.CoreContainer;
import Reika.ReactorCraft.Base.TileEntityNuclearCore;
import Reika.ReactorCraft.Container.ContainerCentrifuge;
import Reika.ReactorCraft.Container.ContainerElectrolyzer;
import Reika.ReactorCraft.Container.ContainerNuclearCore;
import Reika.ReactorCraft.Container.ContainerProcessor;
import Reika.ReactorCraft.Container.ContainerSynthesizer;
import Reika.ReactorCraft.Container.ContainerWasteContainer;
import Reika.ReactorCraft.Container.ContainerWasteStorage;
import Reika.ReactorCraft.GUIs.GuiCPU;
import Reika.ReactorCraft.GUIs.GuiCentrifuge;
import Reika.ReactorCraft.GUIs.GuiElectrolyzer;
import Reika.ReactorCraft.GUIs.GuiNuclearCore;
import Reika.ReactorCraft.GUIs.GuiProcessor;
import Reika.ReactorCraft.GUIs.GuiSynthesizer;
import Reika.ReactorCraft.GUIs.GuiWasteContainer;
import Reika.ReactorCraft.GUIs.GuiWasteStorage;
import Reika.ReactorCraft.Registry.ReactorTiles;
import Reika.ReactorCraft.TileEntities.TileEntityWasteContainer;
import Reika.ReactorCraft.TileEntities.TileEntityWasteStorage;
import Reika.ReactorCraft.TileEntities.Fission.TileEntityCPU;
import Reika.ReactorCraft.TileEntities.Processing.TileEntityCentrifuge;
import Reika.ReactorCraft.TileEntities.Processing.TileEntityElectrolyzer;
import Reika.ReactorCraft.TileEntities.Processing.TileEntitySynthesizer;
import Reika.ReactorCraft.TileEntities.Processing.TileEntityUProcessor;
import cpw.mods.fml.common.network.IGuiHandler;

public class ReactorGuiHandler implements IGuiHandler {

	public static final ReactorGuiHandler instance = new ReactorGuiHandler();

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		ReactorTiles r = ReactorTiles.getTE(world, x, y, z);
		if (r != null) {
			TileEntity te = world.getBlockTileEntity(x, y, z);
			switch(r) {
			case FUEL:
			case BREEDER:
				return new ContainerNuclearCore(player, (TileEntityNuclearCore)te);
			case WASTECONTAINER:
				return new ContainerWasteContainer(player, (TileEntityWasteContainer)te);
			case PROCESSOR:
				return new ContainerProcessor(player, (TileEntityUProcessor)te);
			case CENTRIFUGE:
				return new ContainerCentrifuge(player, (TileEntityCentrifuge)te);
			case SYNTHESIZER:
				return new ContainerSynthesizer(player, (TileEntitySynthesizer)te);
			case ELECTROLYZER:
				return new ContainerElectrolyzer(player, (TileEntityElectrolyzer)te);
			case STORAGE:
				return new ContainerWasteStorage(player, (TileEntityWasteStorage)te);
			case CPU:
				return new CoreContainer(player, te).setAlwaysInteractable();
			default:
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		ReactorTiles r = ReactorTiles.getTE(world, x, y, z);
		if (r != null) {
			TileEntity te = world.getBlockTileEntity(x, y, z);
			switch(r) {
			case FUEL:
			case BREEDER:
				return new GuiNuclearCore(player, (TileEntityNuclearCore)te);
			case WASTECONTAINER:
				return new GuiWasteContainer(player, (TileEntityWasteContainer)te);
			case PROCESSOR:
				return new GuiProcessor(player, (TileEntityUProcessor)te);
			case CENTRIFUGE:
				return new GuiCentrifuge(player, (TileEntityCentrifuge)te);
			case SYNTHESIZER:
				return new GuiSynthesizer(player, (TileEntitySynthesizer)te);
			case ELECTROLYZER:
				return new GuiElectrolyzer(player, (TileEntityElectrolyzer)te);
			case STORAGE:
				return new GuiWasteStorage(player, (TileEntityWasteStorage)te);
			case CPU:
				return new GuiCPU(player, (TileEntityCPU)te);
			default:
				return null;
			}
		}
		return null;
	}

}
