package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ieh extends ieq {
    public ieh(String str) {
        super(str);
    }

    @Override // defpackage.ieq
    public final ign a(String str) {
        return new igj(str, this);
    }

    public ieh(Throwable th) {
        super("Unexpected exception", th);
    }
}
