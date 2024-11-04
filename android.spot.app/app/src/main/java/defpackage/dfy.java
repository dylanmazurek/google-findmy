package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfy extends Exception {
    public final hww b;

    public dfy() {
        this.b = null;
    }

    public dfy(hww hwwVar) {
        this.b = hwwVar;
    }

    public dfy(byte[] bArr) {
        super("<null intent>");
        this.b = null;
    }

    public dfy(Throwable th, byte[] bArr) {
        super("Error while retrieving auth token", th);
        this.b = null;
    }

    public dfy(Throwable th) {
        super(th);
        this.b = null;
    }
}
