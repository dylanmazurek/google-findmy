package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nop extends npv {
    public nop() {
        super(nns.n, nor.s, nor.t);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int b(Locale locale) {
        return npb.a(locale).m;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long i(long j, String str, Locale locale) {
        String[] strArr = npb.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new noa(nns.n, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String n(int i, Locale locale) {
        return npb.a(locale).f[i];
    }
}
