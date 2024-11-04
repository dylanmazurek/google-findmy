package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjy {
    public fju a;
    public Feature[] b;
    private boolean d = true;
    public int c = 0;

    public final fjz a() {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        fma.aG(z, "execute parameter required");
        return new fjx(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.d = false;
    }
}
