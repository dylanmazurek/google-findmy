package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnf implements dir {
    public final dng b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public dnf(String str, dng dngVar) {
        this.c = null;
        bsc.o(str);
        this.d = str;
        bsc.q(dngVar);
        this.b = dngVar;
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        bsc.q(url);
        return url.toString();
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof dnf) {
            dnf dnfVar = (dnf) obj;
            if (b().equals(dnfVar.b()) && this.b.equals(dnfVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            int hashCode = b().hashCode();
            this.h = hashCode;
            int hashCode2 = (hashCode * 31) + this.b.hashCode();
            this.h = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final String toString() {
        return b();
    }

    public dnf(URL url) {
        dng dngVar = dng.a;
        bsc.q(url);
        this.c = url;
        this.d = null;
        bsc.q(dngVar);
        this.b = dngVar;
    }
}
