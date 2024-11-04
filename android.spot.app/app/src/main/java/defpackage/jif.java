package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jif extends jgj {
    private static final long serialVersionUID = 0;
    transient int d;

    public jif() {
        super(new jha(12));
        this.d = 2;
        hwx.J(true);
        this.d = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = 2;
        int readInt = objectInputStream.readInt();
        m(new jha(12));
        hzc.s(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        hzc.t(this, objectOutputStream);
    }

    @Override // defpackage.jgj, defpackage.jge
    public final /* bridge */ /* synthetic */ Collection a() {
        return new jhc(this.d);
    }
}
