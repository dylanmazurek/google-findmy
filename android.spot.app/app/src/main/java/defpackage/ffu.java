package defpackage;

import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffu extends fhq implements ffd {
    public final jfe a;

    static {
        new AtomicBoolean(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ffu(android.content.Context r5, defpackage.jfe r6) {
        /*
            r4 = this;
            gok r0 = defpackage.ffc.k
            fhk r1 = defpackage.fhl.a
            gpn r2 = new gpn
            r2.<init>()
            fma r3 = new fma
            r3.<init>()
            r2.a = r3
            fhp r2 = r2.d()
            r4.<init>(r5, r0, r1, r2)
            r4.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffu.<init>(android.content.Context, jfe):void");
    }

    public final void a(BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            fma.o(Status.b);
            return;
        }
        fjy fjyVar = new fjy();
        fjyVar.a = new fep(batchedLogErrorParcelable, 4);
        fjyVar.b = new Feature[]{ffj.a};
        fjyVar.b();
        o(fjyVar.a());
    }

    public final fhw b(fez fezVar) {
        fft fftVar = new fft(this, fezVar, this.h);
        super.i(2, fftVar);
        return fftVar;
    }
}
