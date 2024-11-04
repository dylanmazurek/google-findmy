package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jau extends jar implements jap {
    public final Exception a;
    private final boolean b;

    public jau(String str, jap japVar, jaz jazVar, boolean z) {
        super("<missing root>:".concat(String.valueOf(str)), japVar, jaz.a(jazVar, jay.b));
        this.a = japVar.e();
        this.b = z;
    }

    @Override // defpackage.jap
    public final jbe d(String str, jaz jazVar, boolean z) {
        if (z && !this.b) {
            WeakHashMap weakHashMap = jbu.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new jau(str, this, jazVar, z2);
    }

    @Override // defpackage.jap
    public final Exception e() {
        return this.a;
    }

    @Override // defpackage.jbe
    public final jaz g() {
        return jay.a;
    }

    @Override // defpackage.jbe
    public final jbe h(String str, jaz jazVar) {
        return d(str, jazVar, true);
    }

    public jau(String str, jaz jazVar, boolean z) {
        super("<missing root>:".concat(String.valueOf(str)), jas.a.b(), jaz.a(jazVar, jay.b));
        this.a = jat.a;
        this.b = z;
    }

    @Override // defpackage.jbe
    public final void i() {
    }

    @Override // defpackage.jbe
    public final void j() {
    }
}
