package defpackage;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmw implements kaf {
    private static final byte[] e = {0};
    public final khm a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public kmw(kgu kguVar) {
        this.a = new kmt(kguVar.c.X());
        this.b = kguVar.a.b;
        this.c = kguVar.b.c();
        if (kguVar.a.c.equals(kgw.c)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public kmw(kha khaVar) {
        String valueOf = String.valueOf(String.valueOf(khaVar.a.d));
        this.a = new kmv("HMAC".concat(valueOf), new SecretKeySpec(khaVar.c.X(), "HMAC"));
        this.b = khaVar.a.b;
        this.c = khaVar.b.c();
        if (khaVar.a.c.equals(khd.c)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public kmw(khm khmVar, int i) {
        this.a = khmVar;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        khmVar.a(new byte[0], i);
    }
}
