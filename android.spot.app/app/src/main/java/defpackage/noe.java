package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noe extends npl {
    private static final long serialVersionUID = -4481126543819298617L;
    public nof a;
    public nnq b;

    public noe(nof nofVar, nnq nnqVar) {
        this.a = nofVar;
        this.b = nnqVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (nof) objectInputStream.readObject();
        this.b = ((nns) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.r());
    }

    @Override // defpackage.npl
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.npl
    protected final nno b() {
        return this.a.b;
    }

    @Override // defpackage.npl
    public final nnq c() {
        return this.b;
    }
}
