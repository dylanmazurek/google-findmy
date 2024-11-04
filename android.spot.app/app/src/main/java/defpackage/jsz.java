package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsz extends jte {
    private jsz(jsx jsxVar, Character ch) {
        super(jsxVar, ch);
        hwx.J(jsxVar.a.length == 64);
    }

    @Override // defpackage.jte, defpackage.jtf
    public final int a(byte[] bArr, CharSequence charSequence) {
        CharSequence h = h(charSequence);
        if (this.b.c(h.length())) {
            int i = 0;
            int i2 = 0;
            while (i < h.length()) {
                int i3 = i2 + 1;
                int b = (this.b.b(h.charAt(i)) << 18) | (this.b.b(h.charAt(i + 1)) << 12);
                bArr[i2] = (byte) (b >>> 16);
                int i4 = i + 2;
                if (i4 < h.length()) {
                    int i5 = i + 3;
                    int b2 = b | (this.b.b(h.charAt(i4)) << 6);
                    int i6 = i2 + 2;
                    bArr[i3] = (byte) ((b2 >>> 8) & 255);
                    if (i5 < h.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((b2 | this.b.b(h.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i = i4;
                    i2 = i3;
                }
            }
            return i2;
        }
        throw new jta("Invalid input length " + h.length());
    }

    @Override // defpackage.jte, defpackage.jtf
    public final void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        hwx.T(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | (i4 << 16) | (bArr[i2 + 2] & 255);
            appendable.append(this.b.a(i5 >>> 18));
            appendable.append(this.b.a((i5 >>> 12) & 63));
            appendable.append(this.b.a((i5 >>> 6) & 63));
            appendable.append(this.b.a(i5 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            j(appendable, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.jte
    public final jtf c(jsx jsxVar) {
        return new jsz(jsxVar, null);
    }

    public jsz(String str, String str2, Character ch) {
        this(new jsx(str, str2.toCharArray()), ch);
    }
}
