package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nit extends ngv {
    final /* synthetic */ nja d;
    final /* synthetic */ int e;
    final /* synthetic */ nkp f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nit(String str, nja njaVar, int i, nkp nkpVar, int i2) {
        super(str);
        this.d = njaVar;
        this.e = i;
        this.f = nkpVar;
        this.g = i2;
    }

    @Override // defpackage.ngv
    public final long a() {
        try {
            this.f.u(this.g);
            this.d.u.j(this.e, 9);
            synchronized (this.d) {
                this.d.w.remove(Integer.valueOf(this.e));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
