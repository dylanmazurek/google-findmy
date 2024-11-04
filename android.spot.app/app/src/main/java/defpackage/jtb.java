package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtb extends jtf {
    private final jtf a;
    private final String b = ":";

    public jtb(jtf jtfVar) {
        this.a = jtfVar;
        hwx.M(true, "Cannot add a separator after every %s chars", 2);
    }

    @Override // defpackage.jtf
    public final int a(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (this.b.indexOf(charAt) < 0) {
                sb.append(charAt);
            }
        }
        return this.a.a(bArr, sb);
    }

    @Override // defpackage.jtf
    public final void b(Appendable appendable, byte[] bArr, int i) {
        hwx.J(true);
        this.a.b(new jsw(appendable), bArr, i);
    }

    @Override // defpackage.jtf
    public final int d(int i) {
        int d = this.a.d(i);
        return d + (this.b.length() * iqg.p(Math.max(0, d - 1), 2, RoundingMode.FLOOR));
    }

    @Override // defpackage.jtf
    public final jtf e() {
        throw null;
    }

    @Override // defpackage.jtf
    public final InputStream f(Reader reader) {
        throw null;
    }

    @Override // defpackage.jtf
    public final OutputStream g(Writer writer) {
        throw null;
    }

    @Override // defpackage.jtf
    public final CharSequence h(CharSequence charSequence) {
        return this.a.h(charSequence);
    }

    @Override // defpackage.jtf
    public final jtf i() {
        throw null;
    }

    @Override // defpackage.jtf
    public final int m(int i) {
        return this.a.m(i);
    }

    public final String toString() {
        return this.a.toString() + ".withSeparator(\"" + this.b + "\", 2)";
    }
}
