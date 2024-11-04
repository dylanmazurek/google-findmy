package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avh implements awi {
    final /* synthetic */ moh a;
    final /* synthetic */ avi b;
    private final int c;
    private final int d;
    private final Map e;

    public avh(int i, int i2, Map map, moh mohVar, avi aviVar) {
        this.a = mohVar;
        this.b = aviVar;
        this.c = i;
        this.d = i2;
        this.e = map;
    }

    @Override // defpackage.awi
    public final int a() {
        return this.d;
    }

    @Override // defpackage.awi
    public final int b() {
        return this.c;
    }

    @Override // defpackage.awi
    public final Map c() {
        return this.e;
    }

    @Override // defpackage.awi
    public final void d() {
        this.a.a(this.b.a.k);
    }

    @Override // defpackage.awi
    public final void e() {
    }
}
