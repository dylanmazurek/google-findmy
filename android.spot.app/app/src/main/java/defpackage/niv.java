package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niv extends ngv {
    final /* synthetic */ nja d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niv(String str, nja njaVar, int i) {
        super(str);
        this.d = njaVar;
        this.e = i;
    }

    @Override // defpackage.ngv
    public final long a() {
        try {
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
