package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niy extends ngv {
    final /* synthetic */ nja d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niy(String str, nja njaVar, int i, int i2) {
        super(str);
        this.d = njaVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ngv
    public final long a() {
        try {
            this.d.m(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
