package defpackage;

import j$.util.Objects;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class jte extends jtf {
    final jsx b;
    final Character c;

    public jte(jsx jsxVar, Character ch) {
        this.b = jsxVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (jsxVar.d('=')) {
                z = false;
            }
        }
        hwx.O(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.jtf
    public int a(byte[] bArr, CharSequence charSequence) {
        jsx jsxVar;
        CharSequence h = h(charSequence);
        if (this.b.c(h.length())) {
            int i = 0;
            int i2 = 0;
            while (i < h.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    jsxVar = this.b;
                    if (i3 >= jsxVar.d) {
                        break;
                    }
                    j <<= jsxVar.c;
                    if (i + i3 < h.length()) {
                        j |= this.b.b(h.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = jsxVar.e;
                int i6 = i4 * jsxVar.c;
                int i7 = (i5 - 1) * 8;
                while (i7 >= (i5 * 8) - i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.b.d;
            }
            return i2;
        }
        throw new jta("Invalid input length " + h.length());
    }

    @Override // defpackage.jtf
    public void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        hwx.T(0, i, bArr.length);
        while (i2 < i) {
            j(appendable, bArr, i2, Math.min(this.b.e, i - i2));
            i2 += this.b.e;
        }
    }

    public jtf c(jsx jsxVar) {
        return new jte(jsxVar, null);
    }

    @Override // defpackage.jtf
    public final int d(int i) {
        return this.b.d * iqg.p(i, this.b.e, RoundingMode.CEILING);
    }

    @Override // defpackage.jtf
    public final jtf e() {
        if (this.c == null) {
            return this;
        }
        return c(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jte) {
            jte jteVar = (jte) obj;
            if (this.b.equals(jteVar.b) && Objects.equals(this.c, jteVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jtf
    public final InputStream f(Reader reader) {
        return new jtd(this, reader);
    }

    @Override // defpackage.jtf
    public final OutputStream g(Writer writer) {
        return new jtc(this, writer);
    }

    @Override // defpackage.jtf
    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    @Override // defpackage.jtf
    public final jtf i() {
        for (int i = 0; i <= 0; i++) {
            hwx.O(true ^ this.b.d(":".charAt(i)), "Separator (%s) cannot contain alphabet characters", ":");
        }
        Character ch = this.c;
        if (ch != null) {
            ch.charValue();
            hwx.O(true, "Separator (%s) cannot contain padding character", ":");
        }
        return new jtb(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        hwx.T(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.b.e) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = (i2 + 1) * 8;
        jsx jsxVar = this.b;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - jsxVar.c) - i3);
            jsx jsxVar2 = this.b;
            appendable.append(jsxVar2.a(jsxVar2.b & ((int) j2)));
            i3 += this.b.c;
        }
        if (this.c != null) {
            while (i3 < this.b.e * 8) {
                this.c.charValue();
                appendable.append('=');
                i3 += this.b.c;
            }
        }
    }

    @Override // defpackage.jtf
    public final int m(int i) {
        return (int) (((this.b.c * i) + 7) / 8);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b);
        if (8 % this.b.c != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public jte(String str, String str2, Character ch) {
        this(new jsx(str, str2.toCharArray()), ch);
    }
}
