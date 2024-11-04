package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glb extends Exception {
    public glb(String str, Throwable th) {
        super("Column not found:".concat(str), th);
    }
}
