package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mmq implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map a;

    public mmq(Map map) {
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                mml mmlVar = new mml(readInt);
                for (int i = 0; i < readInt; i++) {
                    mmlVar.put(objectInput.readObject(), objectInput.readObject());
                }
                this.a = mmlVar.f();
                return;
            }
            throw new InvalidObjectException(a.am(readInt, "Illegal size value: ", "."));
        }
        throw new InvalidObjectException(a.ae(readByte, "Unsupported flags value: "));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public mmq() {
        this(mly.a);
    }
}
