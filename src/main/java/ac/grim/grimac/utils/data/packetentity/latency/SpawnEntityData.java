package ac.grim.grimac.utils.data.packetentity.latency;

import io.github.retrooper.packetevents.utils.vector.Vector3d;
import org.bukkit.entity.Entity;

public class SpawnEntityData {
    public final Entity entity;
    public Vector3d position;
    public int lastTransactionSent;

    public SpawnEntityData(Entity entity, Vector3d position, int lastTransactionSent) {
        this.entity = entity;
        this.position = position;
        this.lastTransactionSent = lastTransactionSent;
    }
}