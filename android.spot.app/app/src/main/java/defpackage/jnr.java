package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnr extends jns {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public jnr(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.jns
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.jns
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.jns
    public final String c() {
        return this.e;
    }

    @Override // defpackage.jns
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jnr) {
            jnr jnrVar = (jnr) obj;
            if (this.c.equals(jnrVar.c) && this.d == jnrVar.d && b().equals(jnrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }
}
