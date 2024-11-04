package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npf implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient nnw a;

    public npf(nnw nnwVar) {
        this.a = nnwVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (nnw) objectInputStream.readObject();
    }

    private Object readResolve() {
        return npg.P(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }
}
