package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ihe extends Exception {
    public ihe(String str) {
        super(str);
    }

    public ihe(Throwable th, byte[] bArr) {
        super("Could not parse sharing invitation token", th);
    }

    public ihe(Throwable th) {
        super(th);
    }
}
