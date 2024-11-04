package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmi implements dtv {
    public final MessageDigest a;
    private final iyu b = new iyu();

    public dmi(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.dtv
    public final iyu f() {
        return this.b;
    }
}
