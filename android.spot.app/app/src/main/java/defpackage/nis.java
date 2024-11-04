package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nis implements mnw {
    final /* synthetic */ nja a;
    private final njd b;

    public nis(nja njaVar, njd njdVar) {
        this.a = njaVar;
        this.b = njdVar;
    }

    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        try {
            if (!this.b.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
            } while (this.b.a(false, this));
            this.a.k(1, 9, null);
            a.z(this.b);
        } catch (IOException e) {
            this.a.k(2, 2, e);
            a.z(this.b);
        } catch (Throwable th) {
            this.a.k(3, 3, null);
            a.z(this.b);
            throw th;
        }
        return mlh.a;
    }
}
