package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhg {
    public final dhh a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ dhi d;

    public dhg(dhi dhiVar, dhh dhhVar) {
        boolean[] zArr;
        this.d = dhiVar;
        this.a = dhhVar;
        if (dhhVar.e) {
            zArr = null;
        } else {
            zArr = new boolean[dhiVar.d];
        }
        this.b = zArr;
    }

    public final void a() {
        this.d.a(this, false);
    }

    public final void b() {
        if (!this.c) {
            try {
                a();
            } catch (IOException unused) {
            }
        }
    }
}
