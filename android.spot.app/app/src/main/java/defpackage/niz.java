package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niz extends ngv {
    final /* synthetic */ nja d;
    final /* synthetic */ int e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niz(String str, nja njaVar, int i, long j) {
        super(str);
        this.d = njaVar;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.ngv
    public final long a() {
        try {
            this.d.u.i(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
