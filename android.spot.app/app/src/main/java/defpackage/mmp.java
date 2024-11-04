package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmp implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public mmp(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection M;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (i != 0) {
                    mmr mmrVar = new mmr(new mml(readInt));
                    while (i2 < readInt) {
                        mmrVar.add(objectInput.readObject());
                        i2++;
                    }
                    M = mkm.D(mmrVar);
                } else {
                    mmg mmgVar = new mmg(readInt);
                    while (i2 < readInt) {
                        mmgVar.add(objectInput.readObject());
                        i2++;
                    }
                    M = mkm.M(mmgVar);
                }
                this.a = M;
                return;
            }
            throw new InvalidObjectException(a.am(readInt, "Illegal size value: ", "."));
        }
        throw new InvalidObjectException(a.am(readByte, "Unsupported flags value: ", "."));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public mmp() {
        this(mlx.a, 0);
    }
}
