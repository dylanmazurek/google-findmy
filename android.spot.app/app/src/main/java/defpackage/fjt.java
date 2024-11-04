package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjt {
    public fju a;
    public fju b;
    public fjo c;
    public Feature[] d;
    public int f;
    private final Runnable g = new gpm(1);
    public boolean e = true;

    public final apc a() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        fma.aG(z, "Must set register function");
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        fma.aG(z2, "Must set unregister function");
        if (this.c == null) {
            z3 = false;
        }
        fma.aG(z3, "Must set holder");
        fma.aS(this.c.b, "Key must not be null");
        return new apc((Object) new fjs(this, this.c, this.d, this.e, this.f), (Object) new njz(this, null), (Object) this.g, (char[]) null);
    }
}
