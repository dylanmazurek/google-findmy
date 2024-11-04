package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsy extends jte {
    final char[] a;

    public jsy(jsx jsxVar) {
        super(jsxVar, null);
        boolean z;
        this.a = new char[512];
        if (jsxVar.a.length == 16) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        for (int i = 0; i < 256; i++) {
            this.a[i] = jsxVar.a(i >>> 4);
            this.a[i | 256] = jsxVar.a(i & 15);
        }
    }

    @Override // defpackage.jte, defpackage.jtf
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new jta("Invalid input length " + charSequence.length());
    }

    @Override // defpackage.jte, defpackage.jtf
    public final void b(Appendable appendable, byte[] bArr, int i) {
        hwx.T(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }

    @Override // defpackage.jte
    public final jtf c(jsx jsxVar) {
        return new jsy(jsxVar);
    }
}
