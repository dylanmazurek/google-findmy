package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqf implements fjn {
    final /* synthetic */ byte[] a;
    private final /* synthetic */ int b;

    public fqf(byte[] bArr, int i) {
        this.b = i;
        this.a = bArr;
    }

    @Override // defpackage.fjn
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                hri hriVar = (hri) obj;
                try {
                    byte[] bArr = this.a;
                    lja ljaVar = lja.a;
                    lkz lkzVar = lkz.a;
                    ljn m = ljn.m(hxd.b, bArr, 0, bArr.length, lja.a);
                    ljn.A(m);
                    hxd hxdVar = (hxd) m;
                    jei jeiVar = (jei) ((AtomicReference) hriVar.b).get();
                    if (jeiVar != null && ((Boolean) jeiVar.a(new rz(hxdVar.a))).booleanValue()) {
                        ((hxh) hriVar.a).a();
                        return;
                    }
                    return;
                } catch (ljy unused) {
                    return;
                }
            }
            fpu fpuVar = (fpu) obj;
            try {
                byte[] bArr2 = this.a;
                ljn m2 = ljn.m(fpo.b, bArr2, 0, bArr2.length, lja.a());
                ljn.A(m2);
                fpuVar.a(Collections.unmodifiableMap(((fpo) m2).a));
                return;
            } catch (ljy e) {
                throw new IllegalStateException("Failed parsing account alerts proto", e);
            }
        }
        fpv fpvVar = (fpv) obj;
        try {
            byte[] bArr3 = this.a;
            ljn m3 = ljn.m(fpr.b, bArr3, 0, bArr3.length, lja.a());
            ljn.A(m3);
            fpvVar.a(Collections.unmodifiableMap(((fpr) m3).a));
        } catch (ljy e2) {
            throw new IllegalStateException("Failed parsing account alerts proto", e2);
        }
    }

    @Override // defpackage.fjn
    public final void b() {
    }
}
