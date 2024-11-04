package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqi implements nrc, nra {
    protected final int a;
    protected final int b;
    private final nns c;

    /* JADX INFO: Access modifiers changed from: protected */
    public nqi(nns nnsVar, int i, int i2) {
        this.c = nnsVar;
        this.a = i;
        this.b = i2 > 18 ? 18 : i2;
    }

    @Override // defpackage.nra
    public final int a() {
        return this.b;
    }

    @Override // defpackage.nrc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        nnq a = this.c.a(nqwVar.a);
        int min = Math.min(this.b, charSequence.length() - i);
        long c = a.s().c() * 10;
        int i2 = 0;
        long j = 0;
        while (i2 < min) {
            char charAt = charSequence.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            c /= 10;
            j += (charAt - '0') * c;
            i2++;
        }
        long j2 = j / 10;
        if (i2 != 0 && j2 <= 2147483647L) {
            int i3 = i + i2;
            nqwVar.c().c(new npv(nns.x, npt.a, a.s()), (int) j2);
            return i3;
        }
        return ~i;
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
        nno nnoVar = ((nod) nohVar).a;
        f(appendable, nnoVar.M(nohVar), nnoVar);
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        f(appendable, j, nnoVar);
    }

    protected final void f(Appendable appendable, long j, nno nnoVar) {
        long j2;
        String l;
        nnq a = this.c.a(nnoVar);
        int i = this.a;
        try {
            long f = a.f(j);
            if (f == 0) {
                while (true) {
                    i--;
                    if (i >= 0) {
                        appendable.append('0');
                    } else {
                        return;
                    }
                }
            } else {
                long c = a.s().c();
                int i2 = this.b;
                while (true) {
                    switch (i2) {
                        case 1:
                            j2 = 10;
                            break;
                        case 2:
                            j2 = 100;
                            break;
                        case 3:
                            j2 = 1000;
                            break;
                        case 4:
                            j2 = 10000;
                            break;
                        case 5:
                            j2 = 100000;
                            break;
                        case 6:
                            j2 = 1000000;
                            break;
                        case 7:
                            j2 = 10000000;
                            break;
                        case 8:
                            j2 = 100000000;
                            break;
                        case 9:
                            j2 = 1000000000;
                            break;
                        case 10:
                            j2 = 10000000000L;
                            break;
                        case 11:
                            j2 = 100000000000L;
                            break;
                        case 12:
                            j2 = 1000000000000L;
                            break;
                        case 13:
                            j2 = 10000000000000L;
                            break;
                        case 14:
                            j2 = 100000000000000L;
                            break;
                        case 15:
                            j2 = 1000000000000000L;
                            break;
                        case 16:
                            j2 = 10000000000000000L;
                            break;
                        case 17:
                            j2 = 100000000000000000L;
                            break;
                        case 18:
                            j2 = 1000000000000000000L;
                            break;
                        default:
                            j2 = 1;
                            break;
                    }
                    if ((c * j2) / j2 == c) {
                        long j3 = (f * j2) / c;
                        long j4 = i2;
                        long j5 = new long[]{j3, j4}[0];
                        if ((2147483647L & j5) == j5) {
                            l = Integer.toString((int) j5);
                        } else {
                            l = Long.toString(j5);
                        }
                        int i3 = (int) j4;
                        int length = l.length();
                        while (length < i3) {
                            appendable.append('0');
                            i--;
                            i3--;
                        }
                        if (i < i3) {
                            while (i < i3 && length > 1) {
                                int i4 = length - 1;
                                if (l.charAt(i4) == '0') {
                                    i3--;
                                    length = i4;
                                }
                            }
                            if (length < l.length()) {
                                for (int i5 = 0; i5 < length; i5++) {
                                    appendable.append(l.charAt(i5));
                                }
                                return;
                            }
                        }
                        appendable.append(l);
                        return;
                    }
                    i2--;
                }
            }
        } catch (RuntimeException unused) {
            nqt.b(appendable, i);
        }
    }
}
