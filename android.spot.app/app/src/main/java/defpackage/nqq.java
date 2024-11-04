package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqq implements nrc, nra {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public nqq(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    private static final int f(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
            char charAt = charSequence.charAt(i + i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.nra
    public final int a() {
        return b();
    }

    @Override // defpackage.nrc
    public final int b() {
        int i;
        if (true != this.c) {
            i = 6;
        } else {
            i = 7;
        }
        String str = this.a;
        if (str != null && str.length() > i) {
            return str.length();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:            if (r0 == false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00eb, code lost:            if (r0 == false) goto L42;     */
    @Override // defpackage.nra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.nqw r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqq.c(nqw, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        int i2;
        int i3;
        if (nnwVar != null) {
            int i4 = 0;
            if (i == 0) {
                String str = this.a;
                if (str == null) {
                    i = 0;
                } else {
                    appendable.append(str);
                    return;
                }
            }
            if (i >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i = -i;
            }
            int i5 = i / 3600000;
            nqy.b(appendable, i5, 2);
            int i6 = i - (i5 * 3600000);
            if (i6 != 0) {
                i4 = i6;
            }
            if (this.c) {
                appendable.append(':');
            }
            int i7 = i4 / 60000;
            nqy.b(appendable, i7, 2);
            if (this.d != 2 && (i2 = i4 - (i7 * 60000)) != 0) {
                int i8 = i2 / 1000;
                if (this.c) {
                    appendable.append(':');
                }
                nqy.b(appendable, i8, 2);
                if (this.d != 3 && (i3 = i2 - (i8 * 1000)) != 0) {
                    if (this.c) {
                        appendable.append('.');
                    }
                    nqy.b(appendable, i3, 3);
                }
            }
        }
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
    }
}
