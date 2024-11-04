package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbz implements dcc {
    private final dbs a;
    private final dbs b;

    public dbz(dbs dbsVar, dbs dbsVar2) {
        this.a = dbsVar;
        this.b = dbsVar2;
    }

    @Override // defpackage.dcc
    public final czw a() {
        return new daj(this.a.a(), this.b.a());
    }

    @Override // defpackage.dcc
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.dcc
    public final boolean c() {
        if (this.a.c() && this.b.c()) {
            return true;
        }
        return false;
    }
}
