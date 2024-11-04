package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbj extends ey {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public hbj(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ey
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.ey
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.ey
    public final boolean c(int i, int i2) {
        return gzc.a(this.a.get(i)).equals(gzc.a(this.b.get(i2)));
    }

    @Override // defpackage.ey
    public final boolean d(int i, int i2) {
        return frx.aj(this.a.get(i)).equals(frx.aj(this.b.get(i2)));
    }
}
