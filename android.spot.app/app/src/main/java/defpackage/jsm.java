package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsm extends jrq implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public jsm(String str, int i) {
        this.d = "Hashing.sha256()";
        MessageDigest e = e(str);
        this.a = e;
        int digestLength = e.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        hwx.P(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = f(e);
    }

    private static MessageDigest e(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean f(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.jsb
    public final jsc d() {
        if (this.c) {
            try {
                return new jsk((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new jsk(e(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new jsl(this.a.getAlgorithm(), this.b);
    }

    public jsm() {
        MessageDigest e = e("SHA-256");
        this.a = e;
        this.b = e.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = f(e);
    }
}
