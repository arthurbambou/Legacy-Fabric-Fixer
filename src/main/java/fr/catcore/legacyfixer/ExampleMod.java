package fr.catcore.legacyfixer;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public class ExampleMod implements PreLaunchEntrypoint {
	@Override
	public void onPreLaunch() {
		System.out.println("First");
//		Path modFolder = FabricLoader.getInstance().getGameDir().resolve("mods");
//
//		for (File modFile : modFolder.toFile().listFiles()) {
//			if (!modFile.getName().endsWith(".jar")) continue;
//
//			try {
//				JarFile jarFile = new JarFile(modFile);
//
//				ZipEntry entry = jarFile.getEntry("fabric.mod.json");
//
//				boolean old = entry.getLastModifiedTime().toInstant().isBefore(Instant.parse("2021-12-05T05:31:00.00Z"));
//
//				if (old) System.out.println("EEEEEEEEEEEEEEEEEEEE");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
