package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czu implements czt {
    private final List a;
    private dfc c = null;
    private float d = -1.0f;
    private dfc b = g(0.0f);

    public czu(List list) {
        this.a = list;
    }

    private final dfc g(float f) {
        dfc dfcVar = (dfc) this.a.get(this.a.size() - 1);
        if (f >= dfcVar.c()) {
            return dfcVar;
        }
        for (int size = this.a.size() - 2; size > 0; size--) {
            dfc dfcVar2 = (dfc) this.a.get(size);
            if (this.b != dfcVar2 && dfcVar2.d(f)) {
                return dfcVar2;
            }
        }
        return (dfc) this.a.get(0);
    }

    @Override // defpackage.czt
    public final float a() {
        return ((dfc) this.a.get(this.a.size() - 1)).b();
    }

    @Override // defpackage.czt
    public final float b() {
        return ((dfc) this.a.get(0)).c();
    }

    @Override // defpackage.czt
    public final dfc c() {
        return this.b;
    }

    @Override // defpackage.czt
    public final boolean d(float f) {
        dfc dfcVar = this.c;
        dfc dfcVar2 = this.b;
        if (dfcVar == dfcVar2 && this.d == f) {
            return true;
        }
        this.c = dfcVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.czt
    public final boolean e() {
        return false;
    }

    @Override // defpackage.czt
    public final boolean f(float f) {
        if (this.b.d(f)) {
            if (!this.b.e()) {
                return true;
            }
            return false;
        }
        this.b = g(f);
        return true;
    }
}
