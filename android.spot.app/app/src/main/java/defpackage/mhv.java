package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhv {
    public final map a;
    public lze b;
    public final mhq c;
    public boolean d = false;

    public mhv(map mapVar, lze lzeVar, mhq mhqVar) {
        this.a = mapVar;
        this.b = lzeVar;
        this.c = mhqVar;
    }

    public final lze a() {
        return this.c.a.a;
    }

    public final void b(lze lzeVar) {
        boolean z;
        this.b = lzeVar;
        if (lzeVar != lze.READY && lzeVar != lze.TRANSIENT_FAILURE) {
            if (lzeVar == lze.IDLE) {
                z = false;
            } else {
                return;
            }
        } else {
            z = true;
        }
        this.d = z;
    }
}
