package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czv implements czt {
    private final dfc a;
    private float b = -1.0f;

    public czv(List list) {
        this.a = (dfc) list.get(0);
    }

    @Override // defpackage.czt
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.czt
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.czt
    public final dfc c() {
        return this.a;
    }

    @Override // defpackage.czt
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.czt
    public final boolean e() {
        return false;
    }

    @Override // defpackage.czt
    public final boolean f(float f) {
        if (!this.a.e()) {
            return true;
        }
        return false;
    }
}
