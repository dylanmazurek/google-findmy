package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jat extends jam implements jap {
    static final jan a = new jao();
    public final jan b;

    public jat() {
        super("<missing root>", jas.a.b());
        this.b = a;
    }

    @Override // defpackage.jap
    public final jbe d(String str, jaz jazVar, boolean z) {
        if (z) {
            WeakHashMap weakHashMap = jbu.a;
        }
        return new jau(str, this, jazVar, z);
    }

    @Override // defpackage.jap
    public final /* synthetic */ Exception e() {
        return this.b;
    }

    @Override // defpackage.jbe
    public final jaz f() {
        return jay.a;
    }

    @Override // defpackage.jbe
    public final jaz g() {
        throw null;
    }

    @Override // defpackage.jbe
    public final jbe h(String str, jaz jazVar) {
        WeakHashMap weakHashMap = jbu.a;
        return d(str, jazVar, true);
    }

    @Override // defpackage.jbe
    public final void i() {
    }

    @Override // defpackage.jbe
    public final void j() {
    }
}
