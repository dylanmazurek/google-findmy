package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqr implements nrc, nra {
    private final nns a;
    private final int b;
    private final boolean c;

    public nqr(nns nnsVar, int i, boolean z) {
        this.a = nnsVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.nra
    public final int a() {
        if (this.c) {
            return 4;
        }
        return 2;
    }

    @Override // defpackage.nrc
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003a  */
    @Override // defpackage.nra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.nqw r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqr.c(nqw, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
        int i = -1;
        if (nohVar.f(this.a)) {
            try {
                int b = nohVar.b(this.a);
                if (b < 0) {
                    b = -b;
                }
                i = b % 100;
            } catch (RuntimeException unused) {
            }
        }
        if (i < 0) {
            appendable.append((char) 65533);
            appendable.append((char) 65533);
        } else {
            nqy.b(appendable, i, 2);
        }
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        int i2;
        try {
            int a = this.a.a(nnoVar).a(j);
            if (a < 0) {
                a = -a;
            }
            i2 = a % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            appendable.append((char) 65533);
            appendable.append((char) 65533);
        } else {
            nqy.b(appendable, i2, 2);
        }
    }
}
