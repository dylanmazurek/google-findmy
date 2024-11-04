package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iea extends ieq {
    public iea(String str) {
        super(str);
    }

    @Override // defpackage.ieq
    public final ign a(String str) {
        return new igl(str, this);
    }

    public iea(Throwable th) {
        super("Writing bad value", th);
    }
}
