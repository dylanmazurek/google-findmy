package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdf implements azv {
    public final int a;
    public final Float b = null;
    public final Float c = null;
    public bfc d = null;
    public bfc e = null;
    private final List f;

    public bdf(int i, List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.azv
    public final boolean y() {
        return this.f.contains(this);
    }
}
