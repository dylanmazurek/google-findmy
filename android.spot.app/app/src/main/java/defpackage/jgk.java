package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgk extends jfn {
    private static final long serialVersionUID = 0;
    transient int d;

    public jgk() {
        super(new jha(12));
        hwx.D(3, "expectedValuesPerKey");
        this.d = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = 3;
        int readInt = objectInputStream.readInt();
        m(new jha());
        hzc.s(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        hzc.t(this, objectOutputStream);
    }

    @Override // defpackage.jfn, defpackage.jge
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.d);
    }
}
