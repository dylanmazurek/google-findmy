package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mur extends mst {
    /* JADX INFO: Access modifiers changed from: protected */
    public final String e() {
        mur murVar;
        mst mstVar = mtj.a;
        mur murVar2 = nbc.a;
        if (this == murVar2) {
            return "Dispatchers.Main";
        }
        try {
            murVar = murVar2.h();
        } catch (UnsupportedOperationException unused) {
            murVar = null;
        }
        if (this != murVar) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    public abstract mur h();

    @Override // defpackage.mst
    public String toString() {
        String e = e();
        if (e == null) {
            return msz.a(this) + "@" + msz.b(this);
        }
        return e;
    }
}
