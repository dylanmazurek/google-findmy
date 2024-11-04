package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsk extends jrp {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public jsk(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void d() {
        hwx.V(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.jrp
    public final void a(byte[] bArr, int i, int i2) {
        d();
        this.a.update(bArr, i, i2);
    }

    @Override // defpackage.jsc
    public final jsa k() {
        d();
        this.c = true;
        int i = this.b;
        if (i == this.a.getDigestLength()) {
            byte[] digest = this.a.digest();
            int i2 = jsa.b;
            return new jrx(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.a.digest(), i);
        int i3 = jsa.b;
        return new jrx(copyOf);
    }
}
