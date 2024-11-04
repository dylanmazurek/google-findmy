package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nip extends ngv {
    final /* synthetic */ nja d;
    final /* synthetic */ njh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nip(String str, nja njaVar, njh njhVar) {
        super(str);
        this.d = njaVar;
        this.e = njhVar;
    }

    @Override // defpackage.ngv
    public final long a() {
        try {
            this.d.b.f(this.e);
            return -1L;
        } catch (IOException e) {
            nju.b.k("Http2Connection.Listener failure for ".concat(String.valueOf(this.d.d)), 4, e);
            try {
                this.e.k(2, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
