package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtb implements dir {
    private final Object b;

    public dtb(Object obj) {
        bsc.q(obj);
        this.b = obj;
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof dtb) {
            return this.b.equals(((dtb) obj).b);
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
