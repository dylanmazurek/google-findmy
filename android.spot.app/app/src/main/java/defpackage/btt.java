package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btt {
    private static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public btt(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public static byte b(char c) {
        if (c < 1792) {
            return e[c];
        }
        return Character.getDirectionality(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte a() {
        char charAt = this.a.charAt(this.c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.a, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c--;
        return b(this.d);
    }
}
