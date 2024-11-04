package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhx {
    private final nkr a;
    private long b = 262144;

    public nhx(nkr nkrVar) {
        this.a = nkrVar;
    }

    public final String a() {
        String l = this.a.l(this.b);
        this.b -= l.length();
        return l;
    }

    public final ngb b() {
        ktf ktfVar = new ktf((byte[]) null, (byte[]) null);
        while (true) {
            String a = a();
            if (a.length() != 0) {
                int x = moz.x(a, ':', 1, 4);
                if (x != -1) {
                    String substring = a.substring(0, x);
                    substring.getClass();
                    String substring2 = a.substring(x + 1);
                    substring2.getClass();
                    ktfVar.n(substring, substring2);
                } else if (a.charAt(0) == ':') {
                    String substring3 = a.substring(1);
                    substring3.getClass();
                    ktfVar.n("", substring3);
                } else {
                    ktfVar.n("", a);
                }
            } else {
                return ktfVar.m();
            }
        }
    }
}
