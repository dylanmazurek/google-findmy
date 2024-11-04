package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrk implements Serializable {
    private final Pattern a;

    public mrk(Pattern pattern) {
        this.a = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.a.pattern();
        pattern.getClass();
        return new mrj(pattern, this.a.flags());
    }

    public final boolean a(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence) {
        String replaceAll = this.a.matcher(charSequence).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mrk(java.lang.String r1) {
        /*
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrk.<init>(java.lang.String):void");
    }
}
