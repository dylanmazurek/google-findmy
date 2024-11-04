package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqp implements nrc, nra {
    private final int a;

    public nqp(int i) {
        this.a = i;
    }

    @Override // defpackage.nra
    public final int a() {
        if (this.a == 1) {
            return 4;
        }
        return 20;
    }

    @Override // defpackage.nrc
    public final int b() {
        if (this.a == 1) {
            return 4;
        }
        return 20;
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        Map map = nnt.a;
        String str = null;
        for (String str2 : map.keySet()) {
            if (nqt.c(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                str = str2;
            }
        }
        if (str != null) {
            nqwVar.f((nnw) map.get(str));
            return i + str.length();
        }
        return ~i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    @Override // defpackage.nrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Appendable r4, long r5, defpackage.nno r7, int r8, defpackage.nnw r9, java.util.Locale r10) {
        /*
            r3 = this;
            if (r9 != 0) goto L6
            java.lang.String r5 = ""
            goto L89
        L6:
            long r7 = (long) r8
            long r5 = r5 - r7
            int r7 = r3.a
            r8 = 0
            if (r7 == 0) goto L4b
            if (r10 != 0) goto L13
            java.util.Locale r10 = java.util.Locale.getDefault()
        L13:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L1d
            java.lang.String r5 = r9.c
            goto L89
        L1d:
            nrj r0 = defpackage.nnw.d
            boolean r1 = r0 instanceof defpackage.nrj
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.String r7 = r9.c
            boolean r1 = r9.l(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L31
            goto L3c
        L31:
            r7 = r7[r2]
            goto L40
        L34:
            java.lang.String r1 = r9.c
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L3e
        L3c:
            r7 = r8
            goto L40
        L3e:
            r7 = r7[r2]
        L40:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.nnw.h(r5)
            goto L89
        L4b:
            if (r10 != 0) goto L51
            java.util.Locale r10 = java.util.Locale.getDefault()
        L51:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L5a
            java.lang.String r5 = r9.c
            goto L89
        L5a:
            nrj r0 = defpackage.nnw.d
            boolean r1 = r0 instanceof defpackage.nrj
            r2 = 1
            if (r1 == 0) goto L71
            java.lang.String r7 = r9.c
            boolean r1 = r9.l(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L6e
            goto L79
        L6e:
            r7 = r7[r2]
            goto L7d
        L71:
            java.lang.String r1 = r9.c
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L7b
        L79:
            r7 = r8
            goto L7d
        L7b:
            r7 = r7[r2]
        L7d:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.nnw.h(r5)
            goto L89
        L88:
            r5 = r7
        L89:
            r4.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqp.e(java.lang.Appendable, long, nno, int, nnw, java.util.Locale):void");
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
    }
}
