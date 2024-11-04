package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbo {
    public static final fzo d = new fzo();
    public int a = -1;
    public gbv b;
    public final ljj c;
    public final fzo e;
    public final ddg f;

    public gbo(ljj ljjVar, fzo fzoVar, ddg ddgVar) {
        this.c = ljjVar;
        this.e = fzoVar;
        this.f = ddgVar;
    }

    public final gbs a() {
        return (gbs) this.c.q();
    }

    public final boolean b() {
        juv juvVar = ((gbs) this.c.b).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        if ((juvVar.a & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        juv juvVar = ((gbs) this.c.b).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        if ((juvVar.a & 2048) != 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        return this.b.i();
    }

    public final String toString() {
        String str;
        gbv gbvVar = this.b;
        if (gbvVar != null) {
            str = ".".concat(String.valueOf(gbvVar.getClass().getSimpleName()));
        } else {
            str = "";
        }
        juv juvVar = ((gbs) this.c.b).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        return "CVE" + str + "#" + juvVar.c + " [" + Integer.toHexString(hashCode()) + "]";
    }
}
