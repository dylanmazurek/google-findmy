package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fgg {
    public final int a;
    public final int b;
    public final Bundle c;
    public final bym d = new bym((int[]) null);

    public fgg(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(fgh fghVar) {
        this.d.r(fghVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Object obj) {
        this.d.s(obj);
    }

    public final String toString() {
        return "Request { what=" + this.b + " id=" + this.a + " oneWay=" + b() + "}";
    }
}
