package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jtj extends iqg {
    public final CharSequence a;

    static {
        jek jekVar = new jek(Pattern.compile("\r\n|\n|\r"));
        hwx.O(!((Matcher) jekVar.a("").a).matches(), "The pattern may not match the empty string: %s", jekVar);
        new kru(new jey(jekVar, 2));
    }

    public jtj(CharSequence charSequence) {
        this.a = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:            if (r1 > 30) goto L6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            r0 = 3
            r1 = 1
            java.lang.String r2 = "maxLength (%s) must be >= length of the truncation indicator (%s)"
            r3 = 30
            defpackage.hwx.P(r1, r2, r3, r0)
            java.lang.CharSequence r0 = r4.a
            int r1 = r0.length()
            if (r1 > r3) goto L1b
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 <= r3) goto L2f
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r2 = 0
            r3 = 27
            r1.append(r0, r2, r3)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L2f:
            java.lang.String r1 = "CharSource.wrap("
            java.lang.String r2 = ")"
            java.lang.String r0 = defpackage.a.ag(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtj.toString():java.lang.String");
    }
}
